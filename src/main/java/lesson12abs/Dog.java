package lesson12abs;

public class Dog extends Pet {
    @Override
    public void voice(){
        System.out.println("gaf gaf");
        isHungry = true;
    }
    @Override
    public void move(){
        if (isHungry) {
            System.out.println("I need food");
            return;
        }
        System.out.println("OK!!! If you say so...");
    }
    public void dogBark(){
        System.out.println("BarkBark");
    }
}
