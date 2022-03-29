package org.vlagru;

public class AbstraktniTridy {
    // potomci jsou povinni abstraktni metodu implementovat, pokud sami nejsou abstraktni
    // navrhovy vzor template method, tam by mohla byt implementace abstraktni metody
    // s ohledem na modifikatory pristupu problemy s private, private metoda nelze prepsat, tedy implementovat,abstraktni metoda
    // nemuze byt final a nemuze byt takova metoda static, abst metoda veci instance
    /*
    * stejne modifikatory metod jako u tridy
    * ab trida muze byt public, nemuze byt protected nebo private, protected nelze zdedit
    * a t nemusi mit abstraktni metody
    *
    * */

/*
* Interface
* typicku pojmenovane able 'Swimable'
* abstraktni motedu, z povahy jsou vsechny jeho metody public a abstraktni
* nemuze mit instancni promenou, nelze instancovat
* od Java8
* public default int length() {
* return 1;
* }
* neni problem implementovat vice rozhrani vs. tridy mohou dedit jen jednou
* @Override
* public int getLength(){
*   return Swimable.super.getLength; - metoda prepsana a odkud se ma brat
* }
*
* z tozhrani nelze instanci
* metodz nelze private, final, ale jsou public vsechny
* rozhrani muze dedit od dalsiho rozhrani
* */

}
