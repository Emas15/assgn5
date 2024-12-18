import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        String reversedWord = "";

        for (int i = (word.length()-1); i>= 0; i-- ){
            char ch = word.charAt(i);
            reversedWord+=ch;
        }

        if(reversedWord.equals(word)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
}