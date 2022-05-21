public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        int greatestCommonDivisor = gcdOf(8, 16);
        if(greatestCommonDivisor == -1){
            System.out.println("invalid value.");
        }else{
            System.out.println("Greatest common divisor is " + greatestCommonDivisor + "." );
        }
    }
    public static int gcdOf(int number1, int number2){
        int gcd = 1;
        if(number1 >= 1 && number2 >= 1){
            for(int i = 1; i <= number1 && i <= number2; i++){
                if(number1 % i == 0 && number2 % i == 0){
                    gcd = i;
                }
            }return gcd;
        }else{
            return -1;
        }
    }
}