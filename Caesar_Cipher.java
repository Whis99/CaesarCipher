import java.util.Scanner;

public class Caesar_Cipher {
	static void encryption(String plaintext, int code) {
		for(int i = 0; i < plaintext.length(); i++) {
			int single_char = plaintext.charAt(i) + (code);
			if(plaintext.charAt(i) > 64 && plaintext.charAt(i) < 91) //Check if chars are uppercase
			{
				if(single_char > 90) 
				{
					while(single_char > 90) {
						single_char = single_char - 90 + 64;
					}
					System.out.print((char)(single_char));
				}else if(single_char < 65) {
					while(single_char < 65) {
						single_char = 90 - 65 + single_char;
					}
					System.out.print((char)(single_char));
				}
				else {
					System.out.print((char)(single_char));
				}
			}
			else if(plaintext.charAt(i) > 96 && plaintext.charAt(i) < 123) //Check if chars are lowercase
			{
				if(single_char > 123) 
				{
					while(single_char > 123) {
						single_char = single_char - 122 + 96;
					}
					System.out.print((char)(single_char));
				}else if(single_char < 97) {
					while(single_char < 97) {
						single_char = 122 - 97 + single_char;
					}
					System.out.print((char)(single_char));
				}
				else {
					System.out.print((char)(single_char));
				}
			}
			else if (plaintext.charAt(i) < 65 || (plaintext.charAt(i) > 90 && plaintext.charAt(i) < 61) || plaintext.charAt(i) > 122)
            {
				System.out.print((char)(plaintext.charAt(i)));
            } 
		} // End for loop
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Plaintext: ");
		String plaintext = sc.nextLine();
		System.out.print("Enter code: ");
		int code = sc.nextInt();
		System.out.print("Ciphertext: ");
		encryption(plaintext, code);
		

	}

}
