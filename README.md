## Урок 1. Цели и смысл тестирования

### 1. [В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте написать тесты для проверки этого поведения.](src/main/java/dz1/Calculator)
### 2. [Мы хотим улучшить функциональность нашего интернет-магазина. Ваша задача - добавить два новых метода в класс Shop: Метод sortProductsByPrice(), который сортирует список продуктов по стоимости. Метод getMostExpensiveProduct(), который возвращает самый дорогой продукт. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины). Напишите тесты для проверки корректности работы метода getMostExpensiveProduct. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки). Используйте класс Product для создания экземпляров продуктов и класс Shop для написания методов сортировки и тестов.](src/main/java/dz1/Shop)

## Урок 2. Знакомство с тестовыми фреймворками

### [Проект Vehicle. Написать следующие тесты с использованием JUnit5:](src/test/java/dz2/VehicleTest.java)
- Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
- Проверить, что объект Car создается с 4-мя колесами.
- Проверить, что объект Motorcycle создается с 2-мя колесами.
- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

## Урок 3. Качество тестов

### 1. Напишите [тесты](src/test/java/dz3/MainHWTest.java), покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным.
### 2. [Разработайте](src/main/java/dz3/MainHW.java) и [протестируйте](src/test/java/dz3/MainHWTest.java) метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100).
### 2. Добавьте [функцию в класс UserRepository](src/main/java/dz3/user/UserRepository.java), которая разлогинивает всех пользователей, кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. [Протестируйте](src/test/java/dz3/user/UserTest.java) данную функцию.