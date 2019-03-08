package cn.codingxiaxw.service;

import cn.codingxiaxw.dto.Exposer;
import cn.codingxiaxw.dto.SeckillExecution;
import cn.codingxiaxw.entity.Seckill;
import cn.codingxiaxw.exception.RepeatKillException;
import cn.codingxiaxw.exception.SeckillCloseException;
import cn.codingxiaxw.exception.SeckillException;

import java.util.List;

public interface SeckillService {

    List<Seckill> getSeckillList();


    Seckill getById(long seckillId);


    //再往下，是我们最重要的行为的一些接口

    Exposer exportSeckillUrl(long seckillId);


    SeckillExecution executeSeckill(long seckillId,long userPhone,String md5)
            throws SeckillException,RepeatKillException,SeckillCloseException;
}
