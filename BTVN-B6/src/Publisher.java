public class Publisher {
    private String name;//tên nhà xuất bản
    private String address;//địa chỉ nhà xuất bản

    public Publisher(String name, String adddress) {//contructor có tham số
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {//dùng phương thức tostring để hiệ thị thông tin co bản của nhà xuất bản
        return name + " "+ address;
    }
}
