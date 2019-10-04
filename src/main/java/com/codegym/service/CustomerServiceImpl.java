package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customers;
    private static int autoId = 0;

    static {
        customers = new HashMap<>();
        customers.put(autoId, new Customer(autoId++, "An", "an@codegym.vn", "Hanoi"));
        customers.put(autoId, new Customer(autoId++, "Binh", "binh@codegym.vn", "Hue"));
        customers.put(autoId, new Customer(autoId++, "Duc", "duc@codegym.vn", "Tokyo"));
        customers.put(autoId, new Customer(autoId++, "Nam", "nam@codegym.vn", "London"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }

    @Override
    public int getSize() {
        return autoId;
    }
}
