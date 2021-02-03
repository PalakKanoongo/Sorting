
public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insertion Sort");
		int n=5;
		int arr[] = { 24, 11, 47, 8, 6 }; 
		int  key, j;  
	    for (int i = 1; i < n; i++) 
	    {  
	        key = arr[i];  
	        j = i - 1;  
	  
	        while (j >= 0 && arr[j] > key) 
	        {  
	            arr[j + 1] = arr[j];  
	            j = j - 1;  
	        }  
	        arr[j + 1] = key;  
	    } 
	    
	    for (int i=0; i<n; ++i)
	        System.out.print(arr[i] + " ");
	    System.out.println();

	}

}
