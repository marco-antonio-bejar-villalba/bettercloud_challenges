package org.example.week2;

public class TextManipulation {

    public static void main(String[] args) {
        String telephone = "123-456-7890";

        System.out.println(hidePhonea(telephone));
        System.out.println(hidePhoneb(telephone));
        System.out.println(hidePhonec(telephone));
        System.out.println(hidePhoned(telephone));


    }


    public static String hidePhonea(String fullPhoneNumber) {

        String mask = "xxx-xxx-";
       // mask.append(fullPhoneNumber.substring(8));
        return mask;
    }

    public static String hidePhoneb(String fullPhoneNumber) {
        return new StringBuilder("xxx-xxx-") + fullPhoneNumber.substring(8);
    }

    public static String hidePhonec(String fullPhoneNumber) {
        return new StringBuilder(fullPhoneNumber).replace(0, 7, "xxx-xxx-").toString();
    }

    public static String hidePhoned(String fullPhoneNumber) {
        return "xxx-xxx-" + fullPhoneNumber.substring(8, 12);
    }

}
