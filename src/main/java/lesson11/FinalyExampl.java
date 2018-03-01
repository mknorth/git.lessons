package lesson11;

public class FinalyExampl {
    public static void main(String[] args) {
        try{
            System.out.println("incide procA");
            throw new RuntimeException("demo");

        }finally {
            System.out.println("procAs finally");
        }
    }
}
