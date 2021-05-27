package com.example.springdemo.calculator;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MyController {

    private final String sharedKey = "SHARED_KEY";

    protected static final String SUCCESS_STATUS = "SUCCESS";
    protected static final String FAIL_STATUS = "FAIL";

    protected static final int SUCCESS_CODE = 100;
    protected static final int FAIL_CODE = 102;

    @GetMapping
    private MyResponse showCode(){
        return new MyResponse(SUCCESS_CODE,SUCCESS_STATUS, 200d);
    }

    @PostMapping("/calculation")
    private MyResponse calculation(@RequestParam(value = "key") String key,
                                   @RequestBody MyRequest request){
        final MyResponse response;

        if(sharedKey.equalsIgnoreCase(key)){
            double result =0d;
            Double val1 = request.getValue1();
            Double val2 = request.getValue2();
            char operator = request.getOperation();
            switch (operator){
                case '+':{
                    result=val1+val2;break;
                }
                case '-':{
                    result=val1-val2;break;
                }
                 case '*':{
                    result=val1*val2;break;
                }
                 case '/':{
                    result=val1/val2;break;
                }
                 case '%':{
                    result=val1%val2;break;
                }

            }

            response= new MyResponse(SUCCESS_CODE,SUCCESS_STATUS, result);
        }else
        {
            response= new MyResponse(FAIL_CODE,FAIL_STATUS);
        }

        return response;
    }




}
