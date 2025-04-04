package recursion;

public class PrintNo {
    public static void printDec(int n){ // decreasing order
        if(n ==1 ){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    public static void printInc(int n){ // increasing order
        if(n ==1 ){
            System.out.print(n+ " ");
            return;
        }
       
        printInc(n-1);
        System.out.print(n + " ");
    }
    
    public static int factorial(int n){ // factorial of a no. - tc & sc -o(N)
        if(n == 0 ){
            return 1;
        }
        n = n * factorial(n-1);
        return n;
    }
    public static int naturalNo(int n){ // natural no - tc & sc - o(N)
        if(n == 1 ){
            return 1;
        }
        n = n + naturalNo(n-1);
        return n;
    }
    public static int fibonacci(int n){ // fibonacci - tc & sc - o(N)
        if(n == 0 ||n==1 ){
            return n;
        }
  
        n = fibonacci(n-1) + fibonacci(n-2);
        return n;
    }
    public static void main(String[] args) {
        int n = 5;
        // printDec(n);
        // printInc(n);
        System.out.println(factorial(n));
        System.out.println(naturalNo(n));
        System.out.println(fibonacci(n));


         



    }
    
}
