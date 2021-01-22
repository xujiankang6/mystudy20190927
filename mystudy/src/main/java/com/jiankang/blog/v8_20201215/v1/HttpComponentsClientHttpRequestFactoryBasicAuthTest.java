package com.jiankang.blog.v8_20201215.v1;

/*
 *@create by jiankang
 *@date 2020/12/16 @time 15:35
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * CHANGE ACTIVITY:
 * <p>
 * Reason      Version    Date        User        Description
 * ------------ ---------- ----------- ----------- -------------------
 * crm-7506        1.0       2020/12/16   jiankang    is_active状态更新
 * <p>
 * END CHANGE ACTIVITY
 */


public class HttpComponentsClientHttpRequestFactoryBasicAuthTest {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor("username", "password"));
        restTemplate.setErrorHandler(new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {

                if (clientHttpResponse.getStatusCode().series() == HttpStatus.Series.SERVER_ERROR) {
                    // handle server_error
                } else if (clientHttpResponse.getStatusCode().series() == HttpStatus.Series.CLIENT_ERROR) {
                    // handle client_error
                } else if (HttpStatus.Series.INFORMATIONAL == clientHttpResponse.getStatusCode().series()) {
                    throw new IOException();
                }

            }
        });
    }
}
