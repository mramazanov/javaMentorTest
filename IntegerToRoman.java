import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerToRoman {



    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        Calculator cal = new Calculator();
        int numberA = 0;
        int numberB = 0;
        int sum = 0;
        try {
            if(cal.isRome(str.charAt(0)) & cal.isRome(str.charAt(4))){
                numberA = cal.convertToArabic(str.charAt(0));
                numberB = cal.convertToArabic(str.charAt(4));

            } else {
                numberA = Integer.parseInt(Character.toString(str.charAt(0)));
                numberB = Integer.parseInt(Character.toString(str.charAt(4)));
            }

            switch (str.charAt(2)){
                case '-': sum = numberA - numberB;
                    break;
                case '+': sum = numberA + numberB;
                    break;
                case '*': sum = numberA * numberB;
                    break;
                case '/': sum = numberA / numberB;
                    break;
            }
            if(cal.isRome(str.charAt(0)) & cal.isRome(str.charAt(4))) {
                cal.integerToRoman(sum);
            } else {
                System.out.println(sum);
            }
        } catch (NumberFormatException e){
            System.out.println("Введено не верно значение. Введите арабскую или римскую цифру");
        }




    }
}
