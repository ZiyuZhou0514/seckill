package com.example.seckilldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.seckilldemo.entity.TSeckillOrder;
import com.example.seckilldemo.entity.TUser;


public interface ITSeckillOrderService extends IService<TSeckillOrder> {
    Long getResult(TUser tUser, Long goodsId);
}
