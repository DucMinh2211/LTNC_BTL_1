public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        double combatScore;
        int hp = this.getBaseHp();
        
        if (Utility.isPrime(Battle.GROUND)) {
            combatScore = hp * 2.0;
        }
        else if (this.getWp() == 1) combatScore = hp;
        else combatScore = hp / 10.0;

        if (combatScore > 999) return 999;
		return combatScore;
    }
}
