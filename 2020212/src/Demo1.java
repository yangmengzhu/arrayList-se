public class Demo1 {
    public static void func(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && arr[left]%2==0){
                left++;
            }
            while(left<right&& arr[right]%2!=0){
                right--;
            }
            if(left<right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
    }
    public static int func1(int m,int n){
        int tmp=n;
        while(m%n!=0){
            tmp=m%n;
            m=n;
            n=tmp;
        }
        return tmp;
    }

    public static void main(String[] args) {
        /*System.out.println(func1(6, 3));
        System.out.println(func1(18,24));
        System.out.println(func1(3,6));
        System.out.println(func1(2,2));*/
        //System.out.println(func2(6,8));
    }
}
