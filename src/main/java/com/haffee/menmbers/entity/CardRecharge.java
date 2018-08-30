package com.haffee.menmbers.entity;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * create by jacktong
 * date 2018/7/16 下午8:17
 * 会员卡充值订单
 **/

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Serialization
public class CardRecharge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; //主键唯一标识
    private int userId=0;
    private String userPhone;
    private int cardId;
    private String cardNo;
    private int shopId;
    private float fee;
    private String createTime;
    private String paymentTime;
    private int paymentStatus=1; //支付状态 1：支付成功 0：待支付，-1：支付失败
    private String orderDesc;
    private int discountId=0;//折扣方案 关联config
    private float discountFee=0; //折扣金额
    private String discountDesc; //折扣描述
    @Transient
    private Person person;
    @Transient
    private Card card;
    @Transient
    private User user;
}
