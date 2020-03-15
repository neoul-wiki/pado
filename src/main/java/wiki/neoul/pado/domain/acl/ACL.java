package wiki.neoul.pado.domain.acl;

import wiki.neoul.pado.domain.namespace.Namespace;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Access Control List
 *
 * @author hyeyoom
 */
@Entity
public class ACL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "namespace_id")
    private Namespace nameSpace;

    @Column(nullable = false)
    private LocalDateTime createdDate = LocalDateTime.now();

}
