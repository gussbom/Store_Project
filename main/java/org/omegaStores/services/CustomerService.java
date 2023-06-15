package org.omegaStores.services;
import org.omegaStores.models.Customer;
import org.omegaStores.models.Product;

public interface CustomerService {

    String shopForProducts(Customer customer, Product product);

}

