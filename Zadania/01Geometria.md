# Zadanie 

## Punkt

Napisać klasę ``Punkt``, która:
- modeluje punkt na płaszczyźnie kartezjańskiej
- posiada konstruktory:
	- bezargumentowy
	- z argumentami ``x`` i ``y`` będącymi współrzędnymi punktu
	- z argumentem będącym punktem; zadaniem konstruktora jest stworzenie drugiego identycznego punktu
- jest wyposażona w metody ``getX``, ``setX``, ``getY``, ``setY`
- posiada metodę ``shift(x, y)`` pozwalającą przesunąć obiekt typu ``Punkt`` o wektor (x, y)
- posiada metodę ``distance(p)`` obliczającą odległość bieżącego punktu od punktu ``p``

## Punt testy
- do projektu dodać bibliotekę JUnit
- dla tworzonych funkcjonalności dla klasy ``Punkt`` stworzyć odpowiednie metody testowe

## Odcinek

Napisać klasę ``Odcinek``, która:
- modeluje odcinek na płaszczyźnie za pomocą dwóch punktów
- posiada konstruktory:
    - bezargumentowy
    - z dwoma punktami
    - ze współrzędnymi dwóch punktów
    - z kombinacjami punktu i współrzędnych punktu
- posiada metodę ``shift(x, y)`` pozwalającą przesunąć obiekt typu ``Odcinek`` o wektor (x, y)
- posiada metodę ``pointDistance(p)`` obliczającą odległość bieżącego odcinka od punktu ``p``

## Odcinek testy
- dla tworzonych funkcjonalności dla klasy ``Odcinek`` stworzyć odpowiednie metody testowe
- spróbować tworzyć nowe funkcjonalności zgodnie z Test Driven Development, 
tj. najpierw piszemy testy do funkcjonalności, a potem funkcjonalność spełniającą testy
