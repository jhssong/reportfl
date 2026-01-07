{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/ArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 49,
      "end_line": 134,
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
        "bytesRead"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": " holds the number of bytes read in this stream "
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
      "end_line": 125,
      "comment": "\n     * Increments the counter of already read bytes.\n     * Doesn\u0027t increment if the EOF has been hit (read \u003d\u003d -1)\n     * \n     * @param read the number of bytes read\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 124,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getCount()",
      "begin_line": 131,
      "end_line": 133,
      "comment": "\n     * Returns the current number of bytes read from this stream.\n     * @return the number of read bytes\n     ",
      "child_ranges": [
        "(line 132,col 9)-(line 132,col 25)"
      ]
    }
  ]
}