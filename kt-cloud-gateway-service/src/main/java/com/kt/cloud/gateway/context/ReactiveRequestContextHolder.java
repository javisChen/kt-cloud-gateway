package com.kt.cloud.gateway.context;

import org.springframework.http.server.reactive.ServerHttpRequest;
import reactor.core.publisher.Mono;

public class ReactiveRequestContextHolder {

	public static final Class<ServerHttpRequest> CONTEXT_KEY = ServerHttpRequest.class;

	public static Mono<ServerHttpRequest> getRequest() {
		return Mono.subscriberContext()
				.map(ctx -> ctx.get(CONTEXT_KEY));
	}

}