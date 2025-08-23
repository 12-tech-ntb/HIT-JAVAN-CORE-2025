public class Cat extends Animal{
    private String keu;
    public void eat(){
        System.out.println("i am eating");
    }

    public Cat(String keu) {
        this.keu = keu;
    }

    public Cat(int age, String keu) {
        super(age);
        this.keu = keu;
    }
}
