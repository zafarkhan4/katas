package com.techreturners.bowling_game;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BowlingGameTest {

  // Open frames where the score is less than 10
  // Spare - total pins - 10
  // going to get bonus 
  // Strike - 10 pins down in first attempt
  // bonus - points accumulated in two throw
  // when i have combinations of strike, opengames and spare

  @Test
  public void checkGetScoreWithAllZeroThrows() {

    String game = "00 00 00 00 00 00 00 00 00 00"; // -
    int expectedFrameScore = 0;
    BowlingGame bowlingGame = new BowlingGame(game);

    assertEquals(expectedFrameScore, bowlingGame.getScore());

  }

  @Test
  public void checkFrameScoreForFrameWithOpenFrames() {
    String game = "9- 9- 9- 9- 9- 9- 9- 9- 9- 9-";
    int expectedFrameScore = 90;
    BowlingGame bowlingGame = new BowlingGame(game);

    assertEquals(expectedFrameScore, bowlingGame.getScore());
  }

  @Test
  public void checkFrameScoreForFrameWithSpare() {
    String game = "5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5";
    int expectedFrameScore = 150;
    BowlingGame bowlingGame = new BowlingGame(game);

    assertEquals(expectedFrameScore, bowlingGame.getScore());
  }

  @Test
  public void checkFrameForSpareWithMiss() {
    String game = "5/ -5 00 00 00 00 00 00 00 00";
    int expectedFrameScore = 15;

    BowlingGame bowlingGame = new BowlingGame(game);

    assertEquals(expectedFrameScore, bowlingGame.getScore());
  }

  @Test
  public void checkFrameForStrike() {
    String game = "X 00 00 00 00 00 00 00 00 00 ";
    int expectedScore = 10;

    BowlingGame bowlingGame = new BowlingGame(game);

    assertEquals(expectedScore, bowlingGame.getScore());
  }


  // @Test
  // public void checkFrameForSpareWithFirstThrowValueIsMiss() {

  //   String game = "5/ -5 00 00 00 00 00 00 00 00";
  //   int expectedFrameScore = 15;
  //   BowlingGame bowlingGame = new BowlingGame(game);

  //   assertEquals(expectedFrameScore, bowlingGame.getScore());

  // }

  // @Test
  // public void checkFrameForSpareWithFirstThrowValueIsStrike() {

  //   String game = "5/ X 00 00 00 00 00 00 00 00";
  //   int expectedFrameScore = 35;
  //   BowlingGame bowlingGame = new BowlingGame(game);

  //   assertEquals(expectedFrameScore, bowlingGame.getScore());

  // }




}
