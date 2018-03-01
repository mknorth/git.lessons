package homework9;


public class Box1 extends Box0 {
    /*int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки*/

    public Box1(){
        //width = 10;
//        height = 20;
//        depth = 30;
    }
    public Box1(int width, int height, int depth){
        this.width = 10;
        this.height = 10;
        this.depth = 20;
    }

    int getVolume(){
        return width*height*depth;
    }
}
