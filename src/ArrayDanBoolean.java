public class ArrayDanBoolean {
    public static void main(String[] args) {
        long[] Numbers = {1231, 12783, 19292, 2772, 887};
        int sum = 0;
        for (int i = 0; i < Numbers.length; i++) {
            boolean checker;
            if (Numbers[i] % 2 == 0) {
                checker = true;
                sum++;
                System.out.printf("%d is an even number!\n", Numbers[i]);
            } else {
                checker = false;
                System.out.printf("%d is not an even number~\n", Numbers[i]);
            }
        }

        System.out.printf("There are %d even numbers~", sum);


    }
}
