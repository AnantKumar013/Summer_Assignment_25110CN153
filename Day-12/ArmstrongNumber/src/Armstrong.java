

public class Armstrong {

    // public Armstrong() {}

    public boolean isArmstrong(int num) {

        int cpyNum = num, sum = 0, digit = 0;

        while (cpyNum > 0) {

            cpyNum /= 10;
            digit++;

        }

        cpyNum = num;

        while (cpyNum > 0) {

            sum += Math.pow((cpyNum % 10), digit);

            cpyNum /= 10;

        }

        return (num == sum);

    }
    
}
