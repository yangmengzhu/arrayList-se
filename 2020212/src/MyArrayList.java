import java.util.Arrays;

public class MyArrayList {
    public int[] array;
    public int usedSize;
    public MyArrayList(){
        this.array=new int[10];
        this.usedSize=0;
    }
    private boolean isFull() {
        return this.usedSize==this.array.length;
    }
    public void add(int pos,int data){
        if(isFull()){
            this.array= Arrays.copyOf(array,2*array.length);
        }
        if(pos<0 || pos>array.length){
            return;
        }
        for (int i = this.usedSize-1; i >=pos ; i--) {
            array[i+1]=array[i];
        }
        array[pos]=data;
        this.usedSize++;
    }
    public void disPlay(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public boolean contains(int tofind){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==tofind){
                return true;
            }
        }
        return false;
    }
    private boolean isEmpty(){
        return this.usedSize==0;
    }
   public int search(int tofind){
       for (int i = 0; i <array.length ; i++) {
           if(array[i]==tofind){
               return i;
           }
       }
       return -1;
   }
   public int getPos(int pos){
       if(isEmpty()){
           return -1;
       }
        if(pos<0 || pos>=this.usedSize){
            throw new RuntimeException("pos位置不合法");
        }
        return array[pos];
   }
   public int size(){
       if(isEmpty()){
           return 0;
       }
       return this.usedSize;
   }
   public void remove(int toremove){
       int index=search(toremove);
        if(index==-1){
            return;
        }

       for (int i = index; i <this.usedSize-1 ; i++) {
           array[i]=array[i+1];
       }
       this.usedSize--;
   }
   public void setPos(int pos,int value){
        if(pos<0|| pos>=this.usedSize){
            return;
        }
        array[pos]=value;
   }
   public void clear(){
        this.usedSize=0;
   }

    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i,i+1);
        }
        list.add(10,11);
        list.disPlay();
        System.out.println(list.search(5));
        System.out.println(list.contains(6));
        System.out.println(list.contains(12));
        System.out.println(list.getPos(1));
        list.remove(11);
        list.disPlay();
    }
}
