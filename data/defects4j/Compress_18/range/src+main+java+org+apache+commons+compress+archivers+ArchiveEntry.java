{
  "filepath": "/tmp/Compress-18b/src/main/java/org/apache/commons/compress/archivers/ArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveEntry",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 46,
      "comment": "\n * Represents an entry of an archive.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getName()",
      "begin_line": 29,
      "end_line": 29,
      "comment": " The name of the entry in the archive. May refer to a file or directory or other item ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getSize()",
      "begin_line": 32,
      "end_line": 32,
      "comment": " The (uncompressed) size of the entry. May be -1 (SIZE_UNKNOWN) if the size is unknown ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_UNKNOWN"
      ],
      "begin_line": 35,
      "end_line": 35,
      "comment": " Special value indicating that the size is unknown "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.isDirectory()",
      "begin_line": 38,
      "end_line": 38,
      "comment": " True if the entry refers to a directory ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getLastModifiedDate()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * The last modified date of the entry.\n     * \n     * @since 1.1\n     ",
      "child_ranges": []
    }
  ]
}