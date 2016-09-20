public class Question
{
	private String question;
	private String answer;

	public Question(String question
					, String answer)
	{
		this.question = question;
		this.answer = answer;
	}

	public void helloWorld()
	{
		System.out.println("Hello World, I am " + this.getClass().getName() + "!");
		System.out.println("----------------------------------");
	}

	public void setAnswer(String answer)
	{
		this.answer = answer;
	}

	public String getAnswer()
	{
		return answer;
	}
	
	public boolean verifyAnswer(String pAnswer) {
		return (pAnswer == this.answer);
	}
}
