package com.techreturners.bowling_game;

public class OpenFrame implements Frame{

  private String roll1;
  private String roll2;
  private int frameNumber;

  public OpenFrame(int frameNumber, String frameString) {
    this.frameNumber = frameNumber;
    this.roll1 = frameString.substring(0, 1);
    this.roll2 = frameString.substring(1,2);
  }

  public String getRoll1() {
    return roll1;
  }

  public String getRoll2() {
    return roll2;
  }

  public int getFrameNumber() {
    return frameNumber;
  }

  private int getRollScore(String roll) {
    int rollScore = 0;
    try {
      rollScore = Integer.parseInt(roll);
    } catch (NumberFormatException e) {
  
    }
    return rollScore;
  }

  @Override
  public int getScore() {
    return getRollScore(this.roll1) + getRollScore(this.roll2);
  }
  

}
