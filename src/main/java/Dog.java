public class Dog extends Animal{

    @Override
    public String makeSound() {
        return "vuf";
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public String showMood() {
        if (true) {
            return "knurrer";
        } else {
            return "logrer";
        }
    }



}
