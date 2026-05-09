package basics;
import java.util.Scanner;
public class circleparametre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your radious ");
        int r = sc.nextInt();
        float pi = 3.14f;
       float circle = pi*r*r;
       float perameter = 2*pi*r;
       System.out.println("Area of circle = " + circle);
       System.out.println("Area or perameter = " + perameter);
    }
}
