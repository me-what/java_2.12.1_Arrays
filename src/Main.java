

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 100;
        System.out.println(nums[2]+"\n");

        int[] nums2 = {1, 2, 3, 4, 5};
        int length = nums2.length;
        System.out.println(length);

        int last = nums2[nums2.length-1];
        System.out.println(last+"\n");

        int[][] nums3 = new int[2][3];
        nums3[1][0]=44;
        System.out.println(nums3[1][0]);
        System.out.println();

        int[][] nums4 = new int[3][];
        nums4[0] = new int[2];
        nums4[1] = new int[3];
        nums4[2] = new int[5];

        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for (int i : array){
            System.out.println(i);
        }
        System.out.println();

        int[] array2 = new int[] { 1, 2, 3, 4, 5 };
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
        System.out.println();

        int[] array3 = new int[] { 1, 2, 3, 4, 5 };
        for (int i=0; i<array3.length;i++){
            array3[i] = array3[i] * 2;
            System.out.println(array3[i]);
        }
        System.out.println();


        int[][] nums5 = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        for (int i = 0; i < nums5.length; i++){
            for(int j=0; j < nums5[i].length; j++){

                System.out.printf("%d ", nums5[i][j]);
            }
            System.out.println();
        }
    }
}