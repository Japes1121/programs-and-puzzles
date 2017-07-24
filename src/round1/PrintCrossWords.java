package round1;
import java.io.*;
/**
 * Created by Jayaprakash on 7/19/17.
 */
public class PrintCrossWords {
    String str="hpoa";
    int reverseDiagnel=str.length()-1;
    
    public void printWords(){
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i==j) {
                    System.out.print(str.charAt(i));
                }else if(j==reverseDiagnel){
                    System.out.print(str.charAt(reverseDiagnel));
                }else{
                    System.out.print(" ");
                }
            }
            reverseDiagnel-=1;
            System.out.println(" ");
        }

    }
}
