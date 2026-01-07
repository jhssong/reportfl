{
  "filepath": "/tmp/Lang-57b/src/java/org/apache/commons/lang/SerializationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.exception.NestableRuntimeException"
      ],
      "begin_line": 30,
      "end_line": 80,
      "comment": "\n * \u003cp\u003eException thrown when the Serialization process fails.\u003c/p\u003e\n *\n * \u003cp\u003eThe original error is wrapped within this one.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": "\n     * Required for serialization support.\n     * \n     * @see java.io.Serializable\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e without specified\n     * detail message.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException(java.lang.String)",
      "begin_line": 53,
      "end_line": 55,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * detail message.\u003c/p\u003e\n     *\n     * @param msg  The error message.\n     ",
      "child_ranges": [
        "(line 54,col 9)-(line 54,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException(java.lang.Throwable)",
      "begin_line": 64,
      "end_line": 66,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cause  The \u003ccode\u003eException\u003c/code\u003e or \u003ccode\u003eError\u003c/code\u003e\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException(java.lang.String, java.lang.Throwable)",
      "begin_line": 76,
      "end_line": 78,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param msg    The error message.\n     * @param cause  The \u003ccode\u003eException\u003c/code\u003e or \u003ccode\u003eError\u003c/code\u003e\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 26)"
      ]
    }
  ]
}