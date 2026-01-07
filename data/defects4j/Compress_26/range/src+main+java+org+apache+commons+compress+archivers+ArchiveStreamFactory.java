{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 362,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order to add other implementations, you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Constant used to identify the AR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Constant used to identify the ARJ archive format.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Constant used to identify the CPIO archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Constant used to identify the Unix DUMP archive format.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": "\n     * Constant used to identify the JAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Constant used to identify the ZIP archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEVEN_Z"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Constant used to identify the 7z archive format.\n     * @since 1.8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 132,
      "end_line": 134,
      "comment": "\n     * Returns the encoding to use for arj, zip, dump, cpio and tar\n     * files, or null for the default.\n     *\n     * @return entry encoding, or null\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 133,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 142,
      "end_line": 144,
      "comment": "\n     * Sets the encoding to use for arj, zip, dump, cpio and tar files. Use null for the default.\n     * \n     * @param entryEncoding the entry encoding, null uses the default.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 143,col 9)-(line 143,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 157,
      "end_line": 215,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"arj\", \"zip\", \"tar\", \"jar\", \"dump\" or \"cpio\"\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 171,col 9)",
        "(line 172,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 185,col 9)",
        "(line 186,col 9)-(line 192,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 209,col 9)",
        "(line 210,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 214,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 228,
      "end_line": 269,
      "comment": "\n     * Create an archive output stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * written to a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 233,col 9)",
        "(line 234,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 240,col 9)",
        "(line 241,col 9)-(line 247,col 9)",
        "(line 248,col 9)-(line 254,col 9)",
        "(line 255,col 9)-(line 257,col 9)",
        "(line 258,col 9)-(line 264,col 9)",
        "(line 265,col 9)-(line 267,col 9)",
        "(line 268,col 9)-(line 268,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 283,
      "end_line": 360,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 285,col 9)-(line 287,col 9)",
        "(line 289,col 9)-(line 291,col 9)",
        "(line 293,col 9)-(line 293,col 46)",
        "(line 294,col 9)-(line 294,col 34)",
        "(line 295,col 9)-(line 357,col 9)",
        "(line 359,col 9)-(line 359,col 81)"
      ]
    }
  ]
}