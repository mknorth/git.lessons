package homework9;


public class Box1 extends Box0 {
    /*int width; // ширина коробки
    int height; // высота коробки
    int depth; // глубина коробки*/
    int width = 10;
    int height = 20;
    int depth = 30;
    public Box1(){
        //width = 10;
//        height = 20;
//        depth = 30;
    }
    public Box1(int width, int height, int depth){
        this.width = 1;
        this.height = 1;
        this.depth = 1;
    }

    int getVolume(){
        return width*height*depth;
    }
}
