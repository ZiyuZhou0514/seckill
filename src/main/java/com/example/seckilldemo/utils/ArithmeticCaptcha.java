package com.example.seckilldemo.utils;

import com.wf.captcha.base.Captcha;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.OutputStream;

/**
 * @Description: TODO
 * @Author: sleepy
 * @Date: 2024/8/2
 */
public class ArithmeticCaptcha extends Captcha {
    private static final ScriptEngine engine;

    static {
        ScriptEngineManager manager = new ScriptEngineManager();
        engine = manager.getEngineByName("JavaScript");
    }

    public ArithmeticCaptcha(int width, int height, int len) {
        super();
        setLen(len);
    }

    @Override
    protected char[] alphas() {
        int num1 = num(1, 10);
        int num2 = num(1, 10);
        String arithmeticString = num1 + "+" + num2;
        try {
            this.chars = String.valueOf(engine.eval(arithmeticString));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return arithmeticString.toCharArray();
    }

    @Override
    public boolean out(OutputStream outputStream) {
        return false;
    }

    @Override
    public String toBase64() {
        return "";
    }
}
