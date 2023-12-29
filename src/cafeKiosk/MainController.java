package cafeKiosk;

import cafeKiosk.service.CustomerService;
import cafeKiosk.service.ManagerService;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerService customerService = new CustomerService();
        ManagerService managerService = new ManagerService();
        boolean run = true;
        int selectNo = 0;

        while (run) {
            boolean run2 = true;
            System.out.println("====== 백곰카페 ======");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.println("1.All | 2.Coffee | 3.Tea | 4.Dessert | 5.Search | 6.basket | 7.Manager | 0.Quit");
            System.out.println("-----------------------------------------------------------------------------------------");
            System.out.print("선택> ");
            selectNo = sc.nextInt();
            if (selectNo == 1) {
                System.out.println("====== 전체 메뉴 ======");

            } else if (selectNo == 2) {
                System.out.println("====== Coffee ======");

            } else if (selectNo == 3) {
                System.out.println("====== Tea ======");

            } else if (selectNo == 4) {
                System.out.println("====== Dessert ======");

            } else if (selectNo == 5) {
                System.out.println("====== Search ======");

            } else if (selectNo == 6) {
                System.out.println("====== Basket ======");

            } else if (selectNo == 7) {
                while (run2) {
                    System.out.println("====== 관리자 메뉴 ======");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.println("1.로그인 | 2.메뉴추가 | 3.메뉴수정 | 4.메뉴삭제 | 5.로그아웃 | 6.회원가입 | 0.메인메뉴");
                    System.out.println("-----------------------------------------------------------------------------------------");
                    System.out.print("선택> ");
                    selectNo = sc.nextInt();
                    if (selectNo == 1) {
                        System.out.println("====== 로그인 ======");

                    } else if (selectNo == 2) {
                        System.out.println("====== 메뉴추가 ======");

                    } else if (selectNo == 3) {
                        System.out.println("====== 메뉴수정 ======");

                    } else if (selectNo == 4) {
                        System.out.println("====== 메뉴삭제 ======");

                    } else if (selectNo == 5) {
                        System.out.println("====== 로그아웃 ======");

                    } else if (selectNo == 6) {
                        System.out.println("====== 회원가입 ======");

                    } else if (selectNo == 0) {
                        System.out.println("메인 메뉴로 돌아갑니다.");
                        run2 = false;
                    }
                }

            } else if (selectNo == 0) {
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}
