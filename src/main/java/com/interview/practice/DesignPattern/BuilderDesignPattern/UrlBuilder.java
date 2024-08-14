package com.interview.practice.DesignPattern.BuilderDesignPattern;

public class UrlBuilder {

    private final String protocol;
    private final String host;
    private final String port;
    private final String pathParam;
    private final String queryParam;

    private UrlBuilder(Builder builder) {
        this.protocol = builder.protocol;
        this.host = builder.host;
        this.port = builder.port;
        this.pathParam = builder.pathParam;
        this.queryParam = builder.queryParam;
    }

    public String getProtocol() {
        return protocol;
    }

    public String getHost() {
        return host;
    }

    public String getPort() {
        return port;
    }

    public String getPathParam() {
        return pathParam;
    }

    public String getQueryParam() {
        return queryParam;
    }

    public static class Builder{
        private String protocol;
        private String host;
        private String port;
        private String pathParam;
        private String queryParam;

        public Builder(){}

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder port(String port) {
            this.port = port;
            return this;
        }

        public Builder pathParam(String pathParam) {
            this.pathParam = pathParam;
            return this;
        }

        public Builder queryParam(String queryParam) {
            this.queryParam = queryParam;
            return this;
        }

        public UrlBuilder build(){
            return new UrlBuilder(this);
        }
    }

    @Override
    public String toString() {
        return protocol + host + port + pathParam + queryParam;
    }
}
