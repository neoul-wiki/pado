package wiki.neoul.pado.domain.namespace;

import javax.persistence.*;

/**
 * Namespace represents the scope of resource.
 *
 * @author hyeyoom
 */
@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(name = "uq_namespace_indexes", columnNames = {"type", "name"})
        }
)
public class Namespace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private NameSpaceType type;

    @Column(nullable = false)
    private String name;

}
