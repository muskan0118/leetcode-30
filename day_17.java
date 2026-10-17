public class day_17 {
    //29. Divide Two Integers
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long count = 0;
        while (a >= b) {
            long chunk = b;
            long group = 1;

            while (chunk <= a - chunk) {
                chunk = chunk << 1;
                group = group << 1;
            }

            a = a - chunk;
            count = count + group;
        }

        
        if (negative) {
            count = -count;
        }

        return (int) count;
    }
}
