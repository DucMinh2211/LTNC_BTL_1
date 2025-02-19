
import jdk.jshell.execution.Util;

public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        if (Utility.isSquare(Battle.GROUND)) {
            return getBaseHP()*2.0;
        }
        if (this.getWp() == 1) return getBaseHP();
        return baseHP / 10.0;
    }
}
