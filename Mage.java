
public class Mage implements Job
{
	
	public Mage()
	{
		// TODO Auto-generated constructor stub
		super();
	}

	@Override
	public int attack(int val, HeroInterface hero)
	{
		// TODO Auto-generated method stub
		return hero.getDEX() + hero.getINT()*val;
	}

	@Override
	public String getJobName()
	{
		// TODO Auto-generated method stub
		return "MAGE";
	}


}
