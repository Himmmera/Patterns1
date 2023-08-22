package ru.netology.delivery.test;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class DeliveryTest {
    private static Faker faker;


    @BeforeEach
    void setup() {
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1800x1200";
        open("http://localhost:9999/");
    }
}
