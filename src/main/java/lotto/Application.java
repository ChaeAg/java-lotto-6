package lotto;

import lotto.Controller.LottoController;

public class Application {
    public static void main(String[] args) {
        final LottoController lottoController = new LottoController();
        lottoController.run();
    }
}
