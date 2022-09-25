import java.util.Scanner;

public class Main
{
    public void BubbleSort()
    {
        int size, a, b, swap;
        Scanner scan = new Scanner(System.in);

        System.out.print("--BUBBLE SORT--");
        System.out.print("\nEnter the size for the array: ");
        size = scan.nextInt();
        int [] arr = new int[size];

        System.out.print("Enter " + size + " elements for the array: ");
        for (a = 0; a < size; a++)
            arr[a] = scan.nextInt();

        for (a = 0; a < (size - 1); a++)
        {
            for (b = 0; b < size - a - 1; b++)
            {
                if (arr[b] < arr[b + 1])
                    {
                    swap = arr[b];
                        arr[b] = arr[b + 1];
                        arr[b + 1] = swap;
                }
            }
        }

        System.out.println("\nHere is your array bubble sorted in descending order:");
        for (a = 0; a < size; a++)
            System.out.print(arr[a] + " ");
    }

    public void SelectionSort()
    {
        int size, i, j, count, small, index = 0, x;
        Scanner scan = new Scanner(System.in);

        System.out.print("\n\n--SELECTION SORT--");
        System.out.print("\nEnter the size for the array: ");
        size = scan.nextInt();
        int[] arr = new int[size];

        System.out.print("Enter " + size + " elements for the array: ");
        for (i = 0; i < size; i++)
            arr[i] = scan.nextInt();

        for (i = 0; i < (size - 1); i++)
        {
            count = 0;
            small = arr[i];
            for (j = (i + 1); j < size; j++)
            {
                if (small < arr[j])
                {
                    small = arr[j];
                    count++;
                    index = j;
                }
            }
            if (count != 0)
            {
                x = arr[i];
                arr[i] = small;
                arr[index] = x;
            }
        }

        System.out.println("\nHere is your array selection sorted in descending order:");
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

    }

    public static void main(String[] args)
    {
        Main sort = new Main();
        sort.BubbleSort();
        sort.SelectionSort();
    }
}