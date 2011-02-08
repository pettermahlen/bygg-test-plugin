/**
 * Copyright (C) 2004 - 2009 Shopzilla, Inc. 
 * All rights reserved. Unauthorized disclosure or distribution is prohibited.
 */

package com.pettermahlen.byggTestPlugin;

import com.pettermahlen.bygg.ByggTargetExecutor;

/**
 * TODO: document this class!
 *
 * @author Petter Måhlén
 * @since 07/02/2011
 */
public class ByggTestPlugin implements ByggTargetExecutor {
    @Override
    public void execute() {
        System.out.println("executing plugin!");
    }
}
