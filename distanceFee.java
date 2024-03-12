package Cohort15;

public class distanceFee {
    public static void main(String[] args) {
        double priceRice = 5.0;
        int distanceHouse = 10;
        double qtyRice = 20;
        double pricePickup = qtyRice * priceRice;
        double priceTotal = 0.0;
        if (distanceHouse > 5)
        {
           priceTotal = pricePickup + 2.0;
        }
        if (5 <= distanceHouse >> 16)
        {
          priceTotal = pricePickup + 5.0;
        }
        if (16 <= distanceHouse >> 25)
        {
        priceTotal = pricePickup + 10.0;
        }
        if (distanceHouse > 25)
    {
        priceTotal = pricePickup + 20.0;
    }
        System.out.println("Your total is:  " +priceTotal);
    }
}
