package com.dd.plist.test.model;

import com.dd.plist.annotations.PlistInclude;
import com.dd.plist.annotations.PlistOptions;

@PlistOptions
@PlistInclude(PlistInclude.Include.NON_DEFAULT)
public class TestAnnotationsClass3 {

    private String nullText = null;

    private String emptyText = "";

    private String textIncluded = "textIncluded";

    private int intIncluded = 42;

    private Long longIncluded = Long.MIN_VALUE;

    private char charIncluded = 'c';

    private boolean boolIncluded = false;

    private byte[] emptyArray = new byte[]{};

    private int[] arrayIncluded = new int[]{17, 56, 0};

    private String[] arrayStringsIncluded = new String[]{"17", "56", "0"};

    private byte[] nullArray = null;

    public String getNullText() {
        return this.nullText;
    }

    public void setNullText(String nullText) {
        this.nullText = nullText;
    }

    public String getEmptyText() {
        return this.emptyText;
    }

    public void setEmptyText(String emptyText) {
        this.emptyText = emptyText;
    }

    public String getTextIncluded() {
        return this.textIncluded;
    }

    public void setTextIncluded(String textIncluded) {
        this.textIncluded = textIncluded;
    }

    public int getIntIncluded() {
        return this.intIncluded;
    }

    public Long getLongIncluded() {
        return this.longIncluded;
    }

    public void setLongIncluded(Long longIncluded) {
        this.longIncluded = longIncluded;
    }

    public void setIntIncluded(int intIncluded) {
        this.intIncluded = intIncluded;
    }

    public char getCharIncluded() {
        return this.charIncluded;
    }

    public void setCharIncluded(char charIncluded) {
        this.charIncluded = charIncluded;
    }

    public boolean isBoolIncluded() {
        return this.boolIncluded;
    }

    public void setBoolIncluded(boolean boolIncluded) {
        this.boolIncluded = boolIncluded;
    }

    public byte[] getEmptyArray() {
        return this.emptyArray;
    }

    public void setEmptyArray(byte[] emptyArray) {
        this.emptyArray = emptyArray;
    }

    public int[] getArrayIncluded() {
        return this.arrayIncluded;
    }

    public void setArrayIncluded(int[] arrayIncluded) {
        this.arrayIncluded = arrayIncluded;
    }

    public String[] getArrayStringsIncluded() {
        return this.arrayStringsIncluded;
    }

    public void setArrayStringsIncluded(String[] arrayStringsIncluded) {
        this.arrayStringsIncluded = arrayStringsIncluded;
    }

    public byte[] getNullArray() {
        return this.nullArray;
    }

    public void setNullArray(byte[] nullArray) {
        this.nullArray = nullArray;
    }
}
