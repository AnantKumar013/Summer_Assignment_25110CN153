public class Palindrome {

    public Palindrome() {}

    public boolean isPalindrome(int num) {

        int cpyNum = num, sum = 0;

        while (cpyNum > 0) {

            sum = (sum * 10 ) + (cpyNum % 10);

            cpyNum /= 10;

        }

        return (num == sum);

    }

}
