package com.tracetech.flux.util;

public class StaticValue {

  private StaticValue() {
    throw new IllegalStateException("StaticValue class");
  }
  // ----------------------------------------------------
  public static final String urlAuthentification = "/api/v1/utilisateur/authentification";
  public static final String urlConnect = "/api/v1/utilisateur/connect";
  public static final String urlCrypt = "/api/v1/utilisateur/crypthkh";

  public static final String bearerString = "Bearer ";
  public static final String secretKey = "pL$d";
}
