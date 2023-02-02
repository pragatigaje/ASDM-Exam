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
    public static void main(String[] args) {

        int[] arr = {10,42,84,47,65};

        LinearSearch(arr, 84);
    }
}
