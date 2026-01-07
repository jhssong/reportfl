{
  "filepath": "/tmp/Compress-25b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 31,
      "end_line": 184,
      "comment": "\n * Utility functions\n * @Immutable\n "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.IOUtils.IOUtils()",
      "begin_line": 34,
      "end_line": 35,
      "comment": " Private constructor to prevent instantiation of this utility class. ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 48,
      "end_line": 50,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 64,
      "end_line": 73,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     *\n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 65,col 9)-(line 65,col 51)",
        "(line 66,col 9)-(line 66,col 18)",
        "(line 67,col 9)-(line 67,col 21)",
        "(line 68,col 9)-(line 71,col 9)",
        "(line 72,col 9)-(line 72,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.skip(java.io.InputStream, long)",
      "begin_line": 87,
      "end_line": 97,
      "comment": "\n     * Skips the given number of bytes by repeatedly invoking skip on\n     * the given input stream if necessary.\n     *\n     * \u003cp\u003eThis method will only skip less than the requested number of\n     * bytes if the end of the input stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to skip bytes in\n     * @param numToSkip the number of bytes to skip\n     * @return the number of bytes actually skipped\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 35)",
        "(line 89,col 9)-(line 95,col 9)",
        "(line 96,col 9)-(line 96,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[])",
      "begin_line": 111,
      "end_line": 113,
      "comment": "\n     * Reads as much from input as possible to fill the given array.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to fill the array and\n     * only read less bytes than the length of the array if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @return the number of bytes actually read\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 112,col 9)-(line 112,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[], int, int)",
      "begin_line": 131,
      "end_line": 145,
      "comment": "\n     * Reads as much from input as possible to fill the given array\n     * with the given amount of bytes.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to read the bytes and\n     * only read less bytes than the requested length if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @param offset offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes actually read\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 29)",
        "(line 137,col 9)-(line 143,col 9)",
        "(line 144,col 9)-(line 144,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.toByteArray(java.io.InputStream)",
      "begin_line": 165,
      "end_line": 169,
      "comment": "\n     * Gets the contents of an \u003ccode\u003eInputStream\u003c/code\u003e as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method buffers the input internally, so there is no need to use a\n     * \u003ccode\u003eBufferedInputStream\u003c/code\u003e.\n     *\n     * @param input  the \u003ccode\u003eInputStream\u003c/code\u003e to read from\n     * @return the requested byte array\n     * @throws NullPointerException if the input is null\n     * @throws IOException if an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 166,col 9)-(line 166,col 73)",
        "(line 167,col 9)-(line 167,col 28)",
        "(line 168,col 9)-(line 168,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.closeQuietly(java.io.Closeable)",
      "begin_line": 176,
      "end_line": 183,
      "comment": "\n     * Closes the given Closeable and swallows any IOException that may occur.\n     * @param c Closeable to close, can be null\n     * @since 1.7\n     ",
      "child_ranges": [
        "(line 177,col 9)-(line 182,col 9)"
      ]
    }
  ]
}