import java.util.Scanner;

public class test {
    public static void main(String [] args) {

//        char [] row = new char[];
        Scanner scanner = new Scanner(System.in);
        String row = scanner.next();//used to input the characters
        char [] rowC = row.toCharArray();//transport to char array

        System.out.println("请输入加密的5位数字");
        String secret = scanner.next();
        int [] password = parse(secret);//transport to int array



//        for(int i = 0; i < password.length; i++) {
//            System.out.println(password[i]);
//        }

        String product = "";
//        System.out.println (product + 'm');
//        System.out.println ( (char)((int)rowC[0] + password[0]));

        for(int i = 0; i < rowC.length; i++) {
            char c  =   (char)((int)rowC[i] + password[i%5]);
            product = product + c;
        }

        System.out.println("加密后的结果为：");
        System.out.println(product);
    }


    //this function was designed to make the String to int and take it to an array
    public static int[] parse (String str) {
        int length = str.length();
        int[] result = new int[length];
        // get every char in String and transport it to number respectively, then take it into the array
        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            result[i] = Character.getNumericValue(c);
        }
        return result;
    }


}
