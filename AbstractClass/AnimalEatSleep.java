//4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.

package AbstractClass;

abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
}

class Lion extends Animal {
    @Override
    public void eat() {
        System.out.println("Lion eats meat");
    }
    @Override
    public void sleep() {
        System.out.println("Lion sleeps in a den");
    }
}
class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }
    @Override
    public void sleep() {
        System.out.println("Tiger sleeps in a forest");
    }
}
class Deer extends Animal {
    @Override
    public void eat() {
        System.out.println("Deer eats grass");
    }
    @Override
    public void sleep() {
        System.out.println("Deer sleeps under trees");
    }
}
public class AnimalEatSleep {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        System.out.println("Lion's behavior:");
        lion.eat();
        lion.sleep();
        System.out.println();

        System.out.println("Tiger's behavior:");
        tiger.eat();
        tiger.sleep();
        System.out.println();

        System.out.println("Deer's behavior:");
        deer.eat();
        deer.sleep();
    }
}

