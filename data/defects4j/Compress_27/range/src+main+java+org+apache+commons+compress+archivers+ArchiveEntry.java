{
  "filepath": "/tmp/Compress-27b/src/main/java/org/apache/commons/compress/archivers/ArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveEntry",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 26,
      "end_line": 59,
      "comment": "\n * Represents an entry of an archive.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getName()",
      "begin_line": 33,
      "end_line": 33,
      "comment": "\n     * Gets the name of the entry in this archive. May refer to a file or directory or other item.\n     * \n     * @return The name of this entry in the archive.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getSize()",
      "begin_line": 40,
      "end_line": 40,
      "comment": "\n     * Gets the uncompressed size of this entry. May be -1 (SIZE_UNKNOWN) if the size is unknown\n     * \n     * @return the uncompressed size of this entry.\n     ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_UNKNOWN"
      ],
      "begin_line": 43,
      "end_line": 43,
      "comment": " Special value indicating that the size is unknown "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.isDirectory()",
      "begin_line": 50,
      "end_line": 50,
      "comment": "\n     * Returns true if this entry refers to a directory.\n     * \n     * @return true if this entry refers to a directory.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getLastModifiedDate()",
      "begin_line": 58,
      "end_line": 58,
      "comment": "\n     * Gets the last modified date of this entry.\n     * \n     * @return the last modified date of this entry.\n     * @since 1.1\n     ",
      "child_ranges": []
    }
  ]
}