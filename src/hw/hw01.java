package hw;

//import java.util.ArrayList;
import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String data[] = new String[n];
		for (int i = 0; i < n; i++) {
			int oo = 0;
			int xx = 0;
			int sum = 0;
			int v1 = scn.nextInt();
			int v2 = scn.nextInt();
			int v3 = scn.nextInt();

			if (v1 > 60) {
				oo++;
				sum = sum + v1;
			} else {
				xx++;
				sum = sum + v1;
			}
			if (v2 > 60) {
				oo++;
				sum = sum + v2;
			} else {
				xx++;
				sum = sum + v2;
			}
			if (v3 > 60) {
				oo++;
				sum = sum + v3;
			} else {
				xx++;
				sum = sum + v3;
			}
			
			if(oo==3){
				data[i]="P";
			}else if(oo==2&&sum>=220){
				data[i]="P";
			}else if(oo==2&&sum<220){
				data[i]="P";
			}else if(oo==1){
				if(v1>=80){data[i]="M";}
				if(v2>=80){data[i]="M";}
				if(v3>=80){data[i]="M";}
			}else{
				data[i]="F";
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(data[i]);
		}
		
		// public static int fun(int v1,int oo,int xx){
		// return;
		// }
	}
}
