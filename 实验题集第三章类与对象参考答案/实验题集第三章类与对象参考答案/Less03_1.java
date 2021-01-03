package cn.jx.sy;

public class Less03_1 {
	public static void main(String[] args){
		
		
		//第1题：复数
		System.out.println("第1题：复数=================");
		complex c0=new complex();
		c0.printResult();
		complex c1=new complex(18,2);
		//c1.printResult();
		complex c2=new complex(19,-13);
		//c2.printResult();
		c0.add(c1,c2);
		c0.printResult();
		c0.sub(c1,c2);
		c0.printResult();
		
		
		//第2题 计算二维坐标系中圆面积
		System.out.println("第2题 计算二维坐标系中圆面积=================");
		point p10,p11,p20,p21;
		circleClass circle1,circle2;
		
		p10=new point(0,0);
		p11=new point(8.5,9);
		
		p20=new point(2,3.5);
		p21=new point(9,6);
		
		circle1=new circleClass(p10,p11);
		circle2=new circleClass(p20,p21);
		
		circle1.area();
		circle2.area();
		
		//第3题 计算长方形面积
		System.out.println("第3题 计算长方形面积======================");
		pointRect p30,p31,p40,p41;
		rectangleClass rect1,rect2;
		
		p30=new pointRect(0,0);
		p31=new pointRect(8.5,9);
		
		p40=new pointRect(2,3.5);
		p41=new pointRect(9,6);
		
		rect1=new rectangleClass(p30,p31);
		rect2=new rectangleClass(p40,p41);
		
		rect1.area();
		rect2.area();
		
		//第5题：图书Book类
		System.out.println("第5题：图书Book类======================");
		Book b1=new Book();
		b1.printBook();
		Book b2=new Book("西游记","吴承恩",1000);
		b2.printBook();
		
		b1.setBook("红楼梦","曹雪芹",2000);
		b1.printBook();
		
		//第6题：银行账户类
		System.out.println("第6题：银行账户类======================");
		Bank bank1=new Bank();
		bank1.query();
		Bank bank2=new Bank("张三疯","1000000002",20000);
		bank2.query();
		bank2.deposit(500000);
		bank2.query();
		bank2.withdraw(100000);
		bank2.query();
		
	}

}

//1 题 复数定义
class complex
{
	int realPart,imagPart;
	complex(){
		realPart=0;
		imagPart=0;
	}
	complex(int realPart,int imagPart){
		this.realPart=realPart;
		this.imagPart=imagPart;
	}
	
	void add(complex c1,complex c2){
		realPart=c1.realPart+c2.realPart;
		imagPart=c1.imagPart+c2.imagPart;
	}
	void sub(complex c1,complex c2){
		realPart=c1.realPart-c2.realPart;
		imagPart=c1.imagPart-c2.imagPart;
	}
	void printResult(){
		if(realPart==0 & imagPart==0)
			System.out.println("运算结果= 0");
		else if(realPart==0)
			System.out.println("运算结果= "+imagPart+"i");
		else if(imagPart==0)
			System.out.println("运算结果= "+realPart);
		else if(imagPart<0)
			System.out.println("运算结果= "+realPart+imagPart+"i");
		else
			System.out.println("运算结果= "+realPart+"+"+imagPart+"i");
	}
	
	
	
}

//第2题 计算二维坐标系中圆面积
//坐标类
class point{
	double x,y;
	point(double x,double y)
	{
		this.x=x;
		this.y=y;
	}
}
//圆面积类
class circleClass{
	final static double PI=3.14;
	point mp,cp;
	//构造方法（带坐标类参数）
	circleClass(point mp,point cp){
		this.mp=mp;
		this.cp=cp;
	}
	//求圆面积方法
	void area(){
		//两点间距离
		double r = Math.sqrt((Math.pow((mp.x-cp.x),2)+Math.pow((mp.y-cp.y),2)));
		System.out.println("圆的面积="+PI*r*r);
	}
}

//第3题 计算长方形面积
class pointRect{
	double x,y;
	pointRect(double x,double y){
		this.x=x;
		this.y=y;
	}
}
class rectangleClass{
	pointRect rp,lp;
	rectangleClass(pointRect rp,pointRect lp){
		this.rp=rp;
		this.lp=lp;
	}
	
	void area(){
		System.out.println("长方形的面积="
		+(Math.abs((rp.x-lp.x)*(rp.y-lp.y))));
	}
}

//第4题 见实验指导书91页

//第5题 图书的Book类
class Book{
	String bookName;
	String author;
	int sales;
	
	Book(){
		bookName="abc";
		author="test";
		sales=0;
	}
	Book(String bookName,String author,int sales){
		this.bookName=bookName;
		this.author=author;
		this.sales=sales;
	}
	void setBook(String bookName,String author,int sales){
		this.bookName=bookName;
		this.author=author;
		this.sales=sales;
	}
	void printBook(){
		System.out.println("书名："+bookName);
		System.out.println("作者："+author);
		System.out.println("月销量："+sales);
	}
}

//第6题 银行账户类
class Bank{
	String userName;
	String account;
	double  balance;
	Bank(){
		userName="银行测试号";
		account="1000000000";
		balance=1000000;
	}
	Bank(String userName,String account,double  balance){
		this.userName=userName;
		this.account=account;
		this.balance=balance;
	}
	void query(){
		System.out.println("用户名："+userName+"\n"
		                   +"账号："+account+"\n"
							+"余额："+balance);
	}
	//存款方法
	void deposit(double numb){
		balance +=numb;
	}
	//取款
	void withdraw(double numb){
		if(balance<numb) {
			System.out.println("账上余额不足，操作失败！");
		}else {
			balance -=numb;
		}
	}
}







