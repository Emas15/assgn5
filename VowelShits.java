import java.util.Scanner;
public class VowelShits{
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
    
        int countA  = 0 ;
        int countE  = 0 ;
        int countI  = 0 ;
        int countO  = 0 ;
        int countU  = 0 ;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

           

            if(ch=='a' || ch=='A'){
                countA++;
               
                
            }
            else if(ch=='e' || ch=='E'){
                countE++;
                
            }
        else if(ch=='i' || ch=='I'){
            countI++;
                
            }
           else if(ch=='o' || ch=='O'){
            countO++;
                
            }
        else if(ch=='u' || ch=='U'){
            countU++;
                
            }
        }
        String countV = ""+  countA + countE + countI + countO + countU;
        System.out.println(countV);

    }
}