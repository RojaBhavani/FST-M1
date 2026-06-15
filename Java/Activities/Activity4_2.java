package activities;


class Activity4_2 
{

    public static void main(String[] args) 
    {
        int[] arr = {45, 12, 78, 34, 23, 90, 11};

        System.out.println("Array before sorting:");
        printArray(arr);
        for (int i = 1 ; i < arr.length; i++) 
        {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < current) 
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        System.out.println("\nArray after sorting:");
        printArray(arr);
    }
    public static void printArray(int[] arr)
    {
        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
