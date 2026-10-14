package se.lexicon;

public class ReceiptBuilder {
    void main(){
        StringBuilder receipt = new StringBuilder();
        double grandTotal =0;
        while(true){
        String itemName = IO.readln("Enter item name ( or 'done' ): ");
        if(itemName.equalsIgnoreCase("done")){
            break;
        }
        double itemPrice= Double.parseDouble(IO.readln("Enter price: "));
        receipt.append(String.format("%-20s %8.2f%n",itemName,itemPrice));
        grandTotal+= itemPrice;
        }
     IO.println("==============================");
     IO.println("        Receipt");
     IO.println("==============================");
     IO.println(receipt.toString());
     IO.println("------------------------------");
     IO.println(String.format("Grand total: %17.2f", grandTotal));
     IO.println("==============================");

    }
}
