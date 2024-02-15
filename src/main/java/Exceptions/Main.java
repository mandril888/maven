package Exceptions;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println(concat("John", "Doe"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println(concat("John", ""));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int x = convertToInt("4");
            System.out.println("x = " + x);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int x = convertToInt("4.1");
            System.out.println("x = " + x);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String concat(String firstName, String lastName) throws IllegalArgumentException{

        if (firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty()) {
            throw new IllegalArgumentException("Strings cannot be null or empty");
        }

        return firstName + " " + lastName;
    }

    public static int convertToInt(String s) throws NumberFormatException {
        return Integer.parseInt(s);
    }
}
