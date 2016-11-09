package com.hardikgoswami.aviratv1.utils.about;

import android.media.Image;

/**
 * Created by geniushkg on 10/30/2016.
 */

public class About {
    String menuName;
    String imgUrl;
    int iamgeId;


    public About(String menuName, String imgUrl) {
        this.menuName = menuName;
        this.imgUrl = imgUrl;
    }

    public About(String menuName, int iamgeId) {
        this.menuName = menuName;
        this.iamgeId = iamgeId;
    }

    public int getIamgeId() {
        return iamgeId;
    }

    public void setIamgeId(int iamgeId) {
        this.iamgeId = iamgeId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
