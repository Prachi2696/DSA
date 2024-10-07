public class BubbleSort {

	public static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,1,4,3,9,6,12345,178};
		
		//time complexity= n^2
		for (int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
				
			}
		}
		printArray(arr);
		
	}

	

}
