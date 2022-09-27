//package assignment2java;
import java.util.*;
class customerdetails{
    Scanner sc=new Scanner(System.in);
    int ac_no[]= new int[30];
    String customername[] =new String[30];
    double balance[]=new double[30];
    int i;
     void setdata(){
        for(i=1;i<=2;i++){
         System.out.println("enter the customer name");
          customername[i]=sc.next();
          
          System.out.println("enter the account number");
          ac_no[i]=sc.nextInt();

          System.out.println("enter the balance");
          balance[i]=sc.nextDouble();
          
     }}



    void lowbalance(){
         setdata();
        for(i=1;i<=2;i++){

             if(balance[i]<=100.00){
                System.out.println("customers having low balance");
                System.out.println(ac_no[i]);
                System.out.println(balance[i]);
             }}}
             void transaction(){
                lowbalance();
                int n;
                System.out.println("enter 1 for deposit and 0 for withdrawl");
                n=sc.nextInt();
                switch(n){
                       case 0:
                       int dep=0;
                         System.out.println("enter the amount to deposit");
                         dep=sc.nextInt();
                         System.out.println("the account number is"+ac_no[i]);
                         System.out.println("the amount  deposited"+dep);

                         case 1:
                         int withdrawal=0;
                           System.out.println("enter the amount to deposit");
                           withdrawal=sc.nextInt();
                           System.out.println("the account number is"+ac_no[i]);
                           System.out.println("the amount  deposited"+withdrawal);
  
                }
             }
void insufficient(){
    transaction();
    if(balance[i]<1){
        System.out.println("the balance is insufficient for withdrawal");
    }
}
    

}
public class bank {
    public static void main(String args[]) {
        customerdetails obj=new customerdetails();
      //  obj.setdata();
        //obj.lowbalance();
        //obj.transaction();
        obj.insufficient();
    }
}
