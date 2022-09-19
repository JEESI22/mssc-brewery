package guru.springframework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;


}
