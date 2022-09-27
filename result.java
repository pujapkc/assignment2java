import java.util.*;

 class cal_result{
      int mark_a,mark_b;

      void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mark_a");
        mark_a=sc.nextInt();
        System.out.println("enter mark_b");
        mark_b=sc.nextInt();
        sc.close();
      }
      void calculate(){
        if (mark_a>= 55 && mark_b >= 45){
            System.out.println("student qualified the degree");

        }
        else if((mark_a >= 45 && mark_b>= 55)){
            System.out.println("student qualified the degree");
        }
        else if(mark_a>=65 && mark_b<=45){
            System.out.println("student have to reappear to qualify exam b");
        }
        else{
            System.out.println("student declared fail");
        }
      }

      
 }
public class result {
    public static void main(String args[]) {
        cal_result obj=new cal_result();
        obj.input();
        obj.calculate();
    }
}
