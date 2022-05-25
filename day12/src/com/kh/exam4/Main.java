package com.kh.exam4;

public class Main {
  public static void main(String[] args) {
    HomeAppliances h1 = new AirConditioner();
    HomeAppliances h2 = new Radio();

    h1.listenVoice();
    h2.listenVoice();

    HomeAppliances.doInter();
  }
}
