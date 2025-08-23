abstract class Animal {
    private int age;

    public abstract void eat();

    public Animal() {
    }

    public void sleep(){
        System.out.println("i am sleep");
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
