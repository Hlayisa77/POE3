/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe3 ;
/**
 *
 * @author Student
 */
public class Registration {
    String userName;
    String passWord;
    String cellPhone;

    public boolean checkUserName(String username) { // start of username method
        return username.contains("_") &&
                username.length() <= 5;
    } //end of username method

    public boolean checkPasswordComplexity(String password) { //start of password method
        return password.length() >= 8
                && password.matches(".*[A-Z].*")
                && password.matches(".*[a-z].*")
                && password.matches(".*\\d.*")
                && password.matches(".*[^a-zA-Z0-9].*");
    } // end of password method

    public boolean checkCellPhoneNumber(String cellphone) { //start of cellphone method
        return cellphone.matches("^\\+27[0-9]{9}$")
                || cellphone.matches("^0[0-9]{9}$");
    } //end of cellphone method

    public String registerUser(String username,
            String password,
            String cellphone) {

        if (checkUserName(username) &&
                checkPasswordComplexity(password) &&
                checkCellPhoneNumber(cellphone)) {

            this.userName = username;
            this.passWord = password;
            this.cellPhone = cellphone;

            return "Registration was a success";
        } else {
            return "Registration was unsuccessfull";
        }
    }

    public boolean registerStatus(String username, String password, String cellphone) {
        return checkUserName(username) &&
                checkPasswordComplexity(password) &&
                checkCellPhoneNumber(cellphone);
    }
            public boolean loginUser(String username, String password) {
        return username.equals(this.userName)
                && password.equals(this.passWord);
    }

    public String returnLoginStatus(boolean status) {
        if (status) {
            return "Welcome " + this.userName + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
        
    }
