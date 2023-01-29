package org.example.restaurant;

import org.example.restaurant.Cook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class CookTest {

    @DisplayName("요리를 생성한다.")
    @Test
    void createTest() {
        assertThatCode(() -> new Cook("만두", 5000))
                .doesNotThrowAnyException();
    }

}