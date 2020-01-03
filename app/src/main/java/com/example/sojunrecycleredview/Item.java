package com.example.sojunrecycleredview;

import android.content.Intent;
import android.graphics.drawable.Drawable;

public class Item {
        private int viewtype;
        private Drawable iconDrawble;
        private String titleStr;
        private String decStr;

    public Item(int viewtype, Drawable iconDrawble, String titleStr, String decStr) {
        this.viewtype = viewtype;
        this.iconDrawble = iconDrawble;
        this.titleStr = titleStr;
        this.decStr = decStr;
    }

        public Drawable getIconDrawble() {
            return iconDrawble;
        }



        public String getTitleStr() {
            return titleStr;
        }



        public String getDecStr() {
            return decStr;
        }


        public int getViewType() {
           return viewtype;
       }
}



