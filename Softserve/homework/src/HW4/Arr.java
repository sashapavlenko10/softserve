package hw4;

public class Arr {
public static void main(String[] args) {
	int arr[] = {5,12,-9,-44,70,-25,15,85,-36,7};
	int i=0;
	int max=0;
	int sum=0;
	int j=0;
	int m =0;
	int amn=0;
	while (i < arr.length) {
		if (arr[i] > max) {
			max = arr[i];
		}
		i++;
		
		if (arr[j]>0) {
			sum+=arr[j];
			}
		j++;
		
		if (arr[m]<0) {
			amn+=arr[m];
			}
		m++;
	}
	
System.out.println("������������ �����: " + max);
System.out.println("����� ������������� �����: " + sum);
System.out.println("����� ������������� �����: " + amn);
if (sum>amn)
System.out.println("������ ������������� �����");
else {System.out.println("������ ������������� �����");	
}
}
}
