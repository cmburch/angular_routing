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

        String build = "";

        String change = morseCode.trim();

        String[] words = change.split(" ");

        for (String word : words) {

            for (String letter : word.split(" ")) {

                for (int x = 0; x < morse.length; x++) {

                    if (letter.equals(morse[x]))

                        build = build + alpha[x];

                }

            }

            build += " ";

        }

        return build.toUpperCase();

    }

    public static String decodeEnglish(String englishCode) {

        String build = "";

        String change = englishCode.trim();

        String[] words = change.split(" ");

        for (String word : words) {

            for (int i = 0; i < word.length(); i++) {

                for (int x = 0; x < morse.length; x++) {

                    if (word.substring(i, i + 1).equalsIgnoreCase(alpha[x])) {

                        build = build + morse[x] + " ";

                    }

                }

            }

            build += " ";

        }

        return build;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the english Pharse to encode in morse code : ");

        String english = input.nextLine();

        System.out.println(decodeEnglish(english));

        System.out.print("\n\nEnter the morse code to decode in english : ");

        String morse = input.nextLine();

        System.out.println(decode(morse));

    }

}