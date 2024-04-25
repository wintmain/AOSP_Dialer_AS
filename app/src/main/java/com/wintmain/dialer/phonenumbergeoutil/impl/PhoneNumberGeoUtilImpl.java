/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.wintmain.dialer.phonenumbergeoutil.impl;

import android.content.Context;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.geocoding.PhoneNumberOfflineGeocoder;
import com.wintmain.dialer.common.LogUtil;
import com.wintmain.dialer.i18n.LocaleUtils;
import com.wintmain.dialer.phonenumbergeoutil.PhoneNumberGeoUtil;

import javax.inject.Inject;
import java.util.Locale;

/**
 * Implementation of {@link PhoneNumberGeoUtil}.
 */
public class PhoneNumberGeoUtilImpl implements PhoneNumberGeoUtil {

    @Inject
    public PhoneNumberGeoUtilImpl() {
    }

    @Override
    public String getGeoDescription(Context context, String number, String countryIso) {
        LogUtil.v("PhoneNumberGeoUtilImpl.getGeoDescription", LogUtil.sanitizePii(number));

        if (TextUtils.isEmpty(number)) {
            return null;
        }

        PhoneNumberUtil util = PhoneNumberUtil.getInstance();
        PhoneNumberOfflineGeocoder geocoder = PhoneNumberOfflineGeocoder.getInstance();

        Locale locale = LocaleUtils.getLocale(context);
        Phonenumber.PhoneNumber pn = null;
        try {
            LogUtil.v(
                    "PhoneNumberGeoUtilImpl.getGeoDescription",
                    "parsing '" + LogUtil.sanitizePii(number) + "' for countryIso '" + countryIso
                            + "'...");
            pn = util.parse(number, countryIso);
            LogUtil.v(
                    "PhoneNumberGeoUtilImpl.getGeoDescription",
                    "- parsed number: " + LogUtil.sanitizePii(pn));
        } catch (NumberParseException e) {
            LogUtil.e(
                    "PhoneNumberGeoUtilImpl.getGeoDescription",
                    "getGeoDescription: NumberParseException for incoming number '"
                            + LogUtil.sanitizePii(number)
                            + "'");
        }

        if (pn != null) {
            String description = geocoder.getDescriptionForNumber(pn, locale);
            LogUtil.v(
                    "PhoneNumberGeoUtilImpl.getGeoDescription",
                    "- got description: '" + description + "'");
            return description;
        }

        return null;
    }
}
