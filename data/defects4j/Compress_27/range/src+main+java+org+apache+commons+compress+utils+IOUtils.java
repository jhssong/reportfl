{
  "filepath": "/tmp/Compress-27b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 204,
      "comment": "\n * Utility functions\n * @Immutable (has mutable data but it is write-only)\n "
    },
    {
      "type": "field",
      "varNames": [
        "COPY_BUF_SIZE"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF_SIZE"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 38,
      "end_line": 38,
      "comment": " Does not affect Immutability"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.IOUtils.IOUtils()",
      "begin_line": 41,
      "end_line": 42,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 55,
      "end_line": 57,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 56,col 9)-(line 56,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 71,
      "end_line": 80,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 72,col 9)-(line 72,col 51)",
        "(line 73,col 9)-(line 73,col 18)",
        "(line 74,col 9)-(line 74,col 21)",
        "(line 75,col 9)-(line 78,col 9)",
        "(line 79,col 9)-(line 79,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.skip(java.io.InputStream, long)",
      "begin_line": 98,
      "end_line": 117,
      "comment": "\n     * Skips the given number of bytes by repeatedly invoking skip on\n     * the given input stream if necessary.\n     *\n     * \u003cp\u003eIn a case where the stream\u0027s skip() method returns 0 before\n     * the requested number of bytes has been skip this implementation\n     * will fall back to using the read() method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method will only skip less than the requested number of\n     * bytes if the end of the input stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to skip bytes in\n     * @param numToSkip the number of bytes to skip\n     * @return the number of bytes actually skipped\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 35)",
        "(line 100,col 9)-(line 106,col 9)",
        "(line 108,col 9)-(line 115,col 9)",
        "(line 116,col 9)-(line 116,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[])",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Reads as much from input as possible to fill the given array.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to fill the array and\n     * only read less bytes than the length of the array if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @return the number of bytes actually read\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[], int, int)",
      "begin_line": 151,
      "end_line": 165,
      "comment": "\n     * Reads as much from input as possible to fill the given array\n     * with the given amount of bytes.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to read the bytes and\n     * only read less bytes than the requested length if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @param offset offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes actually read\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 156,col 9)-(line 156,col 29)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 164,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.toByteArray(java.io.InputStream)",
      "begin_line": 185,
      "end_line": 189,
      "comment": "\n     * Gets the contents of an \u003ccode\u003eInputStream\u003c/code\u003e as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method buffers the input internally, so there is no need to use a\n     * \u003ccode\u003eBufferedInputStream\u003c/code\u003e.\n     *\n     * @param input  the \u003ccode\u003eInputStream\u003c/code\u003e to read from\n     * @return the requested byte array\n     * @throws NullPointerException if the input is null\n     * @throws IOException if an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 73)",
        "(line 187,col 9)-(line 187,col 28)",
        "(line 188,col 9)-(line 188,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.closeQuietly(java.io.Closeable)",
      "begin_line": 196,
      "end_line": 203,
      "comment": "\n     * Closes the given Closeable and swallows any IOException that may occur.\n     * @param c Closeable to close, can be null\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 197,col 9)-(line 202,col 9)"
      ]
    }
  ]
}