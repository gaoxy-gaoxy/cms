package com.briup.cms;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.ServerRequestInfo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmsApplicationTests {

    @Test
    public void contextLoads() {
        String ss = "";
        String ss1 = null;
        String ss2 = " ";
        /*if(ss != null && !"".equals(ss) && !" ".equals(ss2)) {

        }*/

       /* System.out.println(StringUtils.isEmpty(ss));//true
        System.out.println(StringUtils.isEmpty(ss1));//true
        System.out.println(StringUtils.isEmpty(ss2));//false*/
        //return cs == null || cs.length() == 0;

        System.out.println(StringUtils.isBlank(ss));
        System.out.println(StringUtils.isBlank(ss1));
        System.out.println(StringUtils.isBlank(ss2));
    }

}
