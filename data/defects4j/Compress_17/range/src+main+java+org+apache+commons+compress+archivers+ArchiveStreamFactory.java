{
  "filepath": "/tmp/Compress-17b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 74,
      "end_line": 320,
      "comment": "\n * \u003cp\u003eFactory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order add other implementations you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\u003c/p\u003e\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Constant used to identify the AR archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Constant used to identify the CPIO archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": "\n     * Constant used to identify the Unix DUMP archive format.\n     * @since Commons Compress 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Constant used to identify the JAR archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Constant used to identify the ZIP archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Returns the encoding to use for zip and tar files, or null for\n     * the default.\n     *\n     * @return entry encoding, or null\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * Sets the encoding to use for zip and tar files. Use null for\n     * the default.\n     *\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 142,
      "end_line": 182,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\", \"dump\" or \"cpio\"\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 150,col 9)-(line 152,col 9)",
        "(line 154,col 9)-(line 156,col 9)",
        "(line 157,col 9)-(line 163,col 9)",
        "(line 164,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 176,col 9)",
        "(line 177,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 193,
      "end_line": 227,
      "comment": "\n     * Create an archive output stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 201,col 9)",
        "(line 203,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 212,col 9)",
        "(line 213,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 239,
      "end_line": 318,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 241,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 249,col 46)",
        "(line 250,col 9)-(line 250,col 34)",
        "(line 251,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 317,col 81)"
      ]
    }
  ]
}