public class Product {
    private String name;
    private String color;
    private String brand;
    private Integer quantity;

    public Product() {

    }
    public void showMenu(){
        System.out.println("""
                Welcome to our store!
                What would you like to do today?
                1- View storage
                2 - Add item to storage
                3 - Delete item from storage
                """);
    }
}
