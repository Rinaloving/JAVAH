package com.day.july.demo;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("Hello Git!!!"); //���
		System.out.println("��ð�������");
		
		User a = new User();
		a.setName("С��");
		System.out.println(a.getName());
	}
	
	

}

class User
{
	private String name;
	public void setName(String name) 
	{
		this.name = name;
		
	}
	
	public String getName() 
	{
		
		return name;
	}

}
