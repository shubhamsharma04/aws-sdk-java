/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status of the Cognito options for the specified Elasticsearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CognitoOptionsStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the Cognito options for the specified Elasticsearch domain.
     * </p>
     */
    private CognitoOptions options;
    /**
     * <p>
     * Specifies the status of the Cognito options for the specified Elasticsearch domain.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * Specifies the Cognito options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param options
     *        Specifies the Cognito options for the specified Elasticsearch domain.
     */

    public void setOptions(CognitoOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Specifies the Cognito options for the specified Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the Cognito options for the specified Elasticsearch domain.
     */

    public CognitoOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Specifies the Cognito options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param options
     *        Specifies the Cognito options for the specified Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptionsStatus withOptions(CognitoOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the Cognito options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param status
     *        Specifies the status of the Cognito options for the specified Elasticsearch domain.
     */

    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the Cognito options for the specified Elasticsearch domain.
     * </p>
     * 
     * @return Specifies the status of the Cognito options for the specified Elasticsearch domain.
     */

    public OptionStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the Cognito options for the specified Elasticsearch domain.
     * </p>
     * 
     * @param status
     *        Specifies the status of the Cognito options for the specified Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CognitoOptionsStatus withStatus(OptionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CognitoOptionsStatus == false)
            return false;
        CognitoOptionsStatus other = (CognitoOptionsStatus) obj;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CognitoOptionsStatus clone() {
        try {
            return (CognitoOptionsStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.CognitoOptionsStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
