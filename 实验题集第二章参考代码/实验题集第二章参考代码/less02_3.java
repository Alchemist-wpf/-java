import java.util.Scanner;
class less02_3
{
   public static void main(String[] args)
   {
       // ��11�� �������
	   // ˼·����һ�к����һ�ж���1���ӵ����п�ʼÿһ�е�����һ�����к�ǰ����ӡ�

       /* int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][0] = 1;
                arr[i][i] = 1;

            }
        }
        for (int i = 2; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }

        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }*/
		
		//12 �� ��������Ϸ
		/*Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*10);
		while(true)
		{
			System.out.print("���������µ�����");
			int s=sc.nextInt();
			if(s>r)
				System.out.println("sorry,��´��ˣ�");
			else if(s<r)
				System.out.println("sorry,���С�ˣ�");
			else
			{
				System.out.println("��ϲ��������ˣ�");
				break;	
			}
			
		}*/
		//13�� 
		//1��ѭ�����Ʊ���n�������ж��壺
        //ѭ�����Ʊ���n�������main�����ж���
     	/*int sum=0,n,score;
		double avg;
		for(n=0;n<3;n++)
		{	score=(int)(Math.random()*61)+40;
			System.out.println("�ɼ�score="+score);
			sum=sum+score;
		}
		avg=(double)sum/n;
		System.out.println("ƽ���ɼ�avg="+avg);
		*/
	 

 
		//2��ѭ�����Ʊ���n��for����ж��壺
		//ѭ�����Ʊ���n��for����ж���
		/*
		int sum=0,	score,i=0;
		double avg;
		for(int n=0;n<3;n++)
		{	score=(int)(Math.random()*61)+40;
			System.out.println("�ɼ�score="+score);
			sum=sum+score;
			i=n;
		}
		avg=(double)sum/(i+1);
		System.out.println("ƽ���ɼ�avg="+avg);
       */

	 //3��ѭ�����Ʊ���n�޸ģ�ѭ����ȫ������for���ı��ʽ3�С�
     //ѭ�����Ʊ���n�޸ģ�ѭ����ȫ������for���ı��ʽ3��
	/*
		int sum=0,	score,n=0;
		double avg;
		for(n=0;n<3;score=(int)(Math.random()*61)+40,
			System.out.println("�ɼ�score="+score),n++,sum+=score);
		avg=(double)sum/n;
		System.out.println("ƽ���ɼ�avg="+avg);
	*/

  
 
	//4��for���ȫ�գ�
	//for���ȫ��
	/*
		int sum=0,	score,n=0;
		double avg;
		for(;;)
		{	if(n>=3)	break;
			else
			{	score=(int)(Math.random()*61)+40;
				System.out.println("�ɼ�score="+score);
				sum=sum+score;
				n=n+1;
			}
		}
		avg=(double)sum/n;
		System.out.println("ƽ���ɼ�avg="+avg);
	*/

		
    }

}