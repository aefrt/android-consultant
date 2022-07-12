# НаПраво

### Распределение задач

Ася Смирнова: UX, Project management

Копчев Владислав: разработка поддержки

Дмитрий Лапынин: справочник

Кирилл Прокушенков: краткие инструкции 

Юристы: юридическое наполнение

### Оставшиеся задачи

Сейчас:

1. Кирилл. Разобраться, [как](https://youtu.be/6zp-AKBaMT8?list=PLmjT2NFTgg1fdHN-9Wn4XYr-IOuadxMm5) делать кнопки в разных экранах внутри Fragments, которые будут вести в новые Activity, и доделать инструкции.

2. Влад. Сделать [чат-бот](https://www.youtube.com/watch?v=gFtajvZajrg) с нуля, пока он может выдавать бессмыслицу, но главное чтобы все работало — притом сделать это в соответствующем экране внутри Fragments.

3. Дима. Доделать справочник в соответствубщем экране внутри Fragments.

Глобально:

1. Реализовать до конца интерфейс приложения (чтобы все хоть как-то работало, пока что основные 4 раздела)

2. Реализовать нормальный бекенд всех 4 разделов

3. Номера ГИБДД и прочие фичи

### Гайды

#### Как настроить работу в GitHub

1. Создаем токен и логинимся в GitHub с его помощью в Android Studio (в разделе VCS)

2. Загружаем из ветки [`dev` ](https://github.com/aefrt/android-consultant/tree/dev) (В терминале параметр `b`, например, `git clone https://github.com/aefrt/android-consultant/ -b dev`) 

3. Force commit + Force push 

4. Update project

5. Не забываем про local.properties

#### Как создать кнопку

Внутри `Activity` (в прошлом проекте у нас были SomethingActivity.kt):

1. app -> New -> Activity -> Empty Activity, прописываем название Name => получаем xml и kt файлы + соответствующие теги в AndroidManifest

2. Заходим в что-то_там_main_activity.xml и перетаскиваем кнопку (вместо MainActivity может быть произвольная ParentActivity)

3. Заходим в MainActivity.kt и пишем fun func_name { intent = Intent(this, Name::class.java)
        startActivity(intent) }
        
4. Заходим обратно в xml и в кнопке прописываем android:onClick="func_name"

Во `Fragments` (Например, NotificationFragment.kt) так делать [нельзя](https://developer.android.com/guide/topics/ui/controls/button#ClickListener), поскольку в предыдущем варианте мы определяем [`Intent`](https://stackoverflow.com/questions/14139774/android-app-crashing-fragment-and-xml-onclick) между двумя `Activity`, здесь же получится так, что `Intent` определен между `Fragment` и `Activity` — в результате, как я понял, он пытается запустить кнопку, исходя из метода, который определен в соответствующем `Activity` как в бекенде XML-файла (а у нас его, кажется, вообще нет, ведь это `Fragment`, а не `Activity`), где определена кнопка, и не находит (но мб я не прав). 

Как делать внутри `Fragment`:

1. TODO()

#### Что делать с `unresolved Reference: R`

1. Sync project with Gradle files

И все )
