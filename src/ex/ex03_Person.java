package ex;

public class ex03_Person {
	private String name, sex;
	private float height, weight;

	public ex03_Person(String name1, String sex1, float height1, float weight1) {
		name=name1;
		sex=sex1;
		height=height1;
		weight=weight1;
	}
	public void showInfo(){
		System.out.print(name+"\t");
		System.out.print(sex+"\t");
		System.out.print(height+"\t");
		System.out.print(weight+"\t");
		System.out.print(getBMI());
	}
	public double getBMI(){
		return weight/((height/100)*(height/100));
	}
}
