class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String str)
    {
        super(str);
    }
}
class IllegalBankTransactionException extends InsufficientBalanceException {

    public IllegalBankTransactionException(String str) {
        super(str);
    }
}
class  savingAccount{
    private final long id ;
    private double balance  ;
    public savingAccount(long id,double balance){
        this.id=id;
        this.balance=balance;
    };
    public  double withdraw(double amount) throws RuntimeException {
        try {
            if(balance<amount){
                throw new InsufficientBalanceException ("Insufficient balance in the account");
            }
            balance = balance - amount ;
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return  balance ;
    }
public  double deposit(double amount) throws RuntimeException {
    try {
        if(amount<=0){
            throw new IllegalBankTransactionException("Amount should always be greater than 0");
        }
        balance = balance - amount ;
    }
    catch (IllegalBankTransactionException ez) {
        System.out.println(ez.getMessage());
        ez.printStackTrace();
    }
    return  balance ;
        }
    public  double getBalance()  {
        return  balance ;
    }
}

public class ExceptionHandlingQ3 {
    public static void main(String[] args)  {
        savingAccount Mujahid = new savingAccount(10,200000);
        Mujahid.deposit(-1);
        Mujahid.withdraw(9100);
        System.out.println(Mujahid.getBalance());
    }
}