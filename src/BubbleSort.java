
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bubble Sort");
		int n=5;
		int arr[] = {64, 34, 25, 12, 22};
		for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
	

	for (int i=0; i<n; ++i)
        System.out.print(arr[i] + " ");
    System.out.println();
}


}
