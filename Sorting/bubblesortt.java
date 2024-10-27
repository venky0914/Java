package sorting;

public class bubblesortt {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {

        // bubble sort

        int arr[] = { 4, 5, 2, 9, 7 };

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swapping

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        printarray(arr);
    }

}
