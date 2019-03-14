package com.emarte.regurgitator.extensions.web;

import com.emarte.regurgitator.test.Mock;

public class HttpClientWrapper extends Mock {
    public HttpClientWrapper(String protocol, String host, int port, String username, String password) {
        super(protocol, host, port, username, password);
    }
}
