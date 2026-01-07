{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/EntryStreamOffsets.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "EntryStreamOffsets",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 46,
      "comment": "\n * Provides information about ArchiveEntry stream offsets.\n "
    },
    {
      "type": "field",
      "varNames": [
        "OFFSET_UNKNOWN"
      ],
      "begin_line": 28,
      "end_line": 28,
      "comment": " Special value indicating that the offset is unknown. "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.EntryStreamOffsets.getDataOffset()",
      "begin_line": 36,
      "end_line": 36,
      "comment": "\n     * Gets the offset of data stream within the archive file,\n     *\n     * @return\n     *      the offset of entry data stream, {@code OFFSET_UNKNOWN} if not known.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.EntryStreamOffsets.isStreamContiguous()",
      "begin_line": 45,
      "end_line": 45,
      "comment": "\n     * Indicates whether the stream is contiguous, i.e. not split among\n     * several archive parts, interspersed with control blocks, etc.\n     *\n     * @return\n     *      true if stream is contiguous, false otherwise.\n     ",
      "child_ranges": []
    }
  ]
}