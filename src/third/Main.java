package third;

public class Main {

	public static void main(String... args) {
		
		int[] arr1 = {1,2,3,4,5,6,7,9,8,10};
		
	
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		
		int sumarr1 = 0;
		
		int sumarr2 = 0;
		
		for(int i =0; i<arr1.length-1; ++i){
			int i2=i+1;
	        if(i2>=arr1.length-1){
	            i2=0;
	            i2=0;
	        }
	        sumarr1=arr1[i]+arr1[i2];
			
			System.out.print("sum arr1 "+sumarr1);
		}
			System.out.println();
		for(int i=0; i< arr2.length-1; ++i){
			int i3 = i + 1;
			if(i3>=arr2.length-1){
				i3=0;
				i3=0;
			}
			 sumarr2 = arr2[i]+arr2[i3];
		
		System.out.print("sum arr2 "+sumarr2);
		}
		
		
		
		int duplicating_element = sumarr2 - sumarr1;
		
		int index = 0;
		for(int i =0; i<arr1.length; ++i){
			
			if(duplicating_element==arr1[i]) index = i;
				System.out.println("numver of dubli. element "+index);
			
		}
		
		
		
		System.out.println("duplicating_element "+duplicating_element);
	}

}
