package lesson8;

public class StringsMethodExample {
    public static void main(String[] args) {
        String stringNames = "max,vasia,pasha,masha";
        String[] stringArrays = stringNames.split(",");
        for (String str:stringArrays){
            System.out.println(str);
        }
        //System.out.println(stringArrays);
    }
}
