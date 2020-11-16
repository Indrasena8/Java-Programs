public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        int num = 50, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + (num*(num+1)) / 2);

        System.out.println("Sum = " + sum);
    }
}