import java.util.Scanner;

public class Product {
    private String name;
    private String color;
    private String brand;
    private Integer quantity;

    //public Product() {

   // }
    public Product(String name, String color, String brand, Integer quantity) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.quantity = quantity;
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
                this.chooseProduct();
                break;
            case 3:
                System.out.println("option 3");
                break;
            default:
                System.out.println("Invalid Command!");
                break;
        }
    }

    public void chooseProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which product? ");
        String product = scanner.nextLine();

        System.out.println("How many products would you like to add? ");
        int newQuantity = scanner.nextInt();
        this.changeItemQuantity(product, newQuantity);
    }

    public void changeItemQuantity(String product, int newQuantity){
        int  originalQuantity = this.quantity;
        int  uptadedQuantity = (originalQuantity += newQuantity);
        System.out.printf("New %c quantity is: %d", product, uptadedQuantity);
    }
}
