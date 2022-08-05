package com.org.tav.day7;

public interface Calculation<T> {
	T compute(T one,T two);
	
	default double sqrt(int num) {
		return Math.sqrt(num);
	}

}
