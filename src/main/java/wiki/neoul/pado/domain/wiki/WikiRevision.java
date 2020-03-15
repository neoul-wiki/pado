package wiki.neoul.pado.domain.wiki;

import wiki.neoul.pado.domain.actor.Actor;
import wiki.neoul.pado.domain.namespace.Namespace;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * History of wiki document.
 *
 * @author hyeyoom
 */
@Entity
public class WikiRevision {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "namespace_id")
    private Namespace namespace;

    @Column(nullable = false)
    private String raw;

    @Column(nullable = false)
    private Mark mark = Mark.GFM;

    @Column(nullable = false)
    private LocalDateTime writtenAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "contributor_id")
    private Actor contributor;

}
