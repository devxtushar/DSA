import java.util.Scanner;

public class printSubArray {
    public static void subArrays(int[] arr){
        int ts=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i; j < arr.length ; j++){
                System.out.print("[");
                int cal=0;
                for(int k=i; k<=j ; k++ ){
                    System.out.print(arr[k]+" ");
                    cal= cal + arr[k];
                }
                if(cal > max) max = cal;
                if(cal < min) min=cal;

                System.out.print("]");
                ts++;
            }
            System.out.println("");

        }
        System.out.println("total subarrays are :" + ts + "Max =" + max + "Min =" + min);

    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
          int array[] = new int[3];

        System.out.println("Enter array elements");
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<array.length ; i++){
            array[i] = sc.nextInt();

           
        }
        subArrays(array);
    }
}
