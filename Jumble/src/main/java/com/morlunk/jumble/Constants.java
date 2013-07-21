/*
 * Copyright (C) 2013 Andrew Comminos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.morlunk.jumble;

public class Constants {

    public static final int PROTOCOL_MAJOR = 1;
    public static final int PROTOCOL_MINOR = 2;
    public static final int PROTOCOL_PATCH = 4;

    public static final int PROTOCOL_VERSION = (PROTOCOL_MAJOR << 16) | (PROTOCOL_MINOR << 8) | PROTOCOL_PATCH;
    public static final String PROTOCOL_STRING = PROTOCOL_MAJOR+"."+PROTOCOL_MINOR+"."+PROTOCOL_PATCH;
    public static final int CELT_VERSION = 0x8000000b; // TODO get this programmatically through native libs
    public static final int DEFAULT_PORT = 64738;

    public static final String TAG = "Jumble";
}
