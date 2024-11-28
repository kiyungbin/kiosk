package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String categoryName;       // 메뉴 카테고리 이름
    private List<MenuItem> menuItems;  // 해당 카테고리의 메뉴 아이템들

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.menuItems = new ArrayList<>();
    }

    // Getter
    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    // Setter
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // 메뉴 아이템 추가
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    // 메뉴 출력
    public void displayMenuItems() {
        System.out.printf("[ %s MENU ]\n", categoryName);
        for (int i = 0; i < menuItems.size(); i++) {
            MenuItem item = menuItems.get(i);
            System.out.printf("%d. %-15s | W %.1f | %s\n",
                    i + 1, item.getName(), item.getPrice(), item.getPriceInfo());
        }
        System.out.println("0. 뒤로가기");
    }
}
