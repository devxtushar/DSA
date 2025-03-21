import java.util.Scanner;

public class pairsinArray {

    public static void findPairs(int array[]){
        for(int i=0; i< array.length ; i++){
            for(int j=i+1; j<array.length ; j++){
                System.out.print("("+array[i]+","+array[j]+")");

            }
            System.out.println("");
        }
        return;
        
    }
    public static void main(String[] args) {
        int array[] = new int[5];

        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length ; i++){
            array[i] = sc.nextInt();
        }
        findPairs(array);
    }
}
