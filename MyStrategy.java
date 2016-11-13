import model.*;

public final class MyStrategy implements Strategy {
    @Override
    public void move(Wizard self, World world, Game game, Move move) {
        move.setSpeed(game.getWizardForwardSpeed());
		double speed = Math.random();
        move.setStrafeSpeed(2 * (speed - 0.5) * game.getWizardStrafeSpeed());
        if (Math.random() > 0.5)
		{
			double angle = Math.random();
			move.setTurn(2 * (angle - 0.5) * game.getWizardMaxTurnAngle());
		}
        move.setAction(ActionType.MAGIC_MISSILE);
    }
}
