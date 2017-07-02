package ru.job4j.calculator;

public class Calculator {
private double result;
	
	public void addSumm(double first, double second){
		this.result = first + second;
		}
		
		   public void addSubstrukt(double first, double second){
			     this.result = first - second;
		        }
		    
			    public void addDiv(double first, double second){
			           this.result = first / second;
		            }
			
			         public void addMultiple(double first, double second){
			             this.result = first * second;
		                }
			
			
	   public double getResult() {
		   return this.result;
	   }
}