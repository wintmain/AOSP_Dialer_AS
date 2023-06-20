// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/fissy/dialer/calllog/model/coalesced_row.proto

package com.wintmain.dialer.calllog.model;

public interface CoalescedRowOrBuilder extends
        // @@protoc_insertion_point(interface_extends:com.fissy.dialer.calllog.model.CoalescedRow)
        com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog._ID
     * </pre>
     *
     * <code>optional int64 id = 1;</code>
     */
    boolean hasId();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog._ID
     * </pre>
     *
     * <code>optional int64 id = 1;</code>
     */
    long getId();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.TIMESTAMP
     * </pre>
     *
     * <code>optional int64 timestamp = 2;</code>
     */
    boolean hasTimestamp();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.TIMESTAMP
     * </pre>
     *
     * <code>optional int64 timestamp = 2;</code>
     */
    long getTimestamp();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NUMBER
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber number = 3;</code>
     */
    boolean hasNumber();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NUMBER
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber number = 3;</code>
     */
    com.wintmain.dialer.DialerPhoneNumber getNumber();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.FORMATTED_NUMBER
     * </pre>
     *
     * <code>optional string formatted_number = 4;</code>
     */
    boolean hasFormattedNumber();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.FORMATTED_NUMBER
     * </pre>
     *
     * <code>optional string formatted_number = 4;</code>
     */
    java.lang.String getFormattedNumber();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.FORMATTED_NUMBER
     * </pre>
     *
     * <code>optional string formatted_number = 4;</code>
     */
    com.google.protobuf.ByteString
    getFormattedNumberBytes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NUMBER_PRESENTATION
     * </pre>
     *
     * <code>optional int32 number_presentation = 5;</code>
     */
    boolean hasNumberPresentation();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NUMBER_PRESENTATION
     * </pre>
     *
     * <code>optional int32 number_presentation = 5;</code>
     */
    int getNumberPresentation();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.IS_READ
     * </pre>
     *
     * <code>optional bool is_read = 6;</code>
     */
    boolean hasIsRead();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.IS_READ
     * </pre>
     *
     * <code>optional bool is_read = 6;</code>
     */
    boolean getIsRead();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NEW
     * </pre>
     *
     * <code>optional bool is_new = 7;</code>
     */
    boolean hasIsNew();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NEW
     * </pre>
     *
     * <code>optional bool is_new = 7;</code>
     */
    boolean getIsNew();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.GEOCODED_LOCATION
     * </pre>
     *
     * <code>optional string geocoded_location = 8;</code>
     */
    boolean hasGeocodedLocation();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.GEOCODED_LOCATION
     * </pre>
     *
     * <code>optional string geocoded_location = 8;</code>
     */
    java.lang.String getGeocodedLocation();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.GEOCODED_LOCATION
     * </pre>
     *
     * <code>optional string geocoded_location = 8;</code>
     */
    com.google.protobuf.ByteString
    getGeocodedLocationBytes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.PHONE_ACCOUNT_COMPONENT_NAME
     * </pre>
     *
     * <code>optional string phone_account_component_name = 9;</code>
     */
    boolean hasPhoneAccountComponentName();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.PHONE_ACCOUNT_COMPONENT_NAME
     * </pre>
     *
     * <code>optional string phone_account_component_name = 9;</code>
     */
    java.lang.String getPhoneAccountComponentName();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.PHONE_ACCOUNT_COMPONENT_NAME
     * </pre>
     *
     * <code>optional string phone_account_component_name = 9;</code>
     */
    com.google.protobuf.ByteString
    getPhoneAccountComponentNameBytes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.PHONE_ACCOUNT_ID
     * </pre>
     *
     * <code>optional string phone_account_id = 10;</code>
     */
    boolean hasPhoneAccountId();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.PHONE_ACCOUNT_ID
     * </pre>
     *
     * <code>optional string phone_account_id = 10;</code>
     */
    java.lang.String getPhoneAccountId();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.PHONE_ACCOUNT_ID
     * </pre>
     *
     * <code>optional string phone_account_id = 10;</code>
     */
    com.google.protobuf.ByteString
    getPhoneAccountIdBytes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.FEATURES
     * </pre>
     *
     * <code>optional int32 features = 11;</code>
     */
    boolean hasFeatures();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.FEATURES
     * </pre>
     *
     * <code>optional int32 features = 11;</code>
     */
    int getFeatures();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.CALL_TYPE
     * </pre>
     *
     * <code>optional int32 call_type = 12;</code>
     */
    boolean hasCallType();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.CALL_TYPE
     * </pre>
     *
     * <code>optional int32 call_type = 12;</code>
     */
    int getCallType();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NUMBER_ATTRIBUTES
     * </pre>
     *
     * <code>optional .com.fissy.dialer.NumberAttributes number_attributes = 13;</code>
     */
    boolean hasNumberAttributes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.NUMBER_ATTRIBUTES
     * </pre>
     *
     * <code>optional .com.fissy.dialer.NumberAttributes number_attributes = 13;</code>
     */
    com.wintmain.dialer.NumberAttributes getNumberAttributes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.IS_VOICEMAIL_CALL
     * </pre>
     *
     * <code>optional bool is_voicemail_call = 14;</code>
     */
    boolean hasIsVoicemailCall();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.IS_VOICEMAIL_CALL
     * </pre>
     *
     * <code>optional bool is_voicemail_call = 14;</code>
     */
    boolean getIsVoicemailCall();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.VOICEMAIL_CALL_TAG
     * </pre>
     *
     * <code>optional string voicemail_call_tag = 15;</code>
     */
    boolean hasVoicemailCallTag();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.VOICEMAIL_CALL_TAG
     * </pre>
     *
     * <code>optional string voicemail_call_tag = 15;</code>
     */
    java.lang.String getVoicemailCallTag();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.VOICEMAIL_CALL_TAG
     * </pre>
     *
     * <code>optional string voicemail_call_tag = 15;</code>
     */
    com.google.protobuf.ByteString
    getVoicemailCallTagBytes();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.COALESCED_IDS
     * </pre>
     *
     * <code>optional .com.fissy.dialer.CoalescedIds coalesced_ids = 16;</code>
     */
    boolean hasCoalescedIds();

    /**
     * <pre>
     * Value in column CoalescedAnnotatedCallLog.COALESCED_IDS
     * </pre>
     *
     * <code>optional .com.fissy.dialer.CoalescedIds coalesced_ids = 16;</code>
     */
    com.wintmain.dialer.CoalescedIds getCoalescedIds();
}