package InterviewQuestion;

public class ZohoInterviewQ1 {
	static int givenNumber = 6780001;
	public static void main(String[] args) {
		int temp = 0;
		int reordered =0;
		int count =0;
		int baseNumber = 10;
		while(givenNumber>0)
		{
			temp = givenNumber%baseNumber;
			reordered = (int) (reordered+ ((temp==0)? temp=5 : temp )*Math.pow(baseNumber, count));
			//System.out.println(reordered);
			givenNumber = givenNumber/baseNumber;
			count++;
		}
		System.out.println(reordered);
	}

}
