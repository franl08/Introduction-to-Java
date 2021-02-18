public class Calc {
    public static void main(String[] args){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt (args[2]);
        if (args[1].equals("+")){
            sumTwoNumbers(num1,num2);
        }
        else if (args[1].equals("-")){
            subtwoNumbers(num1, num2);
        }
        else if (args[1].equals("*")){
            multTwoNumbers(num1, num2);
        }
        else if (args[1].equals("/")){
            divTwoNumbers(num1, num2);
        }
        else if (args[1].equals("/i")){
            intDivTwoNumbers(num1,num2);
        }
        else if(args[1].equals("%")){
            remainderTwoNumbers (num1, num2);
        }
        else{
            System.out.println("Invalid sentence");
            return;
        }

    }
    public static void sumTwoNumbers (int a, int b){
        int r = a + b;
        System.out.println(a + " + " + b + " = " + r);
    }
    public static void subtwoNumbers (int a, int b){
        int r = a - b;
        System.out.println(a + " - " + b + " = " + r);
    }
    public static void multTwoNumbers(int a, int b){
        int r = a * b;
        System.out.println(a + " * " + b + " = " + r);
    }
    public static void divTwoNumbers(int a, int b){
        try{
            float r = (float) a / (float) b;
            System.out.println(a + " / " + b + " = " + r);
        } catch(ArithmeticException  e){
            System.out.println("Can't divide a number by zero");
        }
    }
    public static void intDivTwoNumbers(int a, int b){
        try{
            int r = a / b;
            System.out.println(a + " / " + b + " = " + r);
        } catch(ArithmeticException  e){
            System.out.println("Can't divide a number by zero");
        }
    }
    public static void remainderTwoNumbers (int a, int b){
        try {
            int r = a % b;
            System.out.println(a + " % " +   b  +  " = " + r);
        } catch(ArithmeticException  e){
            System.out.println("Can't divide a number by zero");
        }
    }
}
