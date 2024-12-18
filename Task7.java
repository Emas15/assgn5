import java.util.Scanner;

public class Task7{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String unique = "";
        String uniqueFinal ="";

        for(int i = 0; i < input1.length(); i++){
            char ch = input1.charAt(i);

            boolean flag = true;

            for(int j = 0; j<input2.length(); j++){
                char ch1 = input2.charAt(j);
            
                if(ch==ch1){
                    flag = false;
                    break;

                }
            }
            if(flag){
                unique+=ch;
            }
        }



        for(int i = 0; i < input2.length(); i++){
            char ch = input2.charAt(i);

            boolean flag = true;

            for(int j = 0; j<input1.length(); j++){
                char ch1 = input1.charAt(j);
            
                if(ch==ch1){
                    flag = false;
                    break;

                }
            }
            if(flag){
                unique+=ch;
            }
        }


        for(int u = 0; u < unique.length(); u++){
            char ch = unique.charAt(u);

            if(ch>='a' && ch<='z'){
                ch = (char)(ch-32);
                uniqueFinal+=ch;
            }
            else{
                uniqueFinal+=ch;
            }
        }
       

        System.out.println(uniqueFinal);

    }
}