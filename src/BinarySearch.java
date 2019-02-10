import java.util.*;
class BinarySearch
{
    public void search(int ar[], int item)
    {
        int u = ar.length, l = 0, mid;
        mid = (l + u) / 2;

        while(ar[mid] != item)
        {
            mid = (l + u) / 2;
            if (ar[mid] == item)
            {
                System.out.println("Number found at "+ (mid + 1));
                break;
            }
            else
            {
                if (ar[mid] > item)
                {
                    u = mid;
                }
                else
                {
                    l = mid - 1;
                }
            }
        }
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchedElement = 6;

        BinarySearch obj = new BinarySearch();
        obj.search(arr, searchedElement);
    }
}