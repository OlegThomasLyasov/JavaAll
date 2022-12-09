import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Seminar4 {
    public static void main(String[] args) {
        /* Map<Integer, String> list = new HashMap<>();
        String encoding = System.getProperty("console.encoding","cp866"); 
        Scanner iScanner = new Scanner(System.in, encoding);
        for(int i=0;i<3;i++){
            System.out.print("Введите паспорт и фамилию: ");
            String s = iScanner.nextLine();
            String[] sMas = s.split(" ");
            list.put(Integer.parseInt(sMas[0]),sMas[1]);
        }
        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
        System.out.println();
        for (var el : list.entrySet()) {
            if(el.getValue().equals("Иванов"))
                System.out.print(el.getKey() + " " + el.getValue() + "\n");
        } 
        iScanner.close();
        */
        //System.out.println(IsIzomorph("add","egg"));
        SortMap();
    }

    public static boolean IsIzomorph(String s1, String s2){
        // s = "paper", t = "timle"
        // key  value
        // p -> t, 
        // a -> i, 
        // e -> l,
        // r -> e 
        if(s1.length()!=s2.length())
            return false;
        if(s1.equals(s2))
            return true;
        Map<Character, Character> subWord = new HashMap<>(); 
        for(int i=0; i<s1.length();i++){
            char a = s1.charAt(i);
            char b = s2.charAt(i);
            //b==subWord.get(a) --> true ! : false 
            if(subWord.containsKey(a) && b!=subWord.get(a))
                return false;
            else
                subWord.put(a, b);
        }
        return true;
    }
    public static void SortMap(){
        String s = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        TreeMap<Integer, String> list = new TreeMap<>();
        String[] sMas = s.split(" ");
        System.out.println(sMas.length);
        for(int i=0; i<sMas.length;i++)
            list.put(sMas[i].length(), sMas[i]);

        for (var el : list.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
