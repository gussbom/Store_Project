package org.omegaStores.services.implementation;

import org.omegaStores.enums.Roles;
import org.omegaStores.models.Cashier;
import org.omegaStores.models.Customer;
import org.omegaStores.models.Manager;
import org.omegaStores.models.Product;
import org.omegaStores.services.CashierService;
import org.omegaStores.services.CustomerService;
import java.io.*;
import java.util.*;


public class CashierServicesImplementation implements CashierService, CustomerService {
        Scanner findProduct;

        @Override
        public String makePayment(Customer customer, Product product) {

                product.setProductPrice(product.getProductPrice() * product.getProductPurchaseQuantity());

                if (customer.getPurchasePower() > product.getProductPrice()) {
                        customer.setCustomerChange(customer.getPurchasePower() - product.getProductPrice());
                        return  issueReceipt(customer, product);
                } else
                        return customer.getCustomerName()+ " Your money is not enough";
        }

        @Override
        public String issueReceipt(Customer customer, Product product) {

                String receipt =
                        ("   Customer name: "+ customer.getCustomerName() + "\n"+
                         "  Contact Number: "+ customer.getContactNumber() + "\n"+
                         "    Product Name: "+ product.getProductName()+ "\n"+
                         "      Unit Price: "+ "#"+product.getProductPrice()+"\n"+
                         "Quantity Ordered: "+ product.getProductPurchaseQuantity() + "\n"+
                         " Amount tendered: "+ "#"+customer.getPurchasePower() + "\n"+
                         " Cost of Product: "+  "\n"+
                         "  Balance Change: "+ "#"+customer.getCustomerChange());

                return receipt;
        }

        @Override
        public String staffCheckIn(Cashier cashier) {
                if(cashier.getStaffRole().equals(Roles.CASHIER)){
                        return "Welcome "+ cashier.getStaffName();
                }else
                        return "You're not a cashier "+ cashier.getStaffName();
        }


        public void openFile(){
                try{
                        findProduct = new Scanner(new File("/Users/decagon/Desktop/week_two_task_sq015-GusBom/main/resources/productInventory"));
                }catch(Exception e){
                        System.out.println("File not found");
                }
        }
        public void closeFile(){
                findProduct.close();
        }

        @Override
        public String shopForProducts(Customer customer, Product product) {
                openFile();
                String value[] = new String[3];

                while(findProduct.hasNext()){
                        String tempory[] = findProduct.next().split(",");

                        if(product.getProductName().equals(tempory[0]))
                        {
                                int price = Integer.parseInt(tempory[1]);
                                int prodQuantity = Integer.parseInt(tempory[2]);
                                product.setProductPrice(price);
                                product.setProductStockQuantity(prodQuantity);
                                value = tempory;
                        }
                }

                if(product.getProductName().equals(value[0])) {
                        if (product.getProductStockQuantity()==0){
                                return product.getProductName() + " is Out of Stock";
                        } else
                        if (product.getProductStockQuantity() < product.getProductPurchaseQuantity()) {
                                return "Your demand exceeds current stock";
                } else {
                                CashierServicesImplementation customerMakePayment = new CashierServicesImplementation();
                                return customerMakePayment.makePayment
                                        (customer,product);}
                } else
                        closeFile();
                        return product.getProductName() + " Does not exist.";
}

}