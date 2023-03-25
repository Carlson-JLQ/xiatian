import java.util.Scanner;
public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three points for a triangle:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double l1 = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        double l2 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        double l3 = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        double s = (l1+l2+l3)/2;
        double area = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        area = Math.round(area*100)/100.0;
        System.out.println("The area of the triangle is "+area);
    }
}
