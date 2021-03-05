package online.mengxun.server.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

public class AdminDTO {
    @Data
    public static class RegisterAdmin {

        @Email
        private String email;

        @Length(min = 6 ,max = 15)
        private String nickName;

        @Length(min = 6,max = 20)
        private String password;

        @Length(min = 6, max = 6)
        private String emailCheckCode;
    }
}
