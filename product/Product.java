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
