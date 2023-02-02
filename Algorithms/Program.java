import java.util.Arrays;

public class Program {
    
    public static void LinearSearch(int[]arr, int key)
    {
        boolean flag = false;
        for(int i=0; i<arr.length ; i++)
        {
            if(arr[i]==key)
            {
                System.out.print("Key found at index : "+i);
                flag=true;
                break;
            }            
        }
        if(flag == false)
            System.out.println("Key not found");
    }

    public static void BinarySearch(int[] arr , int key)
    {
        int count =0;
        int index=0;
        Arrays.sort(arr);
        int first = 0, last = arr.length-1;
        int mid;

        while(first<=last)
        {
            mid=(first+last)/2;

            if(arr[mid]==key)
            {
                count++;
                index=mid;
            }
            else if(key> arr[mid])
            {
                first=mid+1;
            }
            else if(key< arr[mid])
            {
                last=mid-1;
            }
        }
        if(count!=0)
            System.out.println("Key Found at "+index);
    }
    public static void main(String[] args) {

        int[] arr = {10,42,84,14,85,74,98,56,74,47,65};

        //LinearSearch(arr, 84);
        BinarySearch(arr, 74);
    }
}
