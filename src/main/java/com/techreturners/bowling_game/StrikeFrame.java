package com.techreturners.bowling_game;

public class StrikeFrame implements Frame {

  private String firstFrame;
  private String secondFrame;

  public StrikeFrame(String firstFrame, String secondFrame) {
    this.firstFrame = firstFrame;
    this.secondFrame = secondFrame;
  }

  @Override
  public int getScore() {
    
    return 10 + getBonusScore();
  }

  private int getBonusScore() {
    String firstThrow = this.firstFrame.substring(0,1);
    String secondThrow = this.secondFrame.substring(1,2);
    return Integer.parseInt(firstThrow) + Integer.parseInt(secondThrow);
  }

}
