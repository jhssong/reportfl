{
  "filepath": "/tmp/Lang-47b/src/java/org/apache/commons/lang/SerializationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 50,
      "end_line": 195,
      "comment": "\n * \u003cp\u003eAssists with the serialization process and performs additional functionality based \n * on serialization.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eDeep clone using serialization\n * \u003cli\u003eSerialize managing finally and IOException\n * \u003cli\u003eDeserialize managing finally and IOException\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThis class throws exceptions for invalid \u003ccode\u003enull\u003c/code\u003e inputs.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * @author \u003ca href\u003d\"mailto:nissim@nksystems.com\"\u003eNissim Karpenstein\u003c/a\u003e\n * @author \u003ca href\u003d\"mailto:janekdb@yahoo.co.uk\"\u003eJanek Bogucki\u003c/a\u003e\n * @author Daniel L. Rall\n * @author Stephen Colebourne\n * @author Jeff Varszegi\n * @author Gary Gregory\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationUtils.SerializationUtils()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "\n     * \u003cp\u003eSerializationUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as \u003ccode\u003eSerializationUtils.clone(object)\u003c/code\u003e.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SerializationUtils.clone(java.io.Serializable)",
      "begin_line": 79,
      "end_line": 81,
      "comment": "\n     * \u003cp\u003eDeep clone an \u003ccode\u003eObject\u003c/code\u003e using serialization.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is many times slower than writing clone methods by hand\n     * on all objects in your object graph. However, for complex object\n     * graphs, or for those that don\u0027t support deep cloning this can\n     * be a simple alternative implementation. Of course all the objects\n     * must be \u003ccode\u003eSerializable\u003c/code\u003e.\u003c/p\u003e\n     * \n     * @param object  the \u003ccode\u003eSerializable\u003c/code\u003e object to clone\n     * @return the cloned object\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SerializationUtils.serialize(java.io.Serializable, java.io.OutputStream)",
      "begin_line": 100,
      "end_line": 121,
      "comment": "\n     * \u003cp\u003eSerializes an \u003ccode\u003eObject\u003c/code\u003e to the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written.\n     * This avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes, may be null\n     * @param outputStream  the stream to write to, must not be null\n     * @throws IllegalArgumentException if \u003ccode\u003eoutputStream\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 103,col 9)",
        "(line 104,col 9)-(line 104,col 38)",
        "(line 105,col 9)-(line 120,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SerializationUtils.serialize(java.io.Serializable)",
      "begin_line": 131,
      "end_line": 135,
      "comment": "\n     * \u003cp\u003eSerializes an \u003ccode\u003eObject\u003c/code\u003e to a byte array for\n     * storage/serialization.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes\n     * @return a byte[] with the converted Serializable\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 68)",
        "(line 133,col 9)-(line 133,col 29)",
        "(line 134,col 9)-(line 134,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SerializationUtils.deserialize(java.io.InputStream)",
      "begin_line": 154,
      "end_line": 177,
      "comment": "\n     * \u003cp\u003eDeserializes an \u003ccode\u003eObject\u003c/code\u003e from the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written. This\n     * avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     * \n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param inputStream  the serialized object input stream, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException if \u003ccode\u003einputStream\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 36)",
        "(line 159,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang.SerializationUtils.deserialize(byte[])",
      "begin_line": 187,
      "end_line": 193,
      "comment": "\n     * \u003cp\u003eDeserializes a single \u003ccode\u003eObject\u003c/code\u003e from an array of bytes.\u003c/p\u003e\n     *\n     * @param objectData  the serialized object, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException if \u003ccode\u003eobjectData\u003c/code\u003e is \u003ccode\u003enull\u003c/code\u003e\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 190,col 9)",
        "(line 191,col 9)-(line 191,col 73)",
        "(line 192,col 9)-(line 192,col 33)"
      ]
    }
  ]
}