package Week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int[] arr = {3,2,11,4,6,7};
		int[] anotherarr = {1,2,8,4,9,7};
		
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j< anotherarr.length; j++)
			{
				if(arr[i] == anotherarr[j])
				{
					System.out.println("Item match in both the array is" + " "+ arr[i]);
				}
					
			}
		}
	}

}
