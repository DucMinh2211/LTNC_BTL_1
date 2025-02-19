public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (this.getWp() == 1) return getBaseHP();
        else return baseHP / 10.0;
        return 1.0;
    }
}
