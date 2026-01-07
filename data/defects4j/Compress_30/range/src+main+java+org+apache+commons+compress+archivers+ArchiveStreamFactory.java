{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 77,
      "end_line": 416,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order to add other implementations, you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * @Immutable provided that the deprecated method setEntryEncoding is not used.\n * @ThreadSafe even if the deprecated method setEntryEncoding is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Constant (value {@value}) used to identify the AR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ARJ"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Constant (value {@value}) used to identify the ARJ archive format.\n     * Not supported as an output stream type.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": "\n     * Constant (value {@value}) used to identify the CPIO archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DUMP"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": "\n     * Constant (value {@value}) used to identify the Unix DUMP archive format.\n     * Not supported as an output stream type.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Constant (value {@value}) used to identify the JAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": "\n     * Constant (value {@value}) used to identify the ZIP archive format.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SEVEN_Z"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Constant (value {@value}) used to identify the 7z archive format.\n     * @since 1.8\n     "
    },
    {
      "type": "field",
      "varNames": [
        "encoding"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Entry encoding, null for the platform default.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "entryEncoding"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Entry encoding, null for the default.\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.ArchiveStreamFactory()",
      "begin_line": 135,
      "end_line": 137,
      "comment": "\n     * Create an instance using the platform default encoding.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 19)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.ArchiveStreamFactory(java.lang.String)",
      "begin_line": 146,
      "end_line": 151,
      "comment": "\n     * Create an instance using the specified encoding.\n     *\n     * @param encoding the encoding to be used.\n     *\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 147,col 16)",
        "(line 148,col 9)-(line 148,col 33)",
        "(line 150,col 9)-(line 150,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.getEntryEncoding()",
      "begin_line": 160,
      "end_line": 162,
      "comment": "\n     * Returns the encoding to use for arj, jar, zip, dump, cpio and tar\n     * files, or null for the archiver default.\n     *\n     * @return entry encoding, or null for the archiver default\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.setEntryEncoding(java.lang.String)",
      "begin_line": 173,
      "end_line": 180,
      "comment": "\n     * Sets the encoding to use for arj, jar, zip, dump, cpio and tar files. Use null for the archiver default.\n     * \n     * @param entryEncoding the entry encoding, null uses the archiver default.\n     * @since 1.5\n     * @deprecated 1.10 use {@link #ArchiveStreamFactory(String)} to specify the encoding\n     * @throws IllegalStateException if the constructor {@link #ArchiveStreamFactory(String)} \n     * was used to specify the factory encoding.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 194,
      "end_line": 256,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name,\n     * i.e. {@value #AR}, {@value #ARJ}, {@value #ZIP}, {@value #TAR}, {@value #JAR}, {@value #CPIO}, {@value #DUMP} or {@value #SEVEN_Z}\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 200,col 9)",
        "(line 202,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 208,col 9)",
        "(line 209,col 9)-(line 215,col 9)",
        "(line 216,col 9)-(line 222,col 9)",
        "(line 223,col 9)-(line 229,col 9)",
        "(line 230,col 9)-(line 236,col 9)",
        "(line 237,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 250,col 9)",
        "(line 251,col 9)-(line 253,col 9)",
        "(line 255,col 9)-(line 255,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 270,
      "end_line": 315,
      "comment": "\n     * Create an archive output stream from an archiver name and an output stream.\n     * \n     * @param archiverName the archive name,\n     * i.e. {@value #AR}, {@value #ZIP}, {@value #TAR}, {@value #JAR} or {@value #CPIO} \n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * written to a stream\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 273,col 9)-(line 275,col 9)",
        "(line 276,col 9)-(line 278,col 9)",
        "(line 280,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 303,col 9)",
        "(line 304,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 313,col 9)",
        "(line 314,col 9)-(line 314,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 329,
      "end_line": 414,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws StreamingNotSupportedException if the format cannot be\n     * read from a stream\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 335,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 46)",
        "(line 340,col 9)-(line 340,col 34)",
        "(line 341,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 81)"
      ]
    }
  ]
}