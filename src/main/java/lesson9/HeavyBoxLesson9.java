package lesson9;

public class HeavyBoxLesson9 extends Box {
    int weight; // вес коробки
    int height;
    /*public void printInfo() {
        System.out.println("Объем коробки: " + getVolume());
        System.out.println("Вес коробки: " + weight);
    }*/
    //@Override
    public void printInfo(){
        weight = 2;
        System.out.println("Объем коробки: " + getVolume());
        System.out.println("Вес коробки: "+weight);
        System.out.println("So this is volume: " + volume);
    }
    public void printInfo2(){
       // Box bx = new Box();
        weight = 1;
        System.out.println(height);
        System.out.println("Объем коробки: " + getVolume());
        System.out.println("Вес коробки: "+weight);
        System.out.println("So this is volume: " + volume);
    }



    /*public HeavyBox(double width, double height, double depth, int weight) {
        super(width, height, depth);
        this.weight = weight;
    }*/
}
