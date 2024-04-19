import java.util.Scanner;

public class CountNumDigit {
    static int countNumberOfDigits(int N){
        int res=0;
        while(N!=0){
            res++;
            N=N/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("Given number is "+N);
        int result = countNumberOfDigits(N);
        System.out.println("Number of digits are "+result);
    }
}
