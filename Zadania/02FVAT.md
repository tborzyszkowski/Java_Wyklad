# Zadanie: modelowanie faktury VAT

| Termin oddania | Punkty     |
|----------------|:-----------|
| 22.11.2019     |  10        |

Po zakupach w sklepie internetowym, klientowi na wskazany adres email, będzie wysłana faktura VAT. 
Twoim zadaniem jest napisanie logiki, która na podstawie zawartości koszyka z zakupami / produktami 
będzie generowała dane do faktury VAT, takie jak:
- Pozycje faktury, każda pozycja powinna skłądać się z:
    - Nazwy produktu
    - Ilości zamówionego towaru
    - Ceny jednostkowej netto
    - Ceny netto pozycji (cena jednostkowa razy ilość)
    - Podatek VAT
    - Wyliczona cena brutto
- Wartość całkowita faktury (suma cen brutto ze wszystkich pozycji)
- Dane klienta/sprzedającego:
    - Nazwa firmy
    - Adres
    - Numer NIP
    - Konto bankowe (sprzedający)
- Wygenerowany numer faktury
- Data wystawienia dokumentu
- Data sprzedaży
- Data zapłaty

Zaprojektuj zestaw klas, które zamodelują powyższy problem.

### Uwaga
Przed napisaniem każdej klasy stwórz dla niej odpowiednie testy jednostkowe, które klasa powinna spełniać.
