{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/ArchiveStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 45,
      "end_line": 154,
      "comment": "\n * Factory to create Archive[In|Out]putStreams from names or the first bytes of\n * the InputStream. In order add other implementations you should extend\n * ArchiveStreamFactory and override the appropriate methods (and call their\n * implementation from super of course)\n * \n * TODO add example here\n * @Immutable\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 56,
      "end_line": 75,
      "comment": "\n     * Create an archive input stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 61,col 9)",
        "(line 63,col 9)-(line 73,col 9)",
        "(line 74,col 9)-(line 74,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 86,
      "end_line": 106,
      "comment": "\n     * Create an archive output stream from an archiver name and an input stream.\n     * \n     * @param archiverName the archive name, i.e. \"ar\", \"zip\", \"tar\", \"jar\" or \"cpio\"\n     * @param out the output stream\n     * @return the archive output stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 89,col 9)-(line 92,col 9)",
        "(line 94,col 9)-(line 104,col 9)",
        "(line 105,col 9)-(line 105,col 80)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveStreamFactory.createArchiveInputStream(java.io.InputStream)",
      "begin_line": 117,
      "end_line": 153,
      "comment": "\n     * Create an archive input stream from an input stream, autodetecting\n     * the archive type from the first few bytes of the stream.\n     * \n     * @param in the input stream\n     * @return the archive input stream\n     * @throws ArchiveException if the archiver name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 121,col 9)",
        "(line 123,col 9)-(line 125,col 9)",
        "(line 127,col 9)-(line 127,col 46)",
        "(line 128,col 9)-(line 128,col 34)",
        "(line 129,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 152,col 62)"
      ]
    }
  ]
}