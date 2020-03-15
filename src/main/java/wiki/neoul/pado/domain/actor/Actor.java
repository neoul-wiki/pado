package wiki.neoul.pado.domain.actor;

import wiki.neoul.pado.domain.account.Account;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Actor refers to all users, including non-signed-in user, acting on wiki system.
 *
 * @author hyeyoom
 */
@Entity
@Table(
        name = "actors",
        indexes = {
                @Index(name = "idx_actor_id", columnList = "ip_address, account_id")
        },
        uniqueConstraints = {
                @UniqueConstraint(name = "uq_actor", columnNames = {"ip_address", "account_id"})
        }
)
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ip_address",nullable = false)
    private String ipAddress;

    @OneToOne(optional = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id")
    private Account account = null;

    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

}
