package org.omegaStores;

import org.omegaStores.models.Customer;
import org.omegaStores.models.Product;
import org.omegaStores.services.implementation.CashierServicesImplementation;

public class Main {

    public static void main(String[] args) {

        Customer customerData = new Customer("Kwankwaso","418",200);
        Product findProduct = new Product("Fish",3);

        CashierServicesImplementation newCustomer = new CashierServicesImplementation();
        System.out.println(newCustomer.shopForProducts(customerData, findProduct));

//        System.out.println(newCustomer.getCustomerName());
//        Product prod = new Product(3000,"Chicken","CHK##*@");
////        Manager Services to log-in and to recruit new staff based on applicant religion, age, or ethnicity;
//        ManagerServices manager = new ManagerServices();
//        System.out.println(manager.hireNewEmployee("Binta",
//                "Confucianism",46,"Ijaw"));
//        System.out.println(manager.staffCheckIn("Benson",1234,"Manager"));


//        Cashier services to log-in, and to print receipts based on customer purchase request
//        CashierServicesImp cashierService = new CashierServicesImp();
//        System.out.println(cashierService.staffCheckIn("Joy", 1234, "Cashier"));
//        System.out.println(cashierService.customerProductPurchase
//                (4000,"John","Chicken","089"));
    }
}