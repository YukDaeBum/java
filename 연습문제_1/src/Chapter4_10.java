

public class Chapter4_10 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����
		
		int num = 12345;
		int sum = 0;
		
		while(num > 0)
		{
			sum += num%10;
			num /= 10;
		}
	System.out.println("sum = " + sum);
	}
	

}
