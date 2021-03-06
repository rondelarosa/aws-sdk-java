/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/StartCrawlerSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartCrawlerScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the crawler to schedule.
     * </p>
     */
    private String crawlerName;

    /**
     * <p>
     * Name of the crawler to schedule.
     * </p>
     * 
     * @param crawlerName
     *        Name of the crawler to schedule.
     */

    public void setCrawlerName(String crawlerName) {
        this.crawlerName = crawlerName;
    }

    /**
     * <p>
     * Name of the crawler to schedule.
     * </p>
     * 
     * @return Name of the crawler to schedule.
     */

    public String getCrawlerName() {
        return this.crawlerName;
    }

    /**
     * <p>
     * Name of the crawler to schedule.
     * </p>
     * 
     * @param crawlerName
     *        Name of the crawler to schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartCrawlerScheduleRequest withCrawlerName(String crawlerName) {
        setCrawlerName(crawlerName);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCrawlerName() != null)
            sb.append("CrawlerName: ").append(getCrawlerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartCrawlerScheduleRequest == false)
            return false;
        StartCrawlerScheduleRequest other = (StartCrawlerScheduleRequest) obj;
        if (other.getCrawlerName() == null ^ this.getCrawlerName() == null)
            return false;
        if (other.getCrawlerName() != null && other.getCrawlerName().equals(this.getCrawlerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrawlerName() == null) ? 0 : getCrawlerName().hashCode());
        return hashCode;
    }

    @Override
    public StartCrawlerScheduleRequest clone() {
        return (StartCrawlerScheduleRequest) super.clone();
    }

}
