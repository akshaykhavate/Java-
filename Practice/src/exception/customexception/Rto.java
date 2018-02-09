package exception.customexception;

public class Rto {
public void issueDl(int age) throws AgeNotSupportedException
{
	if(age<18)
	{
		throw new AgeNotSupportedException();
	}
}
}
