{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 98,
      "comment": "\n * Utility functions\n * @Immutable\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.IOUtils.IOUtils()",
      "begin_line": 33,
      "end_line": 34,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 47,
      "end_line": 49,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 63,
      "end_line": 72,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 64,col 9)-(line 64,col 51)",
        "(line 65,col 9)-(line 65,col 18)",
        "(line 66,col 9)-(line 66,col 21)",
        "(line 67,col 9)-(line 70,col 9)",
        "(line 71,col 9)-(line 71,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.toByteArray(java.io.InputStream)",
      "begin_line": 93,
      "end_line": 97,
      "comment": "\n     * Gets the contents of an \u003ccode\u003eInputStream\u003c/code\u003e as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method buffers the input internally, so there is no need to use a\n     * \u003ccode\u003eBufferedInputStream\u003c/code\u003e.\n     *\n     * @param input  the \u003ccode\u003eInputStream\u003c/code\u003e to read from\n     * @return the requested byte array\n     * @throws NullPointerException if the input is null\n     * @throws IOException if an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 73)",
        "(line 95,col 9)-(line 95,col 28)",
        "(line 96,col 9)-(line 96,col 36)"
      ]
    }
  ]
}