# Zadanie: JavaMarkt

| Termin oddania | Punkty     |
|----------------|:-----------|
| 29.11.2019     |  10        |

--- 
Przekroczenie terminu o **n** zajęć wiąże się z karą:
- punkty uzyskania za realizację zadania są dzielone przez **2<sup>n</sup>**.

--- 

Twoja firma dostała zlecenie na stworzenie oprogramowania dla dużego sklepu internetowego *JavaMarkt*. 
Jedną z podstawowych funkcjonalności będzie oprogramowanie koszyka zakupów, 
który potrafiłby uwzględniać różne promocje, rabaty oraz oferty specjalne, takie jak:
- jeśli wartość zamówienia jest większa niż 300 zł klient otrzymuje 5% zniżki na zakupione towary
- jeśli klient kupi 2 produkty to 3 najtańszy otrzymuje gratis
- jeśli wartość zamówienia przekracza wartość 200 zł klient otrzymuje firmowy kubek gratis
- jednorazowy kupon rabatowy 30% na wybrany produkt

Towary w koszyku powinny być posegregowane malejąco według ceny, 
a potem według kolejności alfabetycznej nazw produktów.

Twoim zadaniem jest zaimplementowanie logiki, operującej na obiektach typu ``Product``, 
która umożliwiałaby:
1. Wyszukiwanie najtańszego/najdroższego produktu w zadanej kolekcji produktów
2. Wyszukiwanie n najtańszych/najdrożyszych produktów w zadanej kolekcji produktów
3. Sortowanie kolekcji produktów po cenie jak i po nazwie
4. Wyliczanie sumy cen wszystkich zadanych produktów
5. Wyświetlanie w konsoli informacje o wszystkich produktach w zadanej kolekcji produktów
6. Aplikowanie opisanych powyżej rodzajów promocji na zadanej kolekcji produktów

Specyfikacja klasy ``Product``:
- pola w klasie:
    - kod produktu (code) - String
    - nazwa produktu (name) - String
    - cena produktu (price) – double
    - cena produktu po uwzględnieniu promocji (discountPrice) - double

W tym zadaniu użyj tablicy produktów jako kolekcji, na której będziesz operował.

### Uwaga
Projekt powinien również zawierać odpowiednie testy jednostkowe do implementowanej funkcjonalności.
