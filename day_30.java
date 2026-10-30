public class day_30 {
    //258. Add Digits
    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }

        return addDigits(sumDigits(num));
    }

    public int sumDigits(int num) {
        if (num == 0) {
            return 0;
        }

        return (num % 10) + sumDigits(num / 10);
    }
}
