{
  "filepath": "/tmp/Compress-7b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 31,
      "end_line": 103,
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
      "end_line": 51,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 48,col 9)-(line 48,col 29)",
        "(line 49,col 9)-(line 49,col 38)",
        "(line 50,col 9)-(line 50,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[])",
      "begin_line": 58,
      "end_line": 62,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 59,col 9)-(line 59,col 30)",
        "(line 60,col 9)-(line 60,col 25)",
        "(line 61,col 9)-(line 61,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.read(byte[], int, int)",
      "begin_line": 69,
      "end_line": 73,
      "comment": "\n     * {@inheritDoc}\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 70,col 9)-(line 70,col 44)",
        "(line 71,col 9)-(line 71,col 25)",
        "(line 72,col 9)-(line 72,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.gzip.GzipCompressorInputStream.matches(byte[], int)",
      "begin_line": 86,
      "end_line": 101,
      "comment": "\n     * Checks if the signature matches what is expected for a gzip file.\n     * \n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this stream is a gzipped compressed stream, false otherwise\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 90,col 9)",
        "(line 92,col 9)-(line 94,col 9)",
        "(line 96,col 9)-(line 98,col 9)",
        "(line 100,col 9)-(line 100,col 20)"
      ]
    }
  ]
}