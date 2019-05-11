package buoi3;

import java.util.*;


public class Main {
	public static void main  (String a []) {
		
		Job job1 = new Job(1,"HR");
		Job job2 = new Job(2,"BA");
		Job job3 = new Job(3,"Tester");
		Job job4 = new Job(4,"Developer");
		Job job5 = new Job(5,"Ceo");
		
		
		bt2 bt21 = new bt2 (1 , "A" , 3000 , 10 , true , job1);
		bt2 bt22 = new bt2 (2 , "B" , 4000 , 11 , true , job2);
		bt2 bt23 = new bt2 (3 , "C" , 5000 , 13, true , job3);
		bt2 bt24 = new bt2 (4 , "D" , 6000 , 14, true , job4);
		bt2 bt25 = new bt2 (5 , "E" , 7000 , 15 , true , job5);
		
		//bt2 [] bt = new bt2[5];
	    ArrayList<bt2> bt11 =new ArrayList<bt2>();
	    bt11.add(bt21);
	    bt11.add(bt22);
	    bt11.add(bt23);
	    bt11.add(bt24);
	    bt11.add(bt25);
	 Iterator<bt2> itr=bt11.iterator();
	 while (itr.hasNext()){
	    	System.out.println("id:        name:        salary:        age:        married:       job:");

		 bt2 item =itr.next();
 		System.out.println(""+item.getId()+ "          "+item.getName() + "            "+item.getSalary() +"          "+item.getAge()+"          "+item.married + "          "+item.Job.name);

	 }
	    
	    
	    
		
		//bt[0] = bt21;
		//bt[1] = bt22;
		//bt[2] = bt23;	
		//bt[3] = bt24;
		//bt[4] = bt25;
		
		
		//System.out.println("mang co" + bt1.length + "phan tu");
		//System.out.println("id :"+bt1[0].id + "||name :"+bt1[0].name + "||salary :"+bt1[0].salary +"||age :"+bt1[0].age+"||married:"+bt1[0].married + "||job:"+bt1[0].Job.name);
		//System.out.println("id :"+bt1[1].id + "||name :"+bt1[1].name + "||salary :"+bt1[1].salary +"||age :"+bt1[1].age+"||married:"+bt1[1].married + "||job:"+bt1[1].Job.name);
		//System.out.println("id :"+bt1[2].id + "||name :"+bt1[2].name + "||salary :"+bt1[2].salary +"||age :"+bt1[2].age+"||married:"+bt1[2].married + "||job:"+bt1[2].Job.name);
		//System.out.println("id :"+bt1[3].id + "||name :"+bt1[3].name + "||salary :"+bt1[3].salary +"||age :"+bt1[3].age+"||married:"+bt1[3].married + "||job:"+bt1[3].Job.name);
		//System.out.println("id :"+bt1[4].id + "||name :"+bt1[4].name + "||salary :"+bt1[4].salary +"||age :"+bt1[4].age+"||married:"+bt1[4].married + "||job:"+bt1[4].Job.name);

		
		
		//System.out.println("-------------------thông tin-----------------");
		//System.out.println("id:        name:        salary:        age:        married:       job:");
		//System.out.println(""+bt1[4].id + "          "+bt1[4].name + "            "+bt1[4].salary +"          "+bt1[4].age+"          "+bt1[4].married + "          "+bt1[4].Job.name);
		
		
		
		
		
		/*System.out.println("------------------------------------------------------------------------------------------------");
    	System.out.println("id:        name:        salary:        age:        married:       job:");

	        for (bt2 bt : bt11) {
	    		System.out.println(""+bt.getId()+ "          "+bt.getName() + "            "+bt.getSalary() +"          "+bt.getAge()+"          "+bt.married + "          "+bt.Job.name);
	        }*/
	    }

	}


