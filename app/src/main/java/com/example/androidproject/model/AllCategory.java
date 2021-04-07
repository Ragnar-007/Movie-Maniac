package com.example.androidproject.model;

import java.util.List;

public class AllCategory {
    String categoryTitle;
    List<CategoryItem> categoryItemList;
    public AllCategory(String categoryTitle, List<CategoryItem> categoryItemList) {
        this.categoryTitle = categoryTitle;
        this.categoryItemList = categoryItemList;

    }


    public List<CategoryItem> getCategoryItemList() {
        return categoryItemList;
    }

    public void setCategoryItemList(List<CategoryItem> categoryItemList) {
        this.categoryItemList = categoryItemList;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategorytitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
}
