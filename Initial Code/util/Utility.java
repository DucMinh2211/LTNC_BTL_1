public class Utility {

	/**
	 * Test whether a specific number is a prime number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a prime number.
	 */
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i*i < num; i++) {
			if (num % i == 0){
				return false;
			}
		}
		return true;
	}

	/**
	 * Test whether a specific number is a square number.
	 * 
	 * @param num
	 *            the number
	 * @return <code>true</code> if <code>num</code> is a square number.
	 */
	public static boolean isSquare(int num) {
		if (num < 0) {
    		return false;
		} // Số âm không phải số chính phương của số thực (chúng ta đang xét số nguyên dương)
  		if (num == 0) {
    		return true;
		} // 0 là số chính phương (0*0 = 0)
		int x = (int) Math.sqrt(num);
		return x*x == num;
	}
}
