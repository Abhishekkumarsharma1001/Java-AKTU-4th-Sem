
class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(String message){
        super(message);
    }
    public InsufficientFundsException(double amount){
        super("Insufficient fund to withdraw"+ amount);
    }
}
class BankAccount{
    private String fullname;
    private double balance ;
    private long accountNo;
    private static final double fee=5.90;
    public BankAccount(String fullname,double balance,long accountNo){
        this.fullname=fullname;
        this.balance=balance;
        this.accountNo=accountNo;
    }
    public void withdrawFunds(double amount) throws InsufficientFundsException{
        if(amount>balance){
            throw new InsufficientFundsException(String.format("current balance %.2f is less than the requested amount %.2f",balance,amount));

        }
        this.balance-=amount;
    }

    public String getFullname() {
        return fullname;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException(String.format("Invalid deposit amount %s",amount));
        }
        this.balance+=amount;
    }
    public void transfer(BankAccount bankacc, double amounttotransfer){
        if(this.balance<amounttotransfer+BankAccount.fee){
            throw new InsufficientFundsException(String.format("Current balance %.2f is less than the requested amount %.2f",balance,amounttotransfer+BankAccount.fee));
        }
        bankacc.deposit(amounttotransfer);
        this.withdrawFunds(amounttotransfer+BankAccount.fee);
    }
}

public class BankAccountException {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(" Abhishek", 1000, 152481100005750l);
        BankAccount acc2 = new BankAccount("Manish", 800, 14811000050l);
        try {
            acc1.withdrawFunds(50);
            System.out.println("Balance for" + acc1.getFullname() + "\' Account is " + String.format("%.2f", acc1.getBalance()) + "INR");
        } catch (InsufficientFundsException e) {
            e.getMessage();

        }
        try {
            acc1.withdrawFunds(1150);
        } catch (Exception e) {
            System.out.println(e.getClass() + " " + e.getMessage());
        }
        try {
            acc1.deposit(0);
        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
            System.out.println(e.getClass());
        }
        try{
            acc1.transfer(acc2,950);
            System.out.println("Balance for"+acc1.getFullname()+"\s' account is"+String.format("%.2f",acc1.getBalance())+"INR");
            System.out.println("Balance for"+acc2.getFullname()+"\s' account is"+String.format("%.2f",acc2.getBalance())+"INR");
        }
        catch(Exception e){
            System.out.println("\n"+e.getMessage());
            System.out.println(e.getClass());
        }
    }
}

