package model;

public class Toy {
    private static Integer idGenerator = 1;
    private int id;
    private String name;
    private int amount;
    private int weight;

    public Toy(String name, int amount, int weight) {
        this.id = idGenerator++;
        this.name = name;
        this.amount = amount;
        this.weight = weight;
    }

    public static Integer getIdGenerator() {
        return idGenerator;
    }

    public static void setIdGenerator(Integer idGenerator) {
        Toy.idGenerator = idGenerator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", amount = " + amount + ", weight = " + weight + "]";
    }
    

}