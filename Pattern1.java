import java.util.Scanner;

public class Pattern1 {
    static void patternSQR(int n){
        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void patternTRNGL(int n){
        for(int r=0;r<n;r++){
            for(int c=0;c<=r;c++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void patternTRNGLNUM(int n){
        for(int r=0;r<n;r++){
            for(int c=0;c<=r;c++){
                System.out.print(c+1);
            }
            System.out.println();
        }
    }
    static void reverseTRNGL(int n){
        for(int r=0;r<n;r++){
            for(int c=n;c>r;c--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void reverseTRHGLNUM(int n){
        for(int r=0;r<n;r++){
            for(int c=n;c>r;c--){
                System.out.print(n-c+1);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        patternSQR(n);
//        patternTRNGL(n);
//        patternTRNGLNUM(n);
//        reverseTRNGL(n);
          reverseTRHGLNUM(n);
    }
}
