class less02_1
{
   public static void main(String[] args)
   {
      /*1�� ����һά����
	  int[] k=new int[6];
	  for(int i=0;i<k.length;i++)
		  k[i]=i;
	  System.out.println("k[3]="+k[3]);
      */
	  
	  /*2�� ��ά����
	  int[][] k=new int[3][4];
	  for(int i=0;i<k.length;i++)
		  for(int j=0;j<k[i].length;j++)
	          k[i][j]=i*j;
	  System.out.println("k[2][3]="+k[2][3]);
	  */
	  
	  /*3�� �����������ַ���
	  System.out.println("��������������ַ���������"+args.length);
	  for(int i=0;i<args.length;i++)
		  System.out.println("��"+(i+1)+"���ַ������ַ�����"+args[i].length());
	  */
	  
	  /* 4�� �ж�������ż	  
	  int n=Integer.parseInt(args[0]);
	  if(n%2==1)
		  System.out.println(n+"������");
	  else
		  System.out.println(n+"��ż��");
	  */
	  //5 �� �Ƚϴ�С
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