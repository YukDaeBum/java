
public class Chapter3_2 {

	public static void main(String[] args) {
		// TODO �ڵ� ������ �޼ҵ� ����

		int numofApples =123;
		int sizeOfBucket = 10;
		int numOfBucket = numofApples / sizeOfBucket + (numofApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println("�ʿ��� �ٱ��� �� : " +numOfBucket);

	}

}
