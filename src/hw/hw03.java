package hw;

import java.util.Scanner;

import ex.ex03_Person;

import java.util.ArrayList;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList<hw03_Student> dataList = new ArrayList<hw03_Student>();
		boolean flag = false;
		String str = "Y";
		int i = 0;
		float val = 0;

		while (!(str.equals("N") || str.equals("n"))) {
			System.out.println("請輸入   學號    姓名   英文   數學   國文:");
			String id = scn.next();
			String name = scn.next();
			int v1 = scn.nextInt();
			int v2 = scn.nextInt();
			int v3 = scn.nextInt();
			while (v1>100||v1<0) {
				System.out.println("請輸入英文(0~100)");
				v1 = scn.nextInt();
			}
			while (v2>100||v2<0) {
				System.out.println("請輸入數學(0~100)");
				v2 = scn.nextInt();
			}
			while (v3>100||v3<0) {
				System.out.println("請輸入國文(0~100)");
				v3 = scn.nextInt();
			}
			val = (v1+v2+v3)/3;
			if (dataList.size() == 0) {
				dataList.add(new hw03_Student(id,name,v1,v2,v3));
			} else if (dataList.size() == 1) {
				if (dataList.get(i).getsvg() > val) {
					dataList.add(new hw03_Student(id,name,v1,v2,v3));
				} else {
					dataList.add(0,new hw03_Student(id,name,v1,v2,v3));
				}
			} else {
				flag = true;
				i = 0;
				while (flag && i < dataList.size() - 1) {
					if (i == 0 && dataList.get(0).getsvg() < val) {
						dataList.add(0,new hw03_Student(id,name,v1,v2,v3));
						flag = false;
					} else {
						if (dataList.get(i).getsvg() > val && dataList.get(i + 1).getsvg() <= val) {
							flag = false;
							dataList.add(i+1,new hw03_Student(id,name,v1,v2,v3));
						} else {
							i++;
						}
					}
				}
			}
			int size = dataList.size();
			System.out.println("學號   姓名   英文   數學   國文");
			for (int k = 0; k < size; k++) {
				dataList.get(k).showInfo();
				System.out.println();
			}
			System.out.println("Conteinue");
			str = scn.next();

		}

	}
}
