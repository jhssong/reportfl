{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 72,
      "end_line": 225,
      "comment": "\n * \u003cp\u003eFactory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order add other implementations you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course).\u003c/p\u003e\n * \n * Compressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * ArchiveOutputStream os \u003d new ArchiveStreamFactory().createArchiveOutputStream(ArchiveStreamFactory.ZIP, out);\n * \n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test1.xml\"));\n * IOUtils.copy(new FileInputStream(file1), os);\n * os.closeArchiveEntry();\n *\n * os.putArchiveEntry(new ZipArchiveEntry(\"testdata/test2.xml\"));\n * IOUtils.copy(new FileInputStream(file2), os);\n * os.closeArchiveEntry();\n * os.close();\n * \u003c/pre\u003e\n * \n * Decompressing a ZIP-File:\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * ArchiveInputStream in \u003d new ArchiveStreamFactory().createArchiveInputStream(ArchiveStreamFactory.ZIP, is);\n * ZipArchiveEntry entry \u003d (ZipArchiveEntry)in.getNextEntry();\n * OutputStream out \u003d new FileOutputStream(new File(dir, entry.getName()));\n * IOUtils.copy(in, out);\n * out.close();\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "AR"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Constant used to identify the AR archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CPIO"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Constant used to identify the CPIO archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "JAR"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": "\n     * Constant used to identify the JAR archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "TAR"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": "\n     * Constant used to identify the TAR archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZIP"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Constant used to identify the ZIP archive format.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 109,
      "end_line": 138,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)",
        "(line 117,col 9)-(line 119,col 9)",
        "(line 121,col 9)-(line 123,col 9)",
        "(line 124,col 9)-(line 126,col 9)",
        "(line 127,col 9)-(line 129,col 9)",
        "(line 130,col 9)-(line 132,col 9)",
        "(line 133,col 9)-(line 135,col 9)",
        "(line 137,col 9)-(line 137,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 149,
      "end_line": 175,
      "comment": "\n     * Create an archive output stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 161,col 9)",
        "(line 162,col 9)-(line 164,col 9)",
        "(line 165,col 9)-(line 167,col 9)",
        "(line 168,col 9)-(line 170,col 9)",
        "(line 171,col 9)-(line 173,col 9)",
        "(line 174,col 9)-(line 174,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 187,
      "end_line": 224,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 195,col 9)",
        "(line 197,col 9)-(line 197,col 46)",
        "(line 198,col 9)-(line 198,col 34)",
        "(line 199,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 81)"
      ]
    }
  ]
}