/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年09月18日 15时53分
 * @Copyright ©2018 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

package com.suixingpay.transaction;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author: tangqihua[tang_qh@suixingpay.com]
 * @date: 2018年09月18日 15时53分
 * @version: V1.0
 * @review: tangqihua[tang_qh@suixingpay.com]/2018年09月18日 15时53分
 */
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StartApplication.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BaseTest {

    @Autowired
    private WebApplicationContext wac;

    protected MockMvc mockMvc;

    @Before
    public void setup() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void test() {
        System.out.println("########test########");
    }
}
