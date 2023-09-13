package com.github.seneca.controller;

import com.github.seneca.controller.biz.PolyMallBiz;
import com.github.seneca.request.PolyMallCommonRequest;
import com.github.seneca.response.PolyMallCommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Seneca.vin
 * @date: 2023/9/12 10:29
 * @description: 菠萝派自建商城统一入口
 **/
@RestController
@Slf4j
public class PolyMallController {

    @Autowired
    private PolyMallBiz polyMallBiz;

    @RequestMapping(value = "/poly_mall", method = {RequestMethod.POST}, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public PolyMallCommonResponse test(PolyMallCommonRequest request, HttpServletRequest servletRequest) {
        return polyMallBiz.action(request, servletRequest);
    }

}
