package bits;

public class Bitsmani {
    public static void oddEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("N is even");
        } else {
            System.out.println("N is odd");
        }
    }

    public static void getIthbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("bit  is 0 ");
        } else {
            System.out.println("bit is 1");
        }
    }

    public static void setIthbit(int n, int i) {
        int bitmask = 1 << i;

        System.out.println("OR of n is : " + (n | bitmask));

    }

    public static void clearIthbit(int n, int i) {
        int bitmask = ~(1 << i);

        System.out.println("cleared n :" + (n & bitmask));

    }

    public static void main(String[] args) {
        // oddEven(87);
        // getIthbit(10,3);
        // setIthbit(10, 2);
        // clearIthbit(10, 1);

    }

}
