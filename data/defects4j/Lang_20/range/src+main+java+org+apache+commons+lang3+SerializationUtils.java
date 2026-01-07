{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/SerializationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 198,
      "comment": "\n * \u003cp\u003eAssists with the serialization process and performs additional functionality based\n * on serialization.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eDeep clone using serialization\n * \u003cli\u003eSerialize managing finally and IOException\n * \u003cli\u003eDeserialize managing finally and IOException\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThis class throws exceptions for invalid {@code null} inputs.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationUtils.SerializationUtils()",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * \u003cp\u003eSerializationUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as {@code SerializationUtils.clone(object)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.clone(T)",
      "begin_line": 75,
      "end_line": 84,
      "comment": "\n     * \u003cp\u003eDeep clone an {@code Object} using serialization.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is many times slower than writing clone methods by hand\n     * on all objects in your object graph. However, for complex object\n     * graphs, or for those that don\u0027t support deep cloning this can\n     * be a simple alternative implementation. Of course all the objects\n     * must be {@code Serializable}.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the object involved\n     * @param object  the {@code Serializable} object to clone\n     * @return the cloned object\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 82,col 60)",
        "(line 83,col 9)-(line 83,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable, java.io.OutputStream)",
      "begin_line": 103,
      "end_line": 124,
      "comment": "\n     * \u003cp\u003eSerializes an {@code Object} to the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written.\n     * This avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes, may be null\n     * @param outputStream  the stream to write to, must not be null\n     * @throws IllegalArgumentException if {@code outputStream} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 106,col 9)",
        "(line 107,col 9)-(line 107,col 38)",
        "(line 108,col 9)-(line 123,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * \u003cp\u003eSerializes an {@code Object} to a byte array for\n     * storage/serialization.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes\n     * @return a byte[] with the converted Serializable\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 68)",
        "(line 136,col 9)-(line 136,col 29)",
        "(line 137,col 9)-(line 137,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream)",
      "begin_line": 157,
      "end_line": 180,
      "comment": "\n     * \u003cp\u003eDeserializes an {@code Object} from the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written. This\n     * avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param inputStream  the serialized object input stream, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException if {@code inputStream} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 36)",
        "(line 162,col 9)-(line 179,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.deserialize(byte[])",
      "begin_line": 190,
      "end_line": 196,
      "comment": "\n     * \u003cp\u003eDeserializes a single {@code Object} from an array of bytes.\u003c/p\u003e\n     *\n     * @param objectData  the serialized object, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException if {@code objectData} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 73)",
        "(line 195,col 9)-(line 195,col 33)"
      ]
    }
  ]
}