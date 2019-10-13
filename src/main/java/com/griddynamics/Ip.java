package com.griddynamics;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.springframework.security.web.util.matcher.IpAddressMatcher;

public class Ip extends UDF {
    public Boolean evaluate(String one, String two) {
        return matches(one, two);
    }

    private boolean matches(String ip, String subnet) {
        IpAddressMatcher ipAddressMatcher = new IpAddressMatcher(subnet);
        return ipAddressMatcher.matches(ip);
    }
}
