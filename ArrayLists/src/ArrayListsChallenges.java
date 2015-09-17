import java.util.ArrayList;
public class ArrayListsChallenges
	{
		static ArrayList<Double> myArray = new ArrayList<Double>();
		public static void main(String[] args)
			{
				int fever = 0;
				for(int i = 0; i < 10; i++)
					{
						int random = (int)(Math.random()* 50) + 960;
						double ranDecIn = random / 10.0;
						if(ranDecIn > 98.6)
							fever++;
						myArray.add(ranDecIn);
						System.out.println(myArray.get(i) + " degrees Fahrenheit.");
					}
				System.out.println("This many people have fevers: " + fever);
				for(int i = 0; i < 10; i++)
					{
						double tempTemp = myArray.get(i);
						tempTemp = (tempTemp - 32) / 1.8;
						myArray.set(i, tempTemp);
						System.out.println(myArray.get(i) + " degrees Celsius.");
					}
			}

	}
