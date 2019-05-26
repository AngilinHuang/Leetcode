package contest.week138;

/**
 * 
 * Today, the bookstore owner has a store open for customers.length minutes.  Every minute, some number of customers (customers[i]) enter the store, and all those customers leave after the end of that minute.
On some minutes, the bookstore owner is grumpy.  If the bookstore owner is grumpy on the i-th minute, grumpy[i] = 1, otherwise grumpy[i] = 0.  When the bookstore owner is grumpy, the customers of that minute are not satisfied, otherwise they are satisfied.
The bookstore owner knows a secret technique to keep themselves not grumpy for X minutes straight, but can only use it once.
Return the maximum number of customers that can be satisfied throughout the day.
 * 
 * 1 <= X <= customers.length == grumpy.length <= 20000
0 <= customers[i] <= 1000
0 <= grumpy[i] <= 1
 * 
 * @author angilin
 *
 */
public class P1052GrumpyBookstoreOwner {
	
	public int maxSatisfied(int[] customers, int[] grumpy, int X) {
		int result = 0;
        int[] unsatisifiedCustomers = new int[customers.length];
        for(int i=0;i<customers.length;i++) {
        	if(grumpy[i]==1) {
        		unsatisifiedCustomers[i] = customers[i];
        	}
        	else {
        		result += customers[i];
        	}
        }
        //System.out.println(result);
        //System.out.println(Arrays.toString(unsatisifiedCustomers));
        
        int maxGrumpyControlBenefit = 0;
        for(int i=0;i<=unsatisifiedCustomers.length-X;i++) {
        	int temp = 0;
        	for(int j=i;j<i+X;j++) {
        		temp += unsatisifiedCustomers[j];
        	}
        	if(temp>maxGrumpyControlBenefit) {
        		maxGrumpyControlBenefit = temp;
        	}
        }
        //System.out.println(maxGrumpyControlBenefit);
        return result+maxGrumpyControlBenefit;
    }
	
	
	public static void main(String[] args) {
		int[] customers  = {1,0,1,2,1,1,7,5};
		int[] grumpy  = {0,1,0,1,0,1,0,1};
		int X = 3;
		//16
		System.out.println(new P1052GrumpyBookstoreOwner().maxSatisfied(customers, grumpy, X));
	}
}
