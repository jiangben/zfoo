/*
 * Copyright (C) 2020 The zfoo Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package com.zfoo.net.packet.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.zfoo.protocol.IPacket;

import java.util.Comparator;

/**
 * @author godotg
 * @version 3.0
 */
public class PairIntLong implements IPacket {

    public static final short PROTOCOL_ID = 110;

    @JsonSerialize(using = ToStringSerializer.class)
    private int key;

    @JsonSerialize(using = ToStringSerializer.class)
    private long value;

    public static PairIntLong valueOf(int key, long value) {
        var pair = new PairIntLong();
        pair.key = key;
        pair.value = value;
        return pair;
    }

    @Override
    public short protocolId() {
        return PROTOCOL_ID;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}