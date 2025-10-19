package ru.aston.hometask.module3.task1.proxy;

import java.util.logging.Logger;

public class RealProject implements Project {
    private static final Logger logger = Logger.getLogger(RealProject.class.getName());
    private String url;


    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        logger.info(String.format("Loading project from %s ...", url));
    }

    @Override
    public void run() {
        logger.info(String.format("Running project %s", url));
    }

}