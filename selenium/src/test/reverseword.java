package test;

public class reverseword {

	public static void main(String[] args) {
		String s[] = "marolix is a best software company in the hyderabad city".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
		ans += s[i] + " ";
		}
		System.out.println("Reversed String: " + ans);

		}

		}

