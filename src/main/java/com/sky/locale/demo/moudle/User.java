package com.sky.locale.demo.moudle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by gantianxing on 2017/6/8.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull(message="{user.name.null}")
    @Size(min=2,max =5,message = "{user.name.error}")
    private String name;//姓名

    @NotNull(message="{user.birthday.null}")
    @Past(message="{user.birthday.error}")
    private Date birthday;//生日

    @NotNull(message="{user.money.null}")
    @Digits(integer=3,fraction=2,message="{user.money.error}")
    private BigDecimal money;//资产

    @NotNull(message="{user.phoneNum.null}")
    @Pattern(regexp="\\d{11}",message="{user.phoneNum.error}")
    private String phoneNum;//手机号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
