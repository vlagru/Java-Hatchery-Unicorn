//package org.vlagru;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.InputStream;
//
//public class Vyjimky {
//
//    /*
//    * checked
//    * unchecked
//    * error
//    * class Throwable
//    * error chyba, kterou by dev nemel vubec odchytavat (napr. out of memory, app rachne)
//    * kontrolovane vyjimky:  musi osetrit, vsechny, ktere nededi od runtime exception FileNotFoundException
//    * throws File... atd. postara se nekdo jiny
//    * nebo try catch klauzule
//    * nekontrolovane vyjimky: ktere dedi, nemusi osetrovat
//    */
//    public static void main(String[] args) throws IOException {
////        try{
////            throw new IOException();
////        } catch ()
////        throws new IOException();
//
//        canThrowException();
//
//        public static void canThrowException() throws IOException {
//            throw new IOException();
//        }
//
//
////        //System.out.println(args[0]);
////        try{
////            InputStream is = new FileInputStream("test");
////
////            //nelze pajpnout rodice a potomka
////        } catch (FileNotFoundException e | IOException e) {
////
////        } catch (Exception e) {
////
////            //provede se vzdy bez ohledu na vyjimku
////        } finally {
////            System.out.println("inside finally");
////        }
//
//    }
//}
