public class Main {
    public static void main(String[] args) {
        long depositedAmount = 1100;
        long initialAccount = 100;
        long limit = 1000;
        long bonus;
        if (depositedAmount >= limit) {
            bonus = depositedAmount / 100;
        } else {
            bonus = 0;
        }
        long currentAccount = depositedAmount + bonus + initialAccount;
        System.out.println(currentAccount);
    }
}
