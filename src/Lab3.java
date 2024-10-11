public class Lab3 {

    /**
     * Task 1 solution
     */
    public void trojkiPitagorejskie(int n) {
        for (int i = n; i > 2; i--) {
            for (int j = i-1; j > 0; j--) {
                for (int k = j-1; k > 0; k--) {
                    if (Math.pow(k, 2) + Math.pow(j, 2) == Math.pow(i, 2)) {
                        System.out.println(k + "; " + j + "; " + i);
                    }
                }
            }
        }
    }
}
