public abstract class Armors {
    private int ID;
    private String name;
    private int barrier;
    private int price;

    public Armors(int ID, String name, int barrier, int price) {
        this.ID = ID;
        this.name = name;
        this.barrier = barrier;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBarrier() {
        return barrier;
    }

    public void setBarrier(int barrier) {
        this.barrier = barrier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
