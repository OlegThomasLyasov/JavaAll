import java.lang.reflect.Array;
import java.util.*;
;

public class sem6 {
    public static void main(String[] args) {
        /* HashSet<Integer> set = new HashSet<>();
        Integer[] numbers = {1, 2, 3, 2, 4, 5, 6, 3};
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(numbers));
        PrintSet(set2);
        FillSet(set); */
        /* Iterator<Integer> iterator = set.iterator(); 
        while (iterator.hasNext()){
            System.out.println(iterator.next());  
        } */
        /* PrintSet(set);
        LinkedHashSet<Integer> setLink = new LinkedHashSet<>();
        FillLinkSet(setLink);
        PrintLinkSet(setLink); */
        ArrayList<Integer> arr = new ArrayList<>();
        FillMas(arr);
        GetSetFromArray(arr);
        catClass Bars = new catClass();
        Bars.name = "Oleg";
        Bars.age = 25;
        // Bars.PrintInfo();
        // System.out.println(Bars.toString());

        catClass Ivan = new catClass("Oleg");
        catClass Kamila = new catClass("Kamila", 10);
        catClass KamilaSec = new catClass("Kamila", 10);
        HashSet<catClass> allCats = new HashSet<>(Arrays.asList(Bars,Ivan,Kamila,KamilaSec));
        for (catClass el : allCats) {
            System.out.println(el.toString());
        }
        System.out.println(Kamila.equals(KamilaSec));
    }

    public static void FillSet(HashSet<Integer> set){
        Random random = new Random();
        for(int i=0; i<15; i++)
            set.add(random.nextInt(10));
        //так как это Set все будет в единственном количестве
    }
    public static void PrintSet(HashSet<Integer> set){
        for (Integer integer : set) {
            System.out.print(integer+ " ");
        }
        System.out.println();
    }
    public static void FillLinkSet(LinkedHashSet<Integer> set){
        Random random = new Random();
        for(int i=0; i<15; i++)
            set.add(random.nextInt(10));
        //так как это Set все будет в единственном количестве
    }
    public static void PrintLinkSet(LinkedHashSet<Integer> set){
        for (Integer integer : set) {
            System.out.print(integer+ " ");
        }
        System.out.println();
    }

    public static void FillMas(ArrayList<Integer> arr){
        Random random = new Random();
        for(int i=0; i<1000;i++ )
            arr.add(random.nextInt(25));
    }
    public static void GetSetFromArray(ArrayList<Integer> arr){
        //System.out.println(arr.toString());
        HashSet<Integer> set = new HashSet<>(arr);
        //System.out.println(set.toString());
        System.out.println((double)(set.size())/arr.size()*100);
    }
}
