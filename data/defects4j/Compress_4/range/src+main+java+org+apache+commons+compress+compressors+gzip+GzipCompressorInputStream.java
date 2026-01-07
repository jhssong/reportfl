{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/compressors/gzip/GzipCompressorInputStream.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "GzipCompressorInputStream",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorInputStream"
      ],
      "begin_line": 31,
      "end_line": 53,
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
      "end_line": 52,
      "comment": " (non-Javadoc)\n     * @see java.io.InputStream#read()\n     ",
      "child_ranges": [
        "(line 50,col 9)-(line 50,col 22)",
        "(line 51,col 9)-(line 51,col 25)"
      ]
    }
  ]
}