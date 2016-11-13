import model.Game;
import model.Move;
import model.Wizard;
import model.World;

/**
 * Created by user on 14.11.2016.
 */
public abstract class Intent
{
	public static final int MIN_ESTIMATE = -10000;
	public static final int MAX_ESTIMATE =  10000;
	/**
	 * This function estimates profits and risks of performing the intent and returns calculated value.
	 * @param self
	 * @param around
	 * @param game
	 * @return an integer in -10K..10K. Greater values mean more profits and less risks of performing the intent.
	 */
	public abstract int estimateProfitsAndRisks(Wizard self, World around, Game game);
	public abstract void perform(Wizard self, World around, Game game, Move mv);
}
