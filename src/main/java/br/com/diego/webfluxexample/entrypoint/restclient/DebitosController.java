package br.com.diego.webfluxexample.entrypoint.restclient;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("api/heroes")
public class DebitosController {

    private final ConcurrentLinkedQueue<String> eventQueue = new ConcurrentLinkedQueue<>();


    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamEvents() {
        AtomicInteger counter = new AtomicInteger();
        return Flux.interval(Duration.ofSeconds(1))
                .map(tick -> "Event " + counter.incrementAndGet());
    }

    @PostMapping("/events")
    public Mono<String> createEvent(@RequestBody String message) {
        return Mono.just("Event received: " + message);
    }

}
