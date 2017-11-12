package com.example.demo.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class DemoHandler {

    public Mono<ServerResponse> getDemo(ServerRequest req) {
        return ok().body(Flux.just("demo"), String.class);
    }

    public Mono<ServerResponse> postDemo(ServerRequest req) {
        Mono<String> body = req.bodyToMono(String.class);
        return ok().body(body, String.class);
    }
}

