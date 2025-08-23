public class Bai1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Cricle(9);
        shapes[1] = new Cricle(2);
        shapes[2] = new Rectangle(4,5);

        for(int i = 0;i<shapes.length;i++){
            System.out.println("Dien tich cua hinh la: "+ shapes[i].area());
        }
    }
}
