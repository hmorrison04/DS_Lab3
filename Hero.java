
public class Hero implements HeroInterface
{
	String race;
	Job job;
	String jobName;
	public Hero(String name, Job job)//, String jobName)
	{
		// TODO Auto-generated constructor stub
		this.race = name;
		this.job = job;
		//this.jobName = jobName;
		
	}

	@Override
	public int attack(int val)
	{
		// TODO Auto-generated method stub
		return job.attack(val,this);
	}

	@Override
	public int getSTR()
	{
		return 20;
	}
	
	@Override
	public int getDEX()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getINT()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String getRaceName()
	{
		// TODO Auto-generated method stub
		return race;
	}

	@Override
	public String getJobName()
	{
		// TODO Auto-generated method stub
		return job.getJobName();
	}

}
