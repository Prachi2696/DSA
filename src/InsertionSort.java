public class InsertionSort {

	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,1,4,3,9,6};
		
		//time complexity= n^2
	
		for (int i=0;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0&&current<arr[j])
			{
				arr[j+1]=arr[j];
						j--;
			}
			arr[j+1]=current;
		}
		
		printArray(arr);
		
	}

	

}
