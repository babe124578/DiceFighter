package oppoent;

import interfaceGame.IOpponent;

public abstract class Villager implements IOpponent {
	protected static final int MAXHP = 20;
	protected int hp;
	protected int attack;
	protected int defense;
	protected int evade;

	public Villager(int maxHp, int hp, int attack, int defense, int evade) {
		super();
		this.hp = MAXHP;
		this.attack = attack;
		this.defense = defense;
		this.evade = evade;
	}

	@Override
	public void setHp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getHp() {
		// TODO Auto-generated method stub

	}


	@Override
	public boolean isDead() {
		if (this.hp <=0){
			return true;
		}
		return false;

	}

}
