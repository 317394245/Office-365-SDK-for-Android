/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.outlookservices.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.services.odata.interfaces.*;
import com.microsoft.outlookservices.*;
import static com.microsoft.services.odata.Helpers.serializeToJsonByteArray;
import static com.microsoft.services.odata.EntityFetcherHelper.addEntityResultCallback;

/**
 * The type ContactOperations.
 */
public class ContactOperations extends ODataOperations {

     /**
      * Instantiates a new ContactOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
	public ContactOperations(String urlComponent, ODataExecutable parent) {
            super(urlComponent, parent);
    }

      /**
      * Add parameter.
      *
      * @param name the name
      * @param value the value
      * @return the contact operations.
      */
	public ContactOperations addParameter(String name, Object value) {
	    addCustomParameter(name, value);
        return this;
	}
}