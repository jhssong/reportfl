{
  "filepath": "/tmp/Compress-36b/src/main/java/org/apache/commons/compress/archivers/ArchiveOutputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveOutputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 47,
      "end_line": 169,
      "comment": "\n * Archive output stream implementations are expected to override the\n * {@link #write(byte[], int, int)} method to improve performance.\n * They should also override {@link #close()} to ensure that any necessary\n * trailers are added.\n * \n * \u003cp\u003eThe normal sequence of calls when working with ArchiveOutputStreams is:\u003c/p\u003e\n * \u003cul\u003e\n *   \u003cli\u003eCreate ArchiveOutputStream object,\u003c/li\u003e\n *   \u003cli\u003eoptionally write SFX header (Zip only),\u003c/li\u003e\n *   \u003cli\u003erepeat as needed:\n *     \u003cul\u003e\n *       \u003cli\u003e{@link #putArchiveEntry(ArchiveEntry)} (writes entry header),\n *       \u003cli\u003e{@link #write(byte[])} (writes entry data, as often as needed),\n *       \u003cli\u003e{@link #closeArchiveEntry()} (closes entry),\n *     \u003c/ul\u003e\n *   \u003c/li\u003e\n *   \u003cli\u003e {@link #finish()} (ends the addition of entries),\u003c/li\u003e\n *   \u003cli\u003e optionally write additional data, provided format supports it,\u003c/li\u003e\n *   \u003cli\u003e{@link #close()}.\u003c/li\u003e\n * \u003c/ul\u003e\n "
    },
    {
      "type": "field",
      "varNames": [
        "oneByte"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": " Temporary buffer used for the {@link #write(int)} method "
    },
    {
      "type": "field",
      "varNames": [
        "BYTE_MASK"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesWritten"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": " holds the number of bytes written to this stream "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 65,
      "end_line": 65,
      "comment": "\n     * Writes the headers for an archive entry to the output stream.\n     * The caller must then write the content to the stream and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param entry describes the entry\n     * @throws IOException if an I/O error occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.closeArchiveEntry()",
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Closes the archive entry, writing any trailer information that may\n     * be required.\n     * @throws IOException if an I/O error occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.finish()",
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Finishes the addition of entries to this stream, without closing it.\n     * Additional data can be written, if the format supports it.\n     * \n     * @throws IOException if the user forgets to close the entry.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile the file to create the entry from\n     * @param entryName name to use for the entry\n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException if an I/O error occurs\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.write(int)",
      "begin_line": 106,
      "end_line": 110,
      "comment": "\n     * Writes a byte to the current archive entry.\n     *\n     * \u003cp\u003eThis method simply calls {@code write( byte[], 0, 1 )}.\n     *\n     * \u003cp\u003eMUST be overridden if the {@link #write(byte[], int, int)} method\n     * is not overridden; may be overridden otherwise.\n     * \n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 108,col 44)",
        "(line 109,col 9)-(line 109,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.count(int)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if EOF has been hit ({@code written \u003d\u003d -1}).\n     * \n     * @param written the number of bytes written\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.count(long)",
      "begin_line": 129,
      "end_line": 133,
      "comment": "\n     * Increments the counter of already written bytes.\n     * Doesn\u0027t increment if EOF has been hit ({@code written \u003d\u003d -1}).\n     * \n     * @param written the number of bytes written\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 132,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getCount()",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     * @deprecated this method may yield wrong results for large\n     * archives, use #getBytesWritten instead\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.getBytesWritten()",
      "begin_line": 151,
      "end_line": 153,
      "comment": "\n     * Returns the current number of bytes written to this stream.\n     * @return the number of written bytes\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 152,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveOutputStream.canWriteEntryData(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 166,
      "end_line": 168,
      "comment": "\n     * Whether this stream is able to write the given entry.\n     *\n     * \u003cp\u003eSome archive formats support variants or details that are\n     * not supported (yet).\u003c/p\u003e\n     *\n     * @param archiveEntry\n     *            the entry to test\n     * @return This implementation always returns true.\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 20)"
      ]
    }
  ]
}