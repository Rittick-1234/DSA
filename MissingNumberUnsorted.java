public class MissingNumberUnsorted {
    public static void main(String[] args){
        MissingNumberUnsorted ob =new MissingNumberUnsorted();
        int a[]={2,1,5,4,6,8,7};
        int mis=ob.missing(a,a.length+1);
        System.out.println("missing number =" + mis);
    }
    public int missing(int a[],int n)
    {
        int sum =n*(n+1)/2;
        for(int i=0;i<a.length;i++)
        {
            sum = sum-a[i];
        }
        return sum;
    }
    
}
