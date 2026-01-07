{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/ArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 52,
      "end_line": 172,
      "comment": "\n * Archive output stream implementations are expected to override the\n * {@link #write(byte[], int, int)} method to improve performance.\n * They should also override {@link #close()} to ensure that any necessary\n * trailers are added.\n * \n * \u003cp\u003eThe normal sequence of calls when working with ArchiveOutputStreams is:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003eCreate ArchiveOutputStream object,\u003c/li\u003e\n *   \u003cli\u003eoptionally write SFX header (Zip only),\u003c/li\u003e\n *   \u003cli\u003erepeat as needed:\n *     \u003cul\u003e\n *       \u003cli\u003e{@link #putArchiveEntry(ArchiveEntry)} (writes entry header),\n *       \u003cli\u003e{@link #write(byte[])} (writes entry data, as often as needed),\n *       \u003cli\u003e{@link #closeArchiveEntry()} (closes entry),\n *     \u003c/ul\u003e\n *   \u003c/li\u003e\n *   \u003cli\u003e {@link #finish()} (ends the addition of entries),\u003c/li\u003e\n *   \u003cli\u003e optionally write additional data, provided format supports it,\u003c/li\u003e\n *   \u003cli\u003e{@link #close()}.\u003c/li\u003e\n * \u003c/ul\u003e\n * \n * \u003cp\u003e\n * Example usage:\u003cbr/\u003e\n * TBA\n * \u003c/p\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": " Temporary buffer used for the {@link #write(int)} method "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesWritten"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": " holds the number of bytes written to this stream "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 70,
      "end_line": 70,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param entry describes the entry\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Closes the archive entry, writing any trailer information that may\n     * be required.\n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.finish()",
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Finishes the addition of entries to this stream, without closing it.\n     * Additional data can be written, if the format supports it.\n     * \n     * @throws IOException if the user forgets to close the entry.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile\n     * @param entryName \n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.write(int)",
      "begin_line": 111,
      "end_line": 115,
      "comment": "\n     * Writes a byte to the current archive entry.\n     *\n     * \u003cp\u003eThis method simply calls {@code write( byte[], 0, 1 )}.\n     *\n     * \u003cp\u003eMUST be overridden if the {@link #write(byte[], int, int)} method\n     * is not overridden; may be overridden otherwise.\n     * \n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 113,col 44)",
        "(line 114,col 9)-(line 114,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.count(int)",
      "begin_line": 123,
      "end_line": 125,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if EOF has been hit ({@code written \u003d\u003d -1}).\n     * \n     * @param written the number of bytes written\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 124,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.count(long)",
      "begin_line": 134,
      "end_line": 138,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if EOF has been hit ({@code written \u003d\u003d -1}).\n     * \n     * @param written the number of bytes written\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getCount()",
      "begin_line": 146,
      "end_line": 149,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     * @deprecated this method may yield wrong results for large\n     * archives, use #getBytesWritten instead\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getBytesWritten()",
      "begin_line": 156,
      "end_line": 158,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 157,col 9)-(line 157,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 169,
      "end_line": 171,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eSome archive formats support variants or details that are\n     * not supported (yet).\u003c/p\u003e\n     *\n     * \u003cp\u003eThis implementation always returns true.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 20)"
      ]
    }
  ]
}