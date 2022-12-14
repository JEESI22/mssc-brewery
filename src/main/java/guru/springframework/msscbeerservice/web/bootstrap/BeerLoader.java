package guru.springframework.msscbeerservice.web.bootstrap;

import guru.springframework.msscbeerservice.web.domain.Beer;
import guru.springframework.msscbeerservice.web.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count()==0){
            beerRepository.save(Beer.builder()
                            .beerName("Mango bre")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .upc(22222L)
                            .price(new BigDecimal("12.95"))
                    .build());

            beerRepository.save(Beer.builder()
                    .beerName("Mango da")
                    .beerStyle("IPI")
                    .quantityToBrew(205)
                    .upc(222L)
                    .price(new BigDecimal("12.65"))
                    .build());
        }
        System.out.println("Loaded beers" + beerRepository.count());

    }
}
