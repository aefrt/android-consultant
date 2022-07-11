# НаПраво

### Распределение задач

Ася Смирнова: UX, Project management

Копчев Владислав: разработка поддержки

Дмитрий Лапынин: справочник

Кирилл Прокушенков: краткие инструкции 

Юристы: юридическое наполнение

### Оставшиеся задачи

1. Разобраться [как](https://www.youtube.com/watch?v=4pevVON0v-U&t=1627s) делать кнопки в разных экранах и связывать их с другими Activity, каждый заполняет свою Activity

2. Реализовать до конца интерфейс приложения (чтобы все хоть как-то работало)

3. Реализовать нормальный бекенд

### Как настроить работу в GitHub

1. Создаем токен и логинимся в GitHub с его помощью в Android Studio (в разделе VCS)

2. Загружаем из ветки [`dev` ](https://github.com/aefrt/android-consultant/tree/dev) (В терминале параметр `b`, например, `git clone https://github.com/aefrt/android-consultant/ -b dev`) 

3. Force commit + Force push 

4. Update project

local.properties

### Как создать Activity

В старом проекте:

1. app -> New -> Activity -> Empty Activity, прописываем название Name => получаем xml и kt файлы

2. Заходим в что-то_там_main_activity.xml и перетаскиваем кнопку

3. Заходим в MainActivity.kt и пишем fun func_name { intent = Intent(this, Name::class.java)
        startActivity(intent) }
        
4. Заходим обратно в xml и в кнопке прописываем android:onClick="func_name"

В новом:

TODO()
