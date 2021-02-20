public class MergeSort {
    public static void main(String[] args)
    {
        int a[]={33,2,87,9,1};
        MergeSort ob = new MergeSort();
        ob.print(a);
        ob.mergesort(a, 0, a.length-1);
        ob.print(a);

    }       
    public void mergesort(int[] a,int l,int h)
    {
        if(l!=h)
        {
            int mid=(l+h)/2;
            mergesort(a, l, mid);
            mergesort(a, mid+1, h);
            merge(a,l, mid, h);
        }
    }
    public void merge(int a[],int l,int mid,int h)
    {
        int i=l;
        int j=mid+1;
        int k=0;
        int[] temp=new int[h-l+1];
        
        while((i<=mid) && (j<=end))
        {
            if(arr[i]<arr[j])
                temp[k++]=a[i++];
            else
                temp[k++]=a[j++];
        }
        while(i<=mid)
        {
            temp[k++]=a[i++];
        }
        while(j<=end)
        {
            temp[k++]=a[j++];
        }
        for(i=start;i<=end;i++)
        {
            a[i]=temp[i-start];
        }
    }
    public void print(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
