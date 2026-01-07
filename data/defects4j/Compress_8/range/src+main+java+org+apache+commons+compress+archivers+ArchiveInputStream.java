{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/ArchiveInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 40,
      "end_line": 150,
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
      "comment": "\n     * Returns the next Archive Entry in this Stream.\n     *\n     * @return the next entry,\n     *         or \u003ccode\u003enull\u003c/code\u003e if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.read()",
      "begin_line": 79,
      "end_line": 82,
      "comment": "\n     * Reads a byte of data. This method will block until enough input is\n     * available.\n     * \n     * Simply calls the {@link #read(byte[], int, int)} method.\n     * \n     * MUST be overridden if the {@link #read(byte[], int, int)} method\n     * is not overridden; may be overridden otherwise.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 80,col 9)-(line 80,col 37)",
        "(line 81,col 9)-(line 81,col 54)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.count(int)",
      "begin_line": 90,
      "end_line": 92,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.count(long)",
      "begin_line": 101,
      "end_line": 105,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 104,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.pushedBackBytes(long)",
      "begin_line": 113,
      "end_line": 115,
      "comment": "\n     * Decrements the counter of already read bytes.\n     * \n     * @param pushedBack the number of bytes pushed back.\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 114,col 9)-(line 114,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.getCount()",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     * @deprecated this method may yield wrong results for large\n     * archives, use #getBytesRead instead\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.getBytesRead()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveInputStream.canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 146,
      "end_line": 148,
      "comment": "\n     * Whether this stream is able to read the given entry.\n     *\n     * \u003cp\u003eSome archive formats support variants or details that are\n     * not supported (yet).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation always returns true.\n     *\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 20)"
      ]
    }
  ]
}