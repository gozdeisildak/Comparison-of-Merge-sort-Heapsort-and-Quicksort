
public class MergeSort {


	
	 // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge2(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort2(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort2(arr, l, m);
            sort2(arr , m+1, r);
 
            // Merge the sorted halves
            merge2(arr, l, m, r);
        }
    }
    ///**********************************************************************//////////////////////******************************************
    
    
    
    
    // Function  for 3-way merge sort process
    public void mergeSort3Way(int[] gArray)
    {
        // if array of size is zero returns null
        if (gArray == null)
            return;
 
        // creating duplicate of given array
        int[] fArray = new int[gArray.length];
 
        // copying alements of given array into
        // duplicate array
        for (int i = 0; i < fArray.length; i++)
            fArray[i] = gArray[i];
 
        // sort function
        mergeSort3WayRec(fArray, 0, gArray.length, gArray);
 
        // copy back elements of duplicate array
        // to given array
        for (int i = 0; i < fArray.length; i++)
            gArray[i] = fArray[i];
    }
 
    /* Performing the merge sort algorithm on the
       given array of values in the rangeof indices
       [low, high).  low is minimum index, high is
       maximum index (exclusive) */
    public void mergeSort3WayRec(int[] gArray,
                  int low, int high, int[] destArray)
    {
        // If array size is 1 then do nothing
        if (high - low < 2)
            return;
 
        // Splitting array into 3 parts
        int mid1 = low + ((high - low) / 3);
        int mid2 = low + 2 * ((high - low) / 3) + 1;
 
        // Sorting 3 arrays recursively
        mergeSort3WayRec(destArray, low, mid1, gArray);
        mergeSort3WayRec(destArray, mid1, mid2, gArray);
        mergeSort3WayRec(destArray, mid2, high, gArray);
 
        // Merging the sorted arrays
        merge(destArray, low, mid1, mid2, high, gArray);
    }
 
    /* Merge the sorted ranges [low, mid1), [mid1,
       mid2) and [mid2, high) mid1 is first midpoint
       index in overall range to merge mid2 is second
       midpoint index in overall range to merge*/
    public void merge(int[] gArray, int low,
                           int mid1, int mid2, int high,
                                   int[] destArray)
    {
        int i = low, j = mid1, k = mid2, l = low;
 
        // choose smaller of the smallest in the three ranges
        while ((i < mid1) && (j < mid2) && (k < high))
        {
            if (gArray[i] < gArray[j])
            {
                if (gArray[i] < gArray[k])
                    destArray[l++] = gArray[i++];
 
                else
                    destArray[l++] = gArray[k++];
            }
            else
            {
                if (gArray[j] < gArray[k])
                    destArray[l++] = gArray[j++];
                else
                    destArray[l++] = gArray[k++];
            }
        }
 
        // case where first and second ranges have
        // remaining values
        while ((i < mid1) && (j < mid2))
        {
            if (gArray[i] < gArray[j])
                destArray[l++] = gArray[i++];
            else
                destArray[l++] = gArray[j++];
        }
 
        // case where second and third ranges have
        // remaining values
        while ((j < mid2) && (k < high))
        {
            if (gArray[j] < gArray[k])
                destArray[l++] = gArray[j++];
 
            else
                destArray[l++] = gArray[k++];
        }
 
        // case where first and third ranges have
        // remaining values
        while ((i < mid1) && (k < high))
        {
            if (gArray[i]< gArray[k])
                destArray[l++] = gArray[i++];
            else
                destArray[l++] = gArray[k++];
        }
 
        // copy remaining values from the first range
        while (i < mid1)
            destArray[l++] = gArray[i++];
 
        // copy remaining values from the second range
        while (j < mid2)
            destArray[l++] = gArray[j++];
 
        // copy remaining values from the third range
        while (k < high)
            destArray[l++] = gArray[k++];
    }
    
    
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.println(arr[i] + " ");
     
    }
    
    public void mergesort(int [] arr,String type){
    	if(type.equals("TwoParts")){
    		sort2(arr, 0, arr.length-1);
    	}
    	else if(type.equals("ThreeParts")){
    		mergeSort3Way(arr);
    	}
    	
    	
    	
    }

}
