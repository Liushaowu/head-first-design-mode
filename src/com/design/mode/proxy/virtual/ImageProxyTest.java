package com.design.mode.proxy.virtual;


import javax.swing.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/26 18:20
 * @description 图像代理
 */
public class ImageProxyTest {
    JFrame frame = new JFrame("CD Cover viewer");
    ImageComponent component;
    JMenuBar menuBar;
    JMenu menu;
    Hashtable cds = new Hashtable();

    public ImageProxyTest() throws Exception {
        URL url = new URL("https://c-ssl.duitang.com/uploads/item/201804/04/20180404233443_M28PG.jpeg");
        Icon icon = new ImageProxy(url);
        component = new ImageComponent(icon);
        cds.put("美女", "https://c-ssl.duitang.com/uploads/item/201804/04/20180404233443_M28PG.jpeg");
        cds.put("机车", "http://qqpublic.qpic.cn/qq_public/0/0-2252430890-A46396CD50ACE6271D9F51D3ADEF6B1A/0?fmt=jpg&size=99&h=600&w=900&ppv=1.jpg");
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDS");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        for (Enumeration e = cds.keys(); e.hasMoreElements();) {
            String name = (String) e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(e1 -> {
                component.setIcon(new ImageProxy(getCDUrl(e1.getActionCommand())));
                frame.repaint();
            });
        }
        frame.getContentPane().add(component);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        ImageProxyTest imageProxyTest = new ImageProxyTest();
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String) cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
