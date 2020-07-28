package com.seckillproject.service;

import com.seckillproject.service.model.PromoModel;

/**
 * @author hugo Yu
 * @create 2020-07-28
 */
public interface PromoService {
    PromoModel getPromoByItemId(Integer itemId);

}
