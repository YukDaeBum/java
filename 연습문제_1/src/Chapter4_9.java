
public class Chapter4_9 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����

		String ch = "12345";
		int sum = 0;
		int i = 0;
		
		for(i = 0; i < ch.length(); i++)
		{
			sum += ch.charAt(i) - '0';
		}
		
		System.out.println("sum = " + sum);
	}

}
