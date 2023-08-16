package com.example.RegistationLogin.response;

public class LoginResponse {
  String message;
  Boolean success;

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Boolean getStatus() {
    return success;
  }

  public void setStatus(Boolean success) {
    this.success = success;
  }

  public LoginResponse(String message, Boolean success) {
    this.message = message;
    this.success = success;
  }

}
