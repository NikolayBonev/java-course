//�������� ��������, ����� ���� �� ��������� ������ ����� �� ��� int � ��������� ������� ����.

import java.util.Scanner;

public class SumOfInts2 {

	public static void main(String[] args) {
		int num,sum=0;
		Scanner inputs = new Scanner(System.in, "UTF-8");
		
		System.out.print("������ ����� �����: ");
		num=inputs.nextInt();
		sum+=num;
		System.out.print("������ ����� �����: ");
		num=inputs.nextInt();
		sum+=num;
		System.out.print("������ ����� �����: ");
		num=inputs.nextInt();
		sum+=num;
		System.out.print("������ �������� �����: ");
		num=inputs.nextInt();
		sum+=num;
		
		System.out.println("������ �� ������� � " + sum);
		
		inputs.close();
	}

}
