# Zadanie: Bilbo

| Termin oddania | Punkty     |
|----------------|:-----------|
|       |           |

--- 
Przekroczenie terminu o **n** zajęć wiąże się z karą:
- punkty uzyskania za realizację zadania są dzielone przez **2<sup>n</sup>**.

--- 

Dzielny hobbit Bilbo Baggins uczestniczył wraz z krasnoludami w pełnej przygód i
niebezpieczeństw wyprawie po skarby zagrabione przez smoka. Wiedział, że u celu wyprawy
czeka go nie tylko śmiertelne starcie ze smokiem, ale także nie mniej nieprzyjemne dzielenie
zdobytych łupów (krasnoludy bywają bardzo chciwe). Postanowił więc wymyślić sposób na
poskromienie pazerności krasnoludów. 

Przed każdym z nich postawi worek na skarby. 
Każdy worek będzie miał określoną pojemność (proporcjonalną do zasług dla powodzenia wyprawy
posiadacza). Następnie będzie każdemu z krasnoludów po kolei wręczał skarby, aż do
momentu, gdy ten będzie już usatysfakcjonowany. 

W normalnych warunkach krasnolud prędzej dałby się żywcem pogrzebać pod górą skarbów, 
niż przestać prosić o następne, ale Bilbo to przewidział. 
Będzie brał po jednym skarbie i nie pokazując go krasnoludowi pytał,
czy ten chce kolejny skarb. Jeśli tak, to o ile skarb jeszcze będzie się mieścił w worku,
krasnolud go dostanie, lecz jeśli by się okazało, że skarb wystaje z worka, to krasnolud traci
całą zawartość worka.

Krasnoludy długo w noc obmyślały sposoby najlepszej strategii wybierania skarbów: 
- jedne postanowiły zdać się na los i za każdym razem przed podjęciem decyzji rzucać monetą
- inne postanawiały solennie brać skarby dopóki ich worek nie będzie wypełniony np. w 70
procentach, 
- inne postanowiły na bieżąco obliczać średni rozmiar dotąd rozdanych skarbów i przyjmować, 
że to właśnie będzie rozmiar kolejnego skarbu, 
- jeszcze inne wymyśliły jeszcze bardziej wyrafinowane strategie.

Zaprojektuj i zaimplementuj w Java klasy pozwalające przeprowadzić
symulację rozdawania skarbów.


Skarby to zbiór skarbów (każdy skarb zna swój rozmiar). 
Krasnoludy to kolekcja krasnoludów (różne krasnoludy mogą mieć różne
strategie pobierania skarbów, zaimplementuj to w sposób obiektowy; podaj realizację
krasnoluda zdającego się na los, pobierającego skarby do uzyskania wymyślonego przez
siebie procentu objętości worka i krasnoluda-statystyka wyliczającego na bieżąco wartość
oczekiwaną kolejnego skarbu). 

Worki to kolekcja worków (worek wie jaką ma pojemność i w jakim stopniu jest wypełniony). 
Jeśli wszystkie krasnoludy uznają worki za wypełnione, a są
jeszcze skarby, to Bilbo przekazuje zawartość worków krasnoludom i zaczyna rozdzielanie
reszty skarbu według tych samych zasad. 
Jeśli w trakcie rozdzielania jakiś krasnolud okaże
się zbyt zachłanny i przekroczy rozmiar swojego worka, to wszystkie skarby z jego worka
przechodzą na własność Bilba. 
Jeśli w trakcie rozdzielania zabraknie skarbów, to rozdzielanie
się oczywiście kończy. 
Po całkowitym zakończeniu rozdzielania skarbów Bilbo przekazuje
zawartość worków krasnoludom. 

### Uwaga 2: 
- Można założyć, że żaden skarb nie jest większy od wszystkich worków. 
Należy na początku dzielenia sprawdzić, czy liczba worków jest taka jak
krasnoludów i czy są na początku puste. 
- Krasnoludy mogą oglądać zawartości wszystkich
worków (w szczególności swojego) tylko za pomocą Bilba. Na koniec rozdzielania należy
wypisać, który krasnolud ile i jakich skarbów dostał.

### Uwaga 2:
Projekt powinien również zawierać odpowiednie testy jednostkowe do implementowanej funkcjonalności.

---

*Zadanie pracowane na podstawie zadania prezentowanego na przedmiocie: [Programowanie Obiektowe](https://www.mimuw.edu.pl/~janusz/dydaktyka/2001-2002/zsi_nmjp/zsi_nmjp.html)
na [Wydziale Matematyki, Informatyki i Mechaniki UW](https://www.mimuw.edu.pl/).*