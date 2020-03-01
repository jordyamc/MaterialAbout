package com.vansuita.materialabout.builder;

import android.graphics.Bitmap;
import android.view.View;

public class ItemRes extends Item {

    private int icon;

    public int getIconRes() {
        return icon;
    }

    public void setIconRes(int icon) {
        this.icon = icon;
    }

    public ItemRes(int icon, String label, View.OnClickListener onClick) {
        super(null, label, onClick);
        this.icon = icon;
    }
}
