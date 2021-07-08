import java.util.Random;
import java.util.Scanner;

class ex04{

    public static void main(String arg[]){
        int headscnt=0;
        int tailscnt=0;
        int result =0;
        String[] coin = {"heads","tails"};
        Random random = new Random();
        //名前を聞くパート
        Scanner inputname = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = inputname.next();
        System.out.println("My name is " + name);
        //コイントスのパート
        for(int i = 0; i<3 ; i++){
            result = random.nextInt(2);
            
            if(result == 0){headscnt++;}
            else{ tailscnt++;}
            
            String resultcoin = coin[result];
            System.out.println(resultcoin);
        }
        System.out.println("heads:" + headscnt + ",tails:" + tailscnt);
    }

}
