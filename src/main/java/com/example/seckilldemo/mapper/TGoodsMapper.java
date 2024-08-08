package com.example.seckilldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.seckilldemo.entity.TGoods;
import com.example.seckilldemo.vo.GoodsVo;

import java.util.List;


public interface TGoodsMapper extends BaseMapper<TGoods> {


    List<GoodsVo> findGoodsVo();

    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
