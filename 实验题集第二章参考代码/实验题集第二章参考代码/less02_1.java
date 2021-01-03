class less02_1
{
   public static void main(String[] args)
   {
      /*1题 定义一维数组
	  int[] k=new int[6];
	  for(int i=0;i<k.length;i++)
		  k[i]=i;
	  System.out.println("k[3]="+k[3]);
      */
	  
	  /*2题 二维数组
	  int[][] k=new int[3][4];
	  for(int i=0;i<k.length;i++)
		  for(int j=0;j<k[i].length;j++)
	          k[i][j]=i*j;
	  System.out.println("k[2][3]="+k[2][3]);
	  */
	  
	  /*3题 命令行输入字符串
	  System.out.println("从命令行输入的字符串个数："+args.length);
	  for(int i=0;i<args.length;i++)
		  System.out.println("第"+(i+1)+"个字符串的字符数："+args[i].length());
	  */
	  
	  /* 4题 判断数的奇偶	  
	  int n=Integer.parseInt(args[0]);
	  if(n%2==1)
		  System.out.println(n+"是奇数");
	  else
		  System.out.println(n+"是偶数");
	  */
	  //5 题 比较大小
	  int n=Integer.parseInt(args[0]);
	  int m=Integer.parseInt(args[1]);
	  if(n>m)
		  System.out.println(n+" > "+m);
	  else if(n==m)
		  System.out.println(n+" = "+m);
	  else
	      System.out.println(n+" < "+m);
   }


}