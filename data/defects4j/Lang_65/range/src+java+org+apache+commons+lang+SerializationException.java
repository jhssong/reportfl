{
  "filepath": "/tmp/Lang-65b/src/java/org/apache/commons/lang/SerializationException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SerializationException",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.lang.exception.NestableRuntimeException"
      ],
      "begin_line": 29,
      "end_line": 75,
      "comment": "\n * \u003cp\u003eException thrown when the Serialization process fails.\u003c/p\u003e\n *\n * \u003cp\u003eThe original error is wrapped within this one.\u003c/p\u003e\n *\n * @author Stephen Colebourne\n * @since 1.0\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 32,
      "end_line": 32,
      "comment": " Serialization version. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException()",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e without specified\n     * detail message.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException(java.lang.String)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * detail message.\u003c/p\u003e\n     *\n     * @param msg  The error message.\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException(java.lang.Throwable)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * nested \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param cause  The \u003ccode\u003eException\u003c/code\u003e or \u003ccode\u003eError\u003c/code\u003e\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 21)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.lang.SerializationException.SerializationException(java.lang.String, java.lang.Throwable)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * \u003cp\u003eConstructs a new \u003ccode\u003eSerializationException\u003c/code\u003e with specified\n     * detail message and nested \u003ccode\u003eThrowable\u003c/code\u003e.\u003c/p\u003e\n     *\n     * @param msg    The error message.\n     * @param cause  The \u003ccode\u003eException\u003c/code\u003e or \u003ccode\u003eError\u003c/code\u003e\n     *  that caused this exception to be thrown.\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 26)"
      ]
    }
  ]
}