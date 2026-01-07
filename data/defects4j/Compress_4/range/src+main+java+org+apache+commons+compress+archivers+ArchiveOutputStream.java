{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/ArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 49,
      "end_line": 113,
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
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param entry describes the entry\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Closes the archive entry, writing any trailer information that may\n     * be required.\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.finish()",
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Finishes the addition of entries to this stream, without closing it.\n     * Additional data can be written, if the format supports it.\n     * \n     * The finish() method throws an Exception if the user forgets to close the entry\n     * .\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile\n     * @param entryName \n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.write(int)",
      "begin_line": 108,
      "end_line": 111,
      "comment": "\n     * Writes a byte to the current archive entry.\n     *\n     * This method simply calls write( byte[], 0, 1 ).\n     *\n     * MUST be overridden if the {@link #write(byte[], int, int)} method\n     * is not overridden; may be overridden otherwise.\n     * \n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 109,col 9)-(line 109,col 44)",
        "(line 110,col 9)-(line 110,col 29)"
      ]
    }
  ]
}