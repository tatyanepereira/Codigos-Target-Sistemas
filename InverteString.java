import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");

        String str = scanner.nextLine();

        char[] strArray = str.toCharArray();

        int left = 0;
        int right = strArray.length - 1;

        while (left < right) {
            char temp = strArray[left];
            strArray[left] = strArray[right];
            strArray[right] = temp;

            left++;
            right--;
        }

        String strInvertida = new String(strArray);
        System.out.println("String invertida: " + strInvertida);
    }
}
