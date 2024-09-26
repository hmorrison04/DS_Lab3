public class HeroFactory
{
	static String race;
	static String job;



   public static HeroInterface createHero(String raceName, String jobName)   
   {
	  race = raceName;
	  job = jobName;
	  
      if (raceName.equals("ELF"))
      {
    	  if(jobName.equals("WARRIOR"))
    	  {
    		  Job job1 = new Warrior();
    		  Elf elvenWarrior = new Elf(raceName, job1);//, jobName);
    		  
    		  return elvenWarrior;
    		  
    	  }
    	  
    	  else if(jobName.equals("ARCHER"))
    	  {
    		  Job job2 = new Archer();
    		  Elf elvenArcher = new Elf(raceName, job2);//, jobName);
    		///  return elvenArcher;
    	  }
    	  
    	  else if(jobName.equals("MAGE"))
    	  {
    		  Job job3 = new Mage();
    		  Elf elvenMage = new Elf(raceName, job3);//, jobName);
    		//  return elvenMage;
    	  }
      }
      
      else if (raceName.equals("ROBOT"))
      {
    	  if(jobName.equals("WARRIOR"))
    	  {
    		  Job job1 = new Warrior();
    		  Robot robotWarrior = new Robot(raceName, job1);//, jobName);
    		  return robotWarrior;
    	  }
    	  
    	  else if(jobName.equals("ARCHER"))
    	  {
    		  Job job2 = new Archer();
    		  Robot robotArcher = new Robot(raceName, job2);//, jobName);
    		  return robotArcher;
    	  }
    	  
    	  else if(jobName.equals("MAGE"))
    	  {
    		  Job job3 = new Mage();
    		  Robot robotMage = new Robot(raceName, job3);//, jobName);
    		  return robotMage;
    	  }
      }
      
      else if (raceName.equals("DWARF"))
      {
    	  if(jobName.equals("WARRIOR"))
    	  {
    		  Job job1 = new Warrior();
    		  Dwarf dwarfWarrior = new Dwarf(raceName, job1);//, jobName);
    		  return dwarfWarrior;
    	  }
    	  
    	  else if(jobName.equals("ARCHER"))
    	  {
    		  Job job2 = new Archer();
    		  Dwarf dwarfArcher = new Dwarf(raceName, job2);//, jobName);
    		  return dwarfArcher;
    	  }
    	  
    	  else if(jobName.equals("MAGE"))
    	  {
    		  Job job3 = new Mage();
    		  Dwarf dwarfMage = new Dwarf(raceName, job3);//, jobName);
    		  return dwarfMage;
    	  }
      }
	   
	   
	   return null;
   }







}