
public class Warrior implements Job
{

	public Warrior()
	{
		// TODO Auto-generated constructor stub
	}

	@Override
	public int attack(int val, HeroInterface hero)
	{
		// TODO Auto-generated method stub
		return hero.getSTR()*val + hero.getDEX();
	}

	@Override
	public String getJobName()
	{
		// TODO Auto-generated method stub
		return "WARRIOR";
	}

	
}
