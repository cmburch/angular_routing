package MorseCode;

public class EnglishEqual 
{ 
    // function to encode a character as MorseCode
    static String morseEncode(String x)  
    { 

        switch (x)  
        { 
            case ".-" : 
                return "a"; 
            case "-...": 
                return "b"; 
            case "-.-.": 
                return "c"; 
            case "-..": 
                return "d"; 
            case ".": 
                return "e"; 
            case "..-.": 
                return "f"; 
            case "--.": 
                return "g"; 
            case "....": 
                return "h"; 
            case "..": 
                return "i"; 
            case ".---": 
                return "j"; 
            case "-.-": 
                return "k"; 
            case ".-..": 
                return "l"; 
            case "--": 
                return "m"; 
            case "-.": 
                return "n"; 
            case "---": 
                return "o"; 
            case ".--.": 
                return "p"; 
            case "--.-": 
                return "q"; 
            case ".-.": 
                return "r"; 
            case "...": 
                return "s"; 
            case "-": 
                return "t"; 
            case "..-": 
                return "u"; 
            case "...-": 
                return "v"; 
            case ".--": 
                return "w"; 
            case "-..-": 
                return "x"; 
            case "-.--": 
                return "y"; 
            case "--..": 
                return "z"; 
            case "-----": 
                return "0"; 
            case ".----": 
                return "1";     
            case "..---": 
                return "2";     
            case "...--": 
                return "3";     
            case "....-": 
                return "4";     
            case ".....": 
                return "5";     
            case "-....": 
                return "6";     
            case "--...": 
                return "7";     
            case "---..": 
                return "8"; 
            case "----.": 
                return "9"; 
        } 
        return ""; 
    } 
      
    static void morseCode(String str)  
    {   
        //Ask the user to enter morse code to translate to english
        //convert the user string into array of strings
        //loop thru each word in the string array and convert into an english letter

        String[] arr = str.split(" "); 
        for ( String value : arr) 
        { 
            System.out.println(value); 
        }

        // loop thru the string and print each character as Morse Code  
        // for (int i = 0;i<str.length(); i++) 
        //     System.out.print(morseEncode(str.charAt(i))); 
        //     System.out.println(); 
    }  
} 