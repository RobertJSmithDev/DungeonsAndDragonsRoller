package main;

public class Stats
{
	private static int str, dex, con, intel, wis, cha, num;
	private static String mod;

	public static void generateStats()
	{
		str = calc.random(6, 20);
		dex = calc.random(6, 20);
		con = calc.random(6, 20);
		intel = calc.random(6, 20);
		wis = calc.random(6, 20);
		cha = calc.random(6, 20);		
	}
	
	private static String getModifiers(int num)
	{
		switch (num)
		{
			case 1:
				mod = "-5";
				break;
			case 2:
				mod = "-4";
				break;
			case 3:
				mod = "-4";
				break;
			case 4:
				mod = "-3";
				break;
			case 5:
				mod = "-3";
				break;
			case 6:
				mod = "-2";
				break;
			case 7:
				mod = "-2";
				break;
			case 8:
				mod = "-1";
				break;
			case 9:
				mod = "-1";
				break;
			case 10:
				mod = "0";
				break;
			case 11:
				mod = "0";
				break;
			case 12:
				mod = "+1";
				break;
			case 13:
				mod = "+1";
				break;
			case 14:
				mod = "+2";
				break;
			case 15:
				mod = "+2";
				break;
			case 16:
				mod = "+3";
				break;
			case 17:
				mod = "+3";
				break;
			case 18:
				mod = "+4";
				break;
			case 19:
				mod = "+4";
				break;
			case 20:
				mod = "+5";
				break;
		}
		return mod;
	}

	public static String getStrength()
	{
		return str + "";
	}

	public static String getDexterity()
	{
		return dex + "";
	}

	public static String getConstitution()
	{
		return con + "";
	}

	public static String getIntelligence()
	{
		return intel + "";
	}

	public static String getWisdom()
	{
		return wis + "";
	}

	public static String getCharisma()
	{
		return cha + "";
	}
	
	public static String getStrengthMod()
	{
		return " (" + getModifiers(str) + ")";
	}

	public static String getDexterityMod()
	{
		return " (" + getModifiers(dex) + ")";
	}

	public static String getConstitutionMod()
	{
		return " (" + getModifiers(con) + ")";
	}

	public static String getIntelligenceMod()
	{
		return " (" + getModifiers(intel) + ")";
	}

	public static String getWisdomMod()
	{
		return " (" + getModifiers(wis) + ")";
	}

	public static String getCharismaMod()
	{
		return " (" + getModifiers(cha) + ")";
	}
	
	public static void setStrength(int n)
	{
		str = n;
	}

	public static void setDexterity(int n)
	{
		dex = n;
	}

	public static void setConstitution(int n)
	{
		con = n;
	}

	public static void setIntelligence(int n)
	{
		intel = n;
	}

	public static void setWisdom(int n)
	{
		wis = n;
	}

	public static void setCharisma(int n)
	{
		cha = n;
	}
}
