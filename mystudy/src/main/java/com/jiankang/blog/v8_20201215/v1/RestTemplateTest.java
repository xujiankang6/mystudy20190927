package com.jiankang.blog.v8_20201215.v1;


/**
 * 配置RestTemplate的超时时间
 */

public class RestTemplateTest {
    public static void main(String[] args) {
//        RestTemplate restTemplate = new RestTemplate(getClientHttpRequestFactory());

    }

//    private static ClientHttpRequestFactory getClientHttpRequestFactory() {
//        int timeout = 5000;
//        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//        clientHttpRequestFactory.setConnectTimeout(timeout);
//        return clientHttpRequestFactory;
//    }

//    private static ClientHttpRequestFactory getClientHttpRequestFactory2() {
//        int timeout = 5000;
//
//        RequestConfig config = RequestConfig.custom()
//                .setConnectTimeout(timeout)
//                .setConnectionRequestTimeout(timeout)
//                .setSocketTimeout(timeout).build();
//        CloseableHttpClient client = HttpClientBuilder.create().setDefaultRequestConfig(config).build();
//        return new HttpComponentsClientHttpRequestFactory(client);
//    }
}
