import java.util.Random;

public class QuickSort {
	
	
	 public void quickSort(int A[],int p, int r,String pivotType)
	 {
	     int q;
	     if(p<r)
	     {
	         q=partition(A,p,r,pivotType);
	         quickSort(A,p,q-1,pivotType);
	         quickSort(A,q+1,r,pivotType);
	     }
	 }
	 
	 
	 public int partition(int A[],int p, int r,String pivotType){
		    int tmp;
		    if(pivotType.equals("RandomElement")){
		
		    Random rnd = new Random();
		    int pivotIdx=rnd.nextInt((r - p) + 1) + p;

		 
		    
		    tmp=A[pivotIdx];
		    A[pivotIdx]=A[r];
		    A[r]=tmp;
          
		    }
		    
		    else if(pivotType.equals("FirstElement")){
		    
		    	tmp=A[p];
			    A[p]=A[r];
			    A[r]=tmp;
		    	
		    }
		    else if(pivotType.equals("MidOfFirstMidLastElement")){
		    	
		    	int middleIdx=(p+r)/2;
		    	
		    	if((A[p]>A[r] && A[p]<A[middleIdx]) || (A[p]<A[r] && A[p]>A[middleIdx])){
		    		int pivotIdx=p;
		    		tmp=A[pivotIdx];
				    A[pivotIdx]=A[r];
				    A[r]=tmp;
		    		
		    	}
		    	
		    	else if((A[middleIdx]>A[p] && A[middleIdx]<A[r]) || (A[middleIdx]<A[p] && A[middleIdx]>A[r])){
		    		int pivotIdx=middleIdx;
		    		tmp=A[pivotIdx];
				    A[pivotIdx]=A[r];
				    A[r]=tmp;
		    		
		    	}
		   
		    	
		    }
		    int i = p-1;
		    int x = A[r];
		    for(int j=p; j<=r-1; j++)
		    {
		        if(A[j]<=x)
		        {
		            i++;
		            tmp=A[i];
		            A[i]=A[j];
		            A[j]=tmp;
		        }
		    }
		    tmp=A[i+1];
		    A[i+1]=A[r];
		    A[r]=tmp;
		    return i+1;
		    
		}
	 public void print(int [] A){
			for (int i = 0; i < A.length; i++) {
				System.out.println(A[i]);
			}
		}

}
