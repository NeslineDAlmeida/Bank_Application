public class Main {
    public static void main(String[] args) {
        HDFCAccount Nesacc=new HDFCAccount("Nesline","Nes123",20000);
        System.out.println(Nesacc);
        // fetch balance
        System.out.println(Nesacc.fetchBalance("random"));  // wrong password
        System.out.println(Nesacc.fetchBalance("Nes123"));  //correct password

        // add money
        System.out.println(Nesacc.Addmoney(100000));

        // withdraw
        System.out.println(Nesacc.Withdrawmoney(200000,"Nes123"));
        System.out.println(Nesacc.Withdrawmoney(50000,"Nes123"));
        System.out.println(Nesacc.Withdrawmoney(50000,"random"));


        // change Password
        System.out.println(Nesacc.Changepassword("Nes123","vivek"));
        System.out.println(Nesacc.fetchBalance("vivek"));

        //calculate interest
        System.out.println("Interest for 5 years on current balance will be: " + Nesacc.CalculateInterest(5));
    }
}