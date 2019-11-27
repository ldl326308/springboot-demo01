package com.lm.springbootdemo01.conditional;

/**
 * Linux下创建的Bean
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
