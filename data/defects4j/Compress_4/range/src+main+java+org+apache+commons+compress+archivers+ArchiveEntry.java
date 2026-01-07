{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/ArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ArchiveEntry",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 24,
      "end_line": 37,
      "comment": "\n * Represents an entry of an archive.\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getName()",
      "begin_line": 27,
      "end_line": 27,
      "comment": " The name of the entry in the archive. May refer to a file or directory or other item ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.getSize()",
      "begin_line": 30,
      "end_line": 30,
      "comment": " The (uncompressed) size of the entry. May be -1 (SIZE_UNKNOWN) if the size is unknown ",
      "child_ranges": []
    },
    {
      "type": "field",
      "varNames": [
        "SIZE_UNKNOWN"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " Special value indicating that the size is unknown "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.ArchiveEntry.isDirectory()",
      "begin_line": 36,
      "end_line": 36,
      "comment": " True if the entry refers to a directory ",
      "child_ranges": []
    }
  ]
}