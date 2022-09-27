import java.util.*;

class cal_fuel{
    int flight_num;
    String destination;
    double distance;
    double fuel;
    Scanner sc=new Scanner(System.in);
    void feedinfo(){
        System.out.println("enter the flight number");
        flight_num=sc.nextInt();
        System.out.println("enter the destination");
        destination=sc.next();
        System.out.println("enter the distance");
        distance=sc.nextDouble();

    }
     void calfuel(){
        feedinfo();
         if(distance<=1000){
            fuel=500;
         }
         else if(distance>1000||distance<=2000){
            fuel=1100;
         }
           else if(distance>2000){
            fuel=2200;
           }
     }
     void showinfo(){
        calfuel();
        System.out.println("the flight number is "+flight_num);
        System.out.println("the destination is "+destination);
        System.out.println("the distance is "+distance);
        System.out.println("the fuel is"+fuel);
     }
}
public class fuel {
    public static void main(String args[]) {
        cal_fuel obj=new cal_fuel();
        //obj.feedinfo();
        //obj.calfuel();
        obj.showinfo();
        
    }
    
}
