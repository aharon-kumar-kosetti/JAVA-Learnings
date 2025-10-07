import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        evenodd(a);
    }
    static void evenodd(int a){
        if(a%2==0){
            System.out.println("Given Number is Even.");
        }else{
            System.out.println("Given Number is Odd.");
        }
    }
}
