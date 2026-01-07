{
  "filepath": "/tmp/Lang-9b/src/main/java/org/apache/commons/lang3/SerializationUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 48,
      "end_line": 322,
      "comment": "\n * \u003cp\u003eAssists with the serialization process and performs additional functionality based\n * on serialization.\u003c/p\u003e\n * \u003cp\u003e\n * \u003cul\u003e\n * \u003cli\u003eDeep clone using serialization\n * \u003cli\u003eSerialize managing finally and IOException\n * \u003cli\u003eDeserialize managing finally and IOException\n * \u003c/ul\u003e\n *\n * \u003cp\u003eThis class throws exceptions for invalid {@code null} inputs.\n * Each method documents its behaviour in more detail.\u003c/p\u003e\n *\n * \u003cp\u003e#ThreadSafe#\u003c/p\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationUtils.SerializationUtils()",
      "begin_line": 58,
      "end_line": 60,
      "comment": "\n     * \u003cp\u003eSerializationUtils instances should NOT be constructed in standard programming.\n     * Instead, the class should be used as {@code SerializationUtils.clone(object)}.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis constructor is public to permit tools that require a JavaBean instance\n     * to operate.\u003c/p\u003e\n     * @since 2.0\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 16)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.clone(T)",
      "begin_line": 78,
      "end_line": 111,
      "comment": "\n     * \u003cp\u003eDeep clone an {@code Object} using serialization.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is many times slower than writing clone methods by hand\n     * on all objects in your object graph. However, for complex object\n     * graphs, or for those that don\u0027t support deep cloning this can\n     * be a simple alternative implementation. Of course all the objects\n     * must be {@code Serializable}.\u003c/p\u003e\n     *\n     * @param \u003cT\u003e the type of the object involved\n     * @param object  the {@code Serializable} object to clone\n     * @return the cloned object\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 79,col 9)-(line 81,col 9)",
        "(line 82,col 9)-(line 82,col 46)",
        "(line 83,col 9)-(line 83,col 73)",
        "(line 85,col 9)-(line 85,col 52)",
        "(line 86,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable, java.io.OutputStream)",
      "begin_line": 130,
      "end_line": 151,
      "comment": "\n     * \u003cp\u003eSerializes an {@code Object} to the specified stream.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream will be closed once the object is written.\n     * This avoids the need for a finally clause, and maybe also exception\n     * handling, in the application code.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe stream passed in is not buffered internally within this method.\n     * This is the responsibility of your application if desired.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes, may be null\n     * @param outputStream  the stream to write to, must not be null\n     * @throws IllegalArgumentException if {@code outputStream} is {@code null}\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 133,col 9)",
        "(line 134,col 9)-(line 134,col 38)",
        "(line 135,col 9)-(line 150,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.serialize(java.io.Serializable)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * \u003cp\u003eSerializes an {@code Object} to a byte array for\n     * storage/serialization.\u003c/p\u003e\n     *\n     * @param obj  the object to serialize to bytes\n     * @return a byte[] with the converted Serializable\n     * @throws SerializationException (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 68)",
        "(line 163,col 9)-(line 163,col 29)",
        "(line 164,col 9)-(line 164,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.deserialize(java.io.InputStream)",
      "begin_line": 198,
      "end_line": 223,
      "comment": "\n     * \u003cp\u003e\n     * Deserializes an {@code Object} from the specified stream.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The stream will be closed once the object is written. This avoids the need for a finally clause, and maybe also\n     * exception handling, in the application code.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * The stream passed in is not buffered internally within this method. This is the responsibility of your\n     * application if desired.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the call site incorrectly types the return value, a {@link ClassCastException} is thrown from the call site.\n     * Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.\n     * Note that in both cases, the ClassCastException is in the call site, not in this method.\n     * \u003c/p\u003e\n     * \n     * @param inputStream\n     *            the serialized object input stream, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException\n     *             if {@code inputStream} is {@code null}\n     * @throws SerializationException\n     *             (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 203,col 9)",
        "(line 204,col 9)-(line 204,col 36)",
        "(line 205,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.deserialize(byte[])",
      "begin_line": 244,
      "end_line": 251,
      "comment": "\n     * \u003cp\u003e\n     * Deserializes a single {@code Object} from an array of bytes.\n     * \u003c/p\u003e\n     * \n     * \u003cp\u003e\n     * If the call site incorrectly types the return value, a {@link ClassCastException} is thrown from the call site.\n     * Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.\n     * Note that in both cases, the ClassCastException is in the call site, not in this method.\n     * \u003c/p\u003e\n     * \n     * @param objectData\n     *            the serialized object, must not be null\n     * @return the deserialized object\n     * @throws IllegalArgumentException\n     *             if {@code objectData} is {@code null}\n     * @throws SerializationException\n     *             (runtime) if the serialization fails\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 69)"
      ]
    },
    {
      "type": "class_interface",
      "name": "ClassLoaderAwareObjectInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.ObjectInputStream"
      ],
      "begin_line": 266,
      "end_line": 320,
      "comment": "\n     * \u003cp\u003eCustom specialization of the standard JDK {@link java.io.ObjectInputStream}\n     * that uses a custom  \u003ccode\u003eClassLoader\u003c/code\u003e to resolve a class.\n     * If the specified \u003ccode\u003eClassLoader\u003c/code\u003e is not able to resolve the class,\n     * the context classloader of the current thread will be used.\n     * This way, the standard deserialization work also in web-application\n     * containers and application servers, no matter in which of the\n     * \u003ccode\u003eClassLoader\u003c/code\u003e the particular class that encapsulates\n     * serialization/deserialization lives. \u003c/p\u003e\n     * \n     * \u003cp\u003eFor more in-depth information about the problem for which this\n     * class here is a workaround, see the JIRA issue LANG-626. \u003c/p\u003e\n     "
    },
    {
      "type": "field",
      "varNames": [
        "primitiveTypes"
      ],
      "begin_line": 267,
      "end_line": 268,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "classLoader"
      ],
      "begin_line": 269,
      "end_line": 269,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream.ClassLoaderAwareObjectInputStream(java.io.InputStream, java.lang.ClassLoader)",
      "begin_line": 278,
      "end_line": 291,
      "comment": "\n         * Constructor.\n         * @param in The \u003ccode\u003eInputStream\u003c/code\u003e.\n         * @param classLoader classloader to use\n         * @throws IOException if an I/O error occurs while reading stream header.\n         * @see java.io.ObjectInputStream\n         ",
      "child_ranges": [
        "(line 279,col 13)-(line 279,col 22)",
        "(line 280,col 13)-(line 280,col 43)",
        "(line 282,col 13)-(line 282,col 51)",
        "(line 283,col 13)-(line 283,col 53)",
        "(line 284,col 13)-(line 284,col 49)",
        "(line 285,col 13)-(line 285,col 51)",
        "(line 286,col 13)-(line 286,col 53)",
        "(line 287,col 13)-(line 287,col 55)",
        "(line 288,col 13)-(line 288,col 57)",
        "(line 289,col 13)-(line 289,col 51)",
        "(line 290,col 13)-(line 290,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.lang3.SerializationUtils.ClassLoaderAwareObjectInputStream.resolveClass(java.io.ObjectStreamClass)",
      "begin_line": 301,
      "end_line": 318,
      "comment": "\n         * Overriden version that uses the parametrized \u003ccode\u003eClassLoader\u003c/code\u003e or the \u003ccode\u003eClassLoader\u003c/code\u003e\n         * of the current \u003ccode\u003eThread\u003c/code\u003e to resolve the class.\n         * @param desc An instance of class \u003ccode\u003eObjectStreamClass\u003c/code\u003e.\n         * @return A \u003ccode\u003eClass\u003c/code\u003e object corresponding to \u003ccode\u003edesc\u003c/code\u003e.\n         * @throws IOException Any of the usual Input/Output exceptions.\n         * @throws ClassNotFoundException If class of a serialized object cannot be found.\n         ",
      "child_ranges": [
        "(line 303,col 13)-(line 303,col 41)",
        "(line 304,col 13)-(line 317,col 13)"
      ]
    }
  ]
}