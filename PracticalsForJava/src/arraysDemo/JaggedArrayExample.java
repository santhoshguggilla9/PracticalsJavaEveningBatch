package arraysDemo;

public class JaggedArrayExample {
	
	public  static void main(String args[]) {

		//intialising the array
			String [][] names = {
									{"santhosh"},
									{"bheemana"},
									{"kumar"},
									{"varun"},
									{"kumar"}
								};
			
			String sVal = "Kumar";
			int found=0;
			for(String name[] : names) 
			{
				if(name[0].equalsIgnoreCase(sVal))
				{
					found++;
				}
			}
			System.out.println("Value found " + found + " Times");
			
			if(found>0)
			System.out.println("value found");
			else
			System.out.println("value not found");
	}
}
