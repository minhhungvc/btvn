package buoi3;

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
		
		
		bt2 [] bt = new bt2[5];
		
		bt[0] = bt21;
		bt[1] = bt22;
		bt[2] = bt23;	
		bt[3] = bt24;
		bt[4] = bt25;
		
		
		System.out.println("mang co" + bt.length + "phan tu");
		System.out.println("id :"+bt[0].id + "||name :"+bt[0].name + "||salary :"+bt[0].salary +"||age :"+bt[0].age+"||married:"+bt[0].married + "||job:"+bt[0].Job.name);
		System.out.println("id :"+bt[1].id + "||name :"+bt[1].name + "||salary :"+bt[1].salary +"||age :"+bt[1].age+"||married:"+bt[1].married + "||job:"+bt[1].Job.name);
		System.out.println("id :"+bt[2].id + "||name :"+bt[2].name + "||salary :"+bt[2].salary +"||age :"+bt[2].age+"||married:"+bt[2].married + "||job:"+bt[2].Job.name);
		System.out.println("id :"+bt[3].id + "||name :"+bt[3].name + "||salary :"+bt[3].salary +"||age :"+bt[3].age+"||married:"+bt[3].married + "||job:"+bt[3].Job.name);
		System.out.println("id :"+bt[4].id + "||name :"+bt[4].name + "||salary :"+bt[4].salary +"||age :"+bt[4].age+"||married:"+bt[4].married + "||job:"+bt[4].Job.name);

		
		
		System.out.println("-------------------thông tin-----------------");
		System.out.println("id:        name:        salary:        age:        married:       job:");
		System.out.println(""+bt[4].id + "          "+bt[4].name + "            "+bt[4].salary +"          "+bt[4].age+"          "+bt[4].married + "          "+bt[4].Job.name);
		
		
		
		
		
		System.out.println("------------------------------------------------------------------------------------------------");
    	System.out.println("id:        name:        salary:        age:        married:       job:");

	        for (int i = 0; i <= 4; i++) {
	    		System.out.println(""+bt[i].id + "          "+bt[i].name + "            "+bt[i].salary +"          "+bt[i].age+"          "+bt[i].married + "          "+bt[i].Job.name);
	        }
	    }

	}


