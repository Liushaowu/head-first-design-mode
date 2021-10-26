package com.design.mode.proxy.remote;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/26 18:13
 * @description 图片代理
 */
public class ImageProxy implements Icon {
    ImageIcon icon;
    URL url;
    Thread retrievalThread;
    boolean retrieving;

    public ImageProxy(URL url) {
        this.url = url;
    }

    /**
     * Draw the icon at the specified location.  Icon implementations
     * may use the Component argument to get properties useful for
     * painting, e.g. the foreground or background color.
     *
     * @param c
     * @param g
     * @param x
     * @param y
     */
    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (icon != null) {
            icon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover , please wait ......", x + 300, y + 190);
            if (!retrieving) {
                retrieving = true;
                retrievalThread = new Thread(() -> {
                    icon = new ImageIcon(url, "CD Cover");
                    c.repaint();
                });
                retrievalThread.start();
            }
        }
    }

    /**
     * Returns the icon's width.
     *
     * @return an int specifying the fixed width of the icon.
     */
    @Override
    public int getIconWidth() {
        if (icon != null) {
            return icon.getIconWidth();
        }
        return 800;
    }

    /**
     * Returns the icon's height.
     *
     * @return an int specifying the fixed height of the icon.
     */
    @Override
    public int getIconHeight() {
        if (icon != null) {
            return icon.getIconHeight();
        }
        return 600;
    }
}
