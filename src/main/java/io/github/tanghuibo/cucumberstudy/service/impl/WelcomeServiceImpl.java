package io.github.tanghuibo.cucumberstudy.service.impl;

import io.github.tanghuibo.cucumberstudy.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * @author tanghuibo
 * @date 2020/6/6下午11:12
 */
@Service
public class WelcomeServiceImpl implements WelcomeService {

    @Override
    public void sayHello() {
        System.out.println("hello world");
    }
}
