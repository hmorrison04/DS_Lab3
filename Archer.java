
public class Archer implements Job
{

	public Archer()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack(int val, HeroInterface hero)
	{
		// TODO Auto-generated method stub
		return (int) (hero.getDEX()*1.5*val);
	}

	@Override
	public String getJobName()
	{
		// TODO Auto-generated method stub
		return "ARCHER";
	}

	

}
