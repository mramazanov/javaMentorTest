public class Calculator {

    boolean isRome(char ch){
        if(ch >= 8544 & ch <= 8553) {
            return true;
        } else {
            return false;
        }
    }

    int convertToArabic(char ch){
        int number = 0;
        switch (ch) {
            case 'Ⅰ': number = 1;
            break;
            case 'Ⅱ': number = 2;
            break;
            case 'Ⅲ': number = 3;
            break;
            case 'Ⅳ': number = 4;
            break;
            case 'Ⅴ': number = 5;
            break;
            case 'Ⅵ': number = 6;
            break;
            case 'Ⅶ': number = 7;
            break;
            case 'Ⅷ': number = 8;
            break;
            case 'Ⅸ': number = 9;
            break;
            case 'Ⅹ': number = 10;
            break;
            case 'Ⅼ': number = 50;
            break;
            case 'Ⅽ': number = 100;
            break;
        }
        return number;
    }

    public void integerToRoman(int num) {

        System.out.println("Integer: " + num);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println("Roman: " + roman.toString());
        System.out.println("---------------------------------------------------");

    }

    //convertToNumber
}
