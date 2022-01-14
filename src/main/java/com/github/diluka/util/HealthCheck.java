package com.github.diluka.util;

import java.net.HttpURLConnection;
import java.net.URL;

public class HealthCheck {
    public static void main(String[] args) {
        try {
            HttpURLConnection conn = (HttpURLConnection) new URL(args[0]).openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            int statusCode = conn.getResponseCode();
            if (statusCode != 200) {
                System.exit(1);
            }
        } catch (Exception e) {
            System.exit(1);
        }
    }
}
