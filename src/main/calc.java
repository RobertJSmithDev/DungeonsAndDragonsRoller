package main;

import java.math.*;
import java.util.concurrent.*;

public class calc
{
	private static int i;
	private static double j;

	public static int add(int a, int b)
	{
		i = (a + b);
		return i;
	}

	public static int subtract(int a, int b)
	{
		i = (a - b);
		return i;
	}

	public static int divide(int a, int b)
	{
		i = (a / b);
		return i;
	}

	public static int multiply(int a, int b)
	{
		i = (a * b);
		return i;
	}

	public static int random(int a, int b)
	{
		i = ThreadLocalRandom.current().nextInt(a, b + 1);
		return i;
	}
}
