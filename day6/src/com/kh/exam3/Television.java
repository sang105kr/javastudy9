package com.kh.exam3;

public class Television {
  //                           상수들
  public static final int MINCHANNEL = 1;    // 가장 작은 채널 번호
  public static final int MAXCHANNEL = 99;   // 가장 큰 채널 번호

  //                        객체 변수들
  private  String BrandName;        // TV의 브랜드명
  private boolean Powered = false;        // TV가 켜져 있는가 꺼져 있는가?
  private int Channel = MINCHANNEL;  // TV의 현재 채널은?
  private int Volume = 0;          // TV의 볼륨

  //                           생성자 메소드들

  // 기본 생성자 메소드
  //    목적: 모든 객체 변수들의 값을 위에 정의된 기본 값으로 정한다
  // @입력 매개변수
  //         없음
  public Television() {
    // 여기에서 아무 것도 하지 않는다
  }

  //                         접근자 메소드
  // 메소드: getChannel
  //   목적: TV의 현재 채널을 반환한다
  // @반환값: TV의 현재 채널
  public int getChannel() {
    return (Channel);
  }

  // 메소드: getBrandName
  //   목적: TV의 getBrandName
  // @반환값: TV의 브랜드명
  public String getBrandName(){
    return this.BrandName;
  }

  // 메소드: getVolume
  //   목적: TV의 볼륨을 반환한다
  // @반환값: TV의 볼륨
  public int getVolume(){
    return this.Volume;
  }

  // 메소드: getPower
  //   목적: TV의 현재 전원 상태를 반환한다
  // @반환값: TV의 현재 전원 상태
  public boolean getPower(){
    return this.Powered;
  }

  // 메소드: toString
  //  목적: 이 객체의 현재 상태를 나타내는 문자열을 반환한다.
  // @반환값: 현 객체의 변수들과 대응하는 값들을 포함하는 문자열
  @Override
  public String toString(){
    String str = "";
    str += "브랜드 : " + this.getBrandName() + "\n";
    str += "파워 : " + this.getPower() + "\n";
    str += "채녈 : " + this.getChannel() + "\n";
    str += "볼륨 : " + this.getVolume() + "\n";
    return str;
  }

  // 변경자 메소드
  // 메소드: setPowered
  //  목적: TV의 전원을 주어진 값으로 변경한다.
  // @입력 매개변수
  //        NewPowered - TV의 새 전원 상태
  // @반환값: 없음
  public void setPowered(boolean NewPowered) {
    Powered = NewPowered;
  }

  // 메소드: setChannel
  //  목적: TV의 채널 번호를 주어진 값으로 변경한다.
  // @입력 매개변수
  //        NewChannel - TV의 새 채널 번호
  // @반환값: 없음
  public void setChannel(int NewChannel){
    this.Channel = NewChannel;
  }

  // 메소드: setBrandName
  //  목적: TV의 브랜드명을 주어진 값으로 변경한다.
  // @입력 매개변수
  //        NewBrandName - TV의 새 브랜드명
  // @반환값: 없음
  public void setBrandName(String NewBrandName){
    this.BrandName = NewBrandName;
  }

  // 메소드: setVolume
  //  목적: TV의 볼륨을 주어진 값으로 변경한다.
  // @입력 매개변수
  //        NewVolume - TV의 새 볼륨
  // @반환값: 없음
  public void setVolume(int NewVolume){
    this.Volume = NewVolume;
  }

  // 메소드: incrementChannel
  //  목적: TV의 채널을 1만큼 증가시킨다. 최대값을 초과하면 최소값으로 변경한다.
  // @입력 매개변수: 없음
  // @반환값: 없음
  public void incrementChannel(){
    if(this.Channel == MAXCHANNEL ) return;
    this.Channel++;
  }

  // 메소드: decrementChannel
  //  목적: TV의 채널을 1만큼 감소시킨다. 최소값보다 작아지면 최대값으로 변경한다.
  // @입력 매개변수: 없음
  // @반환값: 없음
  public void decrementChannel(){
    if(this.Channel == MINCHANNEL ) return;
    this.Channel--;
  }

  // 메소드: incrementVolume
  //  목적: TV의 볼륨을 1만큼 증가시킨다. 최대값을 초과하면 최대값으로 한다.
  // @입력 매개변수: 없음
  // @반환값: 없음
  public void incrementVolume(){
    this.Volume++;
  }

  // 메소드: decrementVolume
  //  목적: TV의 볼륨을 1만큼 감소시킨다. 최소값보다 작아지면 최소값으로 변경한다.
  // @입력 매개변수: 없음
  // @반환값: 없음
  public void decrementVolume(){
    this.Volume--;
  }
}
