package wiki.neoul.pado.domain.namespace;

public enum NameSpaceType {

    /**
     * for wiki documents
     */
    WIKI,

    /**
     * For files
     */
    FILE,

    /**
     * For users
     * Note: Every user has their own namespace.
     */
    USER,

    /**
     * For categories. It's called 분류 in Korean.
     * This type will be used as a tag for grouping.
     */
    CATEGORY,

    /**
     * For subjects. It's called 주제 in Korean.
     */
    SUBJECT
}
