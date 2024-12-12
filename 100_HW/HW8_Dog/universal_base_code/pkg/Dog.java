package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	int age;
	String name;
	String breed;

	
	public Dog() {
		age = 3;
		name = "Clifford";
		breed = "Big Red Dog";
		
	}
	public Dog(String n){
		name = n;
		age = 1;
		breed = "Dog Dog";
		
	}
	public Dog(String n, String b){
		name = n;
		age = 1;
		breed = b;
		
	}
	public Dog(String n, int a){
		name = n;
		age = a;
		breed = "Dog Dog";
		
	}
	
	public void setName(String n){
		name = n;
	}
	public void setBreed(String b){
		breed = b;
	}
	public void setAge(int a){
		age = a;
	}
	public String getName(){
		return name;
	}
	public String getBreed(){
		return breed;
	}
	public int getAge(){
		return age;
	}
	public boolean isSleeping(){
		int yon = (int)(Math.random()*100);
		if(yon%2 == 0){
			return true;
		}
		return false;
	}
	public void bark(){
		System.out.println(name+" Bark!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
