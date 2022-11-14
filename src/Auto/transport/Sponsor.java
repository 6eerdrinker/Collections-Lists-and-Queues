package Auto.transport;

public class Sponsor <T extends Transport>{
    private final String name;
    private final int amountSum;

    public Sponsor(String name, int amountSum) {
        this.name = name;
        this.amountSum = amountSum;
    }

    public String getName() {
        return name;
    }

    public int getAmountSum() {
        return amountSum;
    }

    public void giveMoneyToRice() {
        System.out.printf("Спонсор %s спонсировал заезд на %s рублей.",
                getName(), getAmountSum());
    }
}
