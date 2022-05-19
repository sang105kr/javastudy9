package com.kh.exam1;

// �ǽ����� 8.3: ConcertDriver.java
// �ܼ�Ʈ Ŭ������ �����Ѵ�

import java.util.Scanner;

public class ConcertDriver {
  public static void main(String[] args) {
    // ������ �̸��� �������ա��̰� ���� ����� ���� �ο��� 100���̰�
    // ���ͳ� Ƽ�� ������ 10,000���̰� ���� Ƽ�� ������ 20,000����
    // Concert ��ü�� �����

    Concert concert = new Concert("������", 100, 10_000, 20_000);

    System.out.println("�ܼ�Ʈ �Ǹ� ���α׷��� �����մϴ�");

    Scanner reader = new Scanner(System.in);

    boolean done = false;

    // Ƽ�� �ǸŰ� ����� ������ Ƽ���� �Ǵ�
    while (!done) {
      // Ƽ�� �Ǹ� ����� �Է¹޴´�
      if (concert.webSalesOnly())
        System.out.print("\n���ͳ� �Ǹ��̸� S, ���� �Ǹŷ� �ٲٷ��� V, �ǸŸ� �����Ϸ��� F�� �Է��ϼ���: ");
      else
        System.out.print("\n���� �Ǹ��̸� S, �ǸŸ� �����Ϸ��� F�� �Է��ϼ���: ");

      String response = reader.next();

      // Ƽ�� �Ǹ� ����� ���� Ƽ���� �Ǵ�
      // �Ǹ� ���Ḧ ���ϸ� �ǸŸ� �����ϰ� �����
      // ���ͳ� �Ǹ��̸� Ƽ���� ���ͳ� �������� �Ǵ�
      // ���� �Ǹŷ� �ٲٱ⸦ ���ϸ� Ƽ���� ���� �������� �Ǵ�
      // Ƽ�� �Ǹ� ����� Ʋ���� �ԷµǸ� ���� �޽����� ����Ѵ�.

      switch (response) {
        case "S":
          concert.doTicketSale();
          break;
        case "V":
          concert.webSalesOver(); //���ͳ� �Ǹ����� ���·� ��ȯ
          break;
        case "F":
          done = true;
          break;
        default:
          System.out.println("�߸� �����߽��ϴ�!");
      }

      // �Ǹ� �� ���� Ƽ�ϵ��� ���� ����Ѵ�,
      System.out.println("���� Ƽ�ϵ��� �� : " + concert.getTicketsLeft());
    }

    // �ȸ� Ƽ�� ���� �� �Ǹ� �ݾ��� ����Ѵ�
    System.out.println("<< �� �Ǹ� ���� >>");
    System.out.println(concert.getSalesReport());
  }
}
