{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 31,
      "end_line": 72,
      "comment": "\n * Implements the \"gz\" compression format as an input stream.\n * This classes wraps the standard java classes for working with gz. \n "
    },
    {
      "type": "field",
      "varNames": [
        "in"
      ],
      "begin_line": 33,
      "end_line": 33,
      "comment": " reference to the compressed stream "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.GzipCompressorInputStream(java.io.InputStream)",
      "begin_line": 42,
      "end_line": 44,
      "comment": "\n     * Constructs a new GZip compressed input stream by the referenced\n     * InputStream.\n     * \n     * @param inputStream the InputStream from which this object should be created of\n     * @throws IOException if the stream could not be created\n     ",
      "child_ranges": [
        "(line 43,col 9)-(line 43,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read()",
      "begin_line": 49,
      "end_line": 53,
      "comment": " (non-Javadoc)\n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 29)",
        "(line 51,col 9)-(line 51,col 38)",
        "(line 52,col 9)-(line 52,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[])",
      "begin_line": 58,
      "end_line": 62,
      "comment": " (non-Javadoc)\n     * @see java.io.InputStream#read(byte[])\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 30)",
        "(line 60,col 9)-(line 60,col 25)",
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[], int, int)",
      "begin_line": 67,
      "end_line": 71,
      "comment": " (non-Javadoc)\n     * @see java.io.InputStream#read(byte[], int, int)\n     ",
      "child_ranges": [
        "(line 68,col 9)-(line 68,col 44)",
        "(line 69,col 9)-(line 69,col 25)",
        "(line 70,col 9)-(line 70,col 20)"
      ]
    }
  ]
}