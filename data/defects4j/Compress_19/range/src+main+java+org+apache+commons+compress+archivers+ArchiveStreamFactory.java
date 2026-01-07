{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 75,
      "end_line": 335,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order to add other implementations, you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": "\n     * Constant used to identify the AR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": "\n     * Constant used to identify the ARJ archive format.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Constant used to identify the CPIO archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * Constant used to identify the Unix DUMP archive format.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Constant used to identify the JAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": "\n     * Constant used to identify the ZIP archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 125,
      "end_line": 127,
      "comment": "\n     * Returns the encoding to use for arj, zip and tar files,\n     * or null for the default.\n     *\n     * @return entry encoding, or null\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 126,col 9)-(line 126,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Sets the encoding to use for arj, zip and tar files.\n     * Use null for the default.\n     *\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 148,
      "end_line": 195,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"arj\", \"zip\", \"tar\", \"jar\", \"dump\" or \"cpio\"\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 158,col 9)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 163,col 9)-(line 169,col 9)",
        "(line 170,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 187,col 9)-(line 189,col 9)",
        "(line 190,col 9)-(line 192,col 9)",
        "(line 194,col 9)-(line 194,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 206,
      "end_line": 240,
      "comment": "\n     * Create an archive output stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 211,col 9)",
        "(line 212,col 9)-(line 214,col 9)",
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 238,col 9)",
        "(line 239,col 9)-(line 239,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 252,
      "end_line": 333,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 46)",
        "(line 263,col 9)-(line 263,col 34)",
        "(line 264,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 81)"
      ]
    }
  ]
}