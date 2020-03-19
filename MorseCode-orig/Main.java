package MorseCode;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) 
    { 
        MorseCodeEncoding morseEncoder = new MorseCodeEncoding();
        MorseCodeEncoding morseToEnglishEncoder = new MorseCodeEncoding();

        String s = "Hello New World"; 
        String str = ".... . .-.. .-.. ---"; 

        morseEncoder.morseCode(s); 
        morseToEnglishEncoder.morseCode(str);
    }
}

