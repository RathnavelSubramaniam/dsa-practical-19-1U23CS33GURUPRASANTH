import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("BINARY SEARCH\n");
        Scanner in = new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF ELEMENTS:");
        int n = in.nextInt();
        int[] numbers = new int[n];

        System.out.println("ENTER THE INTEGER VALUES:");
        for (int i = 0; i < n; i++) {
            if (in.hasNextInt()) 
                numbers[i] = in.nextInt();
            else {
                System.out.println("Enter integer numbers only");
                System.exit(0);
            }
        }

    
        Arrays.sort(numbers);

        System.out.println("ENTER THE KEY VALUE TO BE SEARCHED IN BINARY SEARCH LIST");
        int key = in.nextInt();

        int res = BinarySearchIterative(numbers, key);
        if (res == -1)
            System.out.println(key + " IS NOT FOUND");
        else
            System.out.println(key + " FOUND IN THE ARRAY AT POSITION " + (res + 1));

        in.close();
    }

    public static int BinarySearchIterative(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; 

            if (arr[mid] == key) 
                return mid; 
            else if (arr[mid] < key) 
                left = mid + 1; 
            else 
                right = mid - 1; 
        }

        return -1; 
    }
}