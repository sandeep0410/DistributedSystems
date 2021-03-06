/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package edu.umn.cs.disys.mr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-04-21")
public class Task implements org.apache.thrift.TBase<Task, Task._Fields>, java.io.Serializable, Cloneable, Comparable<Task> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Task");

  private static final org.apache.thrift.protocol.TField TASK_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("jobId", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField SORT_OFFSET_FIELD_DESC = new org.apache.thrift.protocol.TField("sortOffset", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField SORT_CHUNK_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("sortChunkSize", org.apache.thrift.protocol.TType.I32, (short)5);
  private static final org.apache.thrift.protocol.TField SORTFILENAME_FIELD_DESC = new org.apache.thrift.protocol.TField("sortfilename", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField MERGEFILENAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("mergefilenames", org.apache.thrift.protocol.TType.LIST, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TaskStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TaskTupleSchemeFactory());
  }

  public int taskId; // required
  public int jobId; // required
  public String type; // required
  public long sortOffset; // required
  public int sortChunkSize; // required
  public String sortfilename; // required
  public List<String> mergefilenames; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASK_ID((short)1, "taskId"),
    JOB_ID((short)2, "jobId"),
    TYPE((short)3, "type"),
    SORT_OFFSET((short)4, "sortOffset"),
    SORT_CHUNK_SIZE((short)5, "sortChunkSize"),
    SORTFILENAME((short)6, "sortfilename"),
    MERGEFILENAMES((short)7, "mergefilenames");

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
        case 1: // TASK_ID
          return TASK_ID;
        case 2: // JOB_ID
          return JOB_ID;
        case 3: // TYPE
          return TYPE;
        case 4: // SORT_OFFSET
          return SORT_OFFSET;
        case 5: // SORT_CHUNK_SIZE
          return SORT_CHUNK_SIZE;
        case 6: // SORTFILENAME
          return SORTFILENAME;
        case 7: // MERGEFILENAMES
          return MERGEFILENAMES;
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
  private static final int __TASKID_ISSET_ID = 0;
  private static final int __JOBID_ISSET_ID = 1;
  private static final int __SORTOFFSET_ISSET_ID = 2;
  private static final int __SORTCHUNKSIZE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASK_ID, new org.apache.thrift.meta_data.FieldMetaData("taskId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.JOB_ID, new org.apache.thrift.meta_data.FieldMetaData("jobId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SORT_OFFSET, new org.apache.thrift.meta_data.FieldMetaData("sortOffset", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SORT_CHUNK_SIZE, new org.apache.thrift.meta_data.FieldMetaData("sortChunkSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SORTFILENAME, new org.apache.thrift.meta_data.FieldMetaData("sortfilename", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MERGEFILENAMES, new org.apache.thrift.meta_data.FieldMetaData("mergefilenames", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Task.class, metaDataMap);
  }

  public Task() {
  }

  public Task(
    int taskId,
    int jobId,
    String type,
    long sortOffset,
    int sortChunkSize,
    String sortfilename,
    List<String> mergefilenames)
  {
    this();
    this.taskId = taskId;
    setTaskIdIsSet(true);
    this.jobId = jobId;
    setJobIdIsSet(true);
    this.type = type;
    this.sortOffset = sortOffset;
    setSortOffsetIsSet(true);
    this.sortChunkSize = sortChunkSize;
    setSortChunkSizeIsSet(true);
    this.sortfilename = sortfilename;
    this.mergefilenames = mergefilenames;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Task(Task other) {
    __isset_bitfield = other.__isset_bitfield;
    this.taskId = other.taskId;
    this.jobId = other.jobId;
    if (other.isSetType()) {
      this.type = other.type;
    }
    this.sortOffset = other.sortOffset;
    this.sortChunkSize = other.sortChunkSize;
    if (other.isSetSortfilename()) {
      this.sortfilename = other.sortfilename;
    }
    if (other.isSetMergefilenames()) {
      List<String> __this__mergefilenames = new ArrayList<String>(other.mergefilenames);
      this.mergefilenames = __this__mergefilenames;
    }
  }

  public Task deepCopy() {
    return new Task(this);
  }

  @Override
  public void clear() {
    setTaskIdIsSet(false);
    this.taskId = 0;
    setJobIdIsSet(false);
    this.jobId = 0;
    this.type = null;
    setSortOffsetIsSet(false);
    this.sortOffset = 0;
    setSortChunkSizeIsSet(false);
    this.sortChunkSize = 0;
    this.sortfilename = null;
    this.mergefilenames = null;
  }

  public int getTaskId() {
    return this.taskId;
  }

  public Task setTaskId(int taskId) {
    this.taskId = taskId;
    setTaskIdIsSet(true);
    return this;
  }

  public void unsetTaskId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  /** Returns true if field taskId is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskId() {
    return EncodingUtils.testBit(__isset_bitfield, __TASKID_ISSET_ID);
  }

  public void setTaskIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TASKID_ISSET_ID, value);
  }

  public int getJobId() {
    return this.jobId;
  }

  public Task setJobId(int jobId) {
    this.jobId = jobId;
    setJobIdIsSet(true);
    return this;
  }

  public void unsetJobId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  /** Returns true if field jobId is set (has been assigned a value) and false otherwise */
  public boolean isSetJobId() {
    return EncodingUtils.testBit(__isset_bitfield, __JOBID_ISSET_ID);
  }

  public void setJobIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __JOBID_ISSET_ID, value);
  }

  public String getType() {
    return this.type;
  }

  public Task setType(String type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public long getSortOffset() {
    return this.sortOffset;
  }

  public Task setSortOffset(long sortOffset) {
    this.sortOffset = sortOffset;
    setSortOffsetIsSet(true);
    return this;
  }

  public void unsetSortOffset() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SORTOFFSET_ISSET_ID);
  }

  /** Returns true if field sortOffset is set (has been assigned a value) and false otherwise */
  public boolean isSetSortOffset() {
    return EncodingUtils.testBit(__isset_bitfield, __SORTOFFSET_ISSET_ID);
  }

  public void setSortOffsetIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SORTOFFSET_ISSET_ID, value);
  }

  public int getSortChunkSize() {
    return this.sortChunkSize;
  }

  public Task setSortChunkSize(int sortChunkSize) {
    this.sortChunkSize = sortChunkSize;
    setSortChunkSizeIsSet(true);
    return this;
  }

  public void unsetSortChunkSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SORTCHUNKSIZE_ISSET_ID);
  }

  /** Returns true if field sortChunkSize is set (has been assigned a value) and false otherwise */
  public boolean isSetSortChunkSize() {
    return EncodingUtils.testBit(__isset_bitfield, __SORTCHUNKSIZE_ISSET_ID);
  }

  public void setSortChunkSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SORTCHUNKSIZE_ISSET_ID, value);
  }

  public String getSortfilename() {
    return this.sortfilename;
  }

  public Task setSortfilename(String sortfilename) {
    this.sortfilename = sortfilename;
    return this;
  }

  public void unsetSortfilename() {
    this.sortfilename = null;
  }

  /** Returns true if field sortfilename is set (has been assigned a value) and false otherwise */
  public boolean isSetSortfilename() {
    return this.sortfilename != null;
  }

  public void setSortfilenameIsSet(boolean value) {
    if (!value) {
      this.sortfilename = null;
    }
  }

  public int getMergefilenamesSize() {
    return (this.mergefilenames == null) ? 0 : this.mergefilenames.size();
  }

  public java.util.Iterator<String> getMergefilenamesIterator() {
    return (this.mergefilenames == null) ? null : this.mergefilenames.iterator();
  }

  public void addToMergefilenames(String elem) {
    if (this.mergefilenames == null) {
      this.mergefilenames = new ArrayList<String>();
    }
    this.mergefilenames.add(elem);
  }

  public List<String> getMergefilenames() {
    return this.mergefilenames;
  }

  public Task setMergefilenames(List<String> mergefilenames) {
    this.mergefilenames = mergefilenames;
    return this;
  }

  public void unsetMergefilenames() {
    this.mergefilenames = null;
  }

  /** Returns true if field mergefilenames is set (has been assigned a value) and false otherwise */
  public boolean isSetMergefilenames() {
    return this.mergefilenames != null;
  }

  public void setMergefilenamesIsSet(boolean value) {
    if (!value) {
      this.mergefilenames = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASK_ID:
      if (value == null) {
        unsetTaskId();
      } else {
        setTaskId((Integer)value);
      }
      break;

    case JOB_ID:
      if (value == null) {
        unsetJobId();
      } else {
        setJobId((Integer)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((String)value);
      }
      break;

    case SORT_OFFSET:
      if (value == null) {
        unsetSortOffset();
      } else {
        setSortOffset((Long)value);
      }
      break;

    case SORT_CHUNK_SIZE:
      if (value == null) {
        unsetSortChunkSize();
      } else {
        setSortChunkSize((Integer)value);
      }
      break;

    case SORTFILENAME:
      if (value == null) {
        unsetSortfilename();
      } else {
        setSortfilename((String)value);
      }
      break;

    case MERGEFILENAMES:
      if (value == null) {
        unsetMergefilenames();
      } else {
        setMergefilenames((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASK_ID:
      return getTaskId();

    case JOB_ID:
      return getJobId();

    case TYPE:
      return getType();

    case SORT_OFFSET:
      return getSortOffset();

    case SORT_CHUNK_SIZE:
      return getSortChunkSize();

    case SORTFILENAME:
      return getSortfilename();

    case MERGEFILENAMES:
      return getMergefilenames();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASK_ID:
      return isSetTaskId();
    case JOB_ID:
      return isSetJobId();
    case TYPE:
      return isSetType();
    case SORT_OFFSET:
      return isSetSortOffset();
    case SORT_CHUNK_SIZE:
      return isSetSortChunkSize();
    case SORTFILENAME:
      return isSetSortfilename();
    case MERGEFILENAMES:
      return isSetMergefilenames();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Task)
      return this.equals((Task)that);
    return false;
  }

  public boolean equals(Task that) {
    if (that == null)
      return false;

    boolean this_present_taskId = true;
    boolean that_present_taskId = true;
    if (this_present_taskId || that_present_taskId) {
      if (!(this_present_taskId && that_present_taskId))
        return false;
      if (this.taskId != that.taskId)
        return false;
    }

    boolean this_present_jobId = true;
    boolean that_present_jobId = true;
    if (this_present_jobId || that_present_jobId) {
      if (!(this_present_jobId && that_present_jobId))
        return false;
      if (this.jobId != that.jobId)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_sortOffset = true;
    boolean that_present_sortOffset = true;
    if (this_present_sortOffset || that_present_sortOffset) {
      if (!(this_present_sortOffset && that_present_sortOffset))
        return false;
      if (this.sortOffset != that.sortOffset)
        return false;
    }

    boolean this_present_sortChunkSize = true;
    boolean that_present_sortChunkSize = true;
    if (this_present_sortChunkSize || that_present_sortChunkSize) {
      if (!(this_present_sortChunkSize && that_present_sortChunkSize))
        return false;
      if (this.sortChunkSize != that.sortChunkSize)
        return false;
    }

    boolean this_present_sortfilename = true && this.isSetSortfilename();
    boolean that_present_sortfilename = true && that.isSetSortfilename();
    if (this_present_sortfilename || that_present_sortfilename) {
      if (!(this_present_sortfilename && that_present_sortfilename))
        return false;
      if (!this.sortfilename.equals(that.sortfilename))
        return false;
    }

    boolean this_present_mergefilenames = true && this.isSetMergefilenames();
    boolean that_present_mergefilenames = true && that.isSetMergefilenames();
    if (this_present_mergefilenames || that_present_mergefilenames) {
      if (!(this_present_mergefilenames && that_present_mergefilenames))
        return false;
      if (!this.mergefilenames.equals(that.mergefilenames))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskId = true;
    list.add(present_taskId);
    if (present_taskId)
      list.add(taskId);

    boolean present_jobId = true;
    list.add(present_jobId);
    if (present_jobId)
      list.add(jobId);

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type);

    boolean present_sortOffset = true;
    list.add(present_sortOffset);
    if (present_sortOffset)
      list.add(sortOffset);

    boolean present_sortChunkSize = true;
    list.add(present_sortChunkSize);
    if (present_sortChunkSize)
      list.add(sortChunkSize);

    boolean present_sortfilename = true && (isSetSortfilename());
    list.add(present_sortfilename);
    if (present_sortfilename)
      list.add(sortfilename);

    boolean present_mergefilenames = true && (isSetMergefilenames());
    list.add(present_mergefilenames);
    if (present_mergefilenames)
      list.add(mergefilenames);

    return list.hashCode();
  }

  @Override
  public int compareTo(Task other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskId()).compareTo(other.isSetTaskId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskId, other.taskId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobId()).compareTo(other.isSetJobId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobId, other.jobId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSortOffset()).compareTo(other.isSetSortOffset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSortOffset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sortOffset, other.sortOffset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSortChunkSize()).compareTo(other.isSetSortChunkSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSortChunkSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sortChunkSize, other.sortChunkSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSortfilename()).compareTo(other.isSetSortfilename());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSortfilename()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sortfilename, other.sortfilename);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMergefilenames()).compareTo(other.isSetMergefilenames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMergefilenames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mergefilenames, other.mergefilenames);
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
    StringBuilder sb = new StringBuilder("Task(");
    boolean first = true;

    sb.append("taskId:");
    sb.append(this.taskId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobId:");
    sb.append(this.jobId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sortOffset:");
    sb.append(this.sortOffset);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sortChunkSize:");
    sb.append(this.sortChunkSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("sortfilename:");
    if (this.sortfilename == null) {
      sb.append("null");
    } else {
      sb.append(this.sortfilename);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mergefilenames:");
    if (this.mergefilenames == null) {
      sb.append("null");
    } else {
      sb.append(this.mergefilenames);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TaskStandardSchemeFactory implements SchemeFactory {
    public TaskStandardScheme getScheme() {
      return new TaskStandardScheme();
    }
  }

  private static class TaskStandardScheme extends StandardScheme<Task> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Task struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASK_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.taskId = iprot.readI32();
              struct.setTaskIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobId = iprot.readI32();
              struct.setJobIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.type = iprot.readString();
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SORT_OFFSET
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.sortOffset = iprot.readI64();
              struct.setSortOffsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SORT_CHUNK_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.sortChunkSize = iprot.readI32();
              struct.setSortChunkSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SORTFILENAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sortfilename = iprot.readString();
              struct.setSortfilenameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // MERGEFILENAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.mergefilenames = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.mergefilenames.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setMergefilenamesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Task struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TASK_ID_FIELD_DESC);
      oprot.writeI32(struct.taskId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(JOB_ID_FIELD_DESC);
      oprot.writeI32(struct.jobId);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeString(struct.type);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SORT_OFFSET_FIELD_DESC);
      oprot.writeI64(struct.sortOffset);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SORT_CHUNK_SIZE_FIELD_DESC);
      oprot.writeI32(struct.sortChunkSize);
      oprot.writeFieldEnd();
      if (struct.sortfilename != null) {
        oprot.writeFieldBegin(SORTFILENAME_FIELD_DESC);
        oprot.writeString(struct.sortfilename);
        oprot.writeFieldEnd();
      }
      if (struct.mergefilenames != null) {
        oprot.writeFieldBegin(MERGEFILENAMES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.mergefilenames.size()));
          for (String _iter3 : struct.mergefilenames)
          {
            oprot.writeString(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TaskTupleSchemeFactory implements SchemeFactory {
    public TaskTupleScheme getScheme() {
      return new TaskTupleScheme();
    }
  }

  private static class TaskTupleScheme extends TupleScheme<Task> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Task struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTaskId()) {
        optionals.set(0);
      }
      if (struct.isSetJobId()) {
        optionals.set(1);
      }
      if (struct.isSetType()) {
        optionals.set(2);
      }
      if (struct.isSetSortOffset()) {
        optionals.set(3);
      }
      if (struct.isSetSortChunkSize()) {
        optionals.set(4);
      }
      if (struct.isSetSortfilename()) {
        optionals.set(5);
      }
      if (struct.isSetMergefilenames()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTaskId()) {
        oprot.writeI32(struct.taskId);
      }
      if (struct.isSetJobId()) {
        oprot.writeI32(struct.jobId);
      }
      if (struct.isSetType()) {
        oprot.writeString(struct.type);
      }
      if (struct.isSetSortOffset()) {
        oprot.writeI64(struct.sortOffset);
      }
      if (struct.isSetSortChunkSize()) {
        oprot.writeI32(struct.sortChunkSize);
      }
      if (struct.isSetSortfilename()) {
        oprot.writeString(struct.sortfilename);
      }
      if (struct.isSetMergefilenames()) {
        {
          oprot.writeI32(struct.mergefilenames.size());
          for (String _iter4 : struct.mergefilenames)
          {
            oprot.writeString(_iter4);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Task struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.taskId = iprot.readI32();
        struct.setTaskIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobId = iprot.readI32();
        struct.setJobIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.type = iprot.readString();
        struct.setTypeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.sortOffset = iprot.readI64();
        struct.setSortOffsetIsSet(true);
      }
      if (incoming.get(4)) {
        struct.sortChunkSize = iprot.readI32();
        struct.setSortChunkSizeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.sortfilename = iprot.readString();
        struct.setSortfilenameIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.mergefilenames = new ArrayList<String>(_list5.size);
          String _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = iprot.readString();
            struct.mergefilenames.add(_elem6);
          }
        }
        struct.setMergefilenamesIsSet(true);
      }
    }
  }

}

