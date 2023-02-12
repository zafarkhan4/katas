package com.techreturners.bowling_game;

public class SpareFrame implements Frame {

  private String nextFrame;

  public SpareFrame(String nextFrame) {
    this.nextFrame = nextFrame;
  }

  private int getNextThrowScore() {
    String fristThrow = nextFrame.substring(0, 1);

    if(fristThrow.equalsIgnoreCase("-")) {
      return 0;
    }
  
    return Integer.parseInt(fristThrow);
  }

  @Override
  public int getScore() {
    return 10 + getNextThrowScore();
  }

}
