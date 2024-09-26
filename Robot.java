
public class Robot extends Hero
{
	String name;
	//Job job;
	String jobName;

	public Robot(String race, Job job)//, String jobName)
	{
		super(race, job);//, jobName);
		
	}

	@Override
	public int attack(int val)
	{
		// TODO Auto-generated method stub
		return job.attack(val,this);
	}
	
	@Override
	public int getINT()
	{
		// TODO Auto-generated method stub
		return 25;
	}
	
	
	
	
	
/*
	@Override
	public int getSTR()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getDEX()
	{
		// TODO Auto-generated method stub
		return 20;
	}
*/
	
/*
	@Override
	public String getRaceName()
	{
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getJobName()
	{
		// TODO Auto-generated method stub
		return jobName;
	}
*/
}
