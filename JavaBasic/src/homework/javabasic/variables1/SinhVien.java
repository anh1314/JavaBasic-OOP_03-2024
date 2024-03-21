package homework.javabasic.variables1;

public class SinhVien {
    int b=20;
    static int c=30;
    public void bienLocal(){
        int a=10;
        System.out.println("gia tri cua bien local: " +a);
    }
    public static void main(String[] args) {
        SinhVien Local = new SinhVien();
        Local.bienLocal();

        SinhVien Instance = new SinhVien();
        System.out.println("gia tri cua bien instance: " +Instance.b);
        System.out.println("gia tri cua bien static:" +c);

        System.out.println("thong tin: " +ThongTin.Thongtin);

    }
}

