import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String reversedWord = "";

        for (int i = (word.length()-1); i>= 0; i-- ){
            char ch = word.charAt(i);
            reversedWord+=ch;
        }
        System.out.println(reversedWord);

    }
}