public class Final {
    public static void main(String[] args) {
        System.out.println(encode("ЯГ"));
        System.out.println(encode("ЯГГ"));
        System.out.println(encode("ЯГ Г"));
        System.out.println(encode("ДЖАВА ЭТО КРУТО") + "\n");

        System.out.println(decode("2116"));
        System.out.println(decode("2116 256"));
        System.out.println(decode("2116 4"));
        System.out.println(decode("328 67 64 2004 1024 786 1364 1024"));
    }

    public static String encode(String text) {
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < text.length() / 2; i++) {
            String newNumber = turnLetterToCode(text.charAt(i * 2)) + turnLetterToCode(text.charAt(i * 2 + 1));
            code.append(Integer.valueOf(newNumber, 2));
            code.append(" ");
        }

        if (text.length() % 2 == 0) {
            code.deleteCharAt(code.length() - 1);
        } else {
            String newNumber = turnLetterToCode(text.charAt(text.length() - 1)) + "000000";
            code.append(Integer.valueOf(newNumber, 2));
        }

        return code.toString();
    }

    public static String decode(String text) {
        StringBuilder result = new StringBuilder();
        String[] numbers = text.split(" ");

        for (int i = 0; i < numbers.length; i++) {
            String number = turnCodeToLetters(numbers[i]);
            int firstNumber = Integer.valueOf(number.substring(0, 6), 2);
            int secondNumber = Integer.valueOf(number.substring(7, 12), 2);
            result.append(getLetterFromNumber(firstNumber));

            if (i == numbers.length - 1 && secondNumber == 0)
                break;

            result.append(getLetterFromNumber(secondNumber));
        }

        return result.toString();
    }

    public static String turnCodeToLetters(String code){
        int number = Integer.valueOf(code, 10);
        StringBuilder binary = new StringBuilder(Integer.toBinaryString(number));
        while (binary.length() < 12)
            binary.insert(0, '0');
        return binary.toString();
    }

    public static String turnLetterToCode(char letter){
        if (letter == ' ')
            return "000000";

        int number = getNumberOfLetter(letter);
        StringBuilder result = new StringBuilder(Integer.toBinaryString(number));

        while (result.length() < 6)
            result.insert(0, '0');
        return result.toString();
    }

    public static int getNumberOfLetter(char letter) {
        letter = Character.toLowerCase(letter);
        if (letter == 'ё') {
            return 'е' + 2 - 'а';
        } else if (letter <= 'е'){
            return letter - 'а' + 1;
        } else {
            return letter + 2 - 'а';
        }
    }

    public static char getLetterFromNumber(int number) {
        if (number == 0)
            return ' ';

        if (number == 7)
            return 'ё';

        if (number < 7) {
            return (char) (number + 'а' - 1);
        } else {
            return (char) (number + 'а' - 2);
        }
    }
}
