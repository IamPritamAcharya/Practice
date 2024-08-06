#include <stdio.h>

void linearSearch(int arr[], int size, int element) {
    int index;
    printf("%d occurs at index: ", element);
    for (int i = 0; i < size; i++) {
        if(element == arr[i]) {
            printf("%d, ", i);
        }
    }
}

void traverseArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        printf("Element at index %d: %d\n", i, arr[i]);
    }
}

void bubbleSort(int arr[], int size) {
    int temp;
    for (int i = 0; i < size - 1; i++) {
        // Last i elements are already in place
        for (int j = 0; j < size - i - 1; j++) {
            // Swap if the element found is greater than the next element
            if (arr[j] > arr[j + 1]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

void inputArray(int arr[], int size) {
    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &arr[i]);
    }
}


int main() {
    int arr[5]; // Define an array with a fixed size (for demonstration)
    int size = 5; // Size of the array
    int choice, element;

    inputArray(arr, size);

    printf("\nMenu:\n");
    printf("1. Linear Search\n");
    printf("2. Traverse Array\n");
    printf("3. Bubble Sort\n");
    printf("Enter your choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            // Perform linear search
            printf("Enter the element to search: ");
            scanf("%d", &element);
            linearSearch(arr, size, element);
            printf("\n");
            break;
        
        case 2:
            // Traverse array
            traverseArray(arr, size);
            break;
        
        case 3:
            // Bubble sort
            bubbleSort(arr, size);
            printf("Array after sorting:\n");
            traverseArray(arr, size);
            break;
        
        case 4:
            // Exit the program
            printf("Exiting...\n");
            return 0;

        default:
            printf("Invalid choice! Please enter a number between 1 and 4.\n");
    }

}