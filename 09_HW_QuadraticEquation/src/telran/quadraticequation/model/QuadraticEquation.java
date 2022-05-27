package telran.quadraticequation.model;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;	
	// Создать класс квадратичной функции ax^2 + bx + c = 0.

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		// Конструктор, который принимает значения a, b, c
		// (по примеру конструктора Employee из классной работы).
	}

	// геттеры и сеттеры для этих значений
	public void setA(double a) {
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getB() {
		return b;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getC() {
		return c;
	}

	public void displayEquation() {
		System.out.println("Equation: " + a + "X^2" + " + " + b + "X" +  " + " + c + " = 0");
		// TODO метод который будет печатать уравнение в консоль,
	}

	public double delta() {
		 return b * b - 4 * a * c;
		// TODO метод который будет возвращать дискриминант,
	}

	public int amountOfSolutions() {
		if (delta() > 0) {
			return 2;
		}
		if (delta() == 0) {
			return 1;
		} else {
			return 0;
		}
		// метод который будет возвращать количество решений уравнения.
	}

	public double roots() {
		// TODO И метод который будет возвращать собственно сами решения в виде массива
		// Для решения уравнения надо будет извлечь квадратный корень,
		// можно сделать при помощи готового метода Math.sqrt()
		if (a == 0) {
			System.out.println("This is not a quadratic equation");
			return 0;
		}

		if (delta() == 0) {
			double[] roots = new double[1];
			roots[0] = -b / (2 * a);
			displayArray(roots);
		}
		if (delta() > 0) {
			double[] roots = new double[2]; 
			roots[0] = (-b + Math.sqrt(delta())) / (2 * a);
			roots[1] = (-b - Math.sqrt(delta())) / (2 * a);
			displayArray(roots);
		}
		return 0;
	}
	
	public void displayArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Solution " + (i + 1) + ": " + arr[i] + " ");
		}
		System.out.println();
		}
		
}
