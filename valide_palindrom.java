package leetCode;

import java.util.Scanner;

class Innervalide_palindrom {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^A-Za-z0-9]", "");
        StringBuilder inputs = new StringBuilder();
        inputs.append(s1);
        inputs.reverse();
        return s1.equalsIgnoreCase(inputs.toString());
    }

}

public class valide_palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Innervalide_palindrom ip = new Innervalide_palindrom();
        String str = sc.nextLine();
        boolean bn = ip.isPalindrome(str);
        System.out.println(bn);
    }
}
