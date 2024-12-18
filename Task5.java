import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int vCount = 0;
        int cCount =0;

        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);

            if(ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }

            if(ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                vCount++;
            }
            else if(ch>='a' && ch<='z'){
                cCount++;
            }
        }

        if((vCount>0 && vCount%3==0) && (cCount>0 && cCount%5==0)){
            System.out.println("Aaarr! Me Plunder!!");
        }
        else{
            System.out.println("Blimey! No Plunder!!");
        }

    }
}