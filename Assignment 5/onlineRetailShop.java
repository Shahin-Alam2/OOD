import java.util.List;

public class onlineRetailShop {
    public static void main(String[] args) {
        Warehouse warehouse = new WarehouseProxy();

        List<String> products = warehouse.listProducts();

        System.out.println("Available Products:");
        for (String product : products) {
            System.out.println(product);
        }

        System.out.println("Selling : "+warehouse.sellProduct("Nokia"));
        System.out.println("Selling : " + warehouse.sellProduct("Xiaomi"));
    }
}
