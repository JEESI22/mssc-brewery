package guru.springframework.msscbrewery.web.model;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CustomerDto {

    private UUID id1;
    private String customerName;
}
