public class ArrayPractice {

    public static void main(String[] args) {
        int arr[];
        arr = new int[10];
        int[] arr1;
        arr1 = new int[10];
        int[] arr2 = new int[10];
        int[] arr3 = { 10, 20, 30, 50 };
        int arr4[] = new int[] { 10, 30, 40 };
        for (int i : arr4) {
            System.out.println(i);
        }
        // changes value in original
        int arr5[] = arr4;
        arr5[0] = 300;
        System.out.println(arr4[0]);
        // doesnot change
        int arr6[] = arr4.clone();
        arr6[1] = 400;
        System.out.println(arr4[1]);

    }

}