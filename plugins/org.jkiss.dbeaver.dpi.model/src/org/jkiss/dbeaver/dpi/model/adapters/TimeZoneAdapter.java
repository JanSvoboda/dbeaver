/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
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
package org.jkiss.dbeaver.dpi.model.adapters;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.jkiss.dbeaver.dpi.model.DPIContext;

import java.io.IOException;
import java.util.TimeZone;

public class TimeZoneAdapter extends AbstractTypeAdapter<TimeZone> {
    public TimeZoneAdapter(DPIContext context) {
        super(context);
    }

    @Override
    public void write(JsonWriter jsonWriter, TimeZone timeZone) throws IOException {
        jsonWriter.value(timeZone.getID());
    }

    @Override
    public TimeZone read(JsonReader jsonReader) throws IOException {
        return TimeZone.getTimeZone(jsonReader.nextString());
    }
}
