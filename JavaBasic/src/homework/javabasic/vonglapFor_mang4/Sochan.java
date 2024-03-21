package homework.javabasic.vonglapFor_mang4;

public class Sochan {

    public static void main(String[] args) {
        int mangSochan [] = new int[26];
        int a = 0;
        System.out.println("Mảng các số chẵn từ 0-50: ");
        for ( int i = 0; i <= 50; i++ ){
            if ( i % 2 == 0){
                mangSochan[a] = i; i++;
            }
            System.out.print( " " +mangSochan[a]);
        }
    }
}
