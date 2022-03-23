package algorithms;

public class Numbers {



    public boolean isDivisable(int number, int divisor) {
        return number%divisor==0;
    }

    public int getSumDivisors(int number){
        int sum = 0;
        for (int i=1; i<=number/2; i++) {
            if (isDivisable(number, i)) {
                sum+=i;
            }
        }
        return sum;
    }

    public boolean isAbundantNumber(int number) {
        if (number<0) throw new IllegalArgumentException("Number must be positive: "+number);
        return getSumDivisors(number)>number;
    }

}
