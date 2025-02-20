public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (Utility.isPrime(Battle.GROUND)) {
            return this.getBaseHP()*2.0;
        }
        if (this.getWp() == 1) return this.getBaseHP();
        return this.getBaseHP() / 10.0;
    }
}
