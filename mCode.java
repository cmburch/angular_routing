import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

public class mCode {

    static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",

            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",

            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",

            "9", "0", "!", ",", "?", ".", "'" };

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",

            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",

            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",

            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",

            "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.", };

    public static String decode(String morseCode) {

        String strMorseCode = "";

        String stringValue = "";

        String change = morseCode.trim();

        String[] words = change.split(" ");

        for (String word : words) {

            for (String letter : word.split(" ")) {

                for (int x = 0; x < morse.length; x++) {

                    if (letter.equals(morse[x]))

                        strMorseCode = strMorseCode + alpha[x];
                }

            }

            strMorseCode += " ";
        }

        return strMorseCode;

    }

    // public static void decodeEnglish(String englishCode) {

    //     String strMorseCode = "";

    //     String change = englishCode.trim();

    //     String[] words = change.split(" ");

    //     for (String word : words) {

    //         for (int i = 0; i < word.length(); i++) {

    //             for (int x = 0; x < morse.length; x++) {

    //                 if (word.substring(i, i + 1).equalsIgnoreCase(alpha[x])) {

    //                     strMorseCode = strMorseCode + morse[x] + " ";

    //                 }

    //             }

    //         }

    //         strMorseCode += " ";

    //     }

    //     try {
    //         File myObj = new File("morsecode.txt");
    //         if (myObj.createNewFile()) {
    //             System.out.println("File created: " + myObj.getName());
    //         } else {
    //             System.out.println("File already exists.");
    //         }
    //     } catch (IOException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }

    //     try {
    //         FileWriter myWriter = new FileWriter("morsecode.txt");
    //         myWriter.write(strMorseCode);
    //         myWriter.close();
    //         System.out.println("Successfully wrote to the morsecode.txt file.");
    //     } catch (IOException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }

    //     // return strMorseCode;

    // }
//////******************************copied */
    // public static void main(String[] args) {

    //     Scanner input = new Scanner(System.in);

    //     String stringValue = "";

    //     System.out.print("Enter the english Pharse to encode in morse code : ");

    //     String english = input.nextLine();
    //     decodeEnglish(english);

    //     try {
    //         File myObj = new File("morsecode.txt");
    //         Scanner myReader = new Scanner(myObj);
    //         while (myReader.hasNextLine()) {
    //             String data = myReader.nextLine();
    //             stringValue = decode(data);

    //             System.out.println(data);
    //             System.out.println(stringValue);

    //         }
    //         myReader.close();
    //     } catch (FileNotFoundException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }

    //     try {
    //         FileWriter myWriter = new FileWriter("engquivalent.txt");
    //         myWriter.write(stringValue);
    //         myWriter.close();
    //         System.out.println("Successfully wrote to the engquivalent.txt file.");
    //     } catch (IOException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //     }
    // }

}