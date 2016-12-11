package ex;

/*
 * Topic: 請設計 Person 類別 (姓名,性別,身高,體重)，使用者可以新增個人資料，每新增一筆就會列出目前的資料串有哪些人，而這些資料請用插入排序法依每一個人的 BMI 值由大到小排序。
 * Date: 2016/12/05
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
import java.util.ArrayList;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<ex03_Person> dataList = new ArrayList<ex03_Person>();
//		String name = scn.next();
//		int sex = scn.nextInt();
//		float height = scn.nextFloat();
//		float weight = scn.nextFloat();
		boolean flag = false;
		String str = "Y";
		int i = 0;
		double val = 0;

		while (!(str.equals("N") || str.equals("n"))) {
			System.out.println("input a value:");
			String name = scn.next();
			String sex = scn.next();
			float height = scn.nextFloat();
			float weight = scn.nextFloat();
			val=weight/((height/100)*(height/100));
			if (dataList.size() == 0) {
				dataList.add(new ex03_Person(name,sex,height,weight));
			} else if (dataList.size() == 1) {
				if (dataList.get(i).getBMI() > val) {
					dataList.add(new ex03_Person(name,sex,height,weight));
				} else {
					dataList.add(0,new ex03_Person(name,sex,height,weight));
				}
			} else {
				flag = true;
				i = 0;
				while (flag && i < dataList.size() - 1) {
					if (i == 0 && dataList.get(0).getBMI() < val) {
						dataList.add(0, new ex03_Person(name,sex,height,weight));
						flag = false;
					} else {
						if (dataList.get(i).getBMI() > val && dataList.get(i + 1).getBMI() <= val) {
							flag = false;
							dataList.add(i + 1, new ex03_Person(name,sex,height,weight));
						} else {
							i++;
						}
					}
				}
			}
			int size=dataList.size();
			for(int k=0;k<size;k++){
				dataList.get(k).showInfo();
				System.out.println();
			}
			System.out.println("Conteinue");
			str = scn.next();

		}

	}
//	private static void showListData(ArrayList list){
//		int size=list.size();
//		for(int i=0;i<size;i++){
//			System.out.println(list.get(i));
//		}
//	}
//	private static float getBMI(){
//		return ;
//	}
}
