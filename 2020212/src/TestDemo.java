import java.util.Arrays;

public class TestDemo {
    public static int binarySearch(int[] arr,int key) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key) {
                right = mid - 1;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
        }
        public static void main (String[]args){
              /*String[] str={"ab","bc"};
              String[] str1={"ab","bc","cd"};
            System.out.println(Arrays.equals(str, str1)); */
            int[] arr={1,5,8,10};
            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
        public static boolean isUp(int[] arr){
            for (int i = 0; i <arr.length-1 ; i++) {
                if(arr[i+1]<arr[i]){
                    return false;
                }
            }
            return true;
        }
        public static void bubbleSort(int[] arr){
            boolean flag=true;
            for (int i = 0; i <arr.length-1 ; i++) {
                flag=false;
                for (int j = 0; j < arr.length-1-i; j++) {
                    if(arr[j]>arr[j+1]){
                        int tmp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=tmp;
                        flag=true;
                    }
                }
                if(flag==false){
                    break;
                }
            }
        }
        public static void reverse(int[] arr){
           int left=0;
           int right=arr.length-1;
           while(left<right){
               int tmp=arr[left];
               arr[left]=arr[right];
               arr[right]=tmp;
               left++;
               right--;
           }
        }
}
