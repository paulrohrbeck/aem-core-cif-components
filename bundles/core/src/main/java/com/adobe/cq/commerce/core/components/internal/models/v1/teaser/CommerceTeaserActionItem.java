/*******************************************************************************
 *
 *    Copyright 2019 Adobe. All rights reserved.
 *    This file is licensed to you under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License. You may obtain a copy
 *    of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software distributed under
 *    the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 *    OF ANY KIND, either express or implied. See the License for the specific language
 *    governing permissions and limitations under the License.
 *
 ******************************************************************************/

package com.adobe.cq.commerce.core.components.internal.models.v1.teaser;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.adobe.cq.wcm.core.components.models.ListItem;

public class CommerceTeaserActionItem implements ListItem {

    private String title;
    private String url;
    private String categoryId;
    private String productSlug;

    public CommerceTeaserActionItem(String title, String url) {
        this.title = title;
        this.url = url;
    }

    public CommerceTeaserActionItem(String title, String url, String categoryId, String productSlug) {
        this(title, url);
        this.categoryId = categoryId;
        this.productSlug = productSlug;
    }

    @Nonnull
    @Override
    public String getTitle() {
        return title;
    }

    @Nonnull
    @Override
    public String getURL() {
        return url;
    }

    @Nullable
    public String getCategoryId() {
        return categoryId;
    }

    @Nullable
    public String getProductSlug() {
        return productSlug;
    }
}
