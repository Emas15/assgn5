import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        char splitChar = sc.next().charAt(0);
        String splitedData = "";

        for(int i = 0; i < data.length(); i++){
            char ch = data.charAt(i);

            if(ch==splitChar){
                splitedData += "\n";
            }
            else{
                splitedData+=ch;
            }
        }        

        System.out.println(splitedData);
    }
}