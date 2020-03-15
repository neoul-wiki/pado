package wiki.neoul.pado.domain.wiki;

import wiki.neoul.pado.domain.namespace.Namespace;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

/**
 * @author hyeyoom
 */
@Entity
public class Wiki {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pid = UUID.randomUUID().toString();

    @Column(nullable = false)
    private String raw;

    @Column(nullable = false)
    private Mark mark = Mark.GFM;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "namespace_id")
    private Namespace nameSpace;

    @Column(nullable = false)
    private LocalDateTime lastModifiedDate;

}
