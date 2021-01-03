package cn.jx.sy;

public class Less03_2 {
	public static void main(String[] args) {
		
		//第7题：设计一个学生类Student,继承
		System.out.println("第7题：设计一个学生类Student==============");
		undergraduate u1=new undergraduate("张三",20,"学士","通信工程");
		undergraduate u2=new undergraduate("李四",21,"学士","电子工程");
		graduate g1=new graduate("王五",25,"硕士","软件工程");
		graduate g2=new graduate("刘六",36,"博士","人机工程");
		
		u1.show();
		u2.show();
		g1.show();
		g2.show();
		
		//第8题：设计一个电话类Phone,继承
		System.out.println("第8题：设计一个电话类Phone,继承====================");
		fixPhone fp=new fixPhone();
		mobilePhone mp=new mobilePhone();
		cordlessPhone cp=new cordlessPhone();
		
		fp.setNumber(new char[]{'0','5','7','4','8','8','2','2','2','0','9','6'});
		fp.getNumber();
		fp.dail();
		fp.answer();
		
		mp.setNumber(new char[]{'1','5','7','8','8','2','2','2','0','9','6'});
		mp.getNumber();
		mp.dail();
		mp.answer();
		
		cp.setNumber(new char[]{'2','0','9','6'});
		cp.getNumber();
		cp.dail();
		cp.answer();
		cp.move();	
		
		//第9题：设计一个员工类、教师类、科学家类,继承
		System.out.println("第8题：设计一个电话类Phone,继承====================");
		worker w=new worker("张三\t","工人\t",4000);
		worker s=new worker("李四\t","服务员\t",3500);
		teacher t=new teacher("王五\t","教师\t",5000,100);
		scientist k=new scientist("刘六\t","科学家\t",7000,20000);
		
		w.stat();
		s.stat();
		t.stat();
		k.stat();
	}

}

//第7题 student继承

class student{//学生父类、派生类、基类
	 String name;
	 int age;
	 String degree;
	 student(){
		 
	 }
	 student(String name,int age,String degree){
		   this.name=name;
		   this.age=age;
		   this.degree=degree;
	 }
	 void show(){
		   System.out.print("姓名："+name+"\t 年龄："+age+"\t 学位："+degree);
	 }
}
//本科生类子类
class undergraduate extends student{
	String specialty;
	undergraduate(){
	}
	undergraduate(String name,int age,String degree,String specialty){
		super(name,age,degree);
		this.specialty=specialty;
	}
	void show(){
		super.show();
		System.out.println("\t专业："+specialty);
	}
}
//研究生类子类
class graduate extends student{
	String direction;
	graduate(String name,int age,String degree,String direction){
		super(name,age,degree);
		this.direction=direction;
	}
	void show(){
		super.show();
		System.out.println("\t研究方向："+direction);
	}
}


//第8题：电话类Phone

class phone{
	char[] number=new char[12];//字符数组，长度为12
	//设置电话号码方法
	void setNumber(char[] number){
		this.number=number;
	}
	//显示电话号码
	void getNumber(){
		System.out.print("本机号码：");
		for(int i=0;i<number.length;i++) {
			System.out.print(number[i]);
		}
		System.out.println();
	}
	//拨打电话方法
	void dail(){
		System.out.println("正在拨打电话....");
	}
	//接听电话方法
	void answer(){
		System.out.println("正在接听电话....");
	}	
}
//移动电话类子类继承电话类
class mobilePhone extends phone{
	char[] number=new char[11];
	void dail(){
		System.out.println("正在通过移动网络拨打电话....");
	}
	void answer(){
		System.out.println("正在通过移动网络接听电话....");
	}	
}
//固定电话类子类继承电话类
class fixPhone extends phone{
	void dail(){
		System.out.println("正在通过电信固网拨打电话....");
	}
	void answer(){
		System.out.println("正在通过电信固网接听电话....");
	}	
}
//无线电话类子类继承固定电话类
class cordlessPhone extends fixPhone{
	char[] number=new char[4];
	/*void dail(){
		System.out.println("正在通过无线电话拨打电话....");
	}
	void answer(){
		System.out.println("正在通过电信固网接听电话....");
	}*/
	void move(){
		System.out.println("正在移动通话....");
	}
}


//第9题 工人、服务员
//员工类
class worker{
	String name;
	String job;
	double salary;
	
	worker(String name,String job,double salary){
		this.name=name;
		this.job=job;
		this.salary=salary;
	}
	
	void stat(){
		System.out.println("姓名："+name+"\t职业："+job+"\t月薪："+salary+"\t年收入："+(salary*12.0));
	}
}
//教师类
class teacher extends worker{
	double allowance;//课酬
	teacher(String name,String job,double salary,double allowance){
		super(name,job,salary);
		this.allowance=allowance;
	}
	void stat(){
		System.out.println("姓名："+name+"\t职业："+job+"\t月薪："+salary
		                 +"\t课时费："+allowance
		                 +"\t年收入："+(salary*12.0+allowance*200.0));
	}
}
//科学家类
class scientist extends worker{
	double bonus;//激励奖
	scientist(String name,String job,double salary,double bonus){
		super(name,job,salary);
		this.bonus=bonus;
	}
	void stat(){
		System.out.println("姓名："+name+"\t职业："+job+"\t月薪："+salary
		                 +"\t激励奖："+bonus
		                 +"\t年收入： "+(salary*12.0+bonus*4.0));
	}
}

