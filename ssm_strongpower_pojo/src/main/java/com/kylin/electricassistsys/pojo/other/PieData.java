package com.kylin.electricassistsys.pojo.other;

/**
 * @Auther: whq
 * @Date: 2018/10/12 10:44
 * @Description:
 */
public class PieData {
    private Integer value;
    private String name;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PieData{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
