import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String lower = sc.nextLine();
        String upper = "";

        for(int i = 0; i < lower.length(); i++){
            
            char ch = lower.charAt(i);

            if(ch>='a' && ch<='z'){
                ch = (char) (ch-32);
                upper+=ch;
            }
            else{
                upper+=ch;
            }
        }

        System.out.println(upper);
        
    }
}