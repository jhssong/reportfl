{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 76,
      "end_line": 342,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order to add other implementations, you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": "\n     * Constant used to identify the AR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": "\n     * Constant used to identify the ARJ archive format.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * Constant used to identify the CPIO archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Constant used to identify the Unix DUMP archive format.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * Constant used to identify the JAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Constant used to identify the ZIP archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 126,
      "end_line": 128,
      "comment": "\n     * Returns the encoding to use for arj, zip, dump, cpio and tar\n     * files, or null for the default.\n     *\n     * @return entry encoding, or null\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 136,
      "end_line": 138,
      "comment": "\n     * Sets the encoding to use for arj, zip, dump, cpio and tar files. Use null for the default.\n     * \n     * @param entryEncoding the entry encoding, null uses the default.\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 137,col 9)-(line 137,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 149,
      "end_line": 204,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"arj\", \"zip\", \"tar\", \"jar\", \"dump\" or \"cpio\"\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 155,col 9)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 184,col 9)",
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 194,col 9)",
        "(line 195,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 203,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 215,
      "end_line": 253,
      "comment": "\n     * Create an archive output stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 220,col 9)",
        "(line 221,col 9)-(line 223,col 9)",
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 234,col 9)",
        "(line 235,col 9)-(line 241,col 9)",
        "(line 242,col 9)-(line 244,col 9)",
        "(line 245,col 9)-(line 251,col 9)",
        "(line 252,col 9)-(line 252,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 265,
      "end_line": 340,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 267,col 9)-(line 269,col 9)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 46)",
        "(line 276,col 9)-(line 276,col 34)",
        "(line 277,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 81)"
      ]
    }
  ]
}