package com.adminportal.domain.security;

import com.adminportal.domain.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity @Getter @Setter
@NoArgsConstructor
@Table(name = "user_role")
public class UserRole {

    @Id @GeneratedValue(strategy = AUTO)
    private Long userRoleId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private Role role;

    public UserRole(User user, Role role) {
        this.user = user;
        this.role = role;
    }
}