import java.util.Random;

public class HoT {
    public static void main(String[] args){
        int r = random();
        if (r == 0){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }
    }
    public static int random(){
        Random r = new Random();
        return r.nextInt(2);
    }
}
