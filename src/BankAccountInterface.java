public interface BankAccountInterface {

    String fetchBalance(String password);


       String Addmoney(double amount);

       String Withdrawmoney(double amount, String password);

       String Changepassword(String oldpassword, String newpassword);

       double CalculateInterest(int year);
}
