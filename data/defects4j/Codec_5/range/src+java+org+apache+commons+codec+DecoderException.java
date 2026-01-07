{
  "filepath": "/tmp/Codec-5b/src/java/org/apache/commons/codec/DecoderException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "DecoderException",
      "is_interface": false,
      "parent_types": [
        "java.lang.Exception"
      ],
      "begin_line": 26,
      "end_line": 88,
      "comment": "\n * Thrown when a Decoder has encountered a failure condition during a decode.\n * \n * @author Apache Software Foundation\n * @version $Id$\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Declares the Serial Version Uid.\n     * \n     * @see \u003ca href\u003d\"http://c2.com/cgi/wiki?AlwaysDeclareSerialVersionUid\"\u003eAlways Declare Serial Version Uid\u003c/a\u003e\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.DecoderException.DecoderException()",
      "begin_line": 41,
      "end_line": 43,
      "comment": "\n     * Constructs a new exception with \u003ccode\u003enull\u003c/code\u003e as its detail message. The cause is not initialized, and may\n     * subsequently be initialized by a call to {@link #initCause}.\n     * \n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 42,col 9)-(line 42,col 16)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.DecoderException.DecoderException(java.lang.String)",
      "begin_line": 52,
      "end_line": 54,
      "comment": "\n     * Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently\n     * be initialized by a call to {@link #initCause}.\n     * \n     * @param message\n     *            The detail message which is saved for later retrieval by the {@link #getMessage()} method.\n     ",
      "child_ranges": [
        "(line 53,col 9)-(line 53,col 23)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.DecoderException.DecoderException(java.lang.String, java.lang.Throwable)",
      "begin_line": 71,
      "end_line": 73,
      "comment": "\n     * Constructsa new exception with the specified detail message and cause.\n     * \n     * \u003cp\u003e\n     * Note that the detail message associated with \u003ccode\u003ecause\u003c/code\u003e is not automatically incorporated into this\n     * exception\u0027s detail message.\n     * \u003c/p\u003e\n     * \n     * @param message\n     *            The detail message which is saved for later retrieval by the {@link #getMessage()} method.\n     * @param cause\n     *            The cause which is saved for later retrieval by the {@link #getCause()} method. A \u003ccode\u003enull\u003c/code\u003e\n     *            value is permitted, and indicates that the cause is nonexistent or unknown.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 30)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.codec.DecoderException.DecoderException(java.lang.Throwable)",
      "begin_line": 85,
      "end_line": 87,
      "comment": "\n     * Constructs a new exception with the specified cause and a detail message of \u003ccode\u003e(cause\u003d\u003dnull ?\n     * null : cause.toString())\u003c/code\u003e (which typically contains the class and detail message of \u003ccode\u003ecause\u003c/code\u003e).\n     * This constructor is useful for exceptions that are little more than wrappers for other throwables.\n     * \n     * @param cause\n     *            The cause which is saved for later retrieval by the {@link #getCause()} method. A \u003ccode\u003enull\u003c/code\u003e\n     *            value is permitted, and indicates that the cause is nonexistent or unknown.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 86,col 9)-(line 86,col 21)"
      ]
    }
  ]
}