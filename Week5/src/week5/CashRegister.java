package week5;

public class CashRegister
{
    private double cashInRegister;
    private int economicalSold; // Type: 0
    private int gourmetSold;    // Type: 1

    public CashRegister() {
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold    = 0;
    }

    public double pay(final double cashGiven, final double cost, final int type) {
        if (cashGiven < cost) {
            return cashGiven;
        }
        else {
            if (type == 0) {
                this.economicalSold++;
            }
            else {
                this.gourmetSold++;
            }
            this.cashInRegister += cost;

            return (cashGiven - cost);
        }
    }

    public double payEconomical(final double cashGiven) {
        return this.pay(cashGiven, 2.5, 0);
    }

    public double payGourmet(final double cashGiven) {
        return this.pay(cashGiven, 4, 1);
    }

    public boolean pay(final LyyraCard card, final double cost, final int type) {
        if ( card.pay(cost) ) {
            if (type == 0) {
                this.economicalSold++;
            }
            else {
                this.gourmetSold++;
            }

            return true;
        }
        else {
            return false;
        }
    }

    public boolean payEconomical(final LyyraCard card) {
        return this.pay(card, 2.5, 0);
    }

    public boolean payGourmet(final LyyraCard card) {
        return this.pay(card, 4, 1);
    }

    public void loadMoneyToCard(final LyyraCard card, final double sum) {
        if (sum > 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }

    }

    public String toString() {
        return "money in register " + this.cashInRegister
            + " economical lunches sold: " + this.economicalSold
            + " gourmet lunches sold: " + this.gourmetSold;
    }
}
