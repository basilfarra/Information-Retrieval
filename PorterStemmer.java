package ca.rmen.porterstemmer;
import java.util.ArrayList;

public class PorterStemmer {
//////////////////////////////////////////////////(Step 1)
    String stemStep1(String input) {
        
        if (input.endsWith("S")) {
            return input.substring(0, input.length() - 1);
        }
       
        return input;
    }
//////////////////////////////////////////////////(Step 2)
    String stemStep2(String input) {
        
        if (input.endsWith("ATION")) {
            String stem = input.substring(0, input.length() - 5);
            return stem + "E";
        }
        
        return input;
    }
////////////////////////////////////////////////(Step 3)
    String stemStep3(String input) {
        
        if (input.endsWith("IZE")) {
            return  input.substring(0, input.length() - 3);
        }
        
        return input;
    }
//////////////////////////////////////////////////(Step 4)
    String stemStep4(String input) {
        if (input.endsWith("AL")) {
            return  input.substring(0, input.length() - 2);
        }
        return input;
    }
//////////////////////////////////////////////////main
    public static void main(String args[]){
        System.err.println( "Name: " + "Basil Saad Eddin AL-Farra");//Name
    ArrayList<String> tok = new ArrayList<>();
        
        String[] tokens = {"GENERALIZATIONS"};//The Word
    
    for (String x: tokens){
     tok.add(x);
    }

        PorterStemmer pa = new PorterStemmer();
                for (String i : tokens){
                    
                    System.out.println("The Following Word " +"[" + i +"]" );
            
                    String s1 = pa.stemStep1(i);
                        System.out.println("(step 1) "+s1);
                    
                    String s2 = pa.stemStep2(s1);
                        System.out.println("(step 2) "+s2);
                    
                    String s3= pa.stemStep3(s2);   
                        System.out.println("(step 3) "+s3); 
                     
                    String s4= pa.stemStep4(s3);
                        System.out.println("(Step 4) " + s4);

                }

 }
}