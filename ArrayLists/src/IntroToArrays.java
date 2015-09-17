import java.util.ArrayList;

public class IntroToArrays
	{
		static ArrayList myArray = new ArrayList();
		public static void main(String[] args)
			{
				createArrayList();
				System.out.println("The sum of the array list is " + sumArray());
				deleteArray();
			}
		public static void createArrayList()
			{
				for(int i = 0; i < 5; i++)
					{
						double num = i * 4.5;
						myArray.add(num);
					}
				System.out.println(myArray);
			}
		public static double sumArray()
			{
				double sum = 0.0;
				for(int i = 0; i < 5; i++)
					{
						double num = (double) myArray.get(i);
						sum += num;
					}
				return sum;
			}

		public static void deleteArray()
			{
				myArray.remove(0);
				for(int i = 1; i < 3; i++)
					{
						myArray.add(i * 3.6);
					}
				double average = 0.0;
				for(int i = 0; i < myArray.size(); i++)
					{
						double num = (double) myArray.get(i);
						average += num;
					}
				average /= myArray.size();
				System.out.println(myArray);
				System.out.println("The average of the new list was " + average);
			}
	}
