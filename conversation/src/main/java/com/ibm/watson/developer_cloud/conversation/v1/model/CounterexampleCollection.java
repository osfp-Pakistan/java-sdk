/*
 * Copyright 2017 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.conversation.v1.model;

import java.util.List;

import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * CounterexampleCollection.
 */
public class CounterexampleCollection extends GenericModel {

  private List<Counterexample> counterexamples;
  private Pagination pagination;

  /**
   * Gets the counterexamples.
   *
   * An array of objects describing the examples marked as irrelevant input.
   *
   * @return the counterexamples
   */
  public List<Counterexample> getCounterexamples() {
    return counterexamples;
  }

  /**
   * Gets the pagination.
   *
   * An object defining the pagination data for the returned objects.
   *
   * @return the pagination
   */
  public Pagination getPagination() {
    return pagination;
  }

  /**
   * Sets the counterexamples.
   *
   * @param counterexamples the new counterexamples
   */
  public void setCounterexamples(final List<Counterexample> counterexamples) {
    this.counterexamples = counterexamples;
  }

  /**
   * Sets the pagination.
   *
   * @param pagination the new pagination
   */
  public void setPagination(final Pagination pagination) {
    this.pagination = pagination;
  }
}
