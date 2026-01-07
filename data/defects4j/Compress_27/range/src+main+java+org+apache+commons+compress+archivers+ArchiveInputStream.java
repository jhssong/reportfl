{
  "filepath": "/tmp/Compress-27b/src/main/java/org/apache/commons/compress/archivers/ArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 40,
      "end_line": 155,
      "comment": "\n * Archive input streams \u003cb\u003eMUST\u003c/b\u003e override the \n * {@link #read(byte[], int, int)} - or {@link #read()} -\n * method so that reading from the stream generates EOF for the end of\n * data in each entry as well as at the end of the file proper.\n * \u003cp\u003e\n * The {@link #getNextEntry()} method is used to reset the input stream\n * ready for reading the data from the next entry.\n * \u003cp\u003e\n * The input stream classes must also implement a method with the signature:\n * \u003cpre\u003e\n * public static boolean matches(byte[] signature, int length)\n * \u003c/pre\u003e\n * which is used by the {@link ArchiveStreamFactory} to autodetect\n * the archive type from the first few bytes of a stream. \n "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLE"
      ],
      "begin_line": 42,
      "end_line": 42,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesRead"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": " holds the number of bytes read in this stream "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.getNextEntry()",
      "begin_line": 55,
      "end_line": 55,
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.read()",
      "begin_line": 79,
      "end_line": 83,
      "comment": "\n     * Reads a byte of data. This method will block until enough input is\n     * available.\n     * \n     * Simply calls the {@link #read(byte[], int, int)} method.\n     * \n     * MUST be overridden if the {@link #read(byte[], int, int)} method\n     * is not overridden; may be overridden otherwise.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 81,col 9)-(line 81,col 37)",
        "(line 82,col 9)-(line 82,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.count(int)",
      "begin_line": 91,
      "end_line": 93,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.count(long)",
      "begin_line": 102,
      "end_line": 106,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 103,col 9)-(line 105,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.pushedBackBytes(long)",
      "begin_line": 114,
      "end_line": 116,
      "comment": "\n     * Decrements the counter of already read bytes.\n     * \n     * @param pushedBack the number of bytes pushed back.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 115,col 9)-(line 115,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.getCount()",
      "begin_line": 124,
      "end_line": 127,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     * @deprecated this method may yield wrong results for large\n     * archives, use #getBytesRead instead\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.getBytesRead()",
      "begin_line": 134,
      "end_line": 136,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Whether this stream is able to read the given entry.\n     * \n     * \u003cp\u003e\n     * Some archive formats support variants or details that are not supported (yet).\n     * \u003c/p\u003e\n     * \n     * @param archiveEntry\n     *            the entry to test\n     * @return This implementation always returns true.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 20)"
      ]
    }
  ]
}