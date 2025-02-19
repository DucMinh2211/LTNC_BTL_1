public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (Utility.isPrime(Battle.GROUND)) {
            return getBaseHP()*2.0;
        }
        if (this.getWp() == 1) return getBaseHP();
        return baseHP / 10.0;
    }
}
