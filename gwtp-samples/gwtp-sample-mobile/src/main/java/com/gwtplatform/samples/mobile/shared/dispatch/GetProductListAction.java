/**
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.samples.mobile.shared.dispatch;

import com.gwtplatform.dispatch.rpc.shared.Action;

public class GetProductListAction implements Action<GetProductListResult> {
    private int flags;

    public GetProductListAction(int flags) {
        this.flags = flags;
    }

    protected GetProductListAction() {
        // Possibly for serialization.
    }

    @Override
    public String getServiceName() {
        return Action.DEFAULT_SERVICE_NAME + "GetProductList";
    }

    @Override
    public boolean isSecured() {
        return false;
    }

    public int getFlags() {
        return flags;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        GetProductListAction other = (GetProductListAction) obj;

        return flags == other.flags;
    }

    @Override
    public int hashCode() {
        int hashCode = 23;
        hashCode = (hashCode * 37) + new Integer(flags).hashCode();
        return hashCode;
    }

    @Override
    public String toString() {
        return "GetProductListAction[" + flags + "]";
    }
}
