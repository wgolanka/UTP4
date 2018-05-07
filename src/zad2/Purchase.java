/**
 * @author Golanka Wiktoria S15565
 */

package zad2;


import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Purchase implements Comparable<Purchase> {

    String customerId;
    String customerName;
    String customerSurname;
    Map<String, Double> products; //maybe that

    String productName;
    Double productPrice;
    Double quantity;

    public static Comparator<Purchase> surnameComparator = new Comparator<Purchase>() {
        @Override
        public int compare(Purchase e1, Purchase e2) {
            return e1.getCustomerSurname().compareTo(e2.getCustomerSurname());
        }
    };

    public static Comparator<Purchase> idComparator = new Comparator<Purchase>() {
        @Override
        public int compare(Purchase e1, Purchase e2) {
            return Integer.valueOf(e1.getCustomerId()).compareTo(Integer.valueOf(e2.getCustomerId()));
        }
    };

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Purchase() {
        products = new HashMap<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerSurname() {
        return customerSurname;
    }

    public void setCustomerSurname(String getCustomerSurname) {
        this.customerSurname = getCustomerSurname;
    }

    public Map<String, Double> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Double> products) {
        this.products = products;
    }


    @Override
    public String toString() {
        return customerId + ";" +
                customerName + " " +
                customerSurname + ";" +
                productName + ";" +
                productPrice + ";" +
                quantity;
    }

    @Override
    public int compareTo(Purchase o) {
        System.out.println("COMPARE TO");
        return 0;
    }
}
