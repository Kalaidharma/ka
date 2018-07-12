import java.util.Scanner;
public class AlphaDigit {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.next().charAt(0);
		int n=Character.getNumericValue(ch);
		if(ch>='a' && ch<='z'){
			System.out.println("Alphabet");
		}
		else if(n>=0){
			System.out.println("Digits");
		}
		else{
			System.out.println("Special Characters");
		}
		
	}

}
