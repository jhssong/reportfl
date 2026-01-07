{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/zip/Zip64RequiredException.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "Zip64RequiredException",
      "is_interface": false,
      "parent_types": [
        "java.util.zip.ZipException"
      ],
      "begin_line": 29,
      "end_line": 49,
      "comment": "\n * Exception thrown when attempting to write data that requires Zip64\n * support to an archive and {@link ZipArchiveOutputStream#setUseZip64\n * UseZip64} has been set to {@link Zip64Mode#Never Never}.\n * @since 1.3\n "
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64RequiredException.getEntryTooBigMessage(org.apache.commons.compress.archivers.zip.ZipArchiveEntry)",
      "begin_line": 36,
      "end_line": 38,
      "comment": "\n     * Helper to format \"entry too big\" messages.\n     ",
      "child_ranges": [
        "(line 37,col 9)-(line 37,col 69)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "ARCHIVE_TOO_BIG_MESSAGE"
      ],
      "begin_line": 40,
      "end_line": 41,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "TOO_MANY_ENTRIES_MESSAGE"
      ],
      "begin_line": 43,
      "end_line": 44,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.Zip64RequiredException.Zip64RequiredException(java.lang.String)",
      "begin_line": 46,
      "end_line": 48,
      "comment": "",
      "child_ranges": [
        "(line 47,col 9)-(line 47,col 22)"
      ]
    }
  ]
}