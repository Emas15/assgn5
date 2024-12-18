import java.util.Scanner;

public class Task6{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String currentWord = "";
        String reversedSen = "";

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch==' '){
                reversedSen = currentWord + " " + reversedSen;
                currentWord = "";
            }
            else{
                currentWord+=ch;
            }
        }
        reversedSen = currentWord + " " + reversedSen;
        System.out.println(reversedSen);


    }
}