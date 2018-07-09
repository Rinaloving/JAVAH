package com.day.july.demo;

public class HelloGit {
	public static void main(String[] args) {
		System.out.println("Hello Git!!!"); //输出
		System.out.println("你好啊！！！");
		
		User a = new User();
		a.setName("小新");
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
