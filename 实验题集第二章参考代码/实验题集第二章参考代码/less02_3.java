import java.util.Scanner;
class less02_3
{
   public static void main(String[] args)
   {
       // 第11题 杨辉三角
	   // 思路：第一列和最后一列都是1；从第三行开始每一列等于上一行那列和前列相加。

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
		
		//12 题 猜数字游戏
		/*Scanner sc=new Scanner(System.in);
		int r=(int)(Math.random()*10);
		while(true)
		{
			System.out.print("请输入您猜的数：");
			int s=sc.nextInt();
			if(s>r)
				System.out.println("sorry,你猜大了！");
			else if(s<r)
				System.out.println("sorry,你猜小了！");
			else
			{
				System.out.println("恭喜您，答对了！");
				break;	
			}
			
		}*/
		//13题 
		//1）循环控制变量n在主类中定义：
        //循环控制变量n在主类的main方法中定义
     	/*int sum=0,n,score;
		double avg;
		for(n=0;n<3;n++)
		{	score=(int)(Math.random()*61)+40;
			System.out.println("成绩score="+score);
			sum=sum+score;
		}
		avg=(double)sum/n;
		System.out.println("平均成绩avg="+avg);
		*/
	 

 
		//2）循环控制变量n在for语句中定义：
		//循环控制变量n在for语句中定义
		/*
		int sum=0,	score,i=0;
		double avg;
		for(int n=0;n<3;n++)
		{	score=(int)(Math.random()*61)+40;
			System.out.println("成绩score="+score);
			sum=sum+score;
			i=n;
		}
		avg=(double)sum/(i+1);
		System.out.println("平均成绩avg="+avg);
       */

	 //3）循环控制变量n修改，循环体全部放在for语句的表达式3中。
     //循环控制变量n修改，循环体全部放在for语句的表达式3中
	/*
		int sum=0,	score,n=0;
		double avg;
		for(n=0;n<3;score=(int)(Math.random()*61)+40,
			System.out.println("成绩score="+score),n++,sum+=score);
		avg=(double)sum/n;
		System.out.println("平均成绩avg="+avg);
	*/

  
 
	//4）for语句全空：
	//for语句全空
	/*
		int sum=0,	score,n=0;
		double avg;
		for(;;)
		{	if(n>=3)	break;
			else
			{	score=(int)(Math.random()*61)+40;
				System.out.println("成绩score="+score);
				sum=sum+score;
				n=n+1;
			}
		}
		avg=(double)sum/n;
		System.out.println("平均成绩avg="+avg);
	*/

		
    }

}