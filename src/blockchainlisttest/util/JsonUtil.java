/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchainlisttest.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.security.MessageDigest;

/**
 *
 * @author lemin
 */
public class JsonUtil {
   public static String toJson(Object object){
       GsonBuilder gsonBuilder = new GsonBuilder();
       gsonBuilder.setPrettyPrinting();
       Gson gson = gsonBuilder.create();
       return gson.toJson(object);
   }
}
