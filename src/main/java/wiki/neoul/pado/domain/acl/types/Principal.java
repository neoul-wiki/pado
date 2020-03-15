package wiki.neoul.pado.domain.acl.types;

public enum Principal {

    /**
     * Signed-In user only
     */
    SIGNED_IN,

    /**
     * IP Banned
     */
    BANNED_IP,

    /**
     * Blocked, Suspended user.
     */
    SUSPEND_MEMBER,

    /**
     * Member who signed up within 15 days.
     */
    MEMBER_SIGNED_UP_WITHIN_30DAYS,

    /**
     * Contributor
     */
    CONTRIBUTOR,

    /**
     * Manager
     */
    MANAGER,

    /**
     * Everybody
     */
    ANY
}
