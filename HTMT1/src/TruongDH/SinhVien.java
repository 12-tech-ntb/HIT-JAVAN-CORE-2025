package TruongDH;

public class SinhVien {
    // thuộc tính ( Giống với biến )
    private String hoTen;//Biến toàn cục
    private double diem;//Biến toàn cục


    //4.1 cóntructor mặc đinh
    //khởi tạo các giá trị mặc định
    //ngay khi đối tượng vừa được tạo ra
    public SinhVien(){
        hoTen = "No name";
        diem = 0.0;
    }
    //Alt + ins
    //4.2 cóntructor có đối số


    public SinhVien(String hoTen){
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {//Biến cục bộ
        this.hoTen = hoTen;//Dùng thí để phân biệt biến toàn cục và biến cục bộ
        this.diem = diem;//Nếu tên biến khác nhau thì không nhất thiết có this
    }

    //phuong thuc ( cac ham )
    //phuong thuc không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen + ": "+ diem);
    }

    //phưong thức có kiểu trả về
    public double tinhDTB(double diemToan,double diemVan){//đây là một sigrature có 2 đối số
        return (diemToan + diemVan)/2;
    }
    //phương thức 2 (khác nhau về số lượng đối số)
    public double tinhDTB(double diemToan,double diemVan,double diemAnh){//đây là một sigrature có 3 đối số
        return (diemToan + diemVan + diemAnh)/3;
    }//có thể thấy phương thức này có tên gọi và kiểu dữ liệu giống hệt hàm trên tuy nhiên vẫn sử dụng được vì có sự khác nhau về đối số (Sigrature)
     //việc này rất hữu dụng thay vì gọi nhiều phương thức tính điểm trung bình với tên gọi khác nhau thì ta có thể đạt cùng tên và chir thay đổi về đối số. Như vậy sẽ giúp người dùng chỉ cần gọi một tên và nhập số lượng đối số vào là dùng được hàm tùy


    //phương thức 3 (khác nhau về thứ tự đối số)
    public double tinhDTB(double diemToan,double diemVan,String abc) {
        return (diemToan + diemVan) / 2;
    }
    public double tinhDTB(String abc,double diemVan,double diemToan) {
        return (diemToan + diemVan) / 2;
    }
    //2 phương thức trên có sự khác nhau về thứ tự đối số nên vẫn được sự dụng ko báo lỗi mặc dù tên gọi và kiểu dữ liệu của hàm là giống nhau





    //get va set
    public String getHoTen() {//get dùng để xem thông tin biến
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {//Dùng để sửa chưa thông tin của biến
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //toString

    @Override
    public String toString() { //có thể sửa được giá trị trả về
        return hoTen+" / "+diem;
    }

    //Support Method và Service Method
    //1.Support Method
    //kiểm tra điểm khi nhập hồ sơ của sinh viên
    private boolean checkDiem(){
        return this.diem>=24;
    }
    //2.Service Method có thể gọi từ chương trình chính
    public void checkHopLeDiem(){
        if(checkDiem()){
            System.out.println("Diem hop le, tiep tuc nhap thong tin");
        }else{
            System.out.println("Kiem tra lai diem dau vao cua sv");
        }
    }

    //parametter list
    public double tongDiem(double ... arr){
        double tong = 0.0;
        for(double x : arr){
            tong += x;
        }
        return tong;
    }
}
