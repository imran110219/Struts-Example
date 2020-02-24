package Creational.Prototype;

/**
 * Created by Imran on 2/24/2020.
 */
public class Show implements PrototypeCapable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show Object.........");
        return (Show)super.clone();
    }

    @Override
    public String toString() {
        return "Show";
    }
}
