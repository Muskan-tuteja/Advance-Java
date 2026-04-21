package dsa;
public class longsubstring {
	public static void main(String[] args) {	
		int[] arr = {1,2,1,0,0,3,2};	int max = 0;
		int k = 3;
		for(int i =0; i<arr.length;i++) {
			int sum = 0;
			for(int j =i; j<arr.length;j++) {
				sum = sum+arr[j];
				
				if(sum==k) {
					max=Math.max(max, j-i+1);
				}
			}
		}
		System.out.println(max);
		
	}

}
