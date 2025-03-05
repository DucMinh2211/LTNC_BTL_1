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
		if (num == 1) {
    		return true;
		} // 1 là số chính phương (1*1 = 1)
		int x = (int) Math.sqrt(num);
		return x*x == num;
	}

	/**
	 * Test whether a specific number is fibonacci number.
	 */
	public static boolean isFibonacci(int num) {
		// Using fibonacci math formula.
		if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
		int test1 = 5*num*num + 4;
		int test2 = 5*num*num - 4;
		return isSquare(test1) || isSquare(test2);
	}

	public static int getFibonacciIndex(int num) {
        if (num <= 0) {
            return -1;
        }
        if (num == 1) {
            return 1; // hoặc 2 tùy vào cách bạn định nghĩa chỉ số (F(1)=1 hoặc F(2)=1) - Ở đây chọn F(1)=1
        }

        int a = 1; // F(1)
        int b = 1; // F(2)
        int index = 2; // Bắt đầu từ chỉ số 2 (hoặc 3 nếu F(1) là chỉ số 1)

        while (b < num) {
            int nextFib = a + b;
            a = b;
            b = nextFib;
            index++;

            if (b == num) {
                return index; // Tìm thấy số Fibonacci và trả về chỉ số
            }
        }

        return -1; // Không tìm thấy số Fibonacci bằng num
    }

}
