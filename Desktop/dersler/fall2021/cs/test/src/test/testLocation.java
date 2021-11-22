package test;

import java.util.Scanner;
import java.util.LinkedList;

public class testLocation {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      LinkedList<ListItem> newArray = new LinkedList<>();
      // TODO: Declare a LinkedList called shoppingList of type ListItem
      
      String item;
      System.out.println("Birsey: ");
      item = scnr.next();
      while(item.length() != 2 && item.charAt(0) != '-' && item.charAt(1) != '1'){
         
            newArray.add(new ListItem(item));
            System.out.println("Birsey: ");
            item = scnr.next();
            
         }
         
      // TODO: Scan inputs (items) and add them to the shoppingList LinkedList
      //       Read inputs until a -1 is input
     
     for(int index = 0; index<newArray.size(); ++index){
          newArray.get(index).printNodeData();
        }
      // TODO: Print the shoppingList LinkedList using the printNodeData() method
    

   }
}