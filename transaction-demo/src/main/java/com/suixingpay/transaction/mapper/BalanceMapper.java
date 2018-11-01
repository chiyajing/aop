/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: anwenchu<an_wch @ suixingpay.com>
 * @date: 17-3-7 下午3:48
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package com.suixingpay.transaction.mapper;

import com.suixingpay.transaction.domain.Balance;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Description: TODO
 * @author: an_wch<an_wch @ suixingpay.com>
 * @date: 2017-03-30 15:16:28
 * @version: V1.0
 */
public interface BalanceMapper {

    void save(Balance balance);

    Long count(Balance balance);

    List<Balance> find(Balance condition);

    void update(Balance application);

    double getMoneyByName(String name);
}