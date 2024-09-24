import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HeroFactoryTest
{

	String jobA;
	String jobB;
	String jobC;
	String raceA;
	String raceB;
	String raceC;
	String raceD;
	int val;
	
	
	@BeforeEach
	void setUp() throws Exception
	{
		jobA = "ARCHER";
		jobB = "MAGE";
		jobC = "WARRIOR";
		raceA = "ELF";
		raceB = "DWARF";
		raceC = "ROBOT";
		val = 5;
	}
	
	
	@Test
	void createHeroTest()   
	{
		HeroInterface elvenArcher = HeroFactory.createHero(raceA, jobA);
		assertEquals(elvenArcher.getRaceName(), raceA);
		assertEquals(elvenArcher.getJobName(), jobA);
		assertEquals(elvenArcher.getDEX(), 25);
		assertEquals(elvenArcher.getINT(), 20);
		assertEquals(elvenArcher.getSTR(), 20);
		assertEquals(elvenArcher.attack(val), 187);
		
		HeroInterface elvenMage = HeroFactory.createHero(raceA, jobB);
		assertEquals(elvenMage.getRaceName(), raceA);
		assertEquals(elvenMage.getJobName(), jobB);
		assertEquals(elvenMage.getDEX(), 25);
		assertEquals(elvenMage.getINT(), 20);
		assertEquals(elvenMage.getSTR(), 20);
		assertEquals(elvenMage.attack(val), 125);
		
		HeroInterface elvenWarrior = HeroFactory.createHero(raceA, jobC);
		assertEquals(elvenWarrior.getRaceName(), raceA);
		assertEquals(elvenWarrior.getJobName(), jobC);
		assertEquals(elvenWarrior.getDEX(), 25);
		assertEquals(elvenWarrior.getINT(), 20);
		assertEquals(elvenWarrior.getSTR(), 20);
		assertEquals(elvenWarrior.attack(val), 125);
		
		
		HeroInterface dwarfArcher = HeroFactory.createHero(raceB, jobA);
		assertEquals(dwarfArcher.getRaceName(), raceB);
		assertEquals(dwarfArcher.getJobName(), jobA);
		assertEquals(dwarfArcher.getDEX(), 20);
		assertEquals(dwarfArcher.getINT(), 20);
		assertEquals(dwarfArcher.getSTR(), 25);
		assertEquals(dwarfArcher.attack(val), 150);
		
		HeroInterface dwarfMage = HeroFactory.createHero(raceB, jobB);
		assertEquals(dwarfMage.getRaceName(), raceB);
		assertEquals(dwarfMage.getJobName(), jobB);
		assertEquals(dwarfMage.getDEX(), 20);
		assertEquals(dwarfMage.getINT(), 20);
		assertEquals(dwarfMage.getSTR(), 25);
		assertEquals(dwarfMage.attack(val), 120);
		
		HeroInterface dwarfWarrior = HeroFactory.createHero(raceB, jobC);
		assertEquals(dwarfWarrior.getRaceName(), raceB);
		assertEquals(dwarfWarrior.getJobName(), jobC);
		assertEquals(dwarfWarrior.getDEX(), 20);
		assertEquals(dwarfWarrior.getINT(), 20);
		assertEquals(dwarfWarrior.getSTR(), 25);
		assertEquals(dwarfWarrior.attack(val), 145);
		
		HeroInterface robotArcher = HeroFactory.createHero(raceC, jobA);
		assertEquals(robotArcher.getRaceName(), raceC);
		assertEquals(robotArcher.getJobName(), jobA);
		assertEquals(robotArcher.getDEX(), 20);
		assertEquals(robotArcher.getINT(), 25);
		assertEquals(robotArcher.getSTR(), 20);
		assertEquals(robotArcher.attack(val), 150);

		HeroInterface robotMage = HeroFactory.createHero(raceC, jobB);
		assertEquals(robotMage.getRaceName(), raceC);
		assertEquals(robotMage.getJobName(), jobB);
		assertEquals(robotMage.getDEX(), 20);
		assertEquals(robotMage.getINT(), 25);
		assertEquals(robotMage.getSTR(), 20);
		assertEquals(robotMage.attack(val), 145);

		HeroInterface robotWarrior = HeroFactory.createHero(raceC, jobC);
		assertEquals(robotWarrior.getRaceName(), raceC);
		assertEquals(robotWarrior.getJobName(), jobC);
		assertEquals(robotWarrior.getDEX(), 20);
		assertEquals(robotWarrior.getINT(), 25);
		assertEquals(robotWarrior.getSTR(), 20);
		assertEquals(robotWarrior.attack(val), 120);
		
		assertNull(HeroFactory.createHero("WRONG", "ELF"));
		assertNull(HeroFactory.createHero("ROBOT", "WRONG"));
		///HeroInterface badInput = HeroFactory.createHero("elf", "warrior");
		//assertNull(badInput.getRaceName()); 
	//	assertNull(badInput.getJobName()); 
		
		
		
		
	}
	

}
