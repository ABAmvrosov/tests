package net.aab.TestApps;

public class Char001 {
    public static void main(String[] args) {
        char ch1 = 55378;
        char ch2 = 56816;
        String str = new String(new char[]{ch1, ch2});
        System.out.println(str);
        System.out.println(Character.isSurrogatePair(str.charAt(0),str.charAt(1)));
        System.out.println(str.codePointAt(0));

    }
}
