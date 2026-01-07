{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/archivers/zip/CircularBuffer.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CircularBuffer",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 28,
      "end_line": 89,
      "comment": "\n * Circular byte buffer.\n * \n * @author Emmanuel Bourg\n * @since 1.7\n "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 31,
      "end_line": 31,
      "comment": " Size of the buffer "
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 34,
      "end_line": 34,
      "comment": " The buffer "
    },
    {
      "type": "field",
      "varNames": [
        "readIndex"
      ],
      "begin_line": 37,
      "end_line": 37,
      "comment": " Index of the next data to be read from the buffer "
    },
    {
      "type": "field",
      "varNames": [
        "writeIndex"
      ],
      "begin_line": 40,
      "end_line": 40,
      "comment": " Index of the next data written in the buffer "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.CircularBuffer.CircularBuffer(int)",
      "begin_line": 42,
      "end_line": 45,
      "comment": "",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 25)",
        "(line 44,col 9)-(line 44,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.CircularBuffer.available()",
      "begin_line": 50,
      "end_line": 52,
      "comment": "\n     * Tells if a new byte can be read from the buffer.\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 51,col 39)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.CircularBuffer.put(int)",
      "begin_line": 57,
      "end_line": 60,
      "comment": "\n     * Writes a byte to the buffer.\n     ",
      "child_ranges": [
        "(line 58,col 9)-(line 58,col 42)",
        "(line 59,col 9)-(line 59,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.CircularBuffer.get()",
      "begin_line": 65,
      "end_line": 73,
      "comment": "\n     * Reads a byte from the buffer.\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 72,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.CircularBuffer.copy(int, int)",
      "begin_line": 81,
      "end_line": 88,
      "comment": "\n     * Copy a previous interval in the buffer to the current position.\n     * \n     * @param distance the distance from the current write position\n     * @param length   the number of bytes to copy\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 41)",
        "(line 83,col 9)-(line 83,col 33)",
        "(line 84,col 9)-(line 87,col 9)"
      ]
    }
  ]
}