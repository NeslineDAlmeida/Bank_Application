import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;
   private String accountno;
   private String password;
    private double balance;
    final double rateofinterest=7.1;
    final String IFSCcode="HDFC734898";

//default
    public HDFCAccount() {
    }

    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountno= String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateofinterest() {
        return rateofinterest;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your balance is:"+ this.balance;

        }

        return "Incorrect password!";
    }

    @Override
    public String Addmoney(double amount) {
        this.balance+=amount;

        return "Amount added successfully, your current balance is:"+ this.balance ;
    }

    @Override
    public String Withdrawmoney(double amount, String password) {
        if(this.password.equals(password)) {
            if (this.balance < amount){
                return "Insufficient balance";
        }
            this.balance-=amount;
            return "Amount deducted sucessfully. Your current balance is:"+ this.balance;
        }
        return "Incorrect password" ;

    }

    @Override
    public String Changepassword(String oldpassword, String newpassword) {
       if(this.password.equals(oldpassword)){
           this.password=newpassword;
           return "changed password successfully";
       }
        return "Incorrect original password";
    }

    @Override
    public double CalculateInterest(int year) {
        return (this.balance* year *rateofinterest)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountno='" + accountno + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateofinterest=" + rateofinterest +
                ", IFSCcode='" + IFSCcode + '\'' +
                '}';
    }
}
