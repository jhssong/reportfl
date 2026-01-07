{
  "filepath": "/tmp/Lang-20b/src/main/java/org/apache/commons/lang3/SerializationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 28,
      "end_line": 78,
      "comment": "\n * \u003cp\u003eException thrown when the Serialization process fails.\u003c/p\u003e\n *\n * \u003cp\u003eThe original error is wrapped within this one.\u003c/p\u003e\n *\n * \u003cp\u003e#NotThreadSafe# because Throwable is not threadsafe\u003c/p\u003e\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * \u003cp\u003eConstructs a new {@code SerializationException} without specified\n     * detail message.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException(java.lang.String)",
      "begin_line": 51,
      "end_line": 53,
      "comment": "\n     * \u003cp\u003eConstructs a new {@code SerializationException} with specified\n     * detail message.\u003c/p\u003e\n     *\n     * @param msg  The error message.\n     ",
      "child_ranges": [
        "(line 52,col 9)-(line 52,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException(java.lang.Throwable)",
      "begin_line": 62,
      "end_line": 64,
      "comment": "\n     * \u003cp\u003eConstructs a new {@code SerializationException} with specified\n     * nested {@code Throwable}.\u003c/p\u003e\n     *\n     * @param cause  The {@code Exception} or {@code Error}\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 63,col 9)-(line 63,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException(java.lang.String, java.lang.Throwable)",
      "begin_line": 74,
      "end_line": 76,
      "comment": "\n     * \u003cp\u003eConstructs a new {@code SerializationException} with specified\n     * detail message and nested {@code Throwable}.\u003c/p\u003e\n     *\n     * @param msg    The error message.\n     * @param cause  The {@code Exception} or {@code Error}\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 75,col 9)-(line 75,col 26)"
      ]
    }
  ]
}