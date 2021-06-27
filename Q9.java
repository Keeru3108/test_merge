/*
ROUNDSUM
For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the same indent level as roundSum(). 
roundSum(16, 17, 18) → 60 
roundSum(12, 13, 14) → 30 
roundSum(6, 4, 4) → 10 */

class Q9
{
	public static int roundSum(int a,int b,int c)
	{
		int a1=a%10;
		int b1=b%10;
		int c1=c%10;
		int sum=0,sum1=0,sum2=0;


		if(a1>=5)
		{
		  sum=sum+(10-a1)+a;
 
		}
		 if(b1>=5)
		{
			sum=sum+(10-b1)+b;
		}
		if(c1>=5)
		{
			sum=sum+(10-c1)+c;
		}
		if(a1<=5)
		{
			sum= sum+(a-a1);
		}
		if(b1<=5)
		{
			sum=sum+(b-b1);
		}
		if(c1<=5)
		{
			sum=sum+(c-c1);
		}
		
	return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println(roundSum(16, 17, 18));
		System.out.println(roundSum(12, 13, 14));
		System.out.println(roundSum(6, 4, 4));
               System.out.println(roundSum(6, 4, 4));

	}
}
