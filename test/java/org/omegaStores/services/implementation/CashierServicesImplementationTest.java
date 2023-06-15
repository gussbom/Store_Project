package org.omegaStores.services.implementation;

import junit.framework.TestCase;
import org.omegaStores.enums.Roles;
import org.omegaStores.models.Cashier;
import org.omegaStores.models.Customer;
import org.omegaStores.models.Product;

import static org.junit.Assert.assertEquals;

public class CashierServicesImplementationTest extends TestCase {

    public void testMakePayment() {
        CashierServicesImplementation cashierServicesImplementation = new CashierServicesImplementation();
        Customer customer = new Customer("Jide","098",2100);
        Product product = new Product(1800,"Chicken",12,10);

        String actual = cashierServicesImplementation.makePayment(customer,product);

        String expected = cashierServicesImplementation.issueReceipt(customer, product);
        String expected2 = customer.getCustomerName()+ " Your money is not enough";

        assertEquals(expected, actual);
    }

    public void testIssueReceipt() {
        CashierServicesImplementation cashierServicesImplementation = new CashierServicesImplementation();
        Customer customer = new Customer(2100,"098","2100",300);
        Product product = new Product(1800,"Chicken",12,10);

        String actual = cashierServicesImplementation.issueReceipt(customer,product);
        String expected = "   Customer name: "+ customer.getCustomerName() + "\n"+
                "  Contact Number: "+ customer.getContactNumber() + "\n"+
                "    Product Name: "+ product.getProductName()+ "\n"+
                "      Unit Price: "+ "#"+product.getProductPrice()+"\n"+
                "Quantity Ordered: "+ product.getProductPurchaseQuantity() + "\n"+
                " Amount tendered: "+ "#"+customer.getPurchasePower() + "\n"+
                " Cost of Product: "+  "\n"+
                "  Balance Change: "+ "#"+customer.getCustomerChange();

        assertEquals(expected,actual);
    }

    public void testStaffCheckIn() {
        Cashier cashier = new Cashier("Jane",123, Roles.CASHIER);
        CashierServicesImplementation cash = new CashierServicesImplementation();


        String actual = cash.staffCheckIn(cashier);
        String expected = "Welcome "+ cashier.getStaffName(); ;
        String expected2 = "You're not a cashier "+ cashier.getStaffName();;
        assertEquals(expected,actual);
    }

    public void testShopForProducts() {
    }
}