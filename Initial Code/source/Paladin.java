public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		int hp = this.getBaseHp();
		int fiboIdxOfHp = Utility.getFibonacciIndex((int)hp);
		if (fiboIdxOfHp > 2) return 1000 + fiboIdxOfHp;
		return hp * 3.0;
	}
}
