package kiosk;

import java.util.Scanner;

public class HamburgerMenu {
    Scanner sc = new Scanner(System.in);

    public void chooseHamburgerMenu() {
        System.out.print("=====햄버거 메뉴=====\n\n" + "1. 와퍼 (6900원)\n" + "2. 큐브 스테이크 와퍼 (8900원)\n" + "3. 콰트로 치즈 와퍼 (7900원)\n" + "4. 몬스터 와퍼 (9300원)\n" + "5. 통새우 와퍼 (7900원)\n" + "6. 블랙바베큐 와퍼 (9300원)\n" + "\n" + "메뉴선택 (0을 선택 시 홈으로): ");
        int option = sc.nextInt();
        burgerOption(option);
    }

    public void burgerOption(int n) {
        kiosk.KioskMenu kiosk = new KioskMenu();
        if (n >= 1 && n <= 6) {
            kiosk.Basket addBurger = new Basket();
            addBurger.hambergerAdd(n);
            System.out.println("햄버거가 장바구니 안에 담겼습니다.");
            kiosk.chooseKioskMenu();
        } else if (n == 0) {
            kiosk.chooseKioskMenu();
        } else {
            throw new IllegalArgumentException("햄버거 메뉴는 1~6 중 하나를 골라야 합니다.");
        }
    }

    public int calculateBurgerPrice(int burgerNo) {
        int b = 0;
        if (burgerNo == 1) {
            b = 6900;
        } else if (burgerNo == 2) {
            b = 8900;
        } else if (burgerNo == 3) {
            b = 7900;
        } else if (burgerNo == 4) {
            b = 9300;
        } else if (burgerNo == 5) {
            b = 7900;
        } else if (burgerNo == 6) {
            b = 9300;
        }
        return b;
    }

    public String returnBurgerName(int n) {
        n += 1;
        String burgerName = "";
        if (n == 1) {
            burgerName = "와퍼";
        } else if (n == 2) {
            burgerName = "큐브 스테이크 와퍼";
        } else if (n == 3) {
            burgerName = "콰트로 치즈 와퍼";
        } else if (n == 4) {
            burgerName = "몬스터 와퍼";
        } else if (n == 5) {
            burgerName = "통새우 와퍼";
        } else if (n == 6) {
            burgerName = "블랙바베큐 와퍼";
        }
        return burgerName;
    }
}
