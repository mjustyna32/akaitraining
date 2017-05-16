package com.cognifide.akaitraining;

import org.apache.jackrabbit.commons.JcrUtils;

import javax.jcr.*;

/**
 * Created by szymon.nowak on 16.05.2017.
 */
public class Examples {

    public static void simpleSave(Session session) throws RepositoryException {
        Node root = session.getRootNode();
        Node hello = root.addNode("hello");
        Node world = hello.addNode("world");
        world.setProperty("message", "hello world");
        session.save();
    }

    public static void simpleRead(Session session) throws RepositoryException {
        Node root = session.getRootNode();
        Node node = root.getNode("hello/world");
        System.out.println(node.getPath());
        System.out.println(node.getProperty("message").getString());
    }

    public static void simpleRemove(Session session) throws RepositoryException {
        Node root = session.getRootNode();
        root.getNode("hello").remove();
    }
}
