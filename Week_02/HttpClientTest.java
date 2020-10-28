package com.geektime.andy.week2;


import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * @author mac
 */
public class HttpClientTest {
    private static final Logger logger = LogManager.getLogger(HttpClientTest.class);

    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("http://localhost:8801");
        CloseableHttpResponse response;
        try {
            response = client.execute(get);
            HttpEntity httpEntity = response.getEntity();
            logger.info("HttpClientTest.main" + EntityUtils.toString(httpEntity));
        } catch (Exception e) {
            logger.error("HttpClientTest.main", e);
        } finally {
            client.close();
        }
    }
}
