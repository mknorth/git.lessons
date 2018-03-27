package homework9;

public class BoxEx extends Box1 {
    public static void main(String[] args) {
        Box1 bb = new Box1();
        //bb.width = 5;
        //bb1.width = 5;
        bb.oktopus = 99;
        Box1 bb1 = new Box1(1,20,30);
//        bb1.width = 5;
        //bb1.bebebe = 88;
        System.out.println("This is volume of a Big Box: " + bb.getVolume() + "\nThis is volume of a Small Box: " + bb1.getVolume());
}
}
