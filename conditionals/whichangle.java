package conditionals;
import java.util.Scanner;
public class whichangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int largest =-1;
        if(a>b && a>c){
            largest = a;
        }else if(b>a && b>c){
             largest = b;
        }else if(c>a && c>b){
             largest = c;
        }
        int x = 2*(largest*largest);
        int y = (a*a+b*b+c*c);
        if(x<y){
            System.out.println("Acute-angled");
        }else if(x>y){
            System.out.println("Obtuse-angled");
        }else if(x == y){
            System.out.println("Right-angled");
        }
    }
}
