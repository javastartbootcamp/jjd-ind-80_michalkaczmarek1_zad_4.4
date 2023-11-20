package pl.javastart.task.data;

import pl.javastart.task.logic.Config;

public class SalesRepresentative {

    public Config config;

    public Offer createLoanOffer(int requestedAmount, int earnings) {
        Offer offer = new Offer();
        if (earnings >= Config.minRequiredEarnings) {
            offer.setValid(true);
            offer.setValue(requestedAmount);
            offer.setPercentage(Config.percentage);
            return offer;
        }
        return offer;
    }

}
