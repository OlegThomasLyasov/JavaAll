import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Seminar22 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        //int kol = iScanner.nextInt();
        //System.out.println(FillStringName(kol));
        //System.out.println(CompressString("aaaaaaabbbbbbbccccccddddd"));
        FillFile();
        File dir = new File("C://Users/Oleg/Desktop/JAVA");
        StringBuilder allFiles =  GetFiles(dir);
        System.out.println(allFiles.toString());
        iScanner.close();
    }

    public static String FillStringName(int kol){
        String c1 = "Oleg";
        String c2 = "Vasya";
        String res = "";
        for(int i=0;i<kol;i++){
            //if (i%2==0) res = res + c1;
            //else res = res + c2;
            res = i%2==0 ? res+c1 : res+c2;
        }
        return res;
    }
    public static String CompressString(String name){
        String res = "";
        for(int i=0;i<name.length();i++){
            if(res.indexOf(name.charAt(i))==-1){
                res+=name.charAt(i);
            }
        }
        return res;
    }
    public static void FillFile(){
        String name = "TEST";
        try{
            FileWriter fw = new FileWriter("1.txt");
            for(int i=0; i<100;i++){
                fw.write(name);
                fw.append("\n");
            }
             fw.close();   
        }catch (IOException ex){
            ex.getMessage();
        }
    }
    public static StringBuilder GetFiles(File dir){
        StringBuilder allFiles = new StringBuilder();
        try{
        for(File fileEntry : dir.listFiles()){
            allFiles.append(fileEntry.getName());
        }
        }
        catch(Exception ex){
            ex.getMessage();
        }
        return allFiles;
    }

}
