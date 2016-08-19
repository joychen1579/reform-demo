package com.liangmayong.reform;

import android.content.Context;

import com.liangmayong.reform.error.ReformError;

import java.util.Map;

/**
 * ReformInterceptor
 *
 * @author LiangMaYong
 * @version 1.0
 */
public interface ReformInterceptor {

    /**
     * base url
     *
     * @return base url
     */
    String getBaseUrl();

    /**
     * destroy
     *
     * @param context context
     */
    void destroy(Context context);

    /**
     * base url
     *
     * @return base url
     */
    Map<String, String> getCommonHeaders();

    /**
     * enqueue
     *
     * @param context   context
     * @param url       url
     * @param parameter parameter
     * @param listener  listener
     */
    void enqueue(Context context, String url, ReformParameter parameter, OnReformListener listener);

    /**
     * execute
     *
     * @param context   context
     * @param url       url
     * @param parameter parameter
     * @return Response
     * @throws ReformError e
     */
    ReformResponse execute(Context context, String url, ReformParameter parameter) throws ReformError;
}
