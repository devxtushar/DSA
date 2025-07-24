package strings;

public class stringbuilders {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) { // O(26)
            str.append(ch);
        }
        System.out.println(str + " " + str.length());
    }
}
