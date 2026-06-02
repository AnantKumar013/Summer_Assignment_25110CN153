public class Perfect {

    public Perfect() {}

    public boolean isPerfectNumber(int num) {

        int sum = 1;

        for (int i = 2; i * i <= num; i++) {

            if (num % i == 0) {

                sum += i;

                if ((num / i) != i && (num / i) != num)  {

                    sum += num / i;

                }

            }

        }

        return (num == sum);

    }

}
