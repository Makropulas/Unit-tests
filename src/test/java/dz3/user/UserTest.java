package dz3.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.assertj.core.api.Assertions.*;

public class UserTest {
    private final Random random = new Random();
    private User user;
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        user = new User("user", "password");
        userRepository = new UserRepository();
    }

    @Test
    void authenticate() {
        assertTrue(user.authenticate("user", "password"));
    }

    @ParameterizedTest
    @CsvSource({"usr, password", "user, passwd", "123, abracadabra"})
    void notAuthenticate(String login, String password) {
        assertFalse(user.authenticate(login, password));
    }

    @Test
    void addUserInUserRepository() {
        user.authenticate("user", "password");
        userRepository.addUser(user);
        assertTrue(userRepository.findByName(user.name));
    }

    @Test
    void notAddUserInUserRepository() {
        user.authenticate("usr", "passwd");
        userRepository.addUser(user);
        assertFalse(userRepository.findByName(user.name));
    }

    @Test
    void logoutIfNotAdmin() {
        for (int i = 0; i < 10; i++) {
            User usr = new User("User " + i, "password" + i, random.nextBoolean());
            usr.authenticate(usr.name, usr.password);
            userRepository.addUser(usr);
        }
        userRepository.logoutIfNotAdmin();
        assertThat(
                userRepository.data.stream()
                        .map(u -> u.isAdmin)
                        .toList()
        ).doesNotContain(false);
    }
}