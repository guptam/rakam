/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rakam.report.eventexplorer;

import io.airlift.configuration.Config;


public class EventExplorerConfig {
    private boolean enabled = false;
    private boolean precomputed = true;

    @Config("event-explorer.enabled")
    public void setEventExplorerEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isEventExplorerEnabled() {
        return enabled;
    }

    @Config("event-explorer.pre-computed")
    public void setPreComputed(boolean precomputed) {
        this.precomputed = precomputed;
    }

    public boolean getPreComputed() {
        return precomputed;
    }
}
