public class Muliplication {
    public static void main(String[] args) {
        multiplicationOf(3);
    }
    public static int multiplicationOf(int number){
        int i=1;
        int product;
        do {
            product= number * i;
            String temp= number + "X" + i + "=" + product;
            //System.out.println(number + "X" + i + "=" + product);
            System.out.println(temp);
            i++;
        } while (i<=12);
        return 1;
    }
}
