class Holo {
    public static void holo(int totrow, int totcolumn) {
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcolumn; j++) {
                if (i == 1 || i == totrow || j == 1 || j == totcolumn) {
                    System.out.print("*");  // FIXED
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // move to next row
        }
    }

    public static void main(String A[]) {
        holo(4, 5);
    }
}
