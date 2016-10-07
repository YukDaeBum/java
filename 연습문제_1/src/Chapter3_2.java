
public class Chapter3_2 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		int numofApples =123;
		int sizeOfBucket = 10;
		int numOfBucket = numofApples / sizeOfBucket + (numofApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println("필요한 바구니 수 : " +numOfBucket);

	}

}
