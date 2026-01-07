{
  "filepath": "/tmp/Lang-24b/src/main/java/org/apache/commons/lang3/SerializationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationException",
      "is_interface": false,
      "parent_types": [
        "java.lang.RuntimeException"
      ],
      "begin_line": 29,
      "end_line": 79,
      "comment": "\n * \u003cp\u003eException thrown when the Serialization process fails.\u003c/p\u003e\n *\n * \u003cp\u003eThe original error is wrapped within this one.\u003c/p\u003e\n *\n * \u003cp\u003e#NotThreadSafe# because Throwable is not threadsafe\u003c/p\u003e\n * @author Apache Software Foundation\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException()",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e without specified\n     * detail message.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * detail message.\u003c/p\u003e\n     *\n     * @param msg  The error message.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException(java.lang.Throwable)",
      "begin_line": 63,
      "end_line": 65,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cause  The \u003ccode\u003eException\u003c/code\u003e or \u003ccode\u003eError\u003c/code\u003e\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang3.SerializationException.SerializationException(java.lang.String, java.lang.Throwable)",
      "begin_line": 75,
      "end_line": 77,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param msg    The error message.\n     * @param cause  The \u003ccode\u003eException\u003c/code\u003e or \u003ccode\u003eError\u003c/code\u003e\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 76,col 9)-(line 76,col 26)"
      ]
    }
  ]
}