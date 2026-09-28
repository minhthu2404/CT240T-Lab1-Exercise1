import java.util.ArrayList;
import java.util.List;

public class ProductInventory {

    private List<Product> products;

    public ProductInventory() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product != null) {
            products.add(product);
        }
    }

    public void removeProduct(String id) {
        if (id == null) {
            return;
        }

        products.removeIf(product -> id.equals(product.getId()));
    }

    public Product findProductByName(String name) {
        if (name == null) {
            return null;
        }

        for (Product product : products) {
            if (name.equalsIgnoreCase(product.getName())) {
                return product;
            }
        }

        return null;
    }

    public double calculateTotalInventoryValue() {
        double total = 0;

        for (Product product : products) {
            total += product.calculateFinalPrice();
        }

        return total;
    }
}