package com.sit.constant;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/21 22:38
 * 类名: Gender
 * </pre>
 */

public enum Gender {
    UNKNOWN("未知", (byte) 0),
    MALE("男", (byte) 1),
    FEMALE("女", (byte) 2);
    private String name;
    private byte code;

    Gender(String name, byte code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public byte getCode() {
        return code;
    }

    public static Gender lookup(byte code) {
        for (Gender gender : values()) {
            if (gender.getCode() == code) {
                return gender;
            }
        }
        return null;
    }

    public static Gender lookup(String name) {
        for (Gender gender : values()) {
            if (name.equals(gender.getName())) {
                return gender;
            }
        }
        return null;
    }
}
