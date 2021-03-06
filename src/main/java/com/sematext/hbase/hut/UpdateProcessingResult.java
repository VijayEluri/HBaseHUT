/**
 * Copyright 2010 Sematext International
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
package com.sematext.hbase.hut;

import org.apache.hadoop.hbase.KeyValue;

/**
 * Defines processing result
 */
public interface UpdateProcessingResult {
  public void add(byte[] colFam, byte[] qualifier, byte[] value);
  public void delete(byte[] colFam, byte[] qualifier);

  /**
   * Adds keyValues to the result.
   * NOTE: will work only when keyValues have the same row key length as the records being processed
   * @param kvs keyValues to add
   */
  void add(KeyValue[] kvs);

  /**
   * Adds keyValue to the result.
   * NOTE: will work only when keyValue has the same row key length as the records being processed
   * @param kvToAdd keyValue to add
   */
  void add(KeyValue kvToAdd);
}