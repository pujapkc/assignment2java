import java.util.*;

class employee{
int hours,count=1;
double over_time_pay,overtime;
Scanner sc=new Scanner(System.in);

void operation(){
{
 for(int i=1;i<=4;i++){
      System.out.println("enter the working hours");
      hours=sc.nextInt();

      if(hours>=40){
        overtime=hours-40;
        over_time_pay=overtime*12.0;
        System.out.println("the employee no "+i+" has overtimepay  ="+over_time_pay);
      }
      else
      System.out.println("you have to work more than 40 hours to get overtime pay");
 }
}}}


public class overtime {
    public static void main(String args[]) {
        employee obj=new employee();
        obj.operation();
    }
    
}
