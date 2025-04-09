import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
		String str = num + "";
		ArrayList<String> arl = new ArrayList<String>();
		for(int i = 0; i<str.length(); i++){
			arl.add(str.substring(i,i+1));
		}
		ArrayList<Integer> arl2 = new ArrayList<Integer>();
		for(int i = 0; i<arl.size(); i++){
			arl2.add(Integer.parseInt(arl.get(i)));
		}
		digitList = arl2;
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		for(int i  = 0; i<digitList.size()-1; i++){
			if(digitList.get(i) >= digitList.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
