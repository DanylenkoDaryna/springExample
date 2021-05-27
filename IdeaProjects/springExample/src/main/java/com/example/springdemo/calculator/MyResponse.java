package com.example.springdemo.calculator;

public class MyResponse {

   private Integer statusCode;
   private String statusMessage;
   private Double result;


   public MyResponse(int code, String message, double res){
       statusCode=code;
       statusMessage=message;
       result=res;
   }

   public MyResponse(int code, String message){
       statusCode=code;
       statusMessage=message;
       result=0d;
   }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public Double getResult() {
        return result;
    }

}
