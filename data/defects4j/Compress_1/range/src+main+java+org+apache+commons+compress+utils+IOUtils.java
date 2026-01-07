{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/utils/IOUtils.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "IOUtils",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 25,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream)",
      "begin_line": 38,
      "end_line": 40,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream.\n     * Uses a default buffer size of 8024 bytes.\n     * \n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.IOUtils.copy(java.io.InputStream, java.io.OutputStream, int)",
      "begin_line": 54,
      "end_line": 60,
      "comment": "\n     * Copies the content of a InputStream into an OutputStream\n     * \n     * @param input\n     *            the InputStream to copy\n     * @param output\n     *            the target Stream\n     * @param buffersize\n     *            the buffer size to use\n     * @throws IOException\n     *             if an error occurs\n     ",
      "child_ranges": [
        "(line 55,col 9)-(line 55,col 51)",
        "(line 56,col 9)-(line 56,col 18)",
        "(line 57,col 9)-(line 59,col 9)"
      ]
    }
  ]
}