public class InsertEleInArray { 
    int count =0;
    public static void main(String[] args)
    {
        InsertEleInArray o = new InsertEleInArray();
        int a[] =new int[5];
        for(int j=0;j<a.length;j++)
        {
            o.insert(a,j+1);
        }
        o.print(a);
        //o.insertAtStart(a,24);
        //o.insertAtStart(a,21);
        o.insertAtPosition(a, 2, 155);
        o.print(a);
    }
       public void insert(int a[],int val)
       {
           a[count++]=val;
       }
       public void insertAtPosition(int a[],int pos,int val)
       {
           for(int i=count-1;i>pos;i--)
           {
               a[i]=a[i-1];
           }
           a[pos]=val;
       }
       public void insertAtStart(int a[],int val)
       {
           for(int i=a.length-1;i>0;i--)
           {
            a[i]=a[i-1];
           }
           a[0]=val;
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
