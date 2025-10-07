import java.util.Scanner;
public class MaxAndMinOf3Nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a= in.nextInt();
        System.out.print("Enter second number: ");
        int b= in.nextInt();
        System.out.print("Enter third number: ");
        int c= in.nextInt();
        
        int maximum = maxNum(a,b,c);
        int minimum = minNum(a,b,c);
        
        System.out.println("largest of three numbers is "+ maximum);
        System.out.println("Smallest of three numbers is "+ minimum);
    }
    //minimum function
    static int minNum(int a, int b, int c){
        if(a<b){
            if(a<c){
                return a;
            }else{
                return c;
            }
        }else if(b<a){
            if(b<c){
                return b;
            }else{
                return c;
            }
        }else{
            return c;
        }
    }
    //maximum function
    static int maxNum(int a, int b, int c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else if(b>a){
            if(b>c){
                return b;
            }else{
                return c;
            }
        }else{
            return c;
        }
    }
}
