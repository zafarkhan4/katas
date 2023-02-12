package com.techreturners.bowling_game;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

  private static final String MISS = "-";
  private static final String STRIKE = "X";
  private static final String SPARE = "/";
  private List<Frame> frames;

  public BowlingGame(String game) {
    this.frames = createFrames(game);
  }

  private List<Frame> createFrames(String game) {
    int frameNumber = 0;
    Frame frame = null;
    List<Frame> frameList = new ArrayList<>();
    String [] frames = game.split(" ");

    for(int i=0; i<10; i++) {
      if(frames[i].contains(STRIKE)) {
        frame = new StrikeFrame(frames[i+1], frames[i+2]);

      } else if(frames[i].contains(SPARE)) {
        frame = new SpareFrame(frames[i+1]);
      } else {
        frame = new OpenFrame(frameNumber, frames[i]);
      }

      frameList.add(frame);
    }

    return frameList;
  }

  public int getScore() {
    int gameScore = 0;

    for(Frame frame:frames) {
      gameScore += frame.getScore();
    }
    
    return gameScore;
  }



}
