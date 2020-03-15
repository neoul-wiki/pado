package wiki.neoul.pado.domain.account;

import wiki.neoul.pado.domain.namespace.Namespace;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(
        name = "accounts",
        indexes = {
                @Index(name = "idx_account_pid", columnList = "pid"),
                @Index(name = "idx_account_email", columnList = "email")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "uq_account_pid", columnNames = {"pid"}),
                @UniqueConstraint(name = "uq_account_email", columnNames = {"email"})
        }
)
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pid = UUID.randomUUID().toString();

    @Column(nullable = false)
    private String name;

    @Email
    @Column(nullable = false)
    private String email;

    @OneToOne
    @JoinColumn(name = "namespace_id")
    private Namespace nameSpace;

    @Column(nullable = false)
    private LocalDateTime joinedDate = LocalDateTime.now();

}
