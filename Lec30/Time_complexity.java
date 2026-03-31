public class Time_complexity{
    public static void main(String[] args) {
        
        int i = 1;
        int n = 1000_000;
        
		while (n > 0) {
			System.out.println("Hey");
			// O(log n)
			n /= 2;
		}

        while (i <= n) {
			System.out.println("Hey");
			// O(n)
			i += 2;
			i += 3;
		}


        while (i <= n) {
			System.out.println("Hey");
            // O(log n)
			i *= 2;
			i *= 3;
		}

        for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (k = 1; k <= n / 2; k++) {
                    // O(n4)
					System.out.println("hey");
				}
			}
		}

        for (i = n / 2; i <= n; i++) {
			for (int j = 1; j <= n / 2; j++) {
				for ( k = 1; k <= n; k = k * 2) {
					System.out.println("hey");
				
				}
			}
		}

        for (i = 1; i * i <= n; i++) {
            // O(sqrt n)
			System.out.println("hey");
		}
    }
}