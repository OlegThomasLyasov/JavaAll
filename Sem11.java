//import java.time.*;
import java.util.Scanner;
//import java.util.Random;

public class Sem11{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner iScanner = new Scanner(System.in);
        FillArr(numbers);
        PrintArr(numbers);
        //int[] numbers_sec = new int[10];
        //numbers_sec = ChanchedArr(numbers, 1); // ссылаются на одну память
        //System.arraycopy(numbers, 0, numbers_sec, 0, numbers.length);
        //PrintArr(numbers_sec);
        //PrintArr(numbers);
        //System.out.println("\n"+FindMax(numbers));
        //System.out.print("Введите ваше имя: ");
        //String name = iScanner.nextLine();
        //System.out.println(Proverka(name));
        //String[] words = iScanner.nextLine().split(" ");
        //String[] rew_words = RewerseWord(words);
        //for(var s: rew_words)
            //System.out.print(s + " ");
        int a = iScanner.nextInt();
        int b = iScanner.nextInt();
        double res = 1;
        if(b<0)
        {
            res = 1/PowInt(a, Math.abs(b));
            System.out.format("%.3f",res);
        }  
        else
            System.out.println(PowInt(a,b));
        FindIndex(numbers);
        iScanner.close();
    }
    /* 
    public static String Proverka(String name){
        LocalTime ldt = LocalTime.now();
        if (ldt.isAfter(LocalTime.of(5, 00)) && ldt.isBefore(LocalTime.of(11, 59))){
            return "Доброе утро! "+ name;
        }
        else if(ldt.isAfter(LocalTime.of(12, 00)) && ldt.isBefore(LocalTime.of(17, 59))){
            return "Добрый день! "+ name;
        }
        return "Это не имя:) "+ name;
    }
    */
    public static void FillArr(int[] arr){
        for(int i=0; i<arr.length; i++)
            //numbers[i] = new Random().nextInt(4);
            arr[i] = (int)(Math.random() * 8);//*2 
    }
    public static void PrintArr(int[] arr){
        for(var item: arr)
            System.out.print(item + " ");
        System.out.println();
    }
    public static int FindMax(int[] arr){
        int countMax = 0;
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if (arr[i-1] == arr[i] && arr[i] == 1)
                count++;
            else
                count = 1;
            if (count>countMax)
                countMax = count;
        }
        return countMax;
    }
    public static int[] ChanchedArr(int[] arr, int k){
        //0 0 1 1 0 0 1 0 1 0 1
        int i_f,i_t;
        i_t=0;//куда переносим
        for (i_f=0; i_f<arr.length; i_f++)
            if (arr[i_f] !=k ) arr[i_t++]=arr[i_f];
        for (i_f=i_t; i_f<arr.length; i_f++) arr[i_f]=k;
        return arr;
    }
    public static String FindMaxPref(String[] words){
        if (words.length==0)
            return "";
        String prefix = words[0];//запоминаем 1 слово, это и будет наш префикс
        for (var str : words)
        // Возвращает целочисленное значение, указывающее начальную 
        // позицию строки в объекте String. 
        // Если строка не найдена, возвращается -1.
        while (str.indexOf(prefix) != 0) {
            // Начальная позиция подстроки не равна 0, 
            // затем подстрока сокращается, а затем сравнивается.
            prefix = prefix.substring(0, prefix.length() - 1); 
            if (prefix.isEmpty())
                return "";
        }
    return prefix;
    }
    public static String[] RewerseWord(String[] words){
        String[] new_line = new String[words.length];
        System.out.println(new_line.length);
        int k = 0;
        for(int i=words.length-1; i>=0;i--){
            new_line[k] = words[i];
            k++;
        }
        return new_line;
    }
    public static double PowInt(int a, int b){
        if (b==0) return 1;
        if (b==1) return a;
        else return a * PowInt(a, b-1); 
    }
    public static void FindIndex(int[] arr){
        int lt = 0; // первый, то есть левый
        int rt = arr.length - 1; // второй, то есть правый
        int sum = 10; //искомая сумма
        while (lt != rt)
    {       
        int cursum = arr[lt] + arr[rt];
        if (cursum < sum)
            lt++;
        else if (cursum > sum)
            rt--;
        else // if (cursum == sum)
        {
            System.out.println(lt +" "+ rt); 
            System.out.println(arr[lt]+ " "+ arr[rt]);
            break;
        }
    }
    }
}