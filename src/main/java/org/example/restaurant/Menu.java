package org.example.restaurant;

import java.util.List;

public class Menu {
    private final List<MenuItem> menItems;

    public Menu(List<MenuItem> menuItems) {
        this.menItems = menuItems;

    }

    public MenuItem choose(String name) {
        return this.menItems.stream()
                .filter(menuItem -> menuItem.matches(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("잘못된 메뉴 이름 입니다."));
    }

}
