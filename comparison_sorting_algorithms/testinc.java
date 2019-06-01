import java.util.Random;
import java.util.Scanner;

public class testinc {
	public static void main(String[] args) {
	
		while(true){
		Scanner scn = new Scanner (System.in);
		System.out.println("1)MergeSort TwoParts");
		System.out.println("2)MergeSort ThreeParts");
		System.out.println("3)HeapSort");
		System.out.println("4)QuickSort FirstElement");
		System.out.println("5)QuickSort RandomElement");
		System.out.println("6)QuickSort MidOfFirstMidLastElement");

		int sayi = scn.nextInt();
		System.out.println("please enter number of array elements that you wanna?");
		int n = scn.nextInt();
		int x;
	    Random randomno = new Random();
	    int []arr=new int[n];
	 
	    double delta = 10000000 / (float)n;
	    Random random = new Random();
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	    
	  
	    HeapSort hs = new HeapSort();
	    MergeSort ms = new MergeSort();
	    QuickSort qs = new QuickSort();
	
	    
	    if(sayi==1){
			long startTime = System.nanoTime();
    		// ... run one of the sorting methods ...
    		ms.mergesort(arr,"TwoParts");
    		long estimatedTime = System.nanoTime() - startTime;
    		System.out.println(estimatedTime);
		}
		else if(sayi==2){
			long startTime = System.nanoTime();
    		// ... run one of the sorting methods ...
    		ms.mergesort(arr,"ThreeParts");
    		long estimatedTime = System.nanoTime() - startTime;
    		System.out.println(estimatedTime);
		}
		else if(sayi==3){
			long startTime = System.nanoTime();
    		// ... run one of the sorting methods ...
    		hs.sort(arr);
    		long estimatedTime = System.nanoTime() - startTime;
    		System.out.println(estimatedTime);
		}
		else if(sayi==4){
			long startTime = System.nanoTime();
    		// ... run one of the sorting methods ...
			qs.quickSort(arr,0,n-1,"FirstElement");
    		long estimatedTime = System.nanoTime() - startTime;
    		System.out.println(estimatedTime);
		}
		else if(sayi==5){
			long startTime = System.nanoTime();
    		// ... run one of the sorting methods ...
			qs.quickSort(arr,0,n-1,"RandomElement");
    		long estimatedTime = System.nanoTime() - startTime;
    		System.out.println(estimatedTime);
    		//qs.print(arr);
		}
		else if(sayi==6){
			long startTime = System.nanoTime();
    		// ... run one of the sorting methods ...
			qs.quickSort(arr,0,n-1,"MidOfFirstMidLastElement");
    		long estimatedTime = System.nanoTime() - startTime;
    		System.out.println(estimatedTime);
		}
		
		
  
		}
        		
       
	}
}
