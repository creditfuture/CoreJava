package com.task1;

public class Test {

	public static void main(String[] args) {
		
		Encap e1 = new Encap();
		
			e1.setName("jAy");
			System.out.println("case1: " + e1.getName());
			
			Encap e2 = new Encap();
			e2.setName("Jay123");
			System.out.println("name: " + e2.getName());
			
			Encap e3 = new Encap();
			e3.setName("Jay@");
			System.out.println("case3: " + e3.getName());
			
//			e1.setName("vir123y");
//			System.out.println("case4: " + e1.getName());
//			
//			e1.setName("j+y");
//			System.out.println("case5: " + e1.getName());
//			
//			e1.setName("jAy");
//			System.out.println("case6: " + e1.getName());
//			
//			e1.setName("JAY");
//			System.out.println("case7: " + e1.getName());
			
			
	}

}
