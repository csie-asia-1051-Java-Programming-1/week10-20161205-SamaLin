package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float d=scn.nextFloat();
		if(d>700){
			System.out.println((d-700)*5.63+200*4.97+170*4.39+210*3.02+120*2.10);
			System.out.println((d-700)*4.50+200*4.01+170*3.61+210*2.68+120*2.10);
		}else if(d>500){
			System.out.println((d-500)*4.97+170*4.39+210*3.02+120*2.10);
			System.out.println((d-500)*4.01+170*3.61+210*2.68+120*2.10);
		}else if(d>330){
			System.out.println((d-330)*4.39+210*3.02+120*2.10);
			System.out.println((d-330)*3.61+210*2.68+120*2.10);
		}else if(d>120){
			System.out.println((d-120)*3.02+120*2.10);
			System.out.println((d-120)*2.68+120*2.10);
		}else{
			System.out.println(d*2.10);
			System.out.println(d*2.10);
		}
		
	}

}
