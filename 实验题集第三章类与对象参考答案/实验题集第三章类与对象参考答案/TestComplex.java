package cn.jx.sy;

class TestComplex{
	int realPart,imagPart;
	TestComplex()
	{
		realPart=0;
		imagPart=0;
	}
	TestComplex(int realPart,int imagPart)
	{
		this.realPart=realPart;
		this.imagPart=imagPart;
	}
	
	void add(TestComplex c1,TestComplex c2)
	{
		realPart=c1.realPart+c2.realPart;
		imagPart=c1.imagPart+c2.imagPart;
	}
	void sub(TestComplex c1,TestComplex c2)
	{
		realPart=c1.realPart-c2.realPart;
		imagPart=c1.imagPart-c2.imagPart;
	}
	void printResult()
	{
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
	
	public static void main(String[] args)
	{
		TestComplex c0=new TestComplex();
		c0.printResult();
		TestComplex c1=new TestComplex(18,2);
		//c1.printResult();
		TestComplex c2=new TestComplex(19,-13);
		//c2.printResult();
		c0.add(c1,c2);
		c0.printResult();
		c0.sub(c1,c2);
		c0.printResult();
		
	}
	
}
