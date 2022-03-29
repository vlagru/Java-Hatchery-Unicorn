package org.vlagru;

public class Dedicnost {
    // trida muze dedit prave a jen od jedne tridy
    // nelze dedit od vice trid
    //final lze pouzit i pro tridy, nesmi se od ni dedit
    //implicitni dedicnost - vsechny objekty dedi java.lang.object doda automaticky, nemusime psat
    // this a super this a super musi byt 1 . volanim v konstruktortu this(5), this.i, super(8), super.i
    //tridu nelze podedit, pokud jsou jeji konstruktory privatni

    //prepisobani @overriding : modifikator pristupu rodice public potomek nesmi mit protected, pristupnost musi byt minimalne takova,
    //jako je u rodice, ne prisnejsi, animal vs dog + potomek musi mit jeste kovariantni navratovy typ, takovy datovy typ,
    //do ktereho jsem schopny priradit, Number nebo potomka number tedy Integer, nejde to naopak, Number je abstraktni trida vrapperu vsech cisel
    //nelze private metodu rodice override treba na public
    //pozor na hiding, nelze dedit instancni promenne od predka pouze this.age + super.age (z veku predka udelam vek potomka)
    //u stattickych metod tak tady takz hoding, prepsani nstejny naze stajne parametry pro presi metody rodice
    //pretezovat lze tak, aby navratovy typ potomka byl kovariantni

    // polymorfism, kvuli pretypovavani 'instanceOF'
    // Animal animal = new Cat();
//    if (animal instanceof Cat) {
//        Cat cat = (Cat) animal;
//        cat.meow
//    }

}
