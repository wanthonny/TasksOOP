# Dota 2: Исключения и Боевой Орк

**Задание:**

В мире Dota 2, герои могут применять различные заклинания, навыки и предметы, которые могут вызывать исключительные ситуации. Ваша задача - разработать систему для обработки исключений при использовании магических предметов героями.

1. Создайте класс `MagicItem` для представления магического предмета. У этого класса должны быть поля:
    * `itemName` - название магического предмета.
    * `manaCost` - стоимость маны для использования предмета.
    * `cooldown` - время восстановления (в секундах) предмета после использования.

2. Создайте класс `Hero` для представления героя. У этого класса должны быть поля:
    * `heroName` - имя героя.
    * `currentMana` - текущее количество маны у героя.
    * `inventory` - список магических предметов, которые герой может использовать.

3. Создайте класс `BattleException` - пользовательское исключение, которое будет брошено при возникновении исключительной ситуации во время боя.

4. Создайте метод в классе `Hero`, который позволит герою использовать магический предмет. Метод должен проверить, есть ли предмет в инвентаре, достаточно ли у героя маны для использования предмета и не истекло ли время восстановления предмета. Если какое-либо из условий не выполняется, бросьте `BattleException` с информативным сообщением.

5. Создайте симуляцию боя, где герой каждые 2 секунды будет пытаться использовать случайные магические предметы из своего инвентаря. Если возникает исключительная ситуация, выведите информацию о ней.

6. Создайте класс `BattleSimulator`, который будет выполнять симуляцию боя. Этот класс должен иметь метод `public void simulateBattle(Hero hero, int numTurns)`, который будет выполнять бой на протяжении заданного числа ходов.

**Задачи:**

* Реализуйте логику в методе `Hero.useItem` для обработки исключений, если герой не может использовать предмет. В случае возникновения исключения, выбросьте `BattleException` с информативным сообщением.

* В классе `MagicItem` добавьте валидацию полей. Например, название предмета не может быть пустым, а стоимость маны и время восстановления должны быть положительными значениями. Если условия не выполняются, выбросьте соответствующие исключения из Java.

* В методе `simulateBattle` класса `BattleSimulator`, обработайте исключения, которые могут возникнуть при использовании магических предметов во время боя, и выведите информацию о них.

* Добавьте исключение `NoItemsException`, которое будет брошено, если у героя нет доступных магических предметов для использования.

* В методе main запустите метод `simulateBattle` и протестируйте своё решение