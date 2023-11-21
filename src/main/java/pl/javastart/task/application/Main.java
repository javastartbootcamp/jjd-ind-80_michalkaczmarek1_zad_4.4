package pl.javastart.task.application;

import pl.javastart.task.logic.CustomerService;
import pl.javastart.task.data.Offer;
import pl.javastart.task.data.SalesRepresentative;

public class Main {
    public static void main(String[] args) {
        SalesRepresentative salesRepresentative = new SalesRepresentative();
        Offer offer = salesRepresentative.createLoanOffer(1_000_000, 2000);
        CustomerService customerService = new CustomerService();
        customerService.payoutOffer(offer);
    }
}