package QuanLyDiem;

public class KhoaToan extends NamHoc2025{
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    //override

    @Override
    public void tinhDTB() {
        //super.tinhDTB();//nếu muốn dùng phương thức ý hệt như thằng cha nó thì ta dùng super như code bên
        System.out.println("Đây la phương thức tính điểm trung bình cuả khoa toán");//nếu muốn thay đổi phương thức khác thằng cha nó thì cso thể thay đổi như bên
    }
}
