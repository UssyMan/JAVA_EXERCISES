public class Factorial {
    public static void main(String[] args) {
      printFactorial(5);
    }
    public static int printFactorial(int number){
        if (number<1){
            System.out.println("Invalid");
        }
        else{
            int series=1;
            for (int i=1; i<=number; i++){
                series *= i;
                System.out.println(series);
            }
        }
        return 1;
    }
}
