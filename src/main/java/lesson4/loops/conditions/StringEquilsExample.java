package lesson4.loops.conditions;

public class StringEquilsExample {
    public static void main(String[] args) {
        String str1 = new String("Hi");
        String str2 = new String("By");
        String sameStr = str1;

        boolean b1 = str1 == str2;
        boolean b2 = str1.equals(str2);// сравнивать строки только так!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        boolean b3 = str1 == sameStr;
    }
}
