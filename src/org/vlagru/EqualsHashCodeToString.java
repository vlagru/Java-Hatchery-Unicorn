package org.vlagru;



public class EqualsHashCodeToString {
    // toString vsude, kde chceme neco tisknout


    //sdeluje jake cislo hash dany objekt dostane a podle toho hashe cislo dohledavame podle hashovych struktur 'hashset', 'hasmap',
    // 'hashtable'
    /*
    kdyz ukladam do hashset, do kbeliku se objekty prirazuji podle toho, jaky se jim spocita hascode
    hashovaci struktura si vytvori hashovaci kbelik, mohou mit dve cisla stejny hash
    //dulezite je, aby hashe byly rychlé, hashset vs list, když hledáme v listu, musíme projít celý
    výhoda hashovacich struktur, nejdrive si spocitame hash, podle toho jdeme do kebilku, do konretniho kbeliku,
    tam se pouzije metoda equals a podle toho dohledame
    prirazeni hash pro praci v hashovacich strukturach, podle toho se pak dohledava
    hashcode musi stejne jako equals byt konsistentni, hascode se nesmi zmenit
    hashcode a equaůs neprepisujeme, nez se nam to bude hodit v nejakych strukturach
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // pro spravnou fci kolekci,
    //1.reflexe .equals(x) = true
    //2.symetrie x.equals(Y) = y.equals(x
    // 3. tranzitivni pridam jeste do 2 z
    // 4. konzistence - ze konst nastavena a nemuze nikdy nikd prepsat 'final'
    //5. x.equals(null) =false
    // do equals nej finalni promenne
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString(); // da se prepsat, aby to bylo smyslplnejsi
    }

    public static void main(String[] args) {

    }

}
