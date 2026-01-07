{
  "filepath": "/tmp/Compress-9b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 31,
      "end_line": 117,
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
      "begin_line": 47,
      "end_line": 52,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 49,col 9)-(line 49,col 29)",
        "(line 50,col 9)-(line 50,col 38)",
        "(line 51,col 9)-(line 51,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[])",
      "begin_line": 59,
      "end_line": 64,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 61,col 9)-(line 61,col 30)",
        "(line 62,col 9)-(line 62,col 25)",
        "(line 63,col 9)-(line 63,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[], int, int)",
      "begin_line": 71,
      "end_line": 76,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 73,col 9)-(line 73,col 44)",
        "(line 74,col 9)-(line 74,col 25)",
        "(line 75,col 9)-(line 75,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byte[], int)",
      "begin_line": 89,
      "end_line": 104,
      "comment": "\n     * Checks if the signature matches what is expected for a gzip file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a gzipped compressed stream, false otherwise\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 93,col 9)",
        "(line 95,col 9)-(line 97,col 9)",
        "(line 99,col 9)-(line 101,col 9)",
        "(line 103,col 9)-(line 103,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.close()",
      "begin_line": 111,
      "end_line": 116,
      "comment": "\n     * Closes the input stream (unless it is System.in).\n     * \n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 113,col 9)-(line 115,col 9)"
      ]
    }
  ]
}