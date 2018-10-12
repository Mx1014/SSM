package com.kylin.electricassistsys.dto.other;

/**
 * @Auther: whq
 * @Date: 2018/10/12 10:48
 * @Description:
 */
public class PieDataDto {
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
