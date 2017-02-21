package com.sit.constant;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/21 23:23
 * 类名: Career
 * </pre>
 */

public enum Career {
    UNKNOWN("其他", (byte) 0),
    STUDENT("学生", (byte) 1),
    TEACHER("老师", (byte) 2);
    private String name;
    private byte code;

    Career(String name, byte code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public byte getCode() {
        return code;
    }

    public static Career lookup(byte code) {
        for (Career career : values()) {
            if (career.getCode() == code) {
                return career;
            }
        }
        return null;
    }

    public static Career lookup(String name) {
        for (Career career : values()) {
            if (name.equals(career.getName())) {
                return career;
            }
        }
        return null;
    }
}
