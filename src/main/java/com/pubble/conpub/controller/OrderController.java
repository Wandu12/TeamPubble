package com.pubble.conpub.controller;

import com.pubble.conpub.service.MileageService;
import com.pubble.conpub.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private MileageService mileageService;

    @GetMapping({"/mypage", "/shoppingInfo"})
    public String mypage(Model model, @RequestParam("id") String id) { //
        //필요한 처리

        //'ORDERS 테이블의 해당 컬럼들을 받아옴

        return "mypage/myShoppingInfo";
    }
}

