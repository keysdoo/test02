package test_01._t02;

public class _01 {
    public static void main(String[] args) {

        int[] arr = {431,54,25,25,26,45,2,4,65,3,64,6,46,7,54};
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(binarySerach(arr, 7));
        System.out.println(binarySerach(arr, 200));


    }
    public static int binarySerach(int[] arr, int number) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (number == arr[mid]) {
                return mid ;
            } else if (number < arr[mid]) {
                end = mid - 1;
            } else if (number > arr[mid]) {
                start = mid + 1;
            }
        }
        System.out.println("不存在这个数。");
       return -1;

    }
}
