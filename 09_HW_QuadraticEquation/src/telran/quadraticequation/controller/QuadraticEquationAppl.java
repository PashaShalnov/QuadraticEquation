package telran.quadraticequation.controller;

import telran.quadraticequation.model.QuadraticEquation;

public class QuadraticEquationAppl {

	public static void main(String[] args) {
		QuadraticEquation eq0 = new QuadraticEquation(-4, 28, -49);
		QuadraticEquation eq1 = new QuadraticEquation(54, 6, 0);
		
		eq0.displayEquation();
		System.out.println("Delta of eq0 = " + eq0.delta());
		System.out.println("Amount of solutions for eq0 is: " + eq0.amountOfSolutions());
		eq0.roots();

		eq1.displayEquation();
		System.out.println("Delta of eq1 = " + eq1.delta());
		System.out.println("Amount of solutions for eq1 is: " + eq1.amountOfSolutions());
		eq1.roots();
		
		}
}
