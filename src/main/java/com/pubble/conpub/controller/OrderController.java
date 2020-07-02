package com.pubble.conpub.controller;

import com.pubble.conpub.domain.Order;
import com.pubble.conpub.service.MileageService;
import com.pubble.conpub.service.OrderService;
import com.pubble.conpub.service.SelectedOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {

    private OrderService orderService;
    @Autowired
    private MileageService mileageService;
    private SelectedOptionService selectedOptionService;

}

