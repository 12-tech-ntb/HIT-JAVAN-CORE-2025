public class Publisher {
    private String name;
    private String address;

    public Publisher(String name, String adddress) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " "+ address;
    }
}
