import java.util.Scanner;

public class Task8s{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String output = "";
        int charCount = 0;


        
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                
                charCount++;

                if(charCount%2!=0){
                    if(ch>='a' && ch<='z'){
                        output+=ch;
                    }
                    else{
                        output += (char)(ch+32);
                    }
                }

                else if(charCount%2==0){
                     if(ch>='A' && ch<='Z'){
                        output+=ch;
                    }
                    else{
                        output+= (char)(ch-32);
                    }
                }
            }
            else{
                output+=ch;
            }


    }

    System.out.println(output);
}

}