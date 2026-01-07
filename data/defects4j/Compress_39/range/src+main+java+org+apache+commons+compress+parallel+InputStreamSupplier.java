{
  "filepath": "/tmp/Compress-39b/src/main/java/org/apache/commons/compress/parallel/InputStreamSupplier.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "InputStreamSupplier",
      "is_interface": true,
      "parent_types": [],
      "begin_line": 33,
      "end_line": 40,
      "comment": "\n * Supplies input streams.\n *\n * Implementations are required to support thread-handover. While an instance will\n * not be accessed concurrently by multiple threads, it will be called by\n * a different thread than it was created on.\n *\n * @since 1.10\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.parallel.InputStreamSupplier.get()",
      "begin_line": 39,
      "end_line": 39,
      "comment": "\n     * Supply an input stream for a resource.\n     * @return the input stream. Should never null, but may be an empty stream.\n     ",
      "child_ranges": []
    }
  ]
}