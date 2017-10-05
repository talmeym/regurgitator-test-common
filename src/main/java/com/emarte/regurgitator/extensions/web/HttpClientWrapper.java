package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.test.Mock;

public class HttpClientWrapper extends Mock {
    public HttpClientWrapper(String host, int port, String username, String password) {
        super(host, port, username, password);
    }
}
