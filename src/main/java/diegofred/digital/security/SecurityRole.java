package diegofred.digital.security;

import org.springframework.security.core.GrantedAuthority;

import diegofred.digital.models.Role;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SecurityRole implements GrantedAuthority {

    private final Role role;

    @Override
    public String getAuthority() {
        return role.getRoleName();
    }
}