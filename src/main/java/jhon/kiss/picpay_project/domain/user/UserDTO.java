package jhon.kiss.picpay_project.domain.user;

import java.math.BigDecimal;

public record UserDTO(

        String name,

        String document,

        BigDecimal balance,

        String email,

        String password,

        UserType userType
) {
}
