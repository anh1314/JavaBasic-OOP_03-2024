package JavaOOP1.ObjectClass;

public class ThongTin {
    public static void main(String[] args) {
        NhanVien NV = new NhanVien();
        System.out.println("Tên nhân viên: " +NV.name); //C1
        System.out.println("Tuổi: " +NV.getTuoi()); // C2
        System.out.println("Chức vụ: " +NV.getChucvu());

    }
}
