package Lesson;
import java.util.*;
public class AreaAndVolume {
	
	public static double area, volume, number,side, length, pi=3.14,breadth, radius, height;
	public static Scanner scan = new Scanner(System.in);
	public static int type,shape;
	
	public static void main(String[] args){
		
		System.out.println("Enter a number between 1 and 4 to Calculate Shape area or volume");
		System.out.println();
		System.out.println("[1] Square");
		System.out.println("[2] Rectangle");
		System.out.println("[3] Circle");
		System.out.println("[4] Cylinder");
				
		shape=(int) scan.nextDouble();
		
		
		System.out.println("[1] Area");
		System.out.println("[2] Volume");
		System.out.println();
		type = scan.nextInt();
		
		
		if (shape == 1 && type == 1){
			System.out.println("Please Enter the side for square");
			side=scan.nextDouble();
			System.out.println("We are calculating area!");
			System.out.println("Your Answer is: "+side*side);
		}
			
		if (shape == 1 && type == 2){
				System.out.println("Please Enter the side for square");
				side=scan.nextDouble();
				System.out.println("We are calculating Volume");
				System.out.println("Your Answer is: "+side*side*side);
		}
			
		
		
		
		
		if (shape == 2){
			System.out.println("Enter Length of the rectangle");
			length=scan.nextDouble();
			System.out.println("Enter breadth of rectangle");
			breadth=scan.nextDouble();
			System.out.println("Enter value of height");
			height=scan.nextDouble();	
			if (type == 1){
			System.out.println("We are calulcating Area!");	
			System.out.println("Your Answer is: "+length*breadth);
			}
			if (type == 2){
				System.out.println("We are calulcating Volume!");	
				System.out.println("Your Answer is: "+length*breadth*height);
			}
		}
		
		
		
		if (shape == 3){
			System.out.println("Enter the value of Circle Radius");
			radius=scan.nextDouble();
			if (type == 1){
			System.out.println("We are calulcating Area!");	
			System.out.println("Your Answer is: "+pi*radius*radius);
			}
			if (type==2){
				System.out.println("We are calulcating Volume!");	
				System.out.println("Your Answer is: "+(4/3)*pi*radius*radius*radius);
			}
		}
		if (shape == 4){
			System.out.println("Enter value of radius");
			radius=scan.nextDouble();
			System.out.println("Enter value of height");
			height=scan.nextDouble();	
			if (type==1){
			System.out.println("We are calulcating Area!");	
			System.out.println("Your Answer is: "+(pi*radius*radius*height));
			}
			if (type==2){
				System.out.println("We are calculating Volume");
				System.out.println("Your Answer is: "+(2*pi*radius*height)*(2*pi*radius*radius));
			}
		
		}
	}	
	
	
	public static void type(){
		
		
			
		}		
			
			
			
			
		
		
	

	}

