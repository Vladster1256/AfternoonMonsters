package monster.controller;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView appView;
	private MarshmallowMonster myMonster;
	public MonsterAppController()
	{
		appView = new MonsterView(this);
		myMonster = new MarshmallowMonster("John Stewart Wells", 4.0, 5.0, 2, 10, 0, true);
	}
	
	public void start()
	{
		appView.displayInformation();
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
}
