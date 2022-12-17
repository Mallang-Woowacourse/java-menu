package menu.controller;

import menu.domain.Coach;
import menu.domain.Group;
import menu.usecase.MenuRecommendUseCase;

import java.util.List;

public class MenuRecommendController {

    private final MenuRecommendUseCase menuRecommendUseCase;

    public MenuRecommendController(MenuRecommendUseCase menuRecommendUseCase) {
        this.menuRecommendUseCase = menuRecommendUseCase;
    }

    /**
     * 메뉴 추천
     */
    public Group recommend(List<Coach> coaches) {
        return menuRecommendUseCase.command(
                new MenuRecommendUseCase.Command(coaches));
    }
}
