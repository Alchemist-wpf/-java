import java.util.Scanner;
class less02_2
{
	
	//6 �ǹȲ���
  /* public static void main(String[] args)
   {
   	   int tmp=0;
   	   for (int n=3; n<=10000; n++) {
   	    	tmp=n;
   	    	while(tmp!=1)
   	    	{
   	    	   if(tmp%2==1)
   	    	      tmp=tmp*3+1;
   	    	   else
   	    	      tmp=tmp/2;		
   	    	}
   	    	System.out.println(n+"���ϽǹȲ��룡");
   	   }
   	
   	
   }*/
   
   //7 ������
  /* public static void main(String[] args)
   {   
   	//  ����һ
   	   int r1=0,r2=0;
   	   int sum=0,sum2=0,sum3=0,sum4=0,sum5=0,sum6=0,sum7=0,sum8=0,sum9=0,sum10=0,sum11=0,sum12=0;
   	   
   	   for (int n=0; n<3600; n++) {
   	    	r1=(int)(Math.random()*6+1);
   	    	r2=(int)(Math.random()*6+1);
   	    	sum=r1+r2;
   	    	
   	    	switch(sum)
   	    	{
   	    		case 2:sum2++;break;
   	    		case 3:sum3++;break;
   	    		case 4:sum4++;break;
   	    		case 5:sum5++;break;
   	    		case 6:sum6++;break;
   	    		case 7:sum7++;break;	
   	    		case 8:sum8++;break;
   	    		case 9:sum9++;break;
   	    		case 10:sum10++;break;	
   	    		case 11:sum11++;break;
   	    		case 12:sum12++;break;		
   	    	}	
   	   }
   	   System.out.println("��Ϊ2�Ĵ�����"+sum2);
   	   System.out.println("��Ϊ3�Ĵ�����"+sum3);
   	   System.out.println("��Ϊ4�Ĵ�����"+sum4);
   	   System.out.println("��Ϊ5�Ĵ�����"+sum5);
   	   System.out.println("��Ϊ6�Ĵ�����"+sum6);
   	   System.out.println("��Ϊ7�Ĵ�����"+sum7);
   	   System.out.println("��Ϊ8�Ĵ�����"+sum8);
   	   System.out.println("��Ϊ9�Ĵ�����"+sum9);
   	   System.out.println("��Ϊ10�Ĵ�����"+sum10);
   	   System.out.println("��Ϊ11�Ĵ�����"+sum11);
   	   System.out.println("��Ϊ12�Ĵ�����"+sum12);
   	         
   	
   	//����2
   	   int r1=0,r2=0,sum=0;
   	   int[] res=new int[13];
   	   
   	   for (int n=0; n<3600; n++) {
   	    	r1=(int)(Math.random()*6+1);
   	    	r2=(int)(Math.random()*6+1);
   	    	sum=r1+r2;
   	    	res[sum]++;
   	    	
   	   }
   	   for(int n=2;n<=12;n++)
   	   {
   	   	System.out.println("��Ϊ "+n+" �Ĵ�����"+res[n]);
   	   }
   	 
   }
   */
   
   //8 ��ȡ�Ǻ���
   
   //����һ����ӡn���Ǻŵķ���
   static void pStar(int n)
   {
   	  for (int i=0; i<n; i++) {
   	   	System.out.print("*");
   	  }
   	
   }
   //����һ����ӡn���ո�ķ���
   static void pSpace(int n)
   {
   	  for (int i=0; i<n; i++) {
   	   	System.out.print(" ");
   	  }
   	
   }
   //����һ�����еķ���
   static void pEnter()
   {
   	   	System.out.println();   	
   }
   
   public static void main(String[] args)
   {
   	
   	 // Scanner sc=new Scanner(System.in);
   	 // System.out.print("�������Ǻ�����");
   	 // int n=sc.nextInt();
   	  
   	  //ͼ��1
   	  /*for(int i=1;i<=n;i++)
   	  {
   	     pSpace(n-i);
   	     pStar(i);
   	     pEnter();	
   	  }*/
   	  
   	   //ͼ��2
   	 /* for(int i=1;i<=n;i++)
   	  {
   	  	 pStar(i);
   	     pEnter();	
   	  }
   	  for(int i=n-1;i>=1;i--)
   	  {
   	  	pStar(i);
   	  	pEnter();
   	  }*/
   	  //ͼ��3
   	 /*  for(int i=1;i<=n;i++)
   	  {
   	  	 pStar(i);
   	     pEnter();	
   	  }
   	  for(int i=1;i<n;i++)
   	  {
   	  	pSpace(i);
   	  	pStar(n-i);
   	  	pEnter();
   	  }*/
   	  //ͼ��4
   	/*  for(int i=0;i<=(n-1)/2;i++)
   	  {
   	  	pSpace((n-1)/2-i);
   	  	pStar(i*2+1);
   	  	pEnter();
   	  }
   	*/
   	//ͼ��5
   	 /* for(int i=0;i<=(n-1)/2;i++)
   	  {
   	  	pSpace((n-1)/2-i);
   	  	pStar(i*2+1);
   	  	pEnter();
   	  }
   	  for(int i=1;i<=(n-1)/2;i++)
   	  {
   	  	pSpace(i);
   	  	pStar(n-i*2);
   	  	pEnter();
   	  }*/
   	  
   	  // 9 ��ȡһ�����γ���
   	  
   	  
   	  /*	pStar(n);
   	  	pEnter();
   	  	for(int i=0;i<n-2;i++)
   	  	{
   	  		pStar(1);
   	  		pSpace(n-2);
   	  		pStar(1);
   	  		pEnter();
   	  	}
   	  	pStar(n);
   	  */
	  //10 �� ��ȡ��������߳�
	    Scanner sc=new Scanner(System.in);
   	    System.out.print("��������߳���");
   	    int n=sc.nextInt();
		System.out.print("�������ڱ߳���");
   	    int m=sc.nextInt();
		
		for(int i=0;i<((n-m)/2);i++)
		{
			pStar(n);
			pEnter();
		}
		
		for(int i=0;i<m;i++)
		{
			pStar((n-m)/2);
			pSpace(m);
			pStar((n-m)/2);
			pEnter();	
		}
		
		
		for(int i=0;i<((n-m)/2);i++)
		{
			pStar(n);
			pEnter();
		}
		
	  
   	}
   
   
  
}