package ru.job4j.loop;

 public class Factorial {
	 
	 public int calc(int n) {
		 int f = 1;

		 for (int i = 1, i <= n, i++){
			 f = f * i;
		 } 
			 
		return f;
	 }
 }