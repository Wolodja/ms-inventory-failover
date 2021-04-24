package guru.sfg.brewery.msinventoryfailover.web;

import guru.sfg.brewery.msinventoryfailover.model.BeerInventoryDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Component
public class InventoryHandler {

    public Mono<ServerResponse> listInventory(ServerRequest request) {

        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_STREAM_JSON)
            .body(BodyInserters.fromPublisher(Mono.just(Arrays.asList(BeerInventoryDto.builder()
                .id(UUID.randomUUID())
                .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                .quantityOnHand(999)
                .createDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build())), List.class));
    }
}
