import java.util.*;

class premium{
    Scanner sc=new Scanner(System.in);
    char health,area,gender;
     int age;
    void input(){
        System.out.println("enter 'e' for excellent health and 'p' for poor health");
        health=sc.next().charAt(0);
        System.out.println("enter 'c' for city and 'v' for village");
        area=sc.next().charAt(0);
        System.out.println("enter 'm' for male and 'f' for female");
        gender=sc.next().charAt(0);
        System.out.println("enter age");
        age=sc.nextInt();
    }
    void cal_premium(){
        if((health=='e')&& (area=='c')&& (gender=='m') &&
        (age>=25||age<=35)){
            System.out.println("The Premium Is Rs.4 Per Thousand And His Policy Cannot Exceed Rs.2 Lakhs");
        }
        else if((health=='e')&&(area=='c')&&(gender=='f')&&(age>=25||age<=35)){
            System.out.println("The Premium Is Rs.3 Per Thousand And Her Policy Cannot Exceed Rs.1 Lakhs");
        }
        else if((health=='p')&&(area=='v')&&(gender=='m')&&(age>=25||age<=35)){
            System.out.println("The Premium Is Rs.6 Per Thousand And Cannot Exceed Rs. 10,000");
        }
        else{
            System.out.println("not insur");
        }
    }
}
public class insurance {
    public static void main(String args[]) {
        premium obj=new premium();
        obj.input();
        obj.cal_premium();
    }
    
}
