import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		//2단-3단: 계산 및 출력
		System.out.println("2단");
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		System.out.println("3단");		
		System.out.println(3*1);		
		System.out.println(3*2);		
		System.out.println(3*3);		
		System.out.println(3*4);		
		System.out.println(3*5);		
		System.out.println(3*6);		
		System.out.println(3*7);		
		System.out.println(3*8);		
		System.out.println(3*9);
		
		//4단: 변수 사용
		System.out.println("4단");
		int result=4*1;
		System.out.println(result);
		result=4*2;
		System.out.println(result);
		result=4*3;
		System.out.println(result);		
		result=4*4;
		System.out.println(result);		
		result=4*5;
		System.out.println(result);		
		result=4*6;
		System.out.println(result);		
		result=4*7;
		System.out.println(result);		
		result=4*8;
		System.out.println(result);		
		result=4*9;
		System.out.println(result);	
		
		//5단: 사용자 값 입력
		System.out.println("구구단 중 출력할 단은?: ");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		System.out.println(number * 1);		
		System.out.println(number * 2);		
		System.out.println(number * 3);		
		System.out.println(number * 4);		
		System.out.println(number * 5);		
		System.out.println(number * 6);		
		System.out.println(number * 7);		
		System.out.println(number * 8);		
		System.out.println(number * 9);		
		
		//6단: 반목문(while)
		System.out.println("6단");
		int i=1;
		while(i<10) {
			System.out.println(6*i);
			i++;
		}
		
		//7단: 반목문(for)
		System.out.println("7단");
		for(int j=1;j<10;j++) {
			System.out.println(7*j);
		}
		
		//8단: 값 입력 및 조건문
		System.out.println("구구단 중 출력할 단은?: ");
		Scanner scan = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println("사용자가 입력한 값: "+num);
		
		if(num<2)
			System.out.println("값을 잘못 입력");
		else if(num>9)
			System.out.println("값을 잘못 입력");		
		else{
			for(int k=1;k<10;k++)
				System.out.println(num*k);
		}
	}
}
