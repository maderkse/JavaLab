import java.util.regex.*;
import java.util.ArrayList;

public class RegTest
{
	final static int REGEX = 0;
	final static int SOURCE = 1;
	final static int[] SKIP = {REGEX,SOURCE};
	final static String START = "start";
	final static String END = "end";
	final static String GROUP = "group";
	final static String NEWLN = "\n";

	public void helloWorld()
	{
		System.out.println("Hello World, I am " + this.getClass().getName() + "!");
		System.out.println("----------------------------------");
	}

	public void test()
	{
		ArrayList<String[]> regexParamsLists = new ArrayList<String[]>();
		regexParamsLists.add(new String[]{"ab","ababa",START});
		regexParamsLists.add(new String[]{"aba","ababa",START});
		regexParamsLists.add(new String[]{"\\S","w1w w$ &#w1",START});
		regexParamsLists.add(new String[]{"\\b","w2w w$ &#w2",START});
		regexParamsLists.add(new String[]{"[a-cA-C]","cafeBABE",START});
		regexParamsLists.add(new String[]{"0[xX]([0-9a-fA-F])+","12 0x 0x12 0Xf 0xfg 0xg",START,GROUP,NEWLN});
		regexParamsLists.add(new String[]{".*xx","xx",START,GROUP,NEWLN});
		regexParamsLists.add(new String[]{"a([^,])*","a,abc",START,GROUP,NEWLN});
		regexParamsLists.add(new String[]{"a?","abb",START,END,GROUP,NEWLN});
		for (String [] regexPars : regexParamsLists)
			run(regexPars);
	}

	private void run(String[] pRegexPars)
	{
		Pattern p1 = Pattern.compile(pRegexPars[REGEX]);
		Matcher m1 = p1.matcher(pRegexPars[SOURCE]);
		System.out.println("Pattern: " + pRegexPars[REGEX]);
	    System.out.println(" Index: 01234567890123456789");
		System.out.println("Source: " + pRegexPars[SOURCE]);
		System.out.println("Resultaat:");
		while (m1.find())
		{
			int i =0;
			for (String regexPar:pRegexPars)
			{
				if (!(i==REGEX || i == SOURCE)) {
				switch (regexPar)
				{
					case START : System.out.print(m1.start() + " ");break;
					case END : System.out.print(m1.end() + " ");break;
					case GROUP : System.out.print(m1.group() + " ");break;
					default : System.out.print(regexPar);
					
				}}
				i++;
			}
			
		}
		System.out.print("\n");
		System.out.println("----------------------------------");
	}
}
