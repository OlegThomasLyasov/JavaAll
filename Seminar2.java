import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        //int kol = iScanner.nextInt();
        //System.out.println(CreateString(kol)); 
        //String name = iScanner.nextLine();
        //System.out.println(CompressString(name));
        //System.out.println(IsPalindrom(name));
        //FileWriteInfo();
        File folder =  new File("/Users/Oleg/Desktop/JAVA");
        System.out.println(ScanFolder(folder).toString());
        iScanner.close();
    }
    public static String CreateString(int kol){
        String res = "";
        String s1 = "Oleg";
        String s2 = "Vasya";
        for(int i=0; i<kol;i++)
            res = i%2==0 ? res + s1 : res + s2;  
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
    public static boolean IsPalindrom(String name){
        StringBuilder nameSec = new StringBuilder(name).reverse();
        return name.equals(nameSec.toString());
    }
    public static void FileWriteInfo(){
        Scanner FileScan = new Scanner(System.in);
        String name = FileScan.nextLine();
        try {
            FileWriter fw = new FileWriter("1.txt");
            for(int i=0;i<100;i++){
                fw.write(name);
                fw.append('\n');
            }
            fw.close();
        }
        catch(IOException ex){
            ex.getMessage();
        }
        finally{
            FileScan.close();
        }
    }
    public static StringBuilder ScanFolder(File folder){
        StringBuilder allFiles = new StringBuilder();
        //folder.isDirectory
        try{
            for (File fileEntry : folder.listFiles()) {
                    allFiles.append(fileEntry.getName());
                }
        }
        catch(Exception e){
            try{
                FileWriter errorLog  = new FileWriter("error.log");
                errorLog.write(e.getMessage());
                errorLog.close();
            }
            catch(IOException ex){
                ex.getMessage();   
            }  
        }
        return allFiles;
    }
}
//перебор StringBuilder
/*
 * StringBuilder builder = new StringBuilder("magic");
    // Loop over the characters in this StringBuilder.
    for (int i = 0; i < builder.length(); i++) {
        System.out.println(builder.charAt(i));
    }
    }
 */
