/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.dimensiondata.cloudcontrol.domain;

import com.google.auto.value.AutoValue;
import org.jclouds.javax.annotation.Nullable;
import org.jclouds.json.SerializedNames;

@AutoValue
public abstract class Disk {

   Disk() {
   }

   @Nullable
   public abstract String id();

   @Nullable
   public abstract Integer scsiId();

   @Nullable
   public abstract Integer sizeGb();

   public abstract String speed();

   @Nullable
   public abstract State state();

   @SerializedNames({ "id", "scsiId", "sizeGb", "speed", "state" })
   public static Disk create(String id, Integer scsiId, Integer sizeGb, String speed, State state) {
      return builder().id(id).scsiId(scsiId).sizeGb(sizeGb).speed(speed).state(state).build();
   }

   public abstract Builder toBuilder();

   @AutoValue.Builder
   public abstract static class Builder {
      public abstract Builder id(String id);

      public abstract Builder scsiId(Integer scsiId);

      public abstract Builder sizeGb(Integer sizeGb);

      public abstract Builder speed(String speed);

      public abstract Builder state(State state);

      public abstract Disk build();
   }

   public static Builder builder() {
      return new AutoValue_Disk.Builder();
   }
}
