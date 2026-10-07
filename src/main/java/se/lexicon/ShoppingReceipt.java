package se.lexicon;

public class ShoppingReceipt {
    void main(){
        String name1 = "Apple";
        int quantity1 = 2 ;
        double price1 = 15.0 ;

        String name2 = "Milk" ;
        int quantity2 = 1 ;
        double price2 = 22.50 ;

        String name3 = "Bread" ;
        int quantity3 = 3 ;
        double price3 = 18.0 ;

        double total1 = quantity1 * price1;
        double total2 = quantity2 * price2;
        double total3 = quantity3 * price3;

        double grandTotal = total1+total2+total3;

        IO.println("============================");
        IO.println("       Receipt           ");
        IO.println("============================");

        IO.println(name1 +"    " +quantity1 +" x " +price1 +" = " +total1 +" SEK");
        IO.println(name2 +"     "+quantity2 +" x " +price2 +" = " +total2 +" SEK");
        IO.println(name3 +"    "+quantity3 +" x " +price3 +" = " +total3 +" SEK");
        IO.println("----------------------------");
        IO.println("Grand Total:       "+grandTotal +"  SEK");
        IO.println("============================");




    }
}
