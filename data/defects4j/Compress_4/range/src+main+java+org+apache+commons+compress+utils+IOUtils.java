{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 29,
      "end_line": 68,
      "comment": "\n * Utility functions\n * @Immutable\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     * \n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 58,
      "end_line": 67,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     * \n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 51)",
        "(line 60,col 9)-(line 60,col 18)",
        "(line 61,col 9)-(line 61,col 21)",
        "(line 62,col 9)-(line 65,col 9)",
        "(line 66,col 9)-(line 66,col 21)"
      ]
    }
  ]
}