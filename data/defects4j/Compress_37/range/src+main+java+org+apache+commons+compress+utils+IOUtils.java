{
  "filepath": "/tmp/Compress-37b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 206,
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
      "begin_line": 56,
      "end_line": 58,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @return the number of bytes copied\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 57,col 9)-(line 57,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 73,
      "end_line": 82,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @return the number of bytes copied\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 74,col 9)-(line 74,col 51)",
        "(line 75,col 9)-(line 75,col 18)",
        "(line 76,col 9)-(line 76,col 21)",
        "(line 77,col 9)-(line 80,col 9)",
        "(line 81,col 9)-(line 81,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.skip(java.io.InputStream, long)",
      "begin_line": 100,
      "end_line": 119,
      "comment": "\n     * Skips the given number of bytes by repeatedly invoking skip on\n     * the given input stream if necessary.\n     *\n     * \u003cp\u003eIn a case where the stream\u0027s skip() method returns 0 before\n     * the requested number of bytes has been skip this implementation\n     * will fall back to using the read() method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method will only skip less than the requested number of\n     * bytes if the end of the input stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to skip bytes in\n     * @param numToSkip the number of bytes to skip\n     * @return the number of bytes actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 41)",
        "(line 102,col 9)-(line 108,col 9)",
        "(line 110,col 9)-(line 117,col 9)",
        "(line 118,col 9)-(line 118,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[])",
      "begin_line": 133,
      "end_line": 135,
      "comment": "\n     * Reads as much from input as possible to fill the given array.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to fill the array and\n     * only read less bytes than the length of the array if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @return the number of bytes actually read\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 134,col 9)-(line 134,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[], int, int)",
      "begin_line": 153,
      "end_line": 167,
      "comment": "\n     * Reads as much from input as possible to fill the given array\n     * with the given amount of bytes.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to read the bytes and\n     * only read less bytes than the requested length if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @param offset offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes actually read\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 157,col 9)",
        "(line 158,col 9)-(line 158,col 29)",
        "(line 159,col 9)-(line 165,col 9)",
        "(line 166,col 9)-(line 166,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.toByteArray(java.io.InputStream)",
      "begin_line": 187,
      "end_line": 191,
      "comment": "\n     * Gets the contents of an \u003ccode\u003eInputStream\u003c/code\u003e as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method buffers the input internally, so there is no need to use a\n     * \u003ccode\u003eBufferedInputStream\u003c/code\u003e.\n     *\n     * @param input  the \u003ccode\u003eInputStream\u003c/code\u003e to read from\n     * @return the requested byte array\n     * @throws NullPointerException if the input is null\n     * @throws IOException if an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 73)",
        "(line 189,col 9)-(line 189,col 28)",
        "(line 190,col 9)-(line 190,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.closeQuietly(java.io.Closeable)",
      "begin_line": 198,
      "end_line": 205,
      "comment": "\n     * Closes the given Closeable and swallows any IOException that may occur.\n     * @param c Closeable to close, can be null\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 204,col 9)"
      ]
    }
  ]
}