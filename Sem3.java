import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sem3 {
    public static void main(String[] args) {
        //ctrl+shift+p java.clean
        //List<Integer> numbers = FillList();
        List<String> planets = FillList();
        //numbers.sort(null);
        //PrintList(planets);
        //PrintListAndKol(planets);
        RemoveNum();
    }
    public static List FillList(){
        List<Integer> numbers = new ArrayList<>();
        List<String> randPlan = new ArrayList<>();
        String[] planets  = new String[] {"Earth", "Mars", "Venera", "Upiter"};
        for(int i=0;i<10;i++){
            numbers.add((int)(Math.random()*10));
            randPlan.add(planets[(int)(Math.random()*planets.length)]);
        }    
        return randPlan;
    }
    public static void PrintList(List numbers){
        for(var el : numbers)
            System.out.print(el + " ");
        System.out.println();
    }
    public static void PrintListAndKol(List<String> numbers){
        /* Map<String, Integer> frequency = numbers.stream()
        // собираем элементы листа в карту
        .collect(Collectors.toMap(
                // ключ - строка
                e -> e,
                // значение - число,
                // количество вхождений
                e -> 1,
                // суммируем количество вхождений
                Integer::sum));
        frequency.forEach((k, v) -> System.out.println(k + ": " + v)); */
        List<String> names = new ArrayList<String>();
        List<Integer> kol = new ArrayList<Integer>(); 
        int pos;
        for(int i=0; i<numbers.size(); i++){
           pos=names.indexOf(numbers.get(i));
           if(pos==-1){
            names.add(numbers.get(i));
            kol.add(1);
           }else{
                kol.set(pos, kol.get(pos)+1);
           }
        }
        for(int i=0;i<names.size();i++)
            System.out.println(names.get(i) + ": " + kol.get(i));

        for(int i = 0;i<names.size();i++){

            while((numbers.indexOf(names.get(i))) != (pos=numbers.lastIndexOf(names.get(i))))
                numbers.remove(pos);
        }
        for(int i=0;i<numbers.size();i++)
            System.out.print(numbers.get(i) + " ");
    }
    public static void RemoveNum(){
        List<String> combo = new ArrayList<String>();
        String[] planets  = new String[] {"Earth", "Mars", "Venus", "Jupiter", "Uranus"};
        for(int i=0;i<10;i++){
            if(i%2==0)
                combo.add(planets[(int)(Math.random()*planets.length)]);
            else
                combo.add(Integer.toString((int)(Math.random()*10)));
        }
        for (String string : combo) {
            System.out.print(string+ " ");
        }
        System.out.println();
        for(int i=0; i<combo.size();i++) {
            try {
                Integer.parseInt(combo.get(i));
                combo.remove(combo.get(i));
            } 
            catch (NumberFormatException exception) {
               
            }
        }
        for (String string : combo) {
            System.out.print(string+ " ");
        }
    }
}
//System.out.println(Arrays.toString(list.toArray()));
