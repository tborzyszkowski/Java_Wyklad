# Zadanie 

## Punkt

Napisać klasę ``Punkt``, która:
- modeluje punkt na płaszczyźnie kartezjańskiej
- posiada konstruktory:
	- bezargumentowy
	- z argumentami ``x`` i ``y`` będącymi współrzędnymi punktu
	- z argumentem będącym punktem; zadaniem konstruktora jest stworzenie drugiego identycznego punktu
- jest wyposażona w metody ``getX``, ``setX``, ``getY``, ``setY`
- posiada metodę ``shift(x, y)`` pozwalającą przesunąć obiekt typu ``Punkt`` przesunąć o wektor (x, y)
- posiada metodę ``distance(p)`` obliczającą odległość bieżącego punktu od punktu (x, y)

## Punt testy
- do projektu dodać bibliotekę JUnit
- dla tworzonych funkcjonalności dla klasy ``Punkt`` stworzyć odpowiednie metody testowe
