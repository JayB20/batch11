package homework;

public class BankingSystem {
    int id;
    String name;
    double amount;

    public BankingSystem(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void addAmount(double amt) {
        amount += amt;//amount = amount + amt;
        System.out.println("Total Money after addAmount :" + amount);
    }

    void withDraw(double a) {
        if (amount > a) {
            amount -= a;
            System.out.println("Money after withdraw :" + amount);
        } else {
            System.out.println("Cannot Operate!!!");
        }
    }

    public static void main(String[] args) {
        BankingSystem user1 = new BankingSystem(1, "Mg Mg", 100000);
        System.out.println("Current Money :" + user1.amount);
        user1.addAmount(500000);
        user1.withDraw(500000);

        System.out.println();

        BankingSystem user2 = new BankingSystem(2, "Aung Aung", 200000);
        System.out.println("Current Money :" + user2.amount);
        user2.addAmount(500000);
        user2.withDraw(500000);
    }
}
