package Lesson1;

public class Task3 {
    public static void main(String[] args) {
        String password1 = "Password123";
        String password2 = "Password1";
        String password3 = "$Password$";

        System.out.println("Пароль \"" + password1 + "\" является " +
                (isCorrectPassword(password1) ? "действительным." : "не действительным."));
        System.out.println("Пароль \"" + password2 + "\" является " +
                (isCorrectPassword(password2) ? "действительным." : "не действительным."));
        System.out.println("Пароль \"" + password3 + "\" является " +
                (isCorrectPassword(password3) ? "действительным." : "не действительным."));
    }

    public static boolean isCorrectPassword(String password) {
        if (password.length() < 10) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            } else if (!Character.isLetter(ch)) {
                return false;
            }
        }

        return digitCount >= 2;
    }
}
