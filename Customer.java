public class Customer {
    public static void main(String[] args){
        Bank axis = new Bank();
        axis.availableforms();
        axis.submitform("Account transfer");
        System.out.println("amount transferred = "+axis.transfer(1000));
        System.out.println("charges for account transfer = "+10);
        System.out.println("providereceipt = "+axis.providereceipt());
    }
}
class Bank{
   void availableforms(){
       System.out.println("1.Deposit form 2.withdrawl form 3.Account Transfer form");
   }
   void submitform(String formname){
       System.out.println("Received form for "+formname);
   }
   int transfer(int amount) {
       return amount-10;
   }
   boolean providereceipt(){
       return true;
   }
}