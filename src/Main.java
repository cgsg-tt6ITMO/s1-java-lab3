import buildings.*;
import enums.*;
import exceptions.MadnessException;
import interfaces.Flying;
import interfaces.Human;
import landscapes.*;
import people.*;
import objects.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            String text = """
                    Вариант 9136.29
                    Бедняга перечислял знакомые станции подземки, проложенной из Бостона в Кембридж за тысячи миль отсюда, в мирной земле Новой Англии, но мне его нервный лепет не казался ни бредом, ни некстати проснувшимся ностальгическим чувством. Денфорт находился в глубоком шоке, но я тут же безошибочно уловил пришедшую ему на ум болезненную аналогию. Оглядываясь, мы ни на минуту не сомневались, что увидим жуткое чудище, но все же вполне определенное -- к обличью звездоголовых мы как-то привыкли и смирились ним. Однако в зловещей дымке вырисовывалось совершенно другое существо, гораздо более гнусное. Оно казалось реальным воплощением "чужого", инородного организма, какие любят изображать наши фантасты, и больше всего напоминало движущийся состав, если смотреть на него с платформы станции метро. Темная громада, усеянная ярко светящимися разноцветными точками, рвалась из подземного мрака, как пуля из ствола. Но мы находились не в метро, а в подземном туннеле, а за нами гналась, синусоидно извиваясь, кошмарная черная блестящая тварь, длиною не менее пятнадцати футов, изрыгавшая зловоние и все более набиравшая скорость; густой пар окружал ее, восставшую из морских глубин. Это невообразимое чудовище -- бесформенная масса пузырящейся протоплазмы -- слабо иллюминировало, образуя тысячи вспыхивавших зеленоватым светом и тут же гаснувших глазков, и неслось прямо на нас; массивнее любого вагона, оно безжалостно давило испуганных беспомощных пингвинов, скользя по сверкающему полу -- ведь именно эти твари отполировали его до полного блеска. Вновь издевательски прогремел дьявольский трубный глас: "Текели-ли! Текели-ли!" И тут мы вспомнили, что этим нечестивым созданиям, шогготам, Старцы дали все -- жизнь, способность мыслить, пластические органы; шогготы пользовались их точечным алфавитом и, конечно же, подражали в звучании языку своих бывших хозяев. Не все запомнилось нам с Денфортом из нашего поспешного бегства, но кое-что все-таки удержалось в памяти. Помним, как пробежали громадную пещеру, куполу которой Старцы придали черты небесной сферы; как, несколько успокоившись, шли потом коридорами и залами мертвого города, но все это помним как во сне. Как будто мы находились в иллюзорном, призрачном мире, в некоем неизвестном измерении, где отсутствовали время, причинность, ориентиры. Нас несколько отрезвил сумеречный дневной свет, падавший на дно гигантской цилиндрической башни, но мы все же не осмелились приблизиться к оставленным саням и взглянуть еще раз на несчастного Гедни и собаку. Они покоились здесь как на дне огромного круглого мавзолея, и я от всей души надеюсь, что их мертвый сон никто и никогда не потревожит. Лишь взбираясь по колоссальному пандусу, мы осознали, насколько устали; от долгого бега в разреженной атмосфере перехватывало дыхание, но ничто не могло заставить нас остановиться и перевести дух, пока мы не выбрались наружу и не оказались под открытым небом. Карабкаясь на вершину сработанного из цельных глыб шестидесятифутового цилиндра, пыхтя и отдуваясь, мы тем не менее понимали, что сейчас происходит наше глубоко символичное прощание с городом: параллельно пандусу шли широкой полосой героические барельефы, выполненные в изумительной технике древней эпохи сорок миллионов лет назад,-- последний привет от Старцев. Поднявшись на вершину башни, мы, как и предполагали, обнаружили, что спускаться нам предстоит по замерзшему каменному крошеву, окружившему башню снаружи на манер холма. На западе высились другие, не менее громадные постройки, на востоке же, в той стороне, где дремали вдали занесенные снегом вершины великих гор, здания обветшали и были заметно ниже. Косые лучи низкого антарктического полночного солнца пробивались сквозь строй покосившихся руин, а город по контрасту со знакомым полярным пейзажем казался еще древнее и угрюмее. В воздухе дрожала и переливалась снежная пыль, мороз пробирал до остей. Устало опустив рюкзаки, которые лишь чудом сохранились во время нашего отчаянного бегства, мы застегнули пуговицы на куртках и начали спуск. Потом побрели по каменному лабиринту к подножью гор, где нас дожидался самолет. За весь путь мы ни словом не обмолвились о том, что побудило нас спасаться бегством, так и не позволив побывать на краю загадочной и самой древней бездны на Земле. Меньше чем через четверть часа мы по крутой древней террасе спустились туда, откуда был виден темный силуэт нашего самолета, оставленного на высокой площадке среди вмерзших в лед редких руин. На полпути к нему мы остановились, переводя дух, и посмотрели еще раз на оставленные позади фантастические каменные джунгли, четко и таинственно отпечатанные на фоне неба. В это время туманная дымка, затягивавшая западную сторону небосвода, рассеялась, снежная пыль устремилась ввысь, сливаясь в некий диковинный узор, за которым, казалось, вот-вот проступит некая страшная, роковая тайна. За сказочным городом, на совершенно белом небосклоне, протянулась тонкая фиолетовая ломаная линия, ее острые углы, озаренные розовым сиянием, призрачно вырисовывались на горизонте. Плоскогорье постепенно шло ввысь -- к этому таинственно мерцавшему и манившему венцу; местность пересекало бывшее русло реки, похожее теперь на неровно легшую тень. У нас захватило дух от неземной красоты пейзажа, а сердце екнуло от страха. Далекая фиолетовая ломаная линия была не чем иным, как проступившим силуэтом зловещих гор, к которым жителям города запрещалось приближаться. Эти высочайшие на Земле вершины являлись, как мы поняли, средоточием чудовищного Зла, вместилищем отвратительных пороков и мерзостей; им опасливо поклонялись жители древнего города, страшившиеся приоткрыть их тайну даже на своих барельефах. Ни одно живое существо не ступало на склоны загадочных гор -- лишь жуткие, наводящие ужас молнии задерживались в долгие полярные ночи на их острых вершинах, освещая таинственным светом землю далеко вокруг. На полярных просторах они стали как бы прообразом непостижимого Кадата, находившегося за зловещим плато Ленг, о чем смутно упоминается в древних легендах. Если верить виденным нами барельефам и резным картам, до загадочных фиолетовых гор было почти триста миль, однако очертания их четко проступали над раскинувшейся снежной гладью, а зубчатые вершины, круто взмывая ввысь, вызывали ощущение того, что они находятся на чужой, полной неведомых опасностей планете. Высота этих вершин была немыслимой, недоступной человеческому воображению, они уходили в сильно разреженные слои земной атмосферы, которые посещали разве что призраки -- ведь ни один из дерзких воздухоплавателей не остался в живых, чтобы поведать о своем непонятном, не поддающемся объяснению внезапном крушении. Вид гигантских гор заставлял меня не без дрожи вспоминать барельефные изображения, которые подсказывали нам, что великая река могла нести с проклятых склонов нечто, державшее жителей города в смертном ужасе, и я мысленно задавал себе вопрос, а не был ли их страх порождением укоренившегося предрассудка? Я припомнил также, что горы эти своей северной оконечностью выходят к побережью в районе Земли Королевы Мэри, где, в тысяче миль отсюда, именно сейчас работает экспедиция сэра Дугласа Моусона, и от всей души пожелал, чтобы ни с научным руководителем, ни с прочими членами экспедиции не случилось ничего дурного и чтобы они даже не заподозрили, сколь опасные гиганты таятся за грядой прибрежных скал. Эти мысли ужасно угнетали меня, нервная система была напряжена до предела, а Денфорт просто находился на грани срыва. Однако еще задолго до того, как мы, миновав руины пятиконечного строения, достигли самолета, наши неопределенные страхи обрели вполне четкую мотивацию. Черные, усеянные вмерзшими в лед руинами склоны Хребтов Безумия, заслонив от нас высоченной стеной восточную часть неба, вновь напомнили нам о таинственных азиатских полотнах Николая Рериха. То и дело возвращаясь мыслями к ужасным бесформенным тварям, которые, изрыгая зловоние, копошились в подземных норах, пронизывавших хребты вплоть до вершин, мы содрогались от страха, представляя, как будем вновь пролетать над круглыми отверстиями, пробуравленными в земле, и как от трубного завывания ветра у нас будет холодеть в груди. Хуже того -- кое-какие вершины окутывал туман (бедняга Лейк принял это за проявление вулканической деятельности), и мы ежились, вспоминая туманные завитки в подземном туннеле и представляя себе адскую бездну, от которой восходил весь этот пар. Самолет благополучно дожидался нас на прежнем месте, и мы, напялив на себя всю теплую одежду, приготовились к взлету. Денфорт легко завел мотор, и самолет без труда, плавно взмыл в воздух, унося нас от кошмарного города. Внизу вновь поплыл каменный лабиринт, а мы поднимались все выше, замеряя силу и направление ветра. Должно быть, где-то в верхних слоях зарождалась буря, мы видели, как бешено мчались там облака, но на высоте двадцати четырех тысяч футов, над перевалом, условия для перелета через горы были довольно сносные. Когда мы приблизились к торчащим пикам, вновь послышались странные трубные звуки, отчего у Денфорта, сидевшего у штурвала, затряслись руки. Хотя я был средним пилотом, скорее дилетантом, но тут все же решил вести самолет сам: в сложных условиях лавирования между пиками слишком опасно было доверять управление человеку, потерявшему голову от страха. Денфорт даже не протестовал. Собрав всю свою волю, я сосредоточился на управлении и, стараясь вести самолет как можно увереннее, не сводил глаз с красноватого клочка неба, открывшегося в провале между пиками. Я сознательно избегал смотреть на клубившийся у вершины туман и, слыша тревожные трубные звуки, завидовал в душе Одиссею, который в подобной ситуации, чтобы не внимать чарующему пению Сирен, залепил уши воском. Денфорт же, оставшись без дела и томясь внутренним беспокойством, не мог спокойно усидеть на месте. Он все время крутил головой: провожал взглядом оставшийся позади город; глядел вперед на приближавшиеся вершины, изрытые пещерами и усеянные прямоугольными руинами; поворачивался то в одну, то в другую сторону, где проплывали внизу заснеженные предгорья с утопавшими в снегу развалинами крепостных стен; а иногда устремлял взор в небо, следя за фантастическими сочетаниями мчавшихся над нами облаков. Вдруг, у самого перевала, когда я, вцепившись в штурвал, преодолевал самый ответственный участок пути, раздался его истошный вопль, который чуть не привел к катастрофе: штурвал дрогнул у меня в руках и я едва не потерял управление. К счастью, мне удалось совладать с волнением, и мы благополучно завершили перелет, но вот Денфорт... Боюсь, он никогда теперь не обретет душевного равновесия. Как я уже говорил, Денфорт наотрез отказался поведать мне, что за кошмарное зрелище заставило его завопить с такой силой, а ведь именно оно окончательно лишило юношу покоя. Оказавшись по другую сторону Хребтов Безумия и чувствуя себя в безопасности, мы наконец заговорили, обмениваясь громкими (чтобы перекричать шум мотора и завывания ветра) замечаниями; в основном они касались наших взаимных обещаний не разглашать ничего, имеющего отношение к древнему городу. Эти поистине космические тайны не должны были стать достоянием широкой публики, предметом зубоскальства, и, клянусь, я никогда бы и рта не раскрыл, если бы не вполне реальная перспектива работы в тех краях экспедиции Старкуэтера-Мура и прочих научных коллективов. В интересах безопасности человечества нельзя бесцеремонно заглядывать в потаенные уголки планеты и проникать в ее бездонные недра, ибо дремлющие до поры монстры, выжившие адские создания могут восстать ото сна, могут выползти из своих темных нор, подняться со дна подземных морей, готовые к новым завоеваниям. Мне удалось выпытать у Денфорта, что последнее ужасное зрительное впечатление было в виде миража. По его словам, оно не имело ничего общего ни с кубическими сооружениями на склонах, ни с поющими, источающими пар пещерами Хребтов Безумия. Мелькнувшее среди облаков дьявольское- видение открыло ему, что таят фиолетовые горы, которых так боялись и к которым не осмеливались приближаться Старцы. Возможно, видение являлось наполовину галлюцинацией, вполне вероятной после перенесенных нами испытаний, а наполовину -- тем не распознанным им миражом, который мы уже созерцали, подлетая днем назад к лагерю Лейка. Но что бы это ни было, оно лишило Денфорта покоя до конца его дней. Иногда с его губ срываются бессвязные, лишенные смысла словосочетания вроде: "черная бездна", "резные края", "протошогготы", "пятимерные, наглухо закрытые конструкции", "мерзкий цилиндр", "древний Фарос", "Иог-Сотот", "исходная белая студнеобразная структура", "космический оттенок", "крылья", "глаза в темноте", "лунная дорожка", "первозданный, вечный, неумирающий" и прочие странные словосочетания. Придя в себя, он ничего толком не объясняет, связывая свои темные высказывания с неумеренным чтением в юные годы опасной эзотерической литературы. Денфорт, один из немногих, осмелился дочитать до конца источенный временем том "Некрономикона", хранившийся под замком в библиотеке университета. Помнится, когда мы летели над Хребтами Безумия, небо хмурилось, и хотя я ни разу не посмотрел вверх, но, думаю, клубившиеся снежные вихри принимали там фантастические очертания. Быстро бегущие облака могли усилить, дополнить и даже исказить картину, воображение -- с легкостью разукрасить ее еще больше, а к тому времени, когда Денфорт впервые заикнулся о своем кошмарном видении, оно успело также обрасти аллюзиями из его давнего чтения. Не мог узреть он так много в одно мгновение. Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!" Тогда же, над хребтами, он истошно вопил одно и то же -- безумные, услышанные нами одновременно слова: "Текели-ли! Текели-ли!"
                    """;
            System.out.println(text);

            Denfort denfort = new Denfort();

            Subway s = new Subway(Age.UNKNOWN, Shapes.DEFAULT, "из Бостона в Кембридж за тысячи миль отсюда, в мирной земле Новой Англии");
            Subway.Station station = new Subway.Station();
            // анонимный класс, "объект интерфейса"
            Human shoggoths = new Human() {
                @Override
                public void say(String subjectName, String phrase, boolean isMeaningful, boolean isConfident) {
                    System.out.println(subjectName + " say " + phrase);
                }

                @Override
                public void read(String reader, Book b, boolean isInProgress, Literature type) {
                    System.out.println("Elders taught " + reader +" how to read");
                }
            };

            Elders elders = new Elders();
            List<String> presents = Arrays.asList("жизнь,", "способность мыслить,", "пластические органы,", "точечный алфавит,", "звучание языка");
            elders.allow(presents);

            shoggoths.say("Shoggoths", "Elders gave us everything!", true, true);
            shoggoths.read("Shoggoths", new Book(), true, Literature.NEWSPAPER);

            Mountains m = new Mountains(true);
            Caves cave1 = new Caves(Shapes.SPHERICAL);

            Tower tower = new Tower();
            Building mausoleum = new Building(Age.OLD, Shapes.ROUND, null, "mausoleum");
            Building g = new Building(Age.UNKNOWN, Shapes.CYLINDRICAL, "town", "sixty-foot stone");
            // unchecked exception
            Building g1 = new Building(Age.UNKNOWN, null, null);
            g1.describe();
            River river = new River();

            // laba # 3
            List<String> phrases1 = Arrays.asList("черная бездна", "резные края", "протошогготы", "пятимерные, наглухо закрытые конструкции", "мерзкий цилиндр", "древний Фарос", "Иог-Сотот",
                    "исходная белая студнеобразная структура", "космический оттенок", "крылья", "глаза в темноте", "лунная дорожка", "первозданный, вечный, неумирающий");

            for (var phrase : phrases1) {
                denfort.say(denfort.getName(), phrase, false, false);
            }

            Book ezlit = new Book();
            ezlit.setBookName("Эзотерическая литература");
            ezlit.setType(Literature.DIFFERENT_BOOKS);
            denfort.read(denfort.getName(), ezlit, false, ezlit.getType());

            Book b = new Book();
            b.setBookName("Некрономикон");
            b.setWhereFrom("библиотека университета");
            b.setType(Literature.SINGLE_BOOK);
            denfort.read(denfort.getName(), b, false, b.getType());

            Author me = new Author();
            me.fly();
            me.see();
            Sky sky = new Sky();
            sky.frown();

            Author me1 = new Author(1);
            System.out.println(me.equals(me1));

            Cloud cloud = new Cloud();
            cloud.fly();
            cloud.run(true);
            cloud.change();
            cloud.distort();
            Imagination im = new Imagination();
            im.supplement();

            //заикнулся
            denfort.say(denfort.getName(), "что-то о своем кошмарном видении", true, false);
            denfort.see();


            // the checked exception
            denfort.getMad();

            Random random = new Random();
            for (int i = 0; i < 10 * random.nextDouble(); i += 1) {
                denfort.say("Denf", "Текели-ли! Текели-ли!", false, true);
            }
        } catch (MadnessException m) {
            System.err.println(m.getMessage());
        }
    }
}

