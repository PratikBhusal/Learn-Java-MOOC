package week4;
public class LyyraCard
{
    private double balance;

    public LyyraCard(double initBalance) {
        this.balance = initBalance;
    }

    public String toString() {
        return "This card has $" + String.format("%.2f", this.balance);
    }

    public void payEconomical() {
        this.balance -= (this.balance >= 2.5) ? 2.5 : 0;
    }

    public void payGourmet() {
        this.balance -= (this.balance >= 4) ? 4 : 0;
    }

    public void loadMoney(double amount) {
        this.balance += (amount >= 0) ? amount : 0;
        this.balance = (this.balance > 150) ? 150 : this.balance;
    }

}
