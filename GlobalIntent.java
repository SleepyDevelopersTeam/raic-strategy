import model.Game;
import model.Move;
import model.Wizard;
import model.World;

/**
 * Created by user on 14.11.2016.
 */
public abstract class GlobalIntent extends Intent
{
	protected InstantIntent[] consequences;

	@Override
	public void perform(Wizard self, World around, Game game, Move mv)
	{
		if (consequences.length < 1) return;
		int max = consequences[0].estimateProfitsAndRisks(self, around, game);
		int imax = 0;
		for (int i = 1; i < consequences.length; i++)
		{
			int profits = consequences[i].estimateProfitsAndRisks(self, around, game);
			if (profits > max)
			{
				imax = i;
				max = profits;
			}
		}
		consequences[imax].perform(self, around, game, mv);
	}
}
