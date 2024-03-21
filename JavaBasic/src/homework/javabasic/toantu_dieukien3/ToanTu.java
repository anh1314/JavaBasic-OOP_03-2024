package homework.javabasic.toantu_dieukien3;

public class ToanTu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        boolean check1 = (a > 1) && (b <= 20);
        boolean check2 = (a > 6) || (c < 20);
        boolean check3 = (b == 20) == (c > 30);

        System.out.println("lan 1: " +check1);
        System.out.println("lan 2: " +check2);
        System.out.println("lan 3: " +check3);


    }

}
