{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/archivers/zip/ZipArchiveEntryRequestSupplier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ZipArchiveEntryRequestSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 36,
      "comment": "\n * Supplies {@link ZipArchiveEntryRequest}.\n *\n * Implementations are required to support thread-handover. While an instance will\n * not be accessed concurrently by multiple threads, it will be called by\n * a different thread than it was created on.\n *\n * @since 1.13\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequestSupplier.get()",
      "begin_line": 35,
      "end_line": 35,
      "comment": "\n     * Supply a {@link ZipArchiveEntryRequest} to be added to a parallel archive.\n     * @return The {@link ZipArchiveEntryRequest} instance. Should never be null.\n     ",
      "child_ranges": []
    }
  ]
}