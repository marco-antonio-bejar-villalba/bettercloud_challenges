package org.example.week2;

public class TextManipulation {

    public static void main(String[] args) {
        String telephone = "123-456-7890";

        System.out.println(hidePhoneA(telephone));
        System.out.println(hidePhoneB(telephone));
        System.out.println(hidePhoneC(telephone));
        System.out.println(hidePhoneD(telephone));


    }


    public static String hidePhoneA(String fullPhoneNumber) {

        String mask = "xxx-xxx-";
       // mask.append(fullPhoneNumber.substring(8));
        return mask;
    }

    public static String hidePhoneB(String fullPhoneNumber) {
        return new StringBuilder("xxx-xxx-") + fullPhoneNumber.substring(8);
    }

    public static String hidePhoneC(String fullPhoneNumber) {
        return new StringBuilder(fullPhoneNumber).replace(0, 7, "xxx-xxx-").toString();
    }

    public static String hidePhoneD(String fullPhoneNumber) {
        return "xxx-xxx-" + fullPhoneNumber.substring(8, 12);
    }

}
