package com.github.dreamhead.moco;

import org.jboss.netty.handler.codec.http.HttpRequest;

public interface RequestMatcher {
    boolean match(HttpRequest request);

    void apply(MocoConfig config);
}
