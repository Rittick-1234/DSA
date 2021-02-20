public class DeleteEleInArray {
  
     int count=5;
    public static void main(String[] args)
    {
        int a[]={12,2,34,55,66};
        DeleteEleInArray o=new DeleteEleInArray();
        o.print(a);
        /*o.deleteEnd(a);
        o.deletevalue(a,314);*/
        o.deletePos(a,2);
        o.print(a);
    }
    public void deleteEnd(int a[])
    {
        if(a.length<=0)
            return;
        count--;
    }
    public void deletevalue(int a[],int val)
    {
        int i;
        for(i=0;i<count;i++)
        {
            if(a[i]==val){
                break;
            }
        }
        if(i==count)
        {
            System.out.println("value doesn't exists");
            return;
        }
        for(int j=i;j<count-1;j++)
        {
            a[j]=a[j+1];
        }
        count--;
    }
    public void deletePos(int a[],int pos)
    {
        if(pos>count || pos<=0)
        {
            System.out.println("Invalid position");
            return;
        }
        for(int i=pos-1;i<count-1;i++)
        {
            a[i]=a[i+1];
        }
        count--;
    }   
    public void print(int a[])
    {
        for(int i=0;i<count;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
