1. Почему использование тестовых заглушек может быть полезным при написании модульных тестов?

*Они используются для упрощения тестирования. Система тестируется без реальных зависимостей (реальные объекты).*

2. Какой тип тестовой заглушки следует использовать, если вам нужно проверить, что метод был вызван с определенными
аргументами?

*Mock заглушки, поскольку они могут выявлять работу метода с необходимыми параметрами*

3. Какой тип тестовой заглушки следует использовать, если вам просто нужно вернуть определенное значение или исключение
в ответ на вызов метода?

*Stub заглушки, поскольку они возвращают предопределенные значения без рассмотрения внутренней реализации.*

4. Какой тип тестовой заглушки вы бы использовали для имитации взаимодействия с внешним API или базой данных?

*Fake заглушки, поскольку они заменяют тяжеловесную внешнюю зависимость на легковесную реализацию.*