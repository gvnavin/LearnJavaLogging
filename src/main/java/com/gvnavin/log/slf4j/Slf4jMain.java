package com.gvnavin.log.slf4j;

import org.slf4j.Logger;

//http://javarevisited.blogspot.in/2013/08/why-use-sl4j-over-log4j-for-logging-in.html
public class Slf4jMain {
    public static void main(String[] args) {
    
        // Slf4j
        //private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);
        
        // Slf4j
        Logger log = org.slf4j.LoggerFactory.getLogger(Slf4jMain.class);
        int runtimeInt = 10;
        log.error("NET :: JournalDev :: LEVEL :: NetJournalDevApp ERROR Message ::{}", runtimeInt);
    }
}
