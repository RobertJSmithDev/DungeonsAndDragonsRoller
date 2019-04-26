package main;

public class Dice extends calc
{	
	String d4, d6, d8, d10, d100, d12, d20;
	static String toStringNum;
	static int num, temp, max;
	
	public static int roll(String d, int times)
	{
		StringBuilder stringBuilder = new StringBuilder();
		switch (d)
		{
			case "d4":
				for(int i=times; i>0; i--)
				{
					max = times;
					temp = calc.random(1, 4);
					num += temp;
					if (times > 1)
					{
						if (i == 1)
						{
							stringBuilder.append(temp);
						}
						else
						{
							stringBuilder.append(temp + ", ");
						}
					}
				}
				toStringNum = stringBuilder.toString();
				break;
			case "d6":
				for(int i=times; i>0; i--)
				{
					temp = calc.random(1, 6);
					num += temp;
					if (times > 1)
					{
						if (i == 1)
						{
							stringBuilder.append(temp);
						}
						else
						{
							stringBuilder.append(temp + ", ");
						}
					}
				}
				toStringNum = stringBuilder.toString();
				break;
			case "d8":
				for(int i=times; i>0; i--)
				{
					temp = calc.random(1, 8);
					num += temp;
					if (times > 1)
					{
						if (i == 1)
						{
							stringBuilder.append(temp);
						}
						else
						{
							stringBuilder.append(temp + ", ");
						}
					}
				}
				toStringNum = stringBuilder.toString();
				break;
			case "d10":
				for(int i=times; i>0; i--)
				{
					temp = calc.random(1, 10);
					num += temp;
					if (times > 1)
					{
						if (i == 1)
						{
							stringBuilder.append(temp);
						}
						else
						{
							stringBuilder.append(temp + ", ");
						}
					}
				}
				toStringNum = stringBuilder.toString();
				break;
			case "d100":
				for(int i=times; i>0; i--)
				{
					temp = calc.random(0, 99);
					num += temp;
				}
				break;
			case "d12":
				for(int i=times; i>0; i--)
				{
					temp = calc.random(1, 12);
					num += temp;
					if (times > 1)
					{
						if (i == 1)
						{
							stringBuilder.append(temp);
						}
						else
						{
							stringBuilder.append(temp + ", ");
						}
					}
				}
				toStringNum = stringBuilder.toString();
				break;
			case "d20":
				for(int i=times; i>0; i--)
				{
					temp = calc.random(1, 20);
					num += temp;
					if (times > 1)
					{
						if (i == 1)
						{
							stringBuilder.append(temp);
						}
						else
						{
							stringBuilder.append(temp + ", ");
						}
					}
					toStringNum = stringBuilder.toString();
				}
				break;
		}
		return num;
	}
	
	public static int resetNum()
	{
		num = 0;
		return num;
	}
	
	public static String getString()
	{
		return "(" + toStringNum + ")";
	}
}
