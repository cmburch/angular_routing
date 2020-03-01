import java.util.Scanner;
 
class Main {
 public static void main(String[] args) { 
   char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
 
   int[] alphabetCounter = new int[26]; //keep the count of each letter

   int alphabetIndex = 0;
   int alphabetCounterIndex = 0;
 
   ///ask the user to input a string
   System.out.print("Enter a string : ");
   Scanner scanner = new Scanner(System. in);
   String inputString = scanner. nextLine();

   //remove every character that is not a letter from the user input
   String resultString = inputString.replaceAll("\\P{L}", "");
   //convert string into array of characters
   char[] lettersArray = resultString.toCharArray();
 
    //loop thru the string and count how many times a alphabet letter repeats for each alphabet letter
   while(alphabetIndex < alphabet.length){
     char currentLetter = alphabet[alphabetIndex]; //the current alphabet to search for in string 
 
     //loop thru the string to find the current current currentLetter
     for(int i = 0; i< lettersArray.length; i++){
       if(currentLetter == lettersArray[i]){
       //if the current alphabet letter is a match inside of user input string
         //increment the alphabetCounter[alphabetIndex] by one
         ++alphabetCounter[alphabetIndex];
       }
     }//--end for loop

     ++alphabetIndex;
     ++alphabetCounterIndex;
   }
 
   //print table
   String leftAlignFormat = "| %-7s | %-4d |%n";
 
   System.out.format("+-----------------+------+%n");
   System.out.format("| Letter  | Letter Count |%n");
   System.out.format("+-----------------+------+%n");
   for (int i = 0; i < alphabet.length; i++) {
       System.out.format(leftAlignFormat, alphabet[i], alphabetCounter[i]);
   }
   System.out.format("+-----------------+------+%n");
 }
}
