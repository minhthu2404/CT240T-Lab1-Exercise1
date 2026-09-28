
import java.io.*;
import java.util.*;

public class ElectronicProduct extends Product implements Discountable {

    private int warrantyMonths;

    public ElectronicProduct(
            String id,
            String name,
            double price,
            int warrantyMonths) {

        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double calculateFinalPrice() {
        return getPrice() * 1.10;
    }

    @Override
    public void applyDiscount(double percent) {
        double discountAmount = getPrice() * percent / 100;
        setPrice(getPrice() - discountAmount);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(int warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }
}