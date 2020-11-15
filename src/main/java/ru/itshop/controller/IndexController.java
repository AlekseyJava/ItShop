package ru.itshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * IndexController.
 *
 * @author lifeandfree
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/first")
    public String getIndex() {
        return "first";
    }
}
