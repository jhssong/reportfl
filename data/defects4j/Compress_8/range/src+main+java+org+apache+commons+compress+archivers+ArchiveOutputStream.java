{
  "filepath": "/tmp/Compress-8b/src/main/java/org/apache/commons/compress/archivers/ArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 49,
      "end_line": 169,
      "comment": "\n * Archive output stream implementations are expected to override the\n * {@link #write(byte[], int, int)} method to improve performance.\n * They should also override {@link #close()} to ensure that any necessary\n * trailers are added.\n * \n * \u003cp\u003e\n * The normal sequence of calls for working with ArchiveOutputStreams is:\n * + create ArchiveOutputStream object\n * + write SFX header (optional, Zip only)\n * + repeat as needed:\n *      - putArchiveEntry() (writes entry header)\n *      - write() (writes entry data)\n *      - closeArchiveEntry() (closes entry)\n * + finish() (ends the addition of entries)\n * + write additional data if format supports it (optional)\n * + close()\n * \u003c/p\u003e\n * \n * \u003cp\u003e\n * Example usage:\u003cbr/\u003e\n * TBA\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": " Temporary buffer used for the {@link #write(int)} method "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesWritten"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " holds the number of bytes written to this stream "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param entry describes the entry\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 74,
      "end_line": 74,
      "comment": "\n     * Closes the archive entry, writing any trailer information that may\n     * be required.\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.finish()",
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Finishes the addition of entries to this stream, without closing it.\n     * Additional data can be written, if the format supports it.\n     * \n     * The finish() method throws an Exception if the user forgets to close the entry\n     * .\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile\n     * @param entryName \n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.write(int)",
      "begin_line": 110,
      "end_line": 113,
      "comment": "\n     * Writes a byte to the current archive entry.\n     *\n     * This method simply calls write( byte[], 0, 1 ).\n     *\n     * MUST be overridden if the {@link #write(byte[], int, int)} method\n     * is not overridden; may be overridden otherwise.\n     * \n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 111,col 44)",
        "(line 112,col 9)-(line 112,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.count(int)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param written the number of bytes written\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.count(long)",
      "begin_line": 132,
      "end_line": 136,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param written the number of bytes written\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getCount()",
      "begin_line": 144,
      "end_line": 146,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     * @deprecated this method may yield wrong results for large\n     * archives, use #getBytesWritten instead\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getBytesWritten()",
      "begin_line": 153,
      "end_line": 155,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 154,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eSome archive formats support variants or details that are\n     * not supported (yet).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation always returns true.\n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 20)"
      ]
    }
  ]
}