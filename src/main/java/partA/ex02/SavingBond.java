package partA.ex02;

public class SavingBond {public double months;
    public double bond;

    public void termAndInterest()
    {
        double money = 0;

        if (months > 47)
        {
            money = bond * (1 + (.025 * (months / 12)));
        }else if (months > 35) {
            money = bond * (1 + (.02 * (months / 12)));
        }else if (months > 23) {
            money = bond * (1 + (.015 * (months / 12)));
        }else if (months > 11) {
            money = bond * (1 + (.01 * (months / 12)));
        }else if (months >= 0) {
            money = bond * (1 +(.005 * (months / 12)));
        }
        System.out.println("Total money owed is: $" + String.format("%.2f", money));
    }
}
