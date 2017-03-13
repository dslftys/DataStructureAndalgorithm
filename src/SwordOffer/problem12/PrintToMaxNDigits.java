package SwordOffer.problem12;

public class PrintToMaxNDigits {
	/*
	 * �ݹ鷨
	 */
	public void print1ToMaxOfNDigits(int n) {
        if (n <= 0) {
            return;
        }
        char[] number = new char[n];
        for (int i = 0; i < 10; i++) {
            number[0] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(number, n, 0);
        }
    }

	private void print1ToMaxOfNDigitsRecursively(char[] number, int length, int index) {
        if (index == length - 1) {
            String s = new String(number);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '0') {
                    System.out.println(s.substring(i));
                    break;
                }
            }
            return;
        }
        for (int i = 0; i < 10; i++) {
            number[index + 1] = (char) (i + '0');
            print1ToMaxOfNDigitsRecursively(number, length, index + 1);
        }
    }
}
