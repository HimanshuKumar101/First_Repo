import java.util.Arrays;

public class firstFit {
    public static void main(String[] args) {
        int[] blockSizes = { 100, 500, 200, 450, 600 };
        int[] processSizes = { 212, 417, 112, 426 };

        int[] allocation = firstfit(blockSizes, processSizes);

        System.out.println("Process No.\tProcess Size\tBlock No.");
        for (int i = 0; i < processSizes.length; i++) {
            System.out.println(
                    i + "\t\t" + processSizes[i] + "\t\t" + (allocation[i] == -1 ? "Not Allocated" : allocation[i]));
        }
    }

    public static int[] firstfit(int[] blockSizes, int[] processSizes) {
        int m = blockSizes.length;
        int n = processSizes.length;
        int[] allocation = new int[n];

        Arrays.fill(allocation, -1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (blockSizes[j] >= processSizes[i]) {
                    allocation[i] = j;
                    blockSizes[j] -= processSizes[i];
                    break;
                }
            }
        }

        return allocation;
    }
}
