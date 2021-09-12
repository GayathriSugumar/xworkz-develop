
public class SumOfEvenIndex {

	public static void main(String[] args) {
		int sum=0;
		int num[]= {3,9,10,12,98,21,11,30,50,76};
		for(int i=0;i<num.length;i++)
			if(num[i]%2==0)
			sum=sum+i;
		{
			System.out.println("Sum of even array index is : "+sum);
		}

	}

}
