{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 34,
      "end_line": 238,
      "comment": "\n * Utility functions\n * @Immutable (has mutable data but it is write-only)\n "
    },
    {
      "type": "field",
      "varNames": [
        "COPY_BUF_SIZE"
      ],
      "begin_line": 36,
      "end_line": 36,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF_SIZE"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "SKIP_BUF"
      ],
      "begin_line": 41,
      "end_line": 41,
      "comment": " Does not affect Immutability"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.IOUtils.IOUtils()",
      "begin_line": 44,
      "end_line": 45,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 59,
      "end_line": 61,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @return the number of bytes copied\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 60,col 9)-(line 60,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 76,
      "end_line": 85,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @return the number of bytes copied\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 77,col 9)-(line 77,col 51)",
        "(line 78,col 9)-(line 78,col 18)",
        "(line 79,col 9)-(line 79,col 21)",
        "(line 80,col 9)-(line 83,col 9)",
        "(line 84,col 9)-(line 84,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.skip(java.io.InputStream, long)",
      "begin_line": 103,
      "end_line": 122,
      "comment": "\n     * Skips the given number of bytes by repeatedly invoking skip on\n     * the given input stream if necessary.\n     *\n     * \u003cp\u003eIn a case where the stream\u0027s skip() method returns 0 before\n     * the requested number of bytes has been skip this implementation\n     * will fall back to using the read() method.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis method will only skip less than the requested number of\n     * bytes if the end of the input stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to skip bytes in\n     * @param numToSkip the number of bytes to skip\n     * @return the number of bytes actually skipped\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 104,col 9)-(line 104,col 41)",
        "(line 105,col 9)-(line 111,col 9)",
        "(line 113,col 9)-(line 120,col 9)",
        "(line 121,col 9)-(line 121,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[])",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Reads as much from input as possible to fill the given array.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to fill the array and\n     * only read less bytes than the length of the array if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @return the number of bytes actually read\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[], int, int)",
      "begin_line": 156,
      "end_line": 170,
      "comment": "\n     * Reads as much from input as possible to fill the given array\n     * with the given amount of bytes.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to read the bytes and\n     * only read less bytes than the requested length if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @param offset offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes actually read\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 9)",
        "(line 161,col 9)-(line 161,col 29)",
        "(line 162,col 9)-(line 168,col 9)",
        "(line 169,col 9)-(line 169,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.nio.channels.ReadableByteChannel, java.nio.ByteBuffer)",
      "begin_line": 186,
      "end_line": 199,
      "comment": "\n     * Reads {@code b.remaining()} bytes from the given channel\n     * starting at the current channel\u0027s position.\n     *\n     * \u003cp\u003eThis method reads repeatedly from the channel until the\n     * requested number of bytes are read. This method blocks until\n     * the requested number of bytes are read, the end of the channel\n     * is detected, or an exception is thrown.\u003c/p\u003e\n     *\n     * @param channel the channel to read from\n     * @param b the buffer into which the data is read.\n     * @throws IOException - if an I/O error occurs.\n     * @throws EOFException - if the channel reaches the end before reading all the bytes.\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 49)",
        "(line 188,col 9)-(line 188,col 21)",
        "(line 189,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 198,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.toByteArray(java.io.InputStream)",
      "begin_line": 219,
      "end_line": 223,
      "comment": "\n     * Gets the contents of an \u003ccode\u003eInputStream\u003c/code\u003e as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method buffers the input internally, so there is no need to use a\n     * \u003ccode\u003eBufferedInputStream\u003c/code\u003e.\n     *\n     * @param input  the \u003ccode\u003eInputStream\u003c/code\u003e to read from\n     * @return the requested byte array\n     * @throws NullPointerException if the input is null\n     * @throws IOException if an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 73)",
        "(line 221,col 9)-(line 221,col 28)",
        "(line 222,col 9)-(line 222,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.closeQuietly(java.io.Closeable)",
      "begin_line": 230,
      "end_line": 237,
      "comment": "\n     * Closes the given Closeable and swallows any IOException that may occur.\n     * @param c Closeable to close, can be null\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 236,col 9)"
      ]
    }
  ]
}