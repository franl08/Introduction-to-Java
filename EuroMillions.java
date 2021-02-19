import java.util.Random;

public class EuroMillions {
    public static void main(String[] args){
        int i = 0;
        int numKeys = Integer.parseInt(args[0]);
        while (i < numKeys){
            generator(i);
            if (i != numKeys - 1){
                System.out.println("\n");
            }
            i++;
        }
    }
    public static void generator(int index){
        int num1, num2, num3, num4, num5, s1, s2;
        index++;
        num1 = num2 = num3 = num4 = num5 = 0;
        for(int i = 0; i < 5; i++){
            if (i == 0){
                num1 = randomNum();
            }
            else if (i == 1){
                num2 = num1;
                while (num2 == num1){
                num2 = randomNum();
                }
            }
            else if (i == 2){
                num3 = num2;
                while ((num3 == num2) || (num3 == num1)){
                    num3 = randomNum();
                }
            }
            else if (i == 3){
                num4 = num3;
                while((num4 == num3) || (num4 == num2) || (num4 == num1)){
                    num4 = randomNum();
                }
            }
            else{
                num5 = num4;
                while ((num5 == num4) || (num5 == num3) || (num5 == num2) || (num5 == num1)){
                    num4 = randomNum();
                }
            }
        }
        s1 = randomStar();
        s2 = s1;
        while (s2 == s1){
            s2 = randomStar();
        }
        System.out.println("Key " + index + ":");
        System.out.println("Numbers: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
        System.out.println("Stars: " + s1 + " " + s2);
    }

    public static int randomNum(){
        Random n = new Random();
        return (n.nextInt(50) + 1);
    }

    public static int randomStar(){
        Random s = new Random();
        return (s.nextInt(12) + 1);
    }
}
