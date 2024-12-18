import java.util.Scanner;

public class Task8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String output  = "";

        boolean isLower = true;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch >='a' && ch<='z'){
                if(isLower){
                    output+=ch;
                }
                else{
                    output += (char)(ch-32);
                }
                isLower = !isLower; 
            }

            else if(ch>'A' && ch<='Z'){
                if(isLower){
                    output += (char)(ch+32);
                }
                else{
                    output+=ch;
                }
                isLower = !isLower; 
            }
            else{
                output+=ch;
            }
        }

        System.out.println(output);

    }
}