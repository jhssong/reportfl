{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/EncoderException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EncoderException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 28,
      "end_line": 90,
      "comment": "\n * Thrown when there is a failure condition during the encoding process. This exception is thrown when an Encoder\n * encounters a encoding specific exception such as invalid data, inability to calculate a checksum, characters outside\n * of the expected range.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Declares the Serial Version Uid.\n     * \n     * @see \u003ca href\u003d\"http://c2.com/cgi/wiki?AlwaysDeclareSerialVersionUid\"\u003eAlways Declare Serial Version Uid\u003c/a\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.EncoderException.EncoderException()",
      "begin_line": 43,
      "end_line": 45,
      "comment": "\n     * Constructs a new exception with \u003ccode\u003enull\u003c/code\u003e as its detail message. The cause is not initialized, and may\n     * subsequently be initialized by a call to {@link #initCause}.\n     * \n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 44,col 9)-(line 44,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.EncoderException.EncoderException(java.lang.String)",
      "begin_line": 54,
      "end_line": 56,
      "comment": "\n     * Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently\n     * be initialized by a call to {@link #initCause}.\n     * \n     * @param message\n     *            a useful message relating to the encoder specific error.\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.EncoderException.EncoderException(java.lang.String, java.lang.Throwable)",
      "begin_line": 73,
      "end_line": 75,
      "comment": "\n     * Constructs a new exception with the specified detail message and cause.\n     * \n     * \u003cp\u003e\n     * Note that the detail message associated with \u003ccode\u003ecause\u003c/code\u003e is not automatically incorporated into this\n     * exception\u0027s detail message.\n     * \u003c/p\u003e\n     * \n     * @param message\n     *            The detail message which is saved for later retrieval by the {@link #getMessage()} method.\n     * @param cause\n     *            The cause which is saved for later retrieval by the {@link #getCause()} method. A \u003ccode\u003enull\u003c/code\u003e\n     *            value is permitted, and indicates that the cause is nonexistent or unknown.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.EncoderException.EncoderException(java.lang.Throwable)",
      "begin_line": 87,
      "end_line": 89,
      "comment": "\n     * Constructs a new exception with the specified cause and a detail message of \u003ccode\u003e(cause\u003d\u003dnull ?\n     * null : cause.toString())\u003c/code\u003e (which typically contains the class and detail message of \u003ccode\u003ecause\u003c/code\u003e).\n     * This constructor is useful for exceptions that are little more than wrappers for other throwables.\n     * \n     * @param cause\n     *            The cause which is saved for later retrieval by the {@link #getCause()} method. A \u003ccode\u003enull\u003c/code\u003e\n     *            value is permitted, and indicates that the cause is nonexistent or unknown.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 21)"
      ]
    }
  ]
}