/*
 * Copyright 2016 Netbrasoft
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

package com.netbrasoft.gnuob.api.order;

import com.netbrasoft.gnuob.api.MetaData;
import com.netbrasoft.gnuob.api.Order;

public abstract interface ICheckoutWebServiceRepository<O extends Order> {

  public abstract O doCheckout(MetaData credentials, O orderType);

  public abstract O doCheckoutDetails(MetaData credentials, O orderType);

  public abstract O doCheckoutPayment(MetaData credentials, O orderType);

  public abstract O doNotification(MetaData credentials, O orderType);

  public abstract O doRefundTransaction(MetaData credentials, O orderType);

  public abstract O doTransactionDetails(MetaData credentials, O orderType);
}