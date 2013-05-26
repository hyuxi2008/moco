package com.github.dreamhead.moco.resource;

import com.github.dreamhead.moco.MocoConfig;

public class DefaultLocalCache implements LocalCache {
    private WritableResource resource;

    public DefaultLocalCache(WritableResource resource) {
        this.resource = resource;
    }

    public void write(byte[] content) {
        resource.write(content);
    }

    public byte[] read() {
        return resource.asByteArray();
    }

    @Override
    public void apply(MocoConfig config) {
        this.resource.apply(config);
    }
}
