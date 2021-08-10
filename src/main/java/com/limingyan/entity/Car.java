package com.limingyan.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    // 编号
    private Integer num;
    // 品牌
    private String brand;
    // 价格
    private Integer price;
}
