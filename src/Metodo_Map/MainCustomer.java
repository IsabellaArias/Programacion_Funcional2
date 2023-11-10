package Metodo_Map;

import Metodo_Map.Customer;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainCustomer {
    public static void main(String[] args) {
        List<Customer>customers = Arrays.asList(new Customer("Diego","3131212","diego23"));
        List<Customer>customertransform = customers.stream()
                .map(customer -> {
                            customer.setName(customer.getName());
                            customer.setPhoneNumber("4646456");
                            customer.setGmail(customer.getGmail());
                            return customer;
                        }
                )
                .collect(Collectors.toList());
        customertransform.forEach(customer -> System.out.println(customer.getName() + " " + customer.getPhoneNumber() + " " + customer.getGmail()));
    }
}