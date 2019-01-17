import java.util.Scanner;
public class calc {
        public static void main(String ar[]) {
        float a, b, res;
        char choice, ch;
        Scanner sc = new Scanner(System.in);

        do {
                System.out.print("1. ADD TWO NUMBERS\n");
		System.out.print("3. MULTIPLY TWO NUMBERS\n");
		System.out.print("4. SUBTRACT TWO NUMBERS\n");
		System.out.print("2. EXIT\n\n");
                System.out.print("Enter your choice : ");
                choice = sc.next().charAt(0);
                switch(choice) {
                        case '1' : System.out.print("Enter two numbers : ");
                        a = sc.nextFloat();
                        b = sc.nextFloat();
                        res = a + b;
                        System.out.print("Result = " + res);
                        break;

			case '3' : System.out.print("Enter two numbers : ");
				   a = sc.nextFloat();
				   b = sc.nextFloat();
				   res = a * b;
				   System.out.print("Result = " + res);
				   break;


			case '4' : System.out.print("Enter two numbers : ");
                                   a = sc.nextFloat();
                                   b = sc.nextFloat();
                                   res = a - b;
                                   System.out.print("Result = " + res);
                                   break;

                        case '2' : System.exit(0);
                                break;

                        default : System.out.print("INVALID CHOIVCE !!!");
				  break;
                        }
                        System.out.print("\n------------------------\n");
                }while(choice != '2');
        }
}

