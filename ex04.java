import java.util.Random;

class ex04{

    public static void main(String arg[]){
        int headscnt=0;
        int tailscnt=0;
        int result =0;
        String[] coin = {"heads","tails"};
        Random random = new Random();
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
