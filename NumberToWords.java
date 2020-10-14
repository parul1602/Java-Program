import java.util.Scanner;

public class NumberToWords {
	
	private static final String[] ONES = { 
		"Zero", "One", "Two", "Three", "Four", "Five",
		"Six", "Seven", "Eight", "Nine" };
	private static final String[] TEENS = { 
		"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
		"Sixteen", "Seventeen", "Eighteen", "Nineteen" };
	private static final String[] TENS = {
		null, null, "Twenty", "Thirty", "Forty", "Fifty",
		"Sixty", "Seventy", "Eighty", "Ninety" };

	public static String numberToWords(int number) {
		if (number<10) {
			return ONES[number];
		} else if (number<20) {
			int n = number - 10;
			String words = TEENS[n];
			return words==null ? ONES[n]+"teen" : TEENS[n]; 
		} else {
			int n = number % 10;
			return TENS[number/10] + 
				(n==0 ? "" : (" " + numberToWords(n)));
		}
	}

	public static void main(String[] args) throws Exception {
		int num,tem;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter how many numbers you want");
		num= sc.nextInt();
		int a[] = new int[num];
		
		
        for (int i = 0; i < num; i++) 

        {

            a[i] = sc.nextInt();

        }
        for (int i = 0; i < num; i++) 

        {
        	
            for (int j = i + 1; j < num; j++) 

            {
            	            	
                if (a[i] > a[j]) 

                {

                    tem = a[i];

                    a[i] = a[j];

                    a[j] = tem;

                }

            }

        }
        System.out.print("Ascending Order:" + '\n' + '\n');

        for (int i = 0; i < num; i++) 

        {

            System.out.print(a[i] + "--" + numberToWords(a[i])+ '\n');

        }


		}
	}
