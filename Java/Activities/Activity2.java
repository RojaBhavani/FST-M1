package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {10, 77, 10, 54, -11,10};

        int sum = 0;
        for (int num : arr) {
            if (num == 10) {
                sum += num;
            }
        }
        if (sum == 30) {
            System.out.println(true);}
           if (sum >= 30) {
            	System.out.println("Sum greater than 30");
            	}
            else{
            	System.out.println("Sum less than 30");
            }	
          
 //       } else {
 //           System.out.println(false);
	}
}