package com.design.mode.proxy.remote;

import javax.swing.*;
import java.awt.*;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/26 18:37
 * @description 图片组件
 */
public class ImageComponent extends JComponent {
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (800 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }
}
