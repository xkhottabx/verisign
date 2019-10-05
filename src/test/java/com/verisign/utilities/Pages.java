package com.verisign.utilities;


import com.verisign.pages.HomePage;

public class Pages {

    private HomePage homePage;

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }

}
