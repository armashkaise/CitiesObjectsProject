package fuckup;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Street extends AreaSize{
    private final UUID id;
    private String name;

    public Street(String name, int lenght, int width) {
        super(lenght, width);
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public boolean inMain() {
        return true;
    }
}
