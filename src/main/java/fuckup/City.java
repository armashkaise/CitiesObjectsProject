package fuckup;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
public class City {
    private Set<Street> streets;
    private Set<Park> parks;

    public City() {
        this.streets = new HashSet<>();
        this.parks = new HashSet<>();
    }

    public void addStreet(Street street){
            streets.add(street);
    }

    public void addPark(Park park){
        if (Objects.nonNull(park))
            parks.add(park);
    }

    public Set<? extends AreaSize> getAllAreaSizeble() {
        Set<AreaSize> areaSizes = new HashSet<AreaSize>();
        areaSizes.addAll(streets);
        areaSizes.addAll(parks);
        return areaSizes;
    }
}
