import java.util.Random;
import java.util.Scanner;

public class Main {
    private static String generateNumber(int n){
        String str="";
        Random rand = new Random();
        for (int i=0; i<n; i++)
            str+=Integer.toString(rand.nextInt(2));
        return str;
    }
    public static void main(String[] args) {
        //String number = "101011110001111100011000101000";
//        String number=" ";
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please input your binary number:");
//        if (!isValid(number=in.nextLine())) {
//            while (!isValid(number)) {
//                System.out.println("The number is not valid!");
//                System.out.println("Please input your binary number:");
//                number = in.nextLine();
//            }
//        }
        String number="11111111";
        //String number = generateNumber(10000);
//        System.out.println("Your number = "+toDecimal(number));
        System.out.println("Result: " + check(number));
    }

    private static String check(String number) {
        int numberLength = number.length();

        int x = numberLength % 4;
        if (x > 0) {
            for (int i = 0; i < 4 - x; i++)
                number = "0" + number;
        }

        int i = 0;
        int sum = 0;
        while (i < numberLength) {
            String currentNibble = number.substring(i, i + 4);
            switch (currentNibble) {
                case "0000":
                    sum += 0;
                    break;
                case "0001":
                    sum += 1;
                    break;
                case "0010":
                    sum += 2;
                    break;
                case "0011":
                    sum += 3;
                    break;
                case "0100":
                    sum += 4;
                    break;
                case "0101":
                    sum += 5;
                    break;
                case "0110":
                    sum += 6;
                    break;
                case "0111":
                    sum += 7;
                    break;
                case "1000":
                    sum += 8;
                    break;
                case "1001":
                    sum += 9;
                    break;
                case "1010":
                    sum += 10;
                    break;
                case "1011":
                    sum += 11;
                    break;
                case "1100":
                    sum += 12;
                    break;
                case "1101":
                    sum += 13;
                    break;
                case "1110":
                    sum += 14;
                    break;
                case "1111":
                    sum += 15;
                    break;
                default:
                    sum += 0;
                    break;
            }
            i += 4;
        }
        //sum+=Integer.valueOf(number.substring(i, i+3),2);
        System.out.println("sum = "+sum);
        if (sum % 15 == 0)
            return "the number IS DIVIDED by 15";
        else
            return "the number IS NOT DIVIDED by 15";
    }

    private static boolean isValid(String number) {
        for (int i = 0; i < number.length(); i++) {
            if ((number.charAt(i) != '0') && (number.charAt(i) != '1'))
                return false;
        }
        return true;
    }

    private static long toDecimal(String number){
        long sum=0;
        for (int i=number.length()-1;i>=0; i--){
            if (number.charAt(i)=='1'){
                sum+=Math.pow(2,number.length()-1-i);
            }
        }
        return sum;
    }
}
