public class PrimeDeterminator {
    public static void main(String[] args) {
        //System.out.println(isPrime(9));
        printPrime(20);
    }
    public static boolean isPrime(int number){
        if (number<2){
            return false;
        }
        int i=2;
        while (i<= number/2){
            if (number%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    public static int printPrime(int number){
        for (int i=1; i<=number; i++){
            if (isPrime(i)){
                System.out.print(i + ",");
            }
            else{
                System.out.print("");
            }
        }
        return 1;
    }
}
