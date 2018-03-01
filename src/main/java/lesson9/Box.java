package lesson9;

public class Box {

    public int width = 10;
    public int height;
    public int depth = 10;
    public int weight = 1;

    public int volume = width*height*depth*weight;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }




   /* public void volume(){
        System.out.println("Объем равен");
        System.out.println(width*height*depth);

    }
    */
   /*private void volume(){
        System.out.println("Объем равен");
        System.out.println(width*height*depth);

    }

    public void printInfo() {

        System.out.println("Объем коробки: " + getVolume());
        System.out.println("Вес коробки: " + weight);
    }*/

}
