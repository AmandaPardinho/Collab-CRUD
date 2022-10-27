package product;

import javax.swing.*;
import java.util.Scanner;

public class Product {
    private String name;
    private String color;
    private String brand;
    private Integer quantity;

    public Product() {

    }

    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to our store!
                What would you like to do today?
                1- View storage
                2 - Add item to storage
                3 - Delete item from storage
                """);

        int option = scanner.nextInt();

        switch (option){
            case 1:
                System.out.println("option 1");
                break;
            case 2:
                System.out.println("option 2");
                break;
            case 3:
                System.out.println("option 3");
                break;
            default:
                System.out.println("Invalid Command!");
                break;
        }
    }

    public void addItemQuantity(String product, int newQuantity){
        int uptadedQuantity = this.quantity += newQuantity;
        System.out.printf("New %s quantity is: %d", product, uptadedQuantity);
    }

    public void removeItemQuantity(String product, int quantityToRemove){
        if(this.quantity >= 0){
            int uptadedQuantity = this.quantity - quantityToRemove;
            JOptionPane.showMessageDialog(null, "New %s quantity is: %d" + product +
                    uptadedQuantity, "Removed Successfully", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "There is not enough quantity for this item!",
                    "Removal error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
