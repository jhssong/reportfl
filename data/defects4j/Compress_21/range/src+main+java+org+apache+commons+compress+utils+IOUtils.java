{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 30,
      "end_line": 169,
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
      "signature": "org.apache.commons.compress.utils.IOUtils.skip(java.io.InputStream, long)",
      "begin_line": 86,
      "end_line": 96,
      "comment": "\n     * Skips the given number of bytes by repeatedly invoking skip on\n     * the given input stream if necessary.\n     *\n     * \u003cp\u003eThis method will only skip less than the requested number of\n     * bytes if the end of the input stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to skip bytes in\n     * @param numToSkip the number of bytes to skip\n     * @return the number of bytes actually skipped\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 87,col 9)-(line 87,col 35)",
        "(line 88,col 9)-(line 94,col 9)",
        "(line 95,col 9)-(line 95,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[])",
      "begin_line": 110,
      "end_line": 112,
      "comment": "\n     * Reads as much from input as possible to fill the given array.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to fill the array and\n     * only read less bytes than the length of the array if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @return the number of bytes actually read\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.readFully(java.io.InputStream, byte[], int, int)",
      "begin_line": 130,
      "end_line": 144,
      "comment": "\n     * Reads as much from input as possible to fill the given array\n     * with the given amount of bytes.\n     *\n     * \u003cp\u003eThis method may invoke read repeatedly to read the bytes and\n     * only read less bytes than the requested length if the end of\n     * the stream has been reached.\u003c/p\u003e\n     *\n     * @param input stream to read from\n     * @param b buffer to fill\n     * @param offset offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes actually read\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 134,col 9)",
        "(line 135,col 9)-(line 135,col 29)",
        "(line 136,col 9)-(line 142,col 9)",
        "(line 143,col 9)-(line 143,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.toByteArray(java.io.InputStream)",
      "begin_line": 164,
      "end_line": 168,
      "comment": "\n     * Gets the contents of an \u003ccode\u003eInputStream\u003c/code\u003e as a \u003ccode\u003ebyte[]\u003c/code\u003e.\n     * \u003cp\u003e\n     * This method buffers the input internally, so there is no need to use a\n     * \u003ccode\u003eBufferedInputStream\u003c/code\u003e.\n     *\n     * @param input  the \u003ccode\u003eInputStream\u003c/code\u003e to read from\n     * @return the requested byte array\n     * @throws NullPointerException if the input is null\n     * @throws IOException if an I/O error occurs\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 165,col 9)-(line 165,col 73)",
        "(line 166,col 9)-(line 166,col 28)",
        "(line 167,col 9)-(line 167,col 36)"
      ]
    }
  ]
}