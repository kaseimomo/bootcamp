package com.bootcamp.exercise2.bc_forum.infra;

import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

public class UrlBuilder {
  public static String get(Scheme scheme, String domain, String endpoint) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.lowerCase()) //
        .host(domain) //
        .path(endpoint) //
        .toUriString();
  }

  public static String get(Scheme scheme, String domain, String endpoint,
      String[] pathSegments) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.lowerCase()) //
        .host(domain) //
        .pathSegment(pathSegments) //
        .path(endpoint) //
        .toUriString();
  }

  public static String get(Scheme scheme, String domain, String endpoint,
      String[] pathSegments, String queryParm, String queryValue) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.lowerCase()) //
        .host(domain) //
        .pathSegment(pathSegments).queryParam(queryParm, queryValue) //
        .path(endpoint) //
        .toUriString();
  }

  public static String get(Scheme scheme, String domain, String endpoint,
      MultiValueMap<String, String> params) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.lowerCase()) //
        .host(domain) //
        .queryParams(params) //
        .path(endpoint) //
        .toUriString();
  }

  public static String get(Scheme scheme, String domain, String endpoint,
      String[] pathSegments, MultiValueMap<String, String> params) {
    return UriComponentsBuilder.newInstance() //
        .scheme(scheme.lowerCase()) //
        .host(domain) //
        .pathSegment(pathSegments) //
        .queryParams(params) //
        .path(endpoint) //
        .toUriString();
  }
}
