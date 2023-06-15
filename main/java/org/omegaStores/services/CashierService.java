package org.omegaStores.services;

import org.omegaStores.models.Cashier;
import org.omegaStores.models.Customer;
import org.omegaStores.models.Product;

public interface CashierService {
    String makePayment(Customer customer, Product product);

    String issueReceipt(Customer customer, Product product);

    String staffCheckIn(Cashier cashier);
}
