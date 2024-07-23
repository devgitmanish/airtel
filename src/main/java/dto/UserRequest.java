package dto;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class UserRequest {

    @NotNull(message ="user-nane should not be null")
    private String name;

    @Email(message = "invalid email address")
    private String email;

    @Pattern(regexp="^\\d{10}$", message = "invalid email address")
    private String mobile;


    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotNull(message="should belong to some country")
    @NotBlank(message="should belong to some country")
    private String country;
}
