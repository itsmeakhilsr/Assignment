//3. Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
package AbstractClass;

abstract class BankAccount {
    protected double balance;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited into SavingsAccount");
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn from SavingsAccount");
        } else {
            System.out.println("Insufficient funds in SavingsAccount");
        }
    }
}
class CurrentAccount extends BankAccount {
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited into CurrentAccount");
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn from CurrentAccount");
        } else {
            System.out.println("Insufficient funds in CurrentAccount");
        }
    }
}
public class BankDepositWithdraw {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingsAccount.deposit(5000);
        savingsAccount.withdraw(2000);

        currentAccount.deposit(10000);
        currentAccount.withdraw(5000);
    }
}

