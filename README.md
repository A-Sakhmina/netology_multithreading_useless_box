### 1.3 Переменные многопоточной программы. ThreadLocal. Atomics. Volatile.
## Задача 1. Самая бесполезная коробка
Код по [ссылке]()
### Описание
Реализация игрушки cамая [бесполезная коробка](https://www.youtube.com/watch?v=tGCW8xftdOA). 
Один поток будет выключать тумблер, а второй будет эмулировать пользователя, 
то есть включать тумблер с какой-то периодичностью

**Работа программы**:
1. Создание поток-пользователь и поток-игрушка 
2. Поток-пользователь раз в несколько секунд включает тумблер 
3. Поток-игрушка как только обнаруживает включение - выключает тумблер 
4. Поток-пользователь, после нескольких итераций завершает выполнение 
5. Главный поток (main) после завершения потока-пользователя, останавливает поток-игрушку
### Вывод
![Вывод консоли](https://github.com/A-Sakhmina/netology_multithreading_useless_box/blob/master/broken_toy.jpg)