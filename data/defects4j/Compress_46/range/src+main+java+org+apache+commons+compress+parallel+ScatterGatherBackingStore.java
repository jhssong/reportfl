{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/parallel/ScatterGatherBackingStore.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "ScatterGatherBackingStore",
      "is_interface": true,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 36,
      "end_line": 61,
      "comment": "\n * \u003cp\u003eStore intermediate payload in a scatter-gather scenario.\n * Multiple threads write their payload to a backing store, which can\n * subsequently be reversed to an {@link InputStream} to be used as input in the\n * gather phase.\u003c/p\u003e\n *\n * \u003cp\u003eIt is the responsibility of the allocator of an instance of this class\n * to close this. Closing it should clear off any allocated structures\n * and preferably delete files.\u003c/p\u003e\n *\n * @since 1.10\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.parallel.ScatterGatherBackingStore.getInputStream()",
      "begin_line": 44,
      "end_line": 44,
      "comment": "\n     * An input stream that contains the scattered payload\n     *\n     * @return An InputStream, should be closed by the caller of this method.\n     * @throws IOException when something fails\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.parallel.ScatterGatherBackingStore.writeOut(byte[], int, int)",
      "begin_line": 54,
      "end_line": 54,
      "comment": "\n     * Writes a piece of payload.\n     *\n     * @param data the data to write\n     * @param offset offset inside data to start writing from\n     * @param length the amount of data to write\n     * @throws IOException when something fails\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.parallel.ScatterGatherBackingStore.closeForWriting()",
      "begin_line": 60,
      "end_line": 60,
      "comment": "\n     * Closes this backing store for further writing.\n     * @throws IOException when something fails\n     ",
      "child_ranges": []
    }
  ]
}