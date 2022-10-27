import java.util.Scanner;

public class Product {
    private String name;
    private String color;
    private String brand;
    private Integer quantity;

    public Product() {

    }

    //public Product(String name, String color, String brand, Integer quantity) {
    //    this.name = name;
    //    this.color = color;
    //    this.brand = brand;
   //     this.quantity = quantity;
   // }

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
                this.chooseProduct(option);
                break;
            case 3:
                this.chooseProduct(option);
                break;
            default:
                System.out.println("Invalid Command!");
                break;
        }
    }

    public void chooseProduct(int option){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product? ");
        String product = scanner.nextLine();

        System.out.println("How many products? ");
        int newQuantity = scanner.nextInt();

        if(option == 2){
            this.addItemQuantity(product, newQuantity);
        }
        else if(option == 3){
            this.removeItemQuantity(product, newQuantity);
        }
        else{
            System.out.println("Invalid command!");
        }

    }

    public void addItemQuantity(String product, int newQuantity){
        int uptadedQuantity = this.quantity += newQuantity;
        System.out.printf("New %s quantity is: %d", product, uptadedQuantity);
    }

    public void removeItemQuantity(String product, int quantityToRemove){
        if(this.quantity >= 0){
            int uptadedQuantity = this.quantity - quantityToRemove;
            System.out.printf("New %s quantity is: %d", product, uptadedQuantity);
        }
        else {
            System.out.printf("There is not enough quantity for this item!");
        }
    }
}
