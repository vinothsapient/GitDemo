package com.testx.web.api.selenium.restassured.qe.common.utils;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.security.SecureRandom;

public class GeneralUtils {

    public static String generateRandomHexToken(int byteLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] token = new byte[byteLength];
        secureRandom.nextBytes(token);
        return new BigInteger(1, token).toString(16); //hex encoding
    }

    public static Double extractFirstDoubleFromString(String inputString){
        Pattern p = Pattern.compile("[\\d]+(?:[\\.]{1}[\\d]+)?");
        Matcher m = p.matcher(inputString);
        if (m.find())
            return Double.parseDouble(m.group(0));
        else
            return 0.0;
    }
}
