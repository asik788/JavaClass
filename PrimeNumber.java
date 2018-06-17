
public class PrimeNumber {
	public static void main(String[] args) {

		System.out.println("prime numbers in between 1 anf 100");
		for (int i = 1; i <= 100; i++) {
			int prime = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					prime++;
					break;
				}

				if (prime == 0) {
					System.out.println(i);
				}

			}

		}

	}
}
