/* (c) Planet Labs Inc. - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package stratus.redis.rest.info;

import java.util.Properties;

/**
 * @author joshfix
 * Created on 6/15/18
 */
public interface InfoService {
    Properties getInfo();
}
