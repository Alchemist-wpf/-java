package cn.jx.sy.biology.school.garden;

import cn.jx.sy.biology.animal.Human;
import cn.jx.sy.biology.plant.Flower;



public class PackTest {
	public static void main(String[] args)
	   {
	       Human h=new Human("张三");
		   Flower f=new Flower("rose");
		   
		   h.eat();
		   h.sleep();
		   h.work();
		   
		   f.drink();
		   f.blossom();
	   
	   }

}
