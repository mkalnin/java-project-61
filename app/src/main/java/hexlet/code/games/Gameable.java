package hexlet.code.games;

import hexlet.code.GameEngine;

public interface Gameable {
    GameEngine GAME_ENGINE = new GameEngine();
    String getGameTitle();
    default void play() {
        GAME_ENGINE.game(this);
    };
    void gameProcess() throws RuntimeException;
}
