package homework8;


import java.util.ArrayList;

public class KolichestvoSimvolov {
    public static void main(String[] args) {
        String stroka = "aasss,assdfaasdqweaaa,asdaaaas,adsasdasd,aaa,asdghnzzzzzza,zzzzxxxaaaa,zxvvxvxcvxcv,xcvxv.fsdfsdfeweqwejhsdf sf sdfs  a a  sdfsdf sdf";
        char[] at = stroka.toCharArray();
        int count = 0;
        ArrayList<Integer> co = new ArrayList<Integer>();

        for (int i=0; i<stroka.length(); i++){
            if (at[i]=='a'){
                count += 1;
                co.add(i);
            }
        }
        System.out.println("count: " + count + " place: " + co);

    }
}
