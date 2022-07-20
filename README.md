# НаПраво

### Распределение задач

Ася Смирнова: UX, Project management

Копчев Владислав: разработка поддержки, некоторые организационные вопросы 

Дмитрий Лапынин: справочник

Кирилл Прокушенков: краткие инструкции 

Юристы: юридическое наполнение

### Оставшиеся задачи

Сейчас:

1. Кирилл. Доделать инструкции.

2. Влад. Экран 5–6 в полной инструкции с полицией: сделать выделения жирным внутри основного текста и нормальную разметку, реализовать все с помощью всплывающих окон. Сделать чат-бот: поиск с интерфейсом сообщений как на госуслугах, настроить аналитику в Firebase. Позже сделаю остальное. Экран 1–3 в краткой доделать. Экстренное чтение полиция экраны 12347 ссылки хакон 

3. Дима. Доделать справочник в соответствующем экране внутри Fragments.

Глобально:

1. Реализовать до конца интерфейс приложения (чтобы все хоть как-то работало, пока что основные 4 раздела)

2. Реализовать нормальный бекенд всех 4 разделов

3. Номера ГИБДД (просто списком) и прочие фичи

4. Рубрикатор: если в статье есть слова из рубрикатора то его подчеркнуть сделать его ссылкой и по нажатию выводить всплывающее окно с содержимым статьи рубрикатора по этому слову

5. Новости, остальные инструкции решим позже. ГИБДД: доделать разметку экранов 5–6 + ссылки на инструкции (серые кнопки)

6. Прочие инструкции -> новости с поиском по ним -> добавить чат в поддержку. 

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

5. Теперь мы можем идти из `Activity1` в `Activity2`, но не наоборот. Чтобы было наоборот, см низ пункт 6.

Во `Fragments` (Например, NotificationFragment.kt) так делать [нельзя](https://developer.android.com/guide/topics/ui/controls/button#ClickListener), поскольку в предыдущем варианте мы определяем [`Intent`](https://stackoverflow.com/questions/14139774/android-app-crashing-fragment-and-xml-onclick) между двумя `Activity`, здесь же получится так, что `Intent` определен между `Fragment` и `Activity` — в результате, как я понял, он пытается запустить кнопку, исходя из метода, который определен в соответствующем `Activity` как в бекенде XML-файла (а у нас его, кажется, вообще нет, ведь это `Fragment`, а не `Activity`), где определена кнопка, и не находит (но мб я не прав). 

Как делать внутри `Fragment` на примере NotificationFragment:

1. Добавляем у кнопки с полицией `id` `button_police`

2. Создаем `Activity` PoliceIssues

3. Заходим в класс нашего `Fragment` NotificationsFragment.kt

4. Прописываем следующее как в [гайде](https://developer.android.com/guide/topics/ui/controls/button#ClickListener):

```
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var buttonPol = view.findViewById<Button>(R.id.button_police)

        buttonPol.setOnClickListener {
            val intent = Intent(context, PoliceIssues::class.java)
            startActivity(intent)
        }
    }
```

5. Почему именно в onViewCreated? Это все как-то работает через жизненный цикл Fragment, [потом](https://stackoverflow.com/questions/25119090/difference-between-oncreateview-and-onviewcreated-in-fragment) разберусь, чек эту инфу также [здесь](https://developer.android.com/guide/fragments/lifecycle), пока могу сказать, что один из трех основных методов `Fragment`.

6. Дальше нужно добавить кнопку назад. Заходим в `AndroidManifest.xml`. При создании `Activity` туда добавились автоматически следующие строчки:

```
        <activity
            android:name=".ui.notifications.PoliceIssues"
            android:exported="false" />
```

Заменить их на (чтобы из `android:name` он вел в `android:parentActivityName`:

```
        <activity
            android:name=".ui.notifications.PoliceIssues"
            android:parentActivityName=".MainActivity">

            <!-- The meta-data tag is required if you support API level 15 and lower -->
            <meta-data
                android:name="android.support.PARENT_ACTIVITY"
                android:value=".MainActivity" />
        </activity>
```

#### Что делать с `unresolved Reference: R`

1. Sync project with Gradle files

И все )
