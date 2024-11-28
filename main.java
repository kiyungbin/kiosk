package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Burgers 메뉴 초기화
        Menu burgers = new Menu("Burgers");
        burgers.addMenuItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.addMenuItem(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Drinks 메뉴 초기화
        Menu drinks = new Menu("Drinks");
        drinks.addMenuItem(new MenuItem("Coke", 2.0, "시원한 코카콜라"));
        drinks.addMenuItem(new MenuItem("Sprite", 2.0, "상쾌한 스프라이트"));
        drinks.addMenuItem(new MenuItem("Water", 1.5, "깨끗한 생수"));

        // Desserts 메뉴 초기화
        Menu desserts = new Menu("Desserts");
        desserts.addMenuItem(new MenuItem("Ice Cream", 3.5, "바닐라 아이스크림"));
        desserts.addMenuItem(new MenuItem("Brownie", 4.0, "진한 초콜릿 브라우니"));

        // 전체 메뉴 추가
        List<Menu> allMenus = new ArrayList<>();
        allMenus.add(burgers);
        allMenus.add(drinks);
        allMenus.add(desserts);

        // Kiosk 실행
        Kiosk kiosk = new Kiosk(allMenus);
        kiosk.start();
    }
}
