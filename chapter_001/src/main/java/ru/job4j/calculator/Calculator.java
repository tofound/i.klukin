package ru.job4j;
import package-info.java;
/**
 * Calculator.
 */
public class Calculator {
/**
 * Calculator.
 */
private double result;
	/**
                   * AddSum.
                   * @param first arg.
                     * @param second arg.
                      */
	public void addSumm(double first, double second) {
		this.result = first + second;
		}
/**
                   * AddSubstrukt.
                   * @param first arg.
                     * @param second arg.
                      */
		   public void addSubstrukt(double first, double second) {
			     this.result = first - second;
		        }
/**
                   * AddDiv.
                   * @param first arg.
                     * @param second arg.
                      */
			    public void addDiv(double first, double second) {
			           this.result = first / second;
		            }
/**
                   * AddMultiple.
                   * @param first arg.
                     * @param second arg.
                      */
			         public void addMultiple(double first, double second) {
			             this.result = first * second;
		                }

	/**
                   * AddSum.
                   * @return result.
                      */
	   public double getResult() {
		   return this.result;
	   }
}