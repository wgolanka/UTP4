/**
 *
 *  @author Golanka Wiktoria S15565
 *
 */

package zad2;



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomersPurchaseSortFind {

    List<String> customerDesc;
    List<Purchase> purchases;

    private void convertDescToPurchase(){
        purchases = new LinkedList<>();
        Purchase purchase;
        String[] customer;
        for(String line : customerDesc){
            customer = line.split(";|\\s");
            purchase = new Purchase();
            purchase.setCustomerId(customer[0]);
            purchase.setCustomerName(customer[1]);
            purchase.setCustomerSurname(customer[2]);
            purchase.setProductName(customer[3]);
            purchase.setProductPrice(Double.valueOf(customer[4]));
//            purchase.products.put(customer[3], Double.valueOf(customer[4]));
            purchase.setQuantity(Double.valueOf(customer[5]));
            purchases.add(purchase);
        }
    }

    public void readFile(String fileName) {
        customerDesc = new LinkedList<>();
        Scanner scan = null;
        try {
            scan = new Scanner(new File(fileName));
            while (scan.hasNext()) {
                customerDesc.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if(scan != null) scan.close();
        convertDescToPurchase();
    }



    public static void main(String[] args){
        CustomersPurchaseSortFind c = new CustomersPurchaseSortFind();
        String fname = System.getProperty("user.home") + "/customers.txt";
        c.readFile(fname);
        for( String line : c.customerDesc){
            System.out.println(line);
        }

        for( Purchase purchase : c.purchases){
            System.out.println(purchase);
        }
    }

    public void showSortedBy(String surname) {
        if(surname.equals("Nazwiska")){
            showSortedBySurname();
        }else if(surname.equals("Koszty")){
            showSortedByCosts();
        }
    }

    private void showSortedBySurname() {
        for(Purchase purchase : purchases){
            System.out.println(purchase);
        }
        System.out.println();
        Collections.sort(purchases, Purchase.surnameComparator);
//        purchases.sort( (a, b) ->
//                a.getGetCustomerSurname().compareTo(b.getCustomerSurname));
        for(Purchase purchase : purchases){
            System.out.println(purchase);
        }
    }

    private void showSortedByCosts() {

    }

    public void showPurchaseFor(String idCustomer) {

    }
}
