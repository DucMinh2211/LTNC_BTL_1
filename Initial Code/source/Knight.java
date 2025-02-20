public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        int hp = this.getBaseHP();
        if (Utility.isSquare(Battle.GROUND)) {
            return hp * 2.0;
        }
        if (this.getWp() == 1) return hp;
        return hp / 10.0;
    }
}
