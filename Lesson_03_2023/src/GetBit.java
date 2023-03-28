public class GetBit {

    /**
     * 0000000100001000100000000011
     * 0b0000000
     */


    private static int getBitLera(int bin) {
        int count = 0;
        while (bin != 0) {
            if ((bin & 1) == 1) {
                count++;
            }
            bin = bin >> 1;
        }
        return count;
    }

    private static int getBit(int bin) {
        int res = 0;
        while (bin != 0) {
            bin = bin & (bin - 1);
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 0b00000011;
        System.out.println(getBitLera(a));
        System.out.println(getBit(a));
    }
}
