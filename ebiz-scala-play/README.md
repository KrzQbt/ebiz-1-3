Aplikacja w play framework

1. Kontroler produktów
2. Endpointy crud z listą przechowującą dane:
    * Wszystkie produkty: GET /product
    * Dodaj produkt: POST /product z jsonem w body
    * Zmień produkt: PUT /product/id z jsonem w body
    * Usuń produkt: DELETE /product/id


Przykładowy JSON:
{
"id" : 1,
"name" : "some name",
"categoryId" : 1,
"description" : "some product"
}