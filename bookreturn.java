import java.util.*;

class fineoperation{
    int days;
    double fine;
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("enter the days you are late");
        days=sc.nextInt();
    }
    void takefine(){
          if(days<=5){
            fine=0.50*days;
          }
          else if(days>=6||days<10){
            fine=1*days;
          }
          else if(days>=10||days<30){
            fine=5*days;
          }
          else{
          System.out.println("your membership will be cancelled");
          }
           System.out.println("you have to give Rs"+fine);
    }
    
}

public class bookreturn {
    public static void main(String args[]) {
        fineoperation obj=new fineoperation();
        obj.input();
        obj.takefine();
        
    }
    
}
