import java.util.Scanner;

class MatrixAdditionThread extends Thread {
    private final int[][] A;
    private final int[][] B;
    private final int[][] C;
    private final int startRow;
    private final int endRow;

    public MatrixAdditionThread(int[][] A, int[][] B, int[][] C, int startRow, int endRow) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.startRow = startRow;
        this.endRow = endRow;
    }

    @Override
    public void run() {
        for (int i = startRow; i < endRow; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
    }
}



public class _2104225_6a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numThreads = scanner.nextInt();
        int N = scanner.nextInt();

        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        int[][] C = new int[N][N];

        // Input matrix A
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Input matrix B
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        long startTime = System.currentTimeMillis();

        // Create and start matrix addition threads
        MatrixAdditionThread[] threads = new MatrixAdditionThread[numThreads];
        int rowsPerThread = N / numThreads;
        int startRow = 0;
        int endRow = rowsPerThread;

        for (int i = 0; i < numThreads; i++) {
            if (i == numThreads - 1) {
                endRow = N; // Last thread handles the remaining rows
            }
            threads[i] = new MatrixAdditionThread(A, B, C, startRow, endRow);
            threads[i].start();
            startRow = endRow;
            endRow += rowsPerThread;
        }

        // Wait for all threads to finish
        try {
            for (MatrixAdditionThread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Display matrix C
        System.out.println("Matrix C (Result of Addition):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Execution Time (in milliseconds): " + executionTime);

        scanner.close();
    }
}
