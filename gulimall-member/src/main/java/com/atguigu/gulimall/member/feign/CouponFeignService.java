package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

//远程调用Coupon的接口
@FeignClient(name = "gulimall-coupon")
public interface CouponFeignService {



    @RequestMapping("/coupon/coupon/test")
    public R test();


}
