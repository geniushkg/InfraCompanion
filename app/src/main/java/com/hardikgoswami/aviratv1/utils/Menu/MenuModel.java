package com.hardikgoswami.aviratv1.utils.Menu;

import com.hardikgoswami.aviratv1.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geniushkg on 10/27/2016.
 */

public class MenuModel {
    String menuName;
    String imageUrl;
    int imageResId;

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public MenuModel(String menuName, int imageResId) {
        this.menuName = menuName;
        this.imageResId = imageResId;
    }

    public MenuModel(String menuName, String imageUrl) {
        this.menuName = menuName;
        this.imageUrl = imageUrl;

    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public static List<MenuModel> createMenuList(){
        List<MenuModel> menuModelList = new ArrayList<MenuModel>();
        menuModelList.add(new MenuModel("About US", R.drawable.nav_image));
        menuModelList.add(new MenuModel("Project",R.drawable.about_home));
        menuModelList.add(new MenuModel("Testimonials",R.drawable.image_menu_casa));
        menuModelList.add(new MenuModel("Vastu tips",R.drawable.image_menu));

        return menuModelList;
    }

}
