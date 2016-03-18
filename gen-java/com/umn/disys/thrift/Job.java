/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.umn.disys.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-03-18")
public class Job implements org.apache.thrift.TBase<Job, Job._Fields>, java.io.Serializable, Cloneable, Comparable<Job> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Job");

  private static final org.apache.thrift.protocol.TField REQUEST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("requestType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SUB_REQUEST_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("subRequestType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RESPONSE_FIELD_DESC = new org.apache.thrift.protocol.TField("response", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField NODE_DETAILS_FIELD_DESC = new org.apache.thrift.protocol.TField("nodeDetails", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField SENDER_FIELD_DESC = new org.apache.thrift.protocol.TField("sender", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField RECEIVER_FIELD_DESC = new org.apache.thrift.protocol.TField("receiver", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobTupleSchemeFactory());
  }

  public int requestType; // required
  public int subRequestType; // required
  public String response; // required
  public NodeDetails nodeDetails; // required
  public int sender; // required
  public int receiver; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REQUEST_TYPE((short)1, "requestType"),
    SUB_REQUEST_TYPE((short)2, "subRequestType"),
    RESPONSE((short)3, "response"),
    NODE_DETAILS((short)4, "nodeDetails"),
    SENDER((short)5, "sender"),
    RECEIVER((short)6, "receiver");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // REQUEST_TYPE
          return REQUEST_TYPE;
        case 2: // SUB_REQUEST_TYPE
          return SUB_REQUEST_TYPE;
        case 3: // RESPONSE
          return RESPONSE;
        case 4: // NODE_DETAILS
          return NODE_DETAILS;
        case 5: // SENDER
          return SENDER;
        case 6: // RECEIVER
          return RECEIVER;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __REQUESTTYPE_ISSET_ID = 0;
  private static final int __SUBREQUESTTYPE_ISSET_ID = 1;
  private static final int __SENDER_ISSET_ID = 2;
  private static final int __RECEIVER_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REQUEST_TYPE, new org.apache.thrift.meta_data.FieldMetaData("requestType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SUB_REQUEST_TYPE, new org.apache.thrift.meta_data.FieldMetaData("subRequestType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RESPONSE, new org.apache.thrift.meta_data.FieldMetaData("response", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NODE_DETAILS, new org.apache.thrift.meta_data.FieldMetaData("nodeDetails", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, NodeDetails.class)));
    tmpMap.put(_Fields.SENDER, new org.apache.thrift.meta_data.FieldMetaData("sender", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RECEIVER, new org.apache.thrift.meta_data.FieldMetaData("receiver", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Job.class, metaDataMap);
  }

  public Job() {
  }

  public Job(
    int requestType,
    int subRequestType,
    String response,
    NodeDetails nodeDetails,
    int sender,
    int receiver)
  {
    this();
    this.requestType = requestType;
    setRequestTypeIsSet(true);
    this.subRequestType = subRequestType;
    setSubRequestTypeIsSet(true);
    this.response = response;
    this.nodeDetails = nodeDetails;
    this.sender = sender;
    setSenderIsSet(true);
    this.receiver = receiver;
    setReceiverIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Job(Job other) {
    __isset_bitfield = other.__isset_bitfield;
    this.requestType = other.requestType;
    this.subRequestType = other.subRequestType;
    if (other.isSetResponse()) {
      this.response = other.response;
    }
    if (other.isSetNodeDetails()) {
      this.nodeDetails = new NodeDetails(other.nodeDetails);
    }
    this.sender = other.sender;
    this.receiver = other.receiver;
  }

  public Job deepCopy() {
    return new Job(this);
  }

  @Override
  public void clear() {
    setRequestTypeIsSet(false);
    this.requestType = 0;
    setSubRequestTypeIsSet(false);
    this.subRequestType = 0;
    this.response = null;
    this.nodeDetails = null;
    setSenderIsSet(false);
    this.sender = 0;
    setReceiverIsSet(false);
    this.receiver = 0;
  }

  public int getRequestType() {
    return this.requestType;
  }

  public Job setRequestType(int requestType) {
    this.requestType = requestType;
    setRequestTypeIsSet(true);
    return this;
  }

  public void unsetRequestType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __REQUESTTYPE_ISSET_ID);
  }

  /** Returns true if field requestType is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestType() {
    return EncodingUtils.testBit(__isset_bitfield, __REQUESTTYPE_ISSET_ID);
  }

  public void setRequestTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __REQUESTTYPE_ISSET_ID, value);
  }

  public int getSubRequestType() {
    return this.subRequestType;
  }

  public Job setSubRequestType(int subRequestType) {
    this.subRequestType = subRequestType;
    setSubRequestTypeIsSet(true);
    return this;
  }

  public void unsetSubRequestType() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUBREQUESTTYPE_ISSET_ID);
  }

  /** Returns true if field subRequestType is set (has been assigned a value) and false otherwise */
  public boolean isSetSubRequestType() {
    return EncodingUtils.testBit(__isset_bitfield, __SUBREQUESTTYPE_ISSET_ID);
  }

  public void setSubRequestTypeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUBREQUESTTYPE_ISSET_ID, value);
  }

  public String getResponse() {
    return this.response;
  }

  public Job setResponse(String response) {
    this.response = response;
    return this;
  }

  public void unsetResponse() {
    this.response = null;
  }

  /** Returns true if field response is set (has been assigned a value) and false otherwise */
  public boolean isSetResponse() {
    return this.response != null;
  }

  public void setResponseIsSet(boolean value) {
    if (!value) {
      this.response = null;
    }
  }

  public NodeDetails getNodeDetails() {
    return this.nodeDetails;
  }

  public Job setNodeDetails(NodeDetails nodeDetails) {
    this.nodeDetails = nodeDetails;
    return this;
  }

  public void unsetNodeDetails() {
    this.nodeDetails = null;
  }

  /** Returns true if field nodeDetails is set (has been assigned a value) and false otherwise */
  public boolean isSetNodeDetails() {
    return this.nodeDetails != null;
  }

  public void setNodeDetailsIsSet(boolean value) {
    if (!value) {
      this.nodeDetails = null;
    }
  }

  public int getSender() {
    return this.sender;
  }

  public Job setSender(int sender) {
    this.sender = sender;
    setSenderIsSet(true);
    return this;
  }

  public void unsetSender() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SENDER_ISSET_ID);
  }

  /** Returns true if field sender is set (has been assigned a value) and false otherwise */
  public boolean isSetSender() {
    return EncodingUtils.testBit(__isset_bitfield, __SENDER_ISSET_ID);
  }

  public void setSenderIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SENDER_ISSET_ID, value);
  }

  public int getReceiver() {
    return this.receiver;
  }

  public Job setReceiver(int receiver) {
    this.receiver = receiver;
    setReceiverIsSet(true);
    return this;
  }

  public void unsetReceiver() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RECEIVER_ISSET_ID);
  }

  /** Returns true if field receiver is set (has been assigned a value) and false otherwise */
  public boolean isSetReceiver() {
    return EncodingUtils.testBit(__isset_bitfield, __RECEIVER_ISSET_ID);
  }

  public void setReceiverIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RECEIVER_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case REQUEST_TYPE:
      if (value == null) {
        unsetRequestType();
      } else {
        setRequestType((Integer)value);
      }
      break;

    case SUB_REQUEST_TYPE:
      if (value == null) {
        unsetSubRequestType();
      } else {
        setSubRequestType((Integer)value);
      }
      break;

    case RESPONSE:
      if (value == null) {
        unsetResponse();
      } else {
        setResponse((String)value);
      }
      break;

    case NODE_DETAILS:
      if (value == null) {
        unsetNodeDetails();
      } else {
        setNodeDetails((NodeDetails)value);
      }
      break;

    case SENDER:
      if (value == null) {
        unsetSender();
      } else {
        setSender((Integer)value);
      }
      break;

    case RECEIVER:
      if (value == null) {
        unsetReceiver();
      } else {
        setReceiver((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case REQUEST_TYPE:
      return getRequestType();

    case SUB_REQUEST_TYPE:
      return getSubRequestType();

    case RESPONSE:
      return getResponse();

    case NODE_DETAILS:
      return getNodeDetails();

    case SENDER:
      return getSender();

    case RECEIVER:
      return getReceiver();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case REQUEST_TYPE:
      return isSetRequestType();
    case SUB_REQUEST_TYPE:
      return isSetSubRequestType();
    case RESPONSE:
      return isSetResponse();
    case NODE_DETAILS:
      return isSetNodeDetails();
    case SENDER:
      return isSetSender();
    case RECEIVER:
      return isSetReceiver();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Job)
      return this.equals((Job)that);
    return false;
  }

  public boolean equals(Job that) {
    if (that == null)
      return false;

    boolean this_present_requestType = true;
    boolean that_present_requestType = true;
    if (this_present_requestType || that_present_requestType) {
      if (!(this_present_requestType && that_present_requestType))
        return false;
      if (this.requestType != that.requestType)
        return false;
    }

    boolean this_present_subRequestType = true;
    boolean that_present_subRequestType = true;
    if (this_present_subRequestType || that_present_subRequestType) {
      if (!(this_present_subRequestType && that_present_subRequestType))
        return false;
      if (this.subRequestType != that.subRequestType)
        return false;
    }

    boolean this_present_response = true && this.isSetResponse();
    boolean that_present_response = true && that.isSetResponse();
    if (this_present_response || that_present_response) {
      if (!(this_present_response && that_present_response))
        return false;
      if (!this.response.equals(that.response))
        return false;
    }

    boolean this_present_nodeDetails = true && this.isSetNodeDetails();
    boolean that_present_nodeDetails = true && that.isSetNodeDetails();
    if (this_present_nodeDetails || that_present_nodeDetails) {
      if (!(this_present_nodeDetails && that_present_nodeDetails))
        return false;
      if (!this.nodeDetails.equals(that.nodeDetails))
        return false;
    }

    boolean this_present_sender = true;
    boolean that_present_sender = true;
    if (this_present_sender || that_present_sender) {
      if (!(this_present_sender && that_present_sender))
        return false;
      if (this.sender != that.sender)
        return false;
    }

    boolean this_present_receiver = true;
    boolean that_present_receiver = true;
    if (this_present_receiver || that_present_receiver) {
      if (!(this_present_receiver && that_present_receiver))
        return false;
      if (this.receiver != that.receiver)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_requestType = true;
    list.add(present_requestType);
    if (present_requestType)
      list.add(requestType);

    boolean present_subRequestType = true;
    list.add(present_subRequestType);
    if (present_subRequestType)
      list.add(subRequestType);

    boolean present_response = true && (isSetResponse());
    list.add(present_response);
    if (present_response)
      list.add(response);

    boolean present_nodeDetails = true && (isSetNodeDetails());
    list.add(present_nodeDetails);
    if (present_nodeDetails)
      list.add(nodeDetails);

    boolean present_sender = true;
    list.add(present_sender);
    if (present_sender)
      list.add(sender);

    boolean present_receiver = true;
    list.add(present_receiver);
    if (present_receiver)
      list.add(receiver);

    return list.hashCode();
  }

  @Override
  public int compareTo(Job other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetRequestType()).compareTo(other.isSetRequestType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestType, other.requestType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSubRequestType()).compareTo(other.isSetSubRequestType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSubRequestType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subRequestType, other.subRequestType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResponse()).compareTo(other.isSetResponse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResponse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.response, other.response);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNodeDetails()).compareTo(other.isSetNodeDetails());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNodeDetails()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nodeDetails, other.nodeDetails);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSender()).compareTo(other.isSetSender());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSender()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sender, other.sender);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetReceiver()).compareTo(other.isSetReceiver());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReceiver()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.receiver, other.receiver);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Job(");
    boolean first = true;

    sb.append("requestType:");
    sb.append(this.requestType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("subRequestType:");
    sb.append(this.subRequestType);
    first = false;
    if (!first) sb.append(", ");
    sb.append("response:");
    if (this.response == null) {
      sb.append("null");
    } else {
      sb.append(this.response);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("nodeDetails:");
    if (this.nodeDetails == null) {
      sb.append("null");
    } else {
      sb.append(this.nodeDetails);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sender:");
    sb.append(this.sender);
    first = false;
    if (!first) sb.append(", ");
    sb.append("receiver:");
    sb.append(this.receiver);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (nodeDetails != null) {
      nodeDetails.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobStandardSchemeFactory implements SchemeFactory {
    public JobStandardScheme getScheme() {
      return new JobStandardScheme();
    }
  }

  private static class JobStandardScheme extends StandardScheme<Job> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Job struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REQUEST_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.requestType = iprot.readI32();
              struct.setRequestTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUB_REQUEST_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.subRequestType = iprot.readI32();
              struct.setSubRequestTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESPONSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.response = iprot.readString();
              struct.setResponseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // NODE_DETAILS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.nodeDetails = new NodeDetails();
              struct.nodeDetails.read(iprot);
              struct.setNodeDetailsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SENDER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sender = iprot.readI32();
              struct.setSenderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RECEIVER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.receiver = iprot.readI32();
              struct.setReceiverIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Job struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REQUEST_TYPE_FIELD_DESC);
      oprot.writeI32(struct.requestType);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SUB_REQUEST_TYPE_FIELD_DESC);
      oprot.writeI32(struct.subRequestType);
      oprot.writeFieldEnd();
      if (struct.response != null) {
        oprot.writeFieldBegin(RESPONSE_FIELD_DESC);
        oprot.writeString(struct.response);
        oprot.writeFieldEnd();
      }
      if (struct.nodeDetails != null) {
        oprot.writeFieldBegin(NODE_DETAILS_FIELD_DESC);
        struct.nodeDetails.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SENDER_FIELD_DESC);
      oprot.writeI32(struct.sender);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECEIVER_FIELD_DESC);
      oprot.writeI32(struct.receiver);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobTupleSchemeFactory implements SchemeFactory {
    public JobTupleScheme getScheme() {
      return new JobTupleScheme();
    }
  }

  private static class JobTupleScheme extends TupleScheme<Job> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Job struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetRequestType()) {
        optionals.set(0);
      }
      if (struct.isSetSubRequestType()) {
        optionals.set(1);
      }
      if (struct.isSetResponse()) {
        optionals.set(2);
      }
      if (struct.isSetNodeDetails()) {
        optionals.set(3);
      }
      if (struct.isSetSender()) {
        optionals.set(4);
      }
      if (struct.isSetReceiver()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetRequestType()) {
        oprot.writeI32(struct.requestType);
      }
      if (struct.isSetSubRequestType()) {
        oprot.writeI32(struct.subRequestType);
      }
      if (struct.isSetResponse()) {
        oprot.writeString(struct.response);
      }
      if (struct.isSetNodeDetails()) {
        struct.nodeDetails.write(oprot);
      }
      if (struct.isSetSender()) {
        oprot.writeI32(struct.sender);
      }
      if (struct.isSetReceiver()) {
        oprot.writeI32(struct.receiver);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Job struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.requestType = iprot.readI32();
        struct.setRequestTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.subRequestType = iprot.readI32();
        struct.setSubRequestTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.response = iprot.readString();
        struct.setResponseIsSet(true);
      }
      if (incoming.get(3)) {
        struct.nodeDetails = new NodeDetails();
        struct.nodeDetails.read(iprot);
        struct.setNodeDetailsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sender = iprot.readI32();
        struct.setSenderIsSet(true);
      }
      if (incoming.get(5)) {
        struct.receiver = iprot.readI32();
        struct.setReceiverIsSet(true);
      }
    }
  }

}

