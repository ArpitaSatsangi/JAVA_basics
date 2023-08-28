import java.util.Random;

public class _2104225_Lab03 {
    
    private String[] randomStrings;

    public _2104225_Lab03() {
        // Generating an array of 10 random strings
        randomStrings = generateRandomStrings(10); 
    }

    public static void main(String[] args) {
        _2104225_Lab03 instance = new _2104225_Lab03();

        int TIMES = 500; // consering the number of times to repeat the operations is 500

        long timeTaken1 = instance.method1(TIMES);
        long timeTaken2 = instance.method2(TIMES);

        System.out.println("Time taken for method 1: " + timeTaken1 + " ms");
        System.out.println("Time taken for method 2: " + timeTaken2 + " ms");
    }

    private String[] generateRandomStrings(int n) {
        Random random = new Random();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            int length = random.nextInt(5) + 6; // Random length between 6 and 10
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < length; j++) {
                char c = (char) (random.nextInt(26) + 'a'); // Random lowercase letter
                sb.append(c);
            }
            strings[i] = sb.toString();
        }
        return strings;
    }

    public long method1(int TIMES) {
        StringBuilder S1 = new StringBuilder();
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < TIMES; i++) {
            String randomString = randomStrings[random.nextInt(randomStrings.length)];
            S1.append(randomString);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public long method2(int TIMES) {
        StringBuffer S2 = new StringBuffer();
        long startTime = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < TIMES; i++) {
            String randomString = randomStrings[random.nextInt(randomStrings.length)];
            S2.append(randomString);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}
