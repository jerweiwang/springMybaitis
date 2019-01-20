package com.busiDemo;/**
 * first
 *
 * @author why
 * @create 2019-01-13 16:56
 **/

import org.springframework.web.bind.annotation.RestController;

/**
 * first
 * @author why
 * @create 2019-01-13 16:56
 **/
@RestController
public class firstContoller {

    @RequestMapping("/hello")
    public String getFirstRest(){
        System.out.print("this is first controller");
        return "helloWord";
    }

    public String getSecondWorkSpace(){
        System.out.print("this is personal second work space");
        return "second work spece";
    }

}
