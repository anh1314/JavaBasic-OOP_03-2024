package homework.javabasic.toantu_dieukien3;

public class dieukien {
    static void dieuKien(int n) {
        int n1 = 100;
        if (n == n1) {
            System.out.println("n bang n1");
        } else if (n < n1) {
            System.out.println(" n be hon n1");
        } else if (n > n1) {
            System.out.println("n lon hon n1");
        }
    }

    public static void main(String[] args) {
        dieuKien(200);
    }
}
