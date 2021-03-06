package domain

import groovy.transform.ToString
import groovyx.gaelyk.datastore.Entity
import groovyx.gaelyk.datastore.Unindexed

/**
 * Created by rahulsomasunderam on 8/9/14.
 */
@Entity(unindexed = false)
@ToString
class UserList implements Serializable {
    String username
    @Unindexed List<String> hashes

    static UserList findByUsername(String un) {
        UserList.find {
            where username == un
        }
    }
}
