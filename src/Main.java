public class Main {
    public static void main(String[] args) {
        int x, y;

        x = 0;
        y = 1;

        if (x >= -4 && x <= 4 && y >= -3 && y <= 0) {
            System.out.println(true);
        } else {
            if (x >= -2 && x <= 2 && y >= 0 && y <= 4) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
