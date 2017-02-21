package com.sit.constant;

/**
 * <pre>
 * 任务：
 * 描述：
 * 作者：冯忠森
 * 时间：2017/2/21 22:39
 * 类名: Grade
 * </pre>
 */

public enum Grade {
    NEW_0("新晋团队", (byte) 0),
    SILVER_1("银一星", (byte) 1),
    SILVER_2("银二星", (byte) 2),
    SILVER_3("银三星", (byte) 3),
    GOLD_1("金一星", (byte) 4),
    GOLD_2("金二星", (byte) 5),
    GOLD_3("金三星", (byte) 6);
    private String name;
    private byte code;

    Grade(String name, byte code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public byte getCode() {
        return code;
    }

    public static Grade lookup(byte code) {
        for (Grade grade : values()) {
            if (grade.getCode() == code) {
                return grade;
            }
        }
        return null;
    }

    public static Grade lookup(String name) {
        for (Grade grade : values()) {
            if (name.equals(grade.getName())) {
                return grade;
            }
        }
        return null;
    }
}
