/*
 * Copyright 2013 Steve Jones. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.github.sjones4.youare;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.github.sjones4.youare.model.CreateAccountRequest;
import com.github.sjones4.youare.model.CreateAccountResult;
import com.github.sjones4.youare.model.DeleteAccountRequest;
import com.github.sjones4.youare.model.ListAccountsRequest;
import com.github.sjones4.youare.model.ListAccountsResult;

/**
 *
 */
public interface YouAre {
  CreateAccountResult createAccount(CreateAccountRequest createAccountRequest) throws AmazonServiceException, AmazonClientException;

  void deleteAccount(DeleteAccountRequest deleteAccountRequest) throws AmazonServiceException, AmazonClientException;

  ListAccountsResult listAccounts() throws AmazonServiceException, AmazonClientException;

  ListAccountsResult listAccounts( ListAccountsRequest listAccountsRequest ) throws AmazonServiceException, AmazonClientException;
}