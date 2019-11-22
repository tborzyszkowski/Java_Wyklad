# Zadanie: Bank

| Termin oddania | Punkty     |
|----------------|:-----------|
| 29.11.2019     |  10        |

--- 
Przekroczenie terminu o **n** zajęć wiąże się z karą:
- punkty uzyskania za realizację zadania są dzielone przez **2<sup>n</sup>**.

--- 

System bankowy pozwala na zlecenie operacji bankowych na rachunku klienta. 
Do takich operacji należą:
- wpłata środków na konto
- wypłata środków z konta
- wykonanie przelewu z konta na konto

Każda taka operacja jest odkładana w historii rachunku bankowego bądź rachunków 
(jeżeli jest to przelew z konta na konto). 
Klient banku może przeglądać historię swojego konta z wybranego okresu czasu.
Zaprojektuj zestaw klas, które będą modelowały zachowanie historii konta bankowego oraz napisz logikę, 
dzięki której będzie można wybrać logi historii z dowolnego przedziału czasowego.

### Uwaga
Przed napisaniem każdej klasy stwórz dla niej odpowiednie testy jednostkowe, które klasa powinna spełniać.
