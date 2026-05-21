package hexlet.code.games;

import hexlet.code.GameEngine;

public interface Gameable {
    GameEngine GAME_ENGINE = new GameEngine();
    String getGameTitle();
    void play();
    void gameProcess() throws RuntimeException;
}
