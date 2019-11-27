package com.lm.springbootdemo01.conditional;

/**
 * Windows下创建的Bean
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
