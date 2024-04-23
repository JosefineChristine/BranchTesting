public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Katten siger " + dog.makeSound());
        System.out.println("Hunden siger " + cat.makeSound());
        System.out.println();

        cat.eat("cat food");
        dog.eat("dog food");

        System.out.println(dog.showMood(true));
        System.out.println(dog.showMood(false));
        System.out.println();
        System.out.println(cat.showMood(true));
        System.out.println(cat.showMood(false));

        }

    }


