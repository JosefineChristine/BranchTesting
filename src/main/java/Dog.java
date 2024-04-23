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
    public String showMood(boolean erGlad) {
        if (erGlad) {
            return "logrer";
        } else {
            return "knurrer";
        }
    }



}
