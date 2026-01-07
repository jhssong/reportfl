{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/utils/BoundedInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "BoundedInputStream",
      "is_interface": false,
      "parent_types": [
        "java.io.InputStream"
      ],
      "begin_line": 28,
      "end_line": 73,
      "comment": "\n * A stream that limits reading from a wrapped stream to a given number of bytes.\n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 29,
      "end_line": 29,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bytesRemaining"
      ],
      "begin_line": 30,
      "end_line": 30,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.utils.BoundedInputStream.BoundedInputStream(java.io.InputStream, long)",
      "begin_line": 38,
      "end_line": 41,
      "comment": "\n     * Creates the stream that will at most read the given amount of\n     * bytes from the given stream.\n     * @param in the stream to read from\n     * @param size the maximum amount of bytes to read\n     ",
      "child_ranges": [
        "(line 39,col 9)-(line 39,col 21)",
        "(line 40,col 9)-(line 40,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BoundedInputStream.read()",
      "begin_line": 43,
      "end_line": 50,
      "comment": "",
      "child_ranges": [
        "(line 45,col 9)-(line 48,col 9)",
        "(line 49,col 9)-(line 49,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BoundedInputStream.read(byte[], int, int)",
      "begin_line": 52,
      "end_line": 66,
      "comment": "",
      "child_ranges": [
        "(line 54,col 9)-(line 56,col 9)",
        "(line 57,col 9)-(line 57,col 30)",
        "(line 58,col 9)-(line 60,col 9)",
        "(line 61,col 9)-(line 61,col 59)",
        "(line 62,col 9)-(line 64,col 9)",
        "(line 65,col 9)-(line 65,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.utils.BoundedInputStream.close()",
      "begin_line": 68,
      "end_line": 72,
      "comment": "",
      "child_ranges": []
    }
  ]
}