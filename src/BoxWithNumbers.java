public class BoxWithNumbers<T> {
    private T[] nums;
    private int i,j;
    public BoxWithNumbers(int i,int j,T... nums) {
        this.nums = nums;
        this.i=i;
        this.j=j;
    }
    public void swap() {
       T a = nums[i];
       nums[i]=nums[j];
       nums[j]=a;

    }
}