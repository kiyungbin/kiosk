package com.example.kiosk;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus; // 전체 메뉴 카테고리를 관리

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    // Getter
    public List<Menu> getMenus() {
        return menus;
    }

    // Setter
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 메인 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
            }
            System.out.println("0. 종료      | 종료");

            // 사용자 입력
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            // 종료 조건
            if (input.equals("0")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 입력 처리
            try {
                int choice = Integer.parseInt(input);
                if (choice > 0 && choice <= menus.size()) {
                    Menu selectedMenu = menus.get(choice - 1);
                    handleMenuSelection(scanner, selectedMenu);
                } else {
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }

        scanner.close();
    }

    private void handleMenuSelection(Scanner scanner, Menu selectedMenu) {
        while (true) {
            // 선택된 카테고리 메뉴 출력
            selectedMenu.displayMenuItems();

            // 사용자 입력
            System.out.print("메뉴를 선택하세요: ");
            String input = scanner.nextLine();

            // 뒤로가기 조건
            if (input.equals("0")) {
                System.out.println("메인 메뉴로 돌아갑니다.\n");
                break;
            }

            // 입력 처리
            try {
                int choice = Integer.parseInt(input);
                List<MenuItem> items = selectedMenu.getMenuItems();
                if (choice > 0 && choice <= items.size()) {
                    MenuItem selectedItem = items.get(choice - 1);
                    System.out.printf("선택한 메뉴: %s | W %.1f | %s\n\n",
                            selectedItem.getName(), selectedItem.getPrice(), selectedItem.getPriceInfo());

                    return; // handleMenuSelection 메서드 종료
                } else {
                    System.out.println("유효하지 않은 선택입니다. 다시 입력해주세요.\n");
                }
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.\n");
            }
        }
    }
}
