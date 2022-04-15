package baitap;

import java.util.regex.Pattern;

public class PhoneExample {
    private static final String PHONE_REGEX = "[(84)]{4}-[0]{1}[0-9]{9}";

    public PhoneExample() {
    }
    public boolean validate(String regex){
        return Pattern.matches(PHONE_REGEX,regex);
    }
    private static PhoneExample phoneExample;
    public static final String[] validPhone = new String[]{"(84)-0985478515"};
    public static final String[] invalidPhone = new String[]{"(56)-0369855847"};

    public static void main(String[] args) {
        phoneExample = new PhoneExample();
        for (String phone:validPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("So dien thoai " + phone + " la " +isvalid);
        }
        for (String phone:invalidPhone) {
            boolean isvalid = phoneExample.validate(phone);
            System.out.println("So dien thoai " + phone + " la " +isvalid);
        }
    }
}