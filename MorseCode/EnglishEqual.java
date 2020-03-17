package MorseCode;

public class EnglishEqual {

    static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",

            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",

            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",

            "9", "0", "!", ",", "?", ".", "'" };

    static String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",

            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",

            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",

            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",

            "-....", "--...", "---..", "----.", "-----", "-.-.--", "--..--", "..--..", ".-.-.-", ".----.", };

    public String decode(String morseCode) {

        String strMorseCode = "";

        // String stringValue = "";

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
}