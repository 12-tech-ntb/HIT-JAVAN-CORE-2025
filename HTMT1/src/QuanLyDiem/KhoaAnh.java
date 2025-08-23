package QuanLyDiem;

public class KhoaAnh extends NamHoc2025{
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }

    //override

    @Override
    public void tinhDTB() {
        System.out.println("Đây là phương thức tính điểm trung bình khoa văn");
    }
}
/*để làm nhanh hơn nếu các class gần như giống nhau thì ta chuột phải vào class mẫu
chọn refactor, chọn copy class, đổi tên, nhấn oke
 */
