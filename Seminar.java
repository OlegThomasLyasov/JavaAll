import java.util.*;

public class Seminar {
    public static void main(String[] args) {
        /* int[] arr = {1, 2, 3, 5, 2, 4, 5, 6, 3};
        HashSet<Integer> setH = new HashSet<>();
        for(int i=0; i<arr.length;i++)
            setH.add(arr[i]);
        for (Integer el : setH) {
            System.out.print(el+ " ");
        }
        System.out.println();
        LinkedHashSet<Integer> setLink = new LinkedHashSet<>();
        for(int i=0; i<arr.length;i++)
            setLink.add(arr[i]);
        for (Integer el : setLink) {
            System.out.print(el+ " ");
        }
        System.out.println();
        TreeSet<Integer> setTree = new TreeSet<>();
        for(int i=0; i<arr.length;i++)
            setTree.add(arr[i]);
        for (Integer el : setTree) {
            System.out.print(el+ " ");
        } */
        //ArrayList<Integer> arr = new ArrayList<>();
        //FillMas(arr);
        //GetSetFromArray(arr);
        Cat Barsik = new Cat();
        //Barsik.PrintInfo();
        Barsik.name = "Barsik";
        /* Barsik.age = 5;
        Barsik.color = "gray";
        Barsik.p = "m";
        Barsik.type = "dvornyaga";  */
        //Barsik.PrintInfo();
        Cat Pushinka = new Cat(15);
        //Pushinka.PrintInfo();
        Cat Puh = new Cat("Puh","m",15,"white","taksa");
        Cat PuhSec = new Cat("Puh","m",15,"white","taksa");
        //Puh.PrintInfo();
        HashSet<Cat> allCats = new HashSet<>(Arrays.asList(Barsik,Pushinka,Puh, PuhSec));
        for (Cat cat : allCats) {
            cat.PrintInfo();
        }
        //System.out.println(Puh.equals(Pushinka));
        //Puh.equals(allCats);
        /* String qwe = "abc";
        String ter = "abc";
        System.out.println(qwe.equals(ter)); */
    }

    public static void FillMas(ArrayList<Integer> arr){
        Random random = new Random();
        for(int i=0; i<1000;i++)
            arr.add(random.nextInt(25));
    }

    public static void GetSetFromArray(ArrayList<Integer> arr){
        HashSet<Integer> set = new HashSet<>(arr);
        for (Integer el : set) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.println((double)(set.size()*100)/arr.size()); 
    }
}
