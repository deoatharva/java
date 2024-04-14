class Bitpl {
	static Scanner scanner;
	public static void main(String[] args) {	
		int x,y=0, answer=0;
		char op;
		x = input8 ();
		scanner = new Scanner(System.in); 
		System.out.println();
		System.out.print ("Enter an operation (|,^ ,&,~,"+" L, R ): ");
		op = scanner.next().charAt(0);
		// check binary operators
		if (op=='|' || op == '^' || op == '&'){
			y = input8 ();
			//ouptut to verify input 
			output8 (y);
	}
	// check and perform operation
	switch (op) {
		case '|' : answer = x|y;
			break;
		case '^' : answer = x^y;
			break;
	
		case '&': answer = x & y;
			break;
		case 'L':
		case '1': answer=x <<< 1;
			break;
		case 'R':
		case '1': answer=x <<< 1;
			break;
		case '~': answer=~x;
			break;
		default:
		System.out.println("Invalid entry");
	}
	break;
	answer = answer & Ob11111111;
	System.out.println();
	output8 (answer);
	System.out.println();
	// input 8 binary bits
	public static int input8 () {
		int bNum;
		scanner = new Scanner(System.in); 
		System.out.println();
		System.out.print ("Enter a binary number: ");
		// input base 2
		bNum = scanner.nextInt(2);
		// clear upper bits
		bNumbNum & 0b11111111;	
		return bNum;
	}
	// output 8 binary characters
	public static void output8 (int bNum) {
	String bString, zString;
	// convert to string
	bString = Integer.toBinaryString (bNum); // 	
	insert leading zeros and output
	zString
	=
	String.format("%8s", bString).replace('', '0');
	System.out.println(" The binary number is: "+zString);
	}
}
