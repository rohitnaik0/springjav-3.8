package com.avaj.springjav38.intro;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Variables {
    public static void main(String[] args) {
        int myFirst = 5;
        System.out.println(myFirst);
        log.info("this is a test logger" );

        myFirst = 10;
        System.out.println(myFirst);

        myFirst = 1000;
        System.out.println(myFirst);

    }
}
