{
  "filepath": "/tmp/Codec-13b/src/main/java/org/apache/commons/codec/digest/B64.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "B64",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 79,
      "comment": "\n * Base64 like method to convert binary bytes into ASCII chars.\n *\n * TODO: Can Base64 be reused?\n *\n * \u003cp\u003e\n * This class is immutable and thread-safe.\n * \u003c/p\u003e\n *\n * @version $Id$\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "B64T"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": "\n     * Table with characters for Base64 transformation.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.B64.b64from24bit(byte, byte, byte, int, java.lang.StringBuilder)",
      "begin_line": 54,
      "end_line": 64,
      "comment": "\n     * Base64 like conversion of bytes to ASCII chars.\n     *\n     * @param b2\n     *            A byte from the result.\n     * @param b1\n     *            A byte from the result.\n     * @param b0\n     *            A byte from the result.\n     * @param outLen\n     *            The number of expected output chars.\n     * @param buffer\n     *            Where the output chars is appended to.\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 81)",
        "(line 59,col 9)-(line 59,col 23)",
        "(line 60,col 9)-(line 63,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.codec.digest.B64.getRandomSalt(int)",
      "begin_line": 72,
      "end_line": 78,
      "comment": "\n     * Generates a string of random chars from the B64T set.\n     *\n     * @param num\n     *            Number of chars to generate.\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 61)",
        "(line 74,col 9)-(line 76,col 9)",
        "(line 77,col 9)-(line 77,col 37)"
      ]
    }
  ]
}