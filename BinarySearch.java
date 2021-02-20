import javax.lang.model.util.ElementScanner14;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={2,4,5,7,54};
        BinarySearch obj=new BinarySearch();
        int i=obj.searchIndex(a, 4, 0, a.length);
        if(i==-1)
        {
            System.out.println("Value doesn't exist in array");
        }
        else
        {
            System.out.println(i);
        }
    }
    public int searchIndex(int a[],int val,int start,int end)
    {
        if(a.length==0 || start > end)
            return -1;
        int mid =(start+end)/2;
        if(val==a[mid])
        {
            return mid;
        }
        if(val<a[mid])
        {
            return searchIndex(a, val, start, mid-1);
        }
        else
            return searchIndex(a, val, mid+1, end);
    }
}
