package model.abilities;

public class HealingAbility extends Ability {
	private int healAmount;

	public int getHealAmount() {
		return healAmount;
	}

	public void setHealAmount(int healAmount) {
		this.healAmount = healAmount;
	}

	public HealingAbility(String name, int cost, int baseCooldown,
			int castRange, AreaOfEffect area, int required, int healAmount) {
		super(name, cost, baseCooldown, castRange, area, required);
		this.healAmount = healAmount;
	}


}
