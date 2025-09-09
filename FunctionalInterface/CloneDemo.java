package functionalInterface;
class Prototype implements Cloneable {
    String type;

    Prototype(String type) {
        this.type = type;
    }

    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class CloneDemo {
    public static void main(String[] args) {
        Prototype original = new Prototype("Model-X");
        Prototype copy = original.clone();

        System.out.println("Original: " + original.type);
        System.out.println("Cloned: " + copy.type);
    }
}
