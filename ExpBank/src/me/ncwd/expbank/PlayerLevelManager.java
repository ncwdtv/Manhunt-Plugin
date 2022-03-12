package me.ncwd.expbank;

public class PlayerLevelManager {
	private int xp;
	
	public PlayerLevelManager(int xp) {
		this.xp = xp;
	}
	public void setXp(int xp) {
		this.xp = xp;
	}
	public void lowerXp(int xp) {
		this.xp-=xp;
	}
	public int getXp() {
		return xp;
	}
}
