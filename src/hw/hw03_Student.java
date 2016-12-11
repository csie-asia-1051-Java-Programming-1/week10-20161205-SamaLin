package hw;

public class hw03_Student {
	String id,name;
	int v1,v2,v3;
	public hw03_Student (String id1,String name1,int v11,int v21,int v31){
		id=id1;
		name=name1;
		v1=v11;
		v2=v21;
		v3=v31;
	}
	public void showInfo(){
		System.out.print(id+"\t");
		System.out.print(name+"\t");
		System.out.print(v1+"\t");
		System.out.print(v2+"\t");
		System.out.print(v3+"\t");
		System.out.print("svg="+getsvg());
	}
	public float getsvg(){
		return ((float)v1+(float)v2+(float)v3)/3f;
	}
}
