package strings;

public class findDir {

    public static void shortestPath(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) { // O(n)
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }

        }
        System.out.println("Direction value :" + Math.sqrt(x * x + y * y));

    }

    public static void main(String[] args) {
        String direction = "WNEENESENNN";
        shortestPath(direction);
    }
}
