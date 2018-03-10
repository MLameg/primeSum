public class primeSum {

    private static int sum = 0;
    private static int count = 0;
    private static int numbers = 2;

    public static void main(String[] args){

        //  Counts the number of prime numbers found until 1000
        while (count < 1000) {

            //  If numbers is a prime, numbers is printed,
            //  added to sum, and increases the count.
            if (!checkNum(numbers)){
                    System.out.println(numbers);
                    sum += numbers;
                    count++;
                }

                //  Increases to the next value to be checked.
                numbers++;
        }

        //  Prints the sum once the while loop is completed.
        System.out.println(sum);

    }

    public static boolean checkNum(int num){

        //  Divides 'num' by i, checks if num/i has a remainder.
        //  Only returns TRUE if num is NOT A PRIME.
        for (int i = 2; i < num; i++){
            if(num % i == 0)
                return true;
        }

        return false;
    }

        /*    OUTER: do{

            for(int i = 2; i <= b; i++){
                if(a % i == 0){
                    System.out.println("Number is not a PRIME!");
                    break OUTER;
                }
            }
            System.out.println("is PRIME");
            break OUTER;
        }while(true); */

}
