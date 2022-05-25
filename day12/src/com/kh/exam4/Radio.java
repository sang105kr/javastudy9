package com.kh.exam4;

public class Radio implements HomeAppliances {
  @Override
  public void on() {
    System.out.println("라디오를 켜다");
  }

  @Override
  public void off() {
    System.out.println("라디오를 끄다");
  }

  @Override
  public void listenVoice() {
    System.out.println("라디오에서 음성 인식하다.");
  }

}
