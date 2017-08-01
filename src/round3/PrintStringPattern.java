package round3;

import java.io.*;
public class PrintStringPattern {

    public void printPattern() {
        String Str1 = new String("a1c5|500");
        Character letter=' ';
        String length="";

        int ascii,count=0;
        boolean letterAndLengthFound=false;

        for(int i=0;i<Str1.length();i++){
            ascii =(int) Str1.charAt(i);

            if((ascii >=32 && ascii <=47) || (ascii >=58 && ascii <=126 )){
                letter=Str1.charAt(i);
                count++;
            }
            else if(ascii >= 48 && ascii <= 57){
                length=length.concat(Character.toString(Str1.charAt(i)));
                if( (i+1 < Str1.length()) && (((int) Str1.charAt(i+1)) >= 48 && ((int) Str1.charAt(i+1)) <= 57))
                {
                    length=length.concat(Character.toString(Str1.charAt(i+1)));
                    i=i+1;
                    count++;
                }
                count ++;
            }

            if(count==2 || count==3){
                for(int j=0;j<Integer.parseInt(length);j++){
                    System.out.print(letter);
                }
                //System.out.println("");
                count=0;
                letter=' ';
                length="";
            }


        }

    }
}
