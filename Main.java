public class Main {

    static void subString(String str) {
        for (int i = 0; i < str.length(); i++) {
            String substr = "";
            for (int j = i; j < str.length(); j++) {
                substr += str.charAt(j);
                System.out.print(substr + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        String str = "abcd";
        subString(str);
    }
}
