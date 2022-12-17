package menu.step;

import menu.common.Logger;
import menu.controller.MenuRecommendController;
import menu.view.OutputView;

public class RecommendStartStep extends MenuRecommendApplicationStep{

    public RecommendStartStep(MenuRecommendController controller, Logger logger) {
        super(controller, logger);
    }

    @Override
    protected Step pureAction() {
        OutputView.printRecommendStart();
        return new Exit(controller, logger);
    }

    @Override
    public boolean executable() {
        return true;
    }
}
