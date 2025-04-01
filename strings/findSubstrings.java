package strings;

public class findSubstrings {

    public static void findSubStrings(String str,int si, int ei){
        String substr =  "";

        for(int i=si; i<ei; i++){
            substr += str.charAt(i);
        }
        System.out.print(substr);
    }

    public static void compareStrings(String[] fruits){   // x * n
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i]) < 0 ){
                largest = fruits[i];
            }

        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String str= new String("Find the string");
        String[] fruits= {"apple","mango","banana"};    
        int si = 0,ei=3;
        // findSubStrings(str,si,ei);
        compareStrings(fruits);
    }
}
