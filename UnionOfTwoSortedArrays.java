import java.util.*;
public class UnionOfTwoSortedArrays {
    public static void main(String args[])
    {
        UnionOfTwoSortedArrays a=new UnionOfTwoSortedArrays();
        int arr1[]={2,2,2,3,3,4,7,8};
        int arr2[]={1,2,4,4,6,6,7,8,10};
      ArrayList<Integer> finalUnion=new ArrayList<Integer>();            
        a.UnionOfTwoSortedarrays(arr1, arr2, finalUnion);
        System.out.println(finalUnion);
    }
    public void UnionOfTwoSortedarrays(int arr1[],int arr2[],ArrayList<Integer> finalList)
    {
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length)
        {
            while((i<arr1.length-1) && (arr1[i]==arr1[i+1]))
            {
                i++;
            }
            while((j<arr2.length-1) && (arr2[j]==arr2[j+1]))
            {
                j++;
            }
            if(arr1[i]<arr2[j])
            {
                finalList.add(arr1[i++]);
            }else if(arr1[i]>arr2[j])
            {
                finalList.add(arr2[j++]);
            }
            else{
                finalList.add(arr1[i++]);
                    i++;
                    j++;
            }
        }
        while(i<arr1.length)
        {
            if((i<arr1.length-1)&&(arr1[i]==arr1[i+1]))
            {
                i++;
            }
            else{
                finalList.add(arr1[i++]);
            }
        }
        while(j<arr2.length)
        {
            if((j<arr2.length-1)&&(arr2[j]==arr2[j+1]))
            {
                j++;
            }
            else{
                finalList.add(arr2[j++]);
            }
        }
    }	
}
