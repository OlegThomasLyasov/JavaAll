import java.time.LocalTime;
import java.util.Scanner;


public class Seminar1 {
    public static void main(String[] args) {
        
        Scanner iScanner = new Scanner(System.in);
        /* 
        System.out.print( "Введите имя: " );
        String name = iScanner.nextLine();
        System.out.print( "Введите фамилию: " );
        String fam = iScanner.nextLine();
        //System.out.println("Введите число!!!");
        //System.out.println("Привет, "+ name + " " +fam);
        //System.out.println(LocalDateTime.now());
        //System.out.println(NowTime(name,fam));
        */
        int[] arr = new int[10];
        FillMas(arr);
        PrintMas(arr);
        System.out.println(FindMaxCount(arr));
        iScanner.close();
    }

    public static void FillMas(int[] array){
        for(int i=0;i<array.length;i++){
            //System.out.print("Введите число массива: ");
            //int num = iScanner.nextInt();
            array[i] = (int)(Math.random()*2);
        }
    }

    public static void PrintMas(int[] array){
        for(var el : array)
            System.out.print(el+" ");
        System.out.println();
    }

    public static int FindMaxCount(int[] array){
        int count = 1;
        int result = 1;
        for(int i=1; i<array.length;i++){
            if (array[i]==array[i-1] && array[i]==1) {
                count++;
                if (count > result) result = count;
            }
            else {
                count = 1;
            }
        }
        return result;
    }

    public static String NowTime(String name, String fam){
        LocalTime now_time = LocalTime.now();
        //System.out.println(now_time);
        
        if(now_time.isAfter(LocalTime.of(5, 00)) && now_time.isBefore(LocalTime.of(11, 59)))
            return "Доброе утро, "+ name + " " +fam;
    
        else if(now_time.isAfter(LocalTime.of(12, 00)) && now_time.isBefore(LocalTime.of(17, 59))){
            return "Добрый день, "+ name + " " +fam;
        }
        else if(now_time.isAfter(LocalTime.of(18, 00)) && now_time.isBefore(LocalTime.of(22, 59))){
            return "Добрый вечер, "+ name + " " +fam;
        }
        else
            return "Добрый ночи, "+ name + " " +fam;
    }
    
}
