import java.util.ArrayList;
import java.util.List;

class realWareHouse implements wareHouse {
    @Override
    public List<String> listProducts() {
        List<String> products = new ArrayList<>();
        products.add("Cellphone");
        products.add("Samsung");
        products.add("Nokia");
        products.add("Xiaomi");
        products.add("Realme");
        return products;
    }

    @Override
    public String sellProduct(String product)
    {
        List<String>products = listProducts();
        for(String prod : products)
        {
            if(product==prod)
            {
                return prod;
            }
        }
        return "Not available";
    }
}