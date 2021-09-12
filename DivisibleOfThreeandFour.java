
public class DivisibleOfThreeandFour {

	public static void main(String[] args) {
		int Num[]= {3,4,6,8,9,10,12,14,15,16,18,19,20,22,24,27,19,10,40};
		for(int i=0;i<=Num.length;i++)
			if(Num[i]%3==0||Num[i]%4==0)
			{
				System.out.println("Divisible of 3 and 4 is :"+Num[i]);
			}
		

	}

}
