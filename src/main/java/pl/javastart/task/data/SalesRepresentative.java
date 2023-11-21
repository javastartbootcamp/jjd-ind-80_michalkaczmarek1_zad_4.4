package pl.javastart.task.data;

public class SalesRepresentative {

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
