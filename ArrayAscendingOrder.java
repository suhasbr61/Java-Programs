class ArrayAscendingOrder
{
    public static void main(String[] args)
    {
        int[] arr = {5, 3, 8, 1, 2};
        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - 1 - i; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Printing the sorted array
        System.out.println("Sorted array in ascending order: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
