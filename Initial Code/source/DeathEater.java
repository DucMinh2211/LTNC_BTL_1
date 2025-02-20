public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);
	}

	@Override
	public double getCombatScore() {
		Complex mana = this.getMana();
		return mana.getMagnitude();
	}
}
