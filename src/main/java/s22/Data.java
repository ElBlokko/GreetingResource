package s22;

import io.quarkus.runtime.annotations.RegisterForReflection;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@RegisterForReflection(serialization = true)
public class Data {
    @NotNull
    private String id;

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9_-]{1,50}")
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}