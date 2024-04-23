public class Cat extends Animal {
    @Override
    public String makeSound() {
        return "meow";
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public String showMood(boolean erGlad) {
        if (erGlad) {
            return "spinder";
        } else {
            return "hvæser";
        }
    }

}
