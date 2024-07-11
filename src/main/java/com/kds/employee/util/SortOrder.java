package com.kds.employee.util;

public enum SortOrder {
	ASC("asc"),
    DESC("desc");

    private final String value;
    public static final int FIRST_PAGE_NUM = 1;
    
    SortOrder(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
