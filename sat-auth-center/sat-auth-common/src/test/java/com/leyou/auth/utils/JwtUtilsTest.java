package com.sat.auth.utils;


import com.sat.auth.entity.UserInfo;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author zx
 * @date 2021/04/14
 */
public class JwtUtilsTest {

    private static final String publicKeyPath = "E:\\projectList\\hd\\key\\id_rsa.pub";
    private static final String privateKeyPath = "E:\\projectList\\hd\\key\\id_rsa.pri";

    private PrivateKey privateKey;
    private PublicKey publicKey;


    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(publicKeyPath, privateKeyPath, "234");
    }

    @Before
    public void testGetRsa() throws Exception {
        privateKey = RsaUtils.getPrivateKey(privateKeyPath);
        publicKey = RsaUtils.getPublicKey(publicKeyPath);
    }

    @org.junit.Test
    public void generateToken() {
        //生成Token
        String s = JwtUtils.generateToken(new UserInfo(20L, "Jack"), privateKey, 5);
        System.out.println("s = " + s);
    }


    @org.junit.Test
    public void parseToken() {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiSmFjayIsImV4cCI6MTYxODQxMTY2MX0.NrwuZ0QVP8EjhvybwWr6t1QVC4mUrnpQs1OOe2YeZew99HfXCS3eW4cHhW1-awRWlyhrR0qSy4xyUJ12MwxwQu9DdaPewZrRxsbiNm6v91dOUll7QKe8OkgmJQMSFenhiFMYU1WnMeGonxMuNJHOtfMk9T5WCeT2-FNa76esPw4";
        UserInfo userInfo = JwtUtils.getUserInfo(publicKey, token);
        System.out.println("id:" + userInfo.getId());
        System.out.println("name:" + userInfo.getName());
    }

    @org.junit.Test
    public void parseToken1() {
    }

    @org.junit.Test
    public void getUserInfo() {
    }

    @org.junit.Test
    public void getUserInfo1() {
    }
}