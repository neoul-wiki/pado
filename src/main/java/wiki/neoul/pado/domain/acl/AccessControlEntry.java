package wiki.neoul.pado.domain.acl;

import wiki.neoul.pado.domain.acl.types.Action;
import wiki.neoul.pado.domain.acl.types.Principal;
import wiki.neoul.pado.domain.acl.types.Privilege;
import wiki.neoul.pado.domain.actor.Actor;

import javax.persistence.*;

/**
 * Access Control Entry.
 *
 * @author hyeyoom
 */
@Entity
public class AccessControlEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "acl_id")
    private ACL acl;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Principal principal;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Privilege privilege;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Action type;

}
