package com.company.Homework719;

public class User {

    //region Properties

    private String username;
    private String password;
    private String role;

    //endregion

    //region Constructors

    public User() {
    }

    public User(String username, String role) {
        this.username = username;
        this.role = role;
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    //endregion

    //region Public Methods

    public boolean settingPasswordLength(String password) {
        return password.length() >= 5;
    }

    public boolean settingUppercaseCondition(String password) {

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int quantity = 0;

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < uppercase.length(); j++) {
                if (password.charAt(i) == uppercase.charAt(j)) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity >= 1;
    }

    public boolean setting3NumberCondition(String password) {

        String numbers = "0123456789";
        int quantity = 0;

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (password.charAt(i) == numbers.charAt(j)) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity >= 3;
    }

    public boolean settingCharacterCondition(String password) {

        String characters = "#!%";
        int quantity = 0;

        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < characters.length(); j++) {
                if (password.charAt(i) == characters.charAt(j)) {
                    quantity++;
                    break;
                }
            }
        }
        return quantity >= 1;
    }

    public boolean checkingValidation(String password) {

        if (settingPasswordLength(password) && settingUppercaseCondition(password) && setting3NumberCondition(password) && settingCharacterCondition(password)) {
            return true;
        }
        return false;
    }

    //endregion

    //region Getters and Setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (checkingValidation(password)) {
            this.password = password;
        } else {
            System.out.println("The password is not valid.");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    //endregion

}
