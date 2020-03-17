package MorseCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class Main {

    static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",

            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",

            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",

            "9", "0", "!", ",", "?", ".", "'" };

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",

            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",

            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",

            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",

            "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.", };
    public static void main(String[] args) {
        MorseCodeEncoding morseEncoder = new MorseCodeEncoding();
        EnglishEqual morseToEnglishEncoder = new EnglishEqual();

        Scanner input = new Scanner(System.in);

        String stringValue = "";

        System.out.print("Enter the english Pharse to encode in morse code : ");

        String english = input.nextLine();
        morseEncoder.decodeEnglish(english);

        try {
            File myObj = new File("morsecode.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                stringValue = morseToEnglishEncoder.decode(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            FileWriter myWriter = new FileWriter("engquivalent.txt");
            myWriter.write(stringValue);
            myWriter.close();
            System.out.println("Successfully wrote to the engquivalent.txt file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}