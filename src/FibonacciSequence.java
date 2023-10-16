public class FibonacciSequence {
    public static void main(String[] args) {
        printSequence(15);
    }
    public static int printSequence(int num){
        int prev=0;
        int next= 1;
        if (num<0){
            System.out.println("Invalid Sequence");
        } else if (num==0) {
            System.out.println(prev);
        }
        else if (num==1){
            System.out.print(prev + "," + next);
        }
        else{
            int newSeries= 0;
            System.out.print(prev + "," + next + ",");
            for(int i=2; i<=num; i++){
                //fn= fn-1 + fn-2;
                //newSeries= prev + next;
                newSeries= prev + next;
                prev= next;
                next= newSeries;
                System.out.print(newSeries + ",");

            }
        }
        return 1;
    }
}
