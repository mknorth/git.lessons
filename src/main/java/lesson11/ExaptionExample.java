package lesson11;

public class ExaptionExample {
    public static void main(String[] args) {
        int a  = 4;
        try{
        System.out.println(a/0);}
        catch (ArithmeticException e){
            System.out.println("Произошла арифм ошибка!!!");
            System.out.println(e.getMessage());
        }
    }
}
