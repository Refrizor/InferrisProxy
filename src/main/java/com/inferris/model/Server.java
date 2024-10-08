package com.inferris.model;

public enum Server {
    PROXY(25565),
    LOBBY(25566),
    INFERRIS(25567),
    STARLUME(25568),
    UNKNOWN(-1);

    private final int port;
    Server(int port){
        this.port = port;
    }

    public int getPort() {
        return port;
    }

    public String converted() {
        return this.name().toLowerCase();
    }
}