public class Main {
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }

        }
        return true;

    }

    static void subString(String str) {
        for (int i = 0; i < str.length(); i++) {
            String substr = "";
            for (int j = i; j < str.length(); j++) {
                substr += str.charAt(j);
                boolean check = isPalindrome(substr);
                if (check == true) {
                    System.out.println("Yes palindrome " + substr);
                    return;
                }
            }
        }
        System.out.println("no palindrome");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        String str = "eru";
        subString(str);
    }
}
