/**
 * Copyright 2015 IBM Corp. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.ibm.watson.developer_cloud.retrieve_and_rank.v1;

import java.io.File;
import java.io.InputStream;
import java.util.Collection;

/**
 * Manages Solr Clusters configuration.
 */
public interface SolrConfigManager {

  /**
   * Uploads a configuration ZIP {@link File} to ZooKeeper's namespace, including schema.xml,
   * solrconfig.xml, and all other necessary config files to configure a SolrCloud collection.
   * <p>
   * For uploading a directory, use
   * {@link #uploadSolrClusterConfigurationDirectory(String , String, File)} instead. Config files
   * on the XSLT path will not be uploaded.
   * 
   * @param solrClusterId the solr cluster id
   * @param configName the name of the config in ZooKeeper. This name is used when referencing the
   *        config when creating a collection.
   * @param zippedConfig the ZIP file to upload.
   */
  void uploadSolrClusterConfigurationZip(final String solrClusterId, final String configName,
      final File zippedConfig);

  /**
   * Deletes a configuration namespace in ZooKeeper.
   * 
   * @param solrClusterId the solr cluster id
   * @param configurationName the name of the configuration in ZooKeeper.
   */
  void deleteSolrClusterConfiguration(final String solrClusterId, final String configurationName);

  /**
   * Gets the configuration from ZooKeeper.
   * 
   * @param solrClusterId the solr cluster id
   * @param configurationName the name of the configuration in ZooKeeper
   * @return an InputStream containing the zipped configuration if it exists in ZooKeeper or null if
   *         it is not found
   */
  InputStream getSolrClusterConfiguration(final String solrClusterId,
      final String configurationName);

  /**
   * Uploads a configuration {@link File} to ZooKeeper's namespace, including schema.xml,
   * solrconfig.xml, and all other necessary config files to configure a SolrCloud collection.
   * <p>
   * The configuration directory is sent to Solr as a ZIP file. For uploading a ZIP file directly,
   * use {@link #uploadSolrClusterConfigurationZip(String, String, File)} instead. Config files on
   * the XSLT path will not be uploaded.
   * 
   * @param solrClusterId the solr cluster id
   * @param configName the name of the config in ZooKeeper. This name is used when referencing the
   *        config when creating a collection.
   * @param configDirectory the directory to upload.
   * @throws IllegalArgumentException if configDirectory is not a directory
   */
  void uploadSolrClusterConfigurationDirectory(final String solrClusterId, final String configName,
      final File configDirectory);

  /**
   * Lists the configuration sets in ZooKeeper.
   * 
   * @param solrClusterId the solr cluster id
   * @return a list of the names of the configuration sets
   */
  Collection<String> getSolrClusterConfigurations(final String solrClusterId);
}
