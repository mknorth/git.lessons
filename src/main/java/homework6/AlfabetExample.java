package homework6;

public class AlfabetExample {

   //public static String cyr2lat(char ch) {
   public static void main(String[] args) {


        int a;
        int b;


        for (char i = 'a'; i <= 'z'; i++) {
            a = (int) i;
            System.out.print(a + " ");
            System.out.print(i + " ");
        }
//        System.out.println();
//        for(char i = 'а';i<='я';i++)
//        {
//            a = (int) i;
//            System.out.print(a + " ");
//            System.out.print(i + " ");
//        }

        /*switch (ch){
            case 'А': return "A";
            case 'Б': return "B";
            case 'В': return "V";
            case 'Г': return "G";
            case 'Д': return "D";
            case 'Е': return "E";
            case 'Ё': return "JE";
            case 'Ж': return "ZH";
            case 'З': return "Z";
            case 'И': return "I";
            case 'Й': return "Y";
            case 'К': return "K";
            case 'Л': return "L";
            case 'М': return "M";
            case 'Н': return "N";
            case 'О': return "O";
            case 'П': return "P";
            case 'Р': return "R";
            case 'С': return "S";
            case 'Т': return "T";
            case 'У': return "U";
            case 'Ф': return "F";
            case 'Х': return "KH";
            case 'Ц': return "C";
            case 'Ч': return "CH";
            case 'Ш': return "SH";
            case 'Щ': return "JSH";
            case 'Ъ': return "HH";
            case 'Ы': return "IH";
            case 'Ь': return "JH";
            case 'Э': return "EH";
            case 'Ю': return "JU";
            case 'Я': return "JA";
            case ' ': return " ";
            default: return String.valueOf(ch);
        }

    }

    public static String cyr2lat(String s){
    StringBuilder sb = new StringBuilder(s.length());
    for(char ch: s.toCharArray()){
        sb.append(cyr2lat(ch));
    }
    return sb.toString();
}
    public static void main(String[] args) {



        System.out.println(cyr2lat("МОЙ МИР"));
    }*/
    }

}

