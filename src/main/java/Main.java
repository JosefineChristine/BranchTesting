public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("cat" + dog.makeSound());
        System.out.println("dog" + cat.makeSound());

        cat.eat("cat food");
        dog.eat("dog food");

        }

    }



}
