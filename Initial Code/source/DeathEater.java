public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);
	}

	@Override
	public double getCombatScore() {
		Complex mana = this.getMana();
		double combatScore = mana.getMagnitude();
		if (combatScore > 999) return 999;
		return combatScore;
	}
}
