import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    static void keyPairCombination(String dig, String[] kp, String res) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for (int i = 0; i < currChoices.length(); i++) {
            keyPairCombination(dig.substring(1), kp, res + currChoices.charAt(i));

        }
    }

    public static void main(String[] args) {

        System.out.println("Hello");
        String digit = "253";
        String[] kp = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        keyPairCombination(digit, kp, "");

    }
}