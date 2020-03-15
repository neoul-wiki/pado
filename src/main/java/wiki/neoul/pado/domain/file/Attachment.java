package wiki.neoul.pado.domain.file;

import wiki.neoul.pado.domain.namespace.Namespace;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String pid = UUID.randomUUID().toString();

    @OneToOne
    @JoinColumn(name = "namespace_id")
    private Namespace namespace;

    @Column(nullable = false)
    private String originName;

    @Column(nullable = false)
    private String fileHash;

    @Column(nullable = false)
    private Long fileSize;

}
