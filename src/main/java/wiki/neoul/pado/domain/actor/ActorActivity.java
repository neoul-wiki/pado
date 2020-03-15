package wiki.neoul.pado.domain.actor;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Actor dose what(type) when(doneAt) on ip address
 */
@Entity
@Table(name = "actor_activities")
public class ActorActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @Column(nullable = false)
    private String ipAddress;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ActivityType what;

    @Column(nullable = false)
    private LocalDateTime doneAt = LocalDateTime.now();
}
