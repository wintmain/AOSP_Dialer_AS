// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packages/apps/Dialer/java/com/fissy/dialer/calldetails/proto/call_details_header_info.proto

package com.wintmain.dialer.calldetails;

/**
 * <pre>
 * Contains information for the header in CallDetailsActivity
 * Next ID: 5
 * </pre>
 * <p>
 * Protobuf type {@code com.fissy.dialer.calldetails.CallDetailsHeaderInfo}
 */
public final class CallDetailsHeaderInfo extends
        com.google.protobuf.GeneratedMessageLite<
                CallDetailsHeaderInfo, CallDetailsHeaderInfo.Builder> implements
        // @@protoc_insertion_point(message_implements:com.fissy.dialer.calldetails.CallDetailsHeaderInfo)
        CallDetailsHeaderInfoOrBuilder {
    public static final int DIALER_PHONE_NUMBER_FIELD_NUMBER = 1;
    public static final int PHOTO_INFO_FIELD_NUMBER = 2;
    public static final int PRIMARY_TEXT_FIELD_NUMBER = 3;
    public static final int SECONDARY_TEXT_FIELD_NUMBER = 4;
    // @@protoc_insertion_point(class_scope:com.fissy.dialer.calldetails.CallDetailsHeaderInfo)
    private static final com.wintmain.dialer.calldetails.CallDetailsHeaderInfo DEFAULT_INSTANCE;
    private static volatile com.google.protobuf.Parser<CallDetailsHeaderInfo> PARSER;

    static {
        DEFAULT_INSTANCE = new CallDetailsHeaderInfo();
        DEFAULT_INSTANCE.makeImmutable();
    }

    private int bitField0_;
    private com.wintmain.dialer.DialerPhoneNumber dialerPhoneNumber_;
    private com.wintmain.dialer.glidephotomanager.PhotoInfo photoInfo_;
    private java.lang.String primaryText_;
    private java.lang.String secondaryText_;

    private CallDetailsHeaderInfo() {
        primaryText_ = "";
        secondaryText_ = "";
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageLite.parseFrom(
                DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(com.wintmain.dialer.calldetails.CallDetailsHeaderInfo prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public static com.wintmain.dialer.calldetails.CallDetailsHeaderInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.google.protobuf.Parser<CallDetailsHeaderInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /**
     * <pre>
     * The number of all call detail entries.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
     */
    public boolean hasDialerPhoneNumber() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <pre>
     * The number of all call detail entries.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
     */
    public com.wintmain.dialer.DialerPhoneNumber getDialerPhoneNumber() {
        return dialerPhoneNumber_ == null ? com.wintmain.dialer.DialerPhoneNumber.getDefaultInstance() : dialerPhoneNumber_;
    }

    /**
     * <pre>
     * The number of all call detail entries.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
     */
    private void setDialerPhoneNumber(com.wintmain.dialer.DialerPhoneNumber value) {
        if (value == null) {
            throw new NullPointerException();
        }
        dialerPhoneNumber_ = value;
        bitField0_ |= 0x00000001;
    }

    /**
     * <pre>
     * The number of all call detail entries.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
     */
    private void setDialerPhoneNumber(
            com.wintmain.dialer.DialerPhoneNumber.Builder builderForValue) {
        dialerPhoneNumber_ = builderForValue.build();
        bitField0_ |= 0x00000001;
    }

    /**
     * <pre>
     * The number of all call detail entries.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
     */
    private void mergeDialerPhoneNumber(com.wintmain.dialer.DialerPhoneNumber value) {
        if (dialerPhoneNumber_ != null &&
                dialerPhoneNumber_ != com.wintmain.dialer.DialerPhoneNumber.getDefaultInstance()) {
            dialerPhoneNumber_ =
                    com.wintmain.dialer.DialerPhoneNumber.newBuilder(dialerPhoneNumber_).mergeFrom(value).buildPartial();
        } else {
            dialerPhoneNumber_ = value;
        }
        bitField0_ |= 0x00000001;
    }

    /**
     * <pre>
     * The number of all call detail entries.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
     */
    private void clearDialerPhoneNumber() {
        dialerPhoneNumber_ = null;
        bitField0_ = (bitField0_ & ~0x00000001);
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public boolean hasPhotoInfo() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    public com.wintmain.dialer.glidephotomanager.PhotoInfo getPhotoInfo() {
        return photoInfo_ == null ? com.wintmain.dialer.glidephotomanager.PhotoInfo.getDefaultInstance() : photoInfo_;
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    private void setPhotoInfo(com.wintmain.dialer.glidephotomanager.PhotoInfo value) {
        if (value == null) {
            throw new NullPointerException();
        }
        photoInfo_ = value;
        bitField0_ |= 0x00000002;
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    private void setPhotoInfo(
            com.wintmain.dialer.glidephotomanager.PhotoInfo.Builder builderForValue) {
        photoInfo_ = builderForValue.build();
        bitField0_ |= 0x00000002;
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    private void mergePhotoInfo(com.wintmain.dialer.glidephotomanager.PhotoInfo value) {
        if (photoInfo_ != null &&
                photoInfo_ != com.wintmain.dialer.glidephotomanager.PhotoInfo.getDefaultInstance()) {
            photoInfo_ =
                    com.wintmain.dialer.glidephotomanager.PhotoInfo.newBuilder(photoInfo_).mergeFrom(value).buildPartial();
        } else {
            photoInfo_ = value;
        }
        bitField0_ |= 0x00000002;
    }

    /**
     * <pre>
     * Information used to load the contact photo.
     * </pre>
     *
     * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
     */
    private void clearPhotoInfo() {
        photoInfo_ = null;
        bitField0_ = (bitField0_ & ~0x00000002);
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public boolean hasPrimaryText() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public java.lang.String getPrimaryText() {
        return primaryText_;
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    private void setPrimaryText(
            java.lang.String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        primaryText_ = value;
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    public com.google.protobuf.ByteString
    getPrimaryTextBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(primaryText_);
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    private void setPrimaryTextBytes(
            com.google.protobuf.ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        primaryText_ = value.toStringUtf8();
    }

    /**
     * <pre>
     * Primary text of the header, which can be
     * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
     * (2) the contact name, or
     * (3) the formatted number.
     * </pre>
     *
     * <code>optional string primary_text = 3;</code>
     */
    private void clearPrimaryText() {
        bitField0_ = (bitField0_ & ~0x00000004);
        primaryText_ = getDefaultInstance().getPrimaryText();
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public boolean hasSecondaryText() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public java.lang.String getSecondaryText() {
        return secondaryText_;
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    private void setSecondaryText(
            java.lang.String value) {
        if (value == null) {
            throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        secondaryText_ = value;
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    public com.google.protobuf.ByteString
    getSecondaryTextBytes() {
        return com.google.protobuf.ByteString.copyFromUtf8(secondaryText_);
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    private void setSecondaryTextBytes(
            com.google.protobuf.ByteString value) {
        if (value == null) {
            throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        secondaryText_ = value.toStringUtf8();
    }

    /**
     * <pre>
     * Secondary test of the header, which describes the number.
     * Some examples are:
     *   "Mobile • 555-1234",
     *   "Blocked • Mobile • 555-1234", and
     *   "Spam • Mobile • 555-1234".
     * </pre>
     *
     * <code>optional string secondary_text = 4;</code>
     */
    private void clearSecondaryText() {
        bitField0_ = (bitField0_ & ~0x00000008);
        secondaryText_ = getDefaultInstance().getSecondaryText();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            output.writeMessage(1, getDialerPhoneNumber());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            output.writeMessage(2, getPhotoInfo());
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            output.writeString(3, getPrimaryText());
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            output.writeString(4, getSecondaryText());
        }
        unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1) return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, getDialerPhoneNumber());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, getPhotoInfo());
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeStringSize(3, getPrimaryText());
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
            size += com.google.protobuf.CodedOutputStream
                    .computeStringSize(4, getSecondaryText());
        }
        size += unknownFields.getSerializedSize();
        memoizedSerializedSize = size;
        return size;
    }

    protected Object dynamicMethod(
            com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
            Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE: {
                return new com.wintmain.dialer.calldetails.CallDetailsHeaderInfo();
            }
            case IS_INITIALIZED: {
                return DEFAULT_INSTANCE;
            }
            case MAKE_IMMUTABLE: {
                return null;
            }
            case NEW_BUILDER: {
                return new Builder();
            }
            case VISIT: {
                Visitor visitor = (Visitor) arg0;
                com.wintmain.dialer.calldetails.CallDetailsHeaderInfo other = (com.wintmain.dialer.calldetails.CallDetailsHeaderInfo) arg1;
                dialerPhoneNumber_ = visitor.visitMessage(dialerPhoneNumber_, other.dialerPhoneNumber_);
                photoInfo_ = visitor.visitMessage(photoInfo_, other.photoInfo_);
                primaryText_ = visitor.visitString(
                        hasPrimaryText(), primaryText_,
                        other.hasPrimaryText(), other.primaryText_);
                secondaryText_ = visitor.visitString(
                        hasSecondaryText(), secondaryText_,
                        other.hasSecondaryText(), other.secondaryText_);
                if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
                        .INSTANCE) {
                    bitField0_ |= other.bitField0_;
                }
                return this;
            }
            case MERGE_FROM_STREAM: {
                com.google.protobuf.CodedInputStream input =
                        (com.google.protobuf.CodedInputStream) arg0;
                com.google.protobuf.ExtensionRegistryLite extensionRegistry =
                        (com.google.protobuf.ExtensionRegistryLite) arg1;
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            default: {
                                if (!parseUnknownField(tag, input)) {
                                    done = true;
                                }
                                break;
                            }
                            case 10: {
                                com.wintmain.dialer.DialerPhoneNumber.Builder subBuilder = null;
                                if (((bitField0_ & 0x00000001) == 0x00000001)) {
                                    subBuilder = dialerPhoneNumber_.toBuilder();
                                }
                                dialerPhoneNumber_ = input.readMessage(com.wintmain.dialer.DialerPhoneNumber.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(dialerPhoneNumber_);
                                    dialerPhoneNumber_ = subBuilder.buildPartial();
                                }
                                bitField0_ |= 0x00000001;
                                break;
                            }
                            case 18: {
                                com.wintmain.dialer.glidephotomanager.PhotoInfo.Builder subBuilder = null;
                                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                                    subBuilder = photoInfo_.toBuilder();
                                }
                                photoInfo_ = input.readMessage(com.wintmain.dialer.glidephotomanager.PhotoInfo.parser(), extensionRegistry);
                                if (subBuilder != null) {
                                    subBuilder.mergeFrom(photoInfo_);
                                    photoInfo_ = subBuilder.buildPartial();
                                }
                                bitField0_ |= 0x00000002;
                                break;
                            }
                            case 26: {
                                String s = input.readString();
                                bitField0_ |= 0x00000004;
                                primaryText_ = s;
                                break;
                            }
                            case 34: {
                                String s = input.readString();
                                bitField0_ |= 0x00000008;
                                secondaryText_ = s;
                                break;
                            }
                        }
                    }
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw new RuntimeException(e.setUnfinishedMessage(this));
                } catch (java.io.IOException e) {
                    throw new RuntimeException(
                            new com.google.protobuf.InvalidProtocolBufferException(
                                    e.getMessage()).setUnfinishedMessage(this));
                }
            }
            case GET_DEFAULT_INSTANCE: {
                return DEFAULT_INSTANCE;
            }
            case GET_PARSER: {
                if (PARSER == null) {
                    synchronized (com.wintmain.dialer.calldetails.CallDetailsHeaderInfo.class) {
                        if (PARSER == null) {
                            PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                        }
                    }
                }
                return PARSER;
            }
        }
        throw new UnsupportedOperationException();
    }

    /**
     * <pre>
     * Contains information for the header in CallDetailsActivity
     * Next ID: 5
     * </pre>
     * <p>
     * Protobuf type {@code com.fissy.dialer.calldetails.CallDetailsHeaderInfo}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageLite.Builder<
                    com.wintmain.dialer.calldetails.CallDetailsHeaderInfo, Builder> implements
            // @@protoc_insertion_point(builder_implements:com.fissy.dialer.calldetails.CallDetailsHeaderInfo)
            com.wintmain.dialer.calldetails.CallDetailsHeaderInfoOrBuilder {
        // Construct using com.fissy.dialer.calldetails.CallDetailsHeaderInfo.newBuilder()
        private Builder() {
            super(DEFAULT_INSTANCE);
        }


        /**
         * <pre>
         * The number of all call detail entries.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
         */
        public boolean hasDialerPhoneNumber() {
            return instance.hasDialerPhoneNumber();
        }

        /**
         * <pre>
         * The number of all call detail entries.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
         */
        public com.wintmain.dialer.DialerPhoneNumber getDialerPhoneNumber() {
            return instance.getDialerPhoneNumber();
        }

        /**
         * <pre>
         * The number of all call detail entries.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
         */
        public Builder setDialerPhoneNumber(com.wintmain.dialer.DialerPhoneNumber value) {
            copyOnWrite();
            instance.setDialerPhoneNumber(value);
            return this;
        }

        /**
         * <pre>
         * The number of all call detail entries.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
         */
        public Builder setDialerPhoneNumber(
                com.wintmain.dialer.DialerPhoneNumber.Builder builderForValue) {
            copyOnWrite();
            instance.setDialerPhoneNumber(builderForValue);
            return this;
        }

        /**
         * <pre>
         * The number of all call detail entries.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
         */
        public Builder mergeDialerPhoneNumber(com.wintmain.dialer.DialerPhoneNumber value) {
            copyOnWrite();
            instance.mergeDialerPhoneNumber(value);
            return this;
        }

        /**
         * <pre>
         * The number of all call detail entries.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.DialerPhoneNumber dialer_phone_number = 1;</code>
         */
        public Builder clearDialerPhoneNumber() {
            copyOnWrite();
            instance.clearDialerPhoneNumber();
            return this;
        }

        /**
         * <pre>
         * Information used to load the contact photo.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
         */
        public boolean hasPhotoInfo() {
            return instance.hasPhotoInfo();
        }

        /**
         * <pre>
         * Information used to load the contact photo.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
         */
        public com.wintmain.dialer.glidephotomanager.PhotoInfo getPhotoInfo() {
            return instance.getPhotoInfo();
        }

        /**
         * <pre>
         * Information used to load the contact photo.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
         */
        public Builder setPhotoInfo(com.wintmain.dialer.glidephotomanager.PhotoInfo value) {
            copyOnWrite();
            instance.setPhotoInfo(value);
            return this;
        }

        /**
         * <pre>
         * Information used to load the contact photo.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
         */
        public Builder setPhotoInfo(
                com.wintmain.dialer.glidephotomanager.PhotoInfo.Builder builderForValue) {
            copyOnWrite();
            instance.setPhotoInfo(builderForValue);
            return this;
        }

        /**
         * <pre>
         * Information used to load the contact photo.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
         */
        public Builder mergePhotoInfo(com.wintmain.dialer.glidephotomanager.PhotoInfo value) {
            copyOnWrite();
            instance.mergePhotoInfo(value);
            return this;
        }

        /**
         * <pre>
         * Information used to load the contact photo.
         * </pre>
         *
         * <code>optional .com.fissy.dialer.glidephotomanager.PhotoInfo photo_info = 2;</code>
         */
        public Builder clearPhotoInfo() {
            copyOnWrite();
            instance.clearPhotoInfo();
            return this;
        }

        /**
         * <pre>
         * Primary text of the header, which can be
         * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
         * (2) the contact name, or
         * (3) the formatted number.
         * </pre>
         *
         * <code>optional string primary_text = 3;</code>
         */
        public boolean hasPrimaryText() {
            return instance.hasPrimaryText();
        }

        /**
         * <pre>
         * Primary text of the header, which can be
         * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
         * (2) the contact name, or
         * (3) the formatted number.
         * </pre>
         *
         * <code>optional string primary_text = 3;</code>
         */
        public java.lang.String getPrimaryText() {
            return instance.getPrimaryText();
        }

        /**
         * <pre>
         * Primary text of the header, which can be
         * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
         * (2) the contact name, or
         * (3) the formatted number.
         * </pre>
         *
         * <code>optional string primary_text = 3;</code>
         */
        public Builder setPrimaryText(
                java.lang.String value) {
            copyOnWrite();
            instance.setPrimaryText(value);
            return this;
        }

        /**
         * <pre>
         * Primary text of the header, which can be
         * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
         * (2) the contact name, or
         * (3) the formatted number.
         * </pre>
         *
         * <code>optional string primary_text = 3;</code>
         */
        public com.google.protobuf.ByteString
        getPrimaryTextBytes() {
            return instance.getPrimaryTextBytes();
        }

        /**
         * <pre>
         * Primary text of the header, which can be
         * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
         * (2) the contact name, or
         * (3) the formatted number.
         * </pre>
         *
         * <code>optional string primary_text = 3;</code>
         */
        public Builder setPrimaryTextBytes(
                com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setPrimaryTextBytes(value);
            return this;
        }

        /**
         * <pre>
         * Primary text of the header, which can be
         * (1) a presentation name (e.g., "Restricted", "Unknown", etc.),
         * (2) the contact name, or
         * (3) the formatted number.
         * </pre>
         *
         * <code>optional string primary_text = 3;</code>
         */
        public Builder clearPrimaryText() {
            copyOnWrite();
            instance.clearPrimaryText();
            return this;
        }

        /**
         * <pre>
         * Secondary test of the header, which describes the number.
         * Some examples are:
         *   "Mobile • 555-1234",
         *   "Blocked • Mobile • 555-1234", and
         *   "Spam • Mobile • 555-1234".
         * </pre>
         *
         * <code>optional string secondary_text = 4;</code>
         */
        public boolean hasSecondaryText() {
            return instance.hasSecondaryText();
        }

        /**
         * <pre>
         * Secondary test of the header, which describes the number.
         * Some examples are:
         *   "Mobile • 555-1234",
         *   "Blocked • Mobile • 555-1234", and
         *   "Spam • Mobile • 555-1234".
         * </pre>
         *
         * <code>optional string secondary_text = 4;</code>
         */
        public java.lang.String getSecondaryText() {
            return instance.getSecondaryText();
        }

        /**
         * <pre>
         * Secondary test of the header, which describes the number.
         * Some examples are:
         *   "Mobile • 555-1234",
         *   "Blocked • Mobile • 555-1234", and
         *   "Spam • Mobile • 555-1234".
         * </pre>
         *
         * <code>optional string secondary_text = 4;</code>
         */
        public Builder setSecondaryText(
                java.lang.String value) {
            copyOnWrite();
            instance.setSecondaryText(value);
            return this;
        }

        /**
         * <pre>
         * Secondary test of the header, which describes the number.
         * Some examples are:
         *   "Mobile • 555-1234",
         *   "Blocked • Mobile • 555-1234", and
         *   "Spam • Mobile • 555-1234".
         * </pre>
         *
         * <code>optional string secondary_text = 4;</code>
         */
        public com.google.protobuf.ByteString
        getSecondaryTextBytes() {
            return instance.getSecondaryTextBytes();
        }

        /**
         * <pre>
         * Secondary test of the header, which describes the number.
         * Some examples are:
         *   "Mobile • 555-1234",
         *   "Blocked • Mobile • 555-1234", and
         *   "Spam • Mobile • 555-1234".
         * </pre>
         *
         * <code>optional string secondary_text = 4;</code>
         */
        public Builder setSecondaryTextBytes(
                com.google.protobuf.ByteString value) {
            copyOnWrite();
            instance.setSecondaryTextBytes(value);
            return this;
        }

        /**
         * <pre>
         * Secondary test of the header, which describes the number.
         * Some examples are:
         *   "Mobile • 555-1234",
         *   "Blocked • Mobile • 555-1234", and
         *   "Spam • Mobile • 555-1234".
         * </pre>
         *
         * <code>optional string secondary_text = 4;</code>
         */
        public Builder clearSecondaryText() {
            copyOnWrite();
            instance.clearSecondaryText();
            return this;
        }

        // @@protoc_insertion_point(builder_scope:com.fissy.dialer.calldetails.CallDetailsHeaderInfo)
    }
}
