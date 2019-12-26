package com.example.sojunrecycleredview;

import android.graphics.drawable.Drawable;

public class Item {

        private Drawable iconDrawble;
        private String titleStr;
        private String decStr;

        public Drawable getIconDrawble() {
            return iconDrawble;
        }

        public void setIconDrawble(Drawable iconDrawble) {
            this.iconDrawble = iconDrawble;
        }

        public String getTitleStr() {
            return titleStr;
        }

        public void setTitleStr(String titleStr) {
            this.titleStr = titleStr;
        }

        public String getDecStr() {
            return decStr;
        }

        public void setDecStr(String decStr) {
            this.decStr = decStr;
        }
    }


