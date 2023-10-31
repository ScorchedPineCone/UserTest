package FruitClass;

public class Fruit {
    private String name;
    private String color;
    public Fruit(String Name,String color) {
        this.name = Name;
        this.color = color;
    }
    public void FruitColor() {
        System.out.println("The "+name+ " is " +color+ "!");

    }

}

