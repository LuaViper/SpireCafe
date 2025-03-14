package spireCafe.interactables.patrons.missingno;

import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.common.DrawCardAction;
import com.megacrit.cardcrawl.actions.utility.WaitAction;
import spireCafe.actions.MoveCardToDeckAction;

import static spireCafe.util.Wiz.att;

public class DribbleCardAction extends AbstractGameAction {

    @Override
    public void update() {
        if(!DrawCardAction.drawnCards.isEmpty()) {
            att(new MoveCardToDeckAction(DrawCardAction.drawnCards.get(0)));
            att(new WaitAction(.1f));
            att(new WaitAction(.1f));
            att(new WaitAction(.1f));
            att(new WaitAction(.1f));
        }
        this.isDone = true;
    }
}
