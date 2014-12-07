package com.orhanobut.android.bee;

/**
 * @author Orhan Obut
 */
class Info implements ContentHolder {

    private final String title;
    private final String value;

    Info(String title, String value) {
        this.title = title;
        this.value = value;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getValue() {
        return value;
    }
}
