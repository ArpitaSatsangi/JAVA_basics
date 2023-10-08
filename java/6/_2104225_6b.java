import java.util.Random;

class MatrixMultiplicationThread extends Thread {
    private final int[][] A;
    private final int[][] B;
    private final int[][] C;
    private final int startRow;
    private final int endRow;

    public MatrixMultiplicationThread(int[][] A, int[][] B, int[][] C, int startRow, int endRow) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    @Override
    public void run() {
        int N = A.length;
        int M = B[0].length;
        int K = A[0].length;

        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < K; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
    }
}

public class _2104225_6b {
    public static void main(String[] args) {
        int N = 1000; // Change the matrix size N to compare execution times
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];

        // Initialize matrices A and B with random values
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = random.nextInt(10);
                B[i][j] = random.nextInt(10);
            }
        }

        // Multithreaded matrix multiplication
        long startTime = System.currentTimeMillis();

        int numThreads = Runtime.getRuntime().availableProcessors();
        MatrixMultiplicationThread[] threads = new MatrixMultiplicationThread[numThreads];
        int rowsPerThread = N / numThreads;
        int startRow = 0;
        int endRow = rowsPerThread;

        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                endRow = N; // Last thread handles the remaining rows
            }
            threads[i] = new MatrixMultiplicationThread(A, B, C, startRow, endRow);
            threads[i].start();
            startRow = endRow;
            endRow += rowsPerThread;
        }

        // Wait for all threads to finish
        try {
            for (MatrixMultiplicationThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTimeMultithreaded = endTime - startTime;

        // Simple single-threaded matrix multiplication for comparison
        startTime = System.currentTimeMillis();
        int[][] D = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    D[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        endTime = System.currentTimeMillis();
        long executionTimeSingleThreaded = endTime - startTime;

        // Display execution times
        System.out.println("Multithreaded Execution Time (in milliseconds): " + executionTimeMultithreaded);
        System.out.println("Single Threaded Execution Time (in milliseconds): " + executionTimeSingleThreaded);
    }
}
