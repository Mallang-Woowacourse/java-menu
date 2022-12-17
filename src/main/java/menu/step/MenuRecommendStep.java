package menu.step;

import menu.common.Logger;
import menu.controller.MenuRecommendController;
import menu.domain.Coach;
import menu.domain.WeekRecommends;
import menu.view.OutputView;

import java.util.List;

public class MenuRecommendStep extends MenuRecommendApplicationStep {

    private final List<Coach> coaches;

    public MenuRecommendStep(List<Coach> coaches,
                             MenuRecommendController controller,
                             Logger logger) {
        super(controller, logger);
        this.coaches = coaches;
    }

    @Override
    protected Step pureAction() {
        controller.recommend(coaches);
        OutputView.printRecommendResult(coaches);
        return new Exit(controller, logger);
    }

    @Override
    public boolean executable() {
        return true;
    }
}