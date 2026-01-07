{
  "filepath": "/tmp/Compress-22b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveSparseEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveSparseEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants"
      ],
      "begin_line": 43,
      "end_line": 63,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 45,
      "end_line": 45,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry.TarArchiveSparseEntry(byte[])",
      "begin_line": 54,
      "end_line": 58,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IOException on unknown format\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 23)",
        "(line 56,col 9)-(line 56,col 39)",
        "(line 57,col 9)-(line 57,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry.isExtended()",
      "begin_line": 60,
      "end_line": 62,
      "comment": "",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 26)"
      ]
    }
  ]
}