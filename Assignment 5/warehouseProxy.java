import java.util.List;

class warehouseProxy implements wareHouse {
    private realWareHouse realWarehouse;

    @Override
    public List<String> listProducts() {
        if (realWarehouse == null) {
            realWarehouse = new realWareHouse();
        }

        return realWarehouse.listProducts();
    }

    @Override
    public String sellProduct(String product)
    {
        if(realWarehouse==null)
        {
            realWarehouse = new realWareHouse();
        }

        return realWarehouse.sellProduct(product);
    }
}