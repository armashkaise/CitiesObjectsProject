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
public class Park extends AreaSize{
    private final UUID id;
    private String name;

    public Park( String name, int lenght, int width) {
        super(lenght, width);
        this.id = UUID.randomUUID();
        this.name = name;
    }
}
