package com.payfood.payfood.comunicacaoExterna;

public class ApiWeb {

    public static final String BASE_URL = "https://proj-web-cassianoviana.c9users.io";

    public static class estabelecimento {
        public static String lista = "/estabelecimentos";
    }

    public static class usuario {
        public static String post = "/usuario";
    }

    public static class produto {
        public static String lista = "/produtos";
        public static String get = "/produto";
    }
}
