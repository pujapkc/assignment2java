import java.util.*;

public class distancebetweentwopoint {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int i;
        double[] x=new double[200];
        double[] y=new double[200];
        double x1,y1 ,dist, sum=0.0;
        System.out.println("enter the coordinates of 4 points");
        for(i=0;i<3;i++){
            x[i]=sc.nextDouble();
            y[i]=sc.nextDouble();
           
        }
        //sc.close();

        for(i=0;i<9;i++)
{
     x1=Math.pow((x[i+1]-x[i]),2.0);
     y1=Math.pow((y[i+1]-y[i]),2.0);
     dist=Math.sqrt(x1+y1);
     sum+=dist;
    }
    System.out.println("the distance is "+sum);
}}

    
