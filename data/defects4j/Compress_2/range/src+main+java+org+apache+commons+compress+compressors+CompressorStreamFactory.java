{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 38,
      "end_line": 89,
      "comment": "\n * Factory to create Compressor[In|Out]putStreams from names In order add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course)\n * \n * TODO add example here\n * @Immutable\n "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 49,
      "end_line": 67,
      "comment": "\n     * Create a compressor input stream from a compressor name and an input stream.\n     * \n     * @param name of the compressor, i.e. \"gz\" or \"bzip2\"\n     * @param in the input stream\n     * @return compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 51,col 9)-(line 54,col 9)",
        "(line 56,col 9)-(line 66,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 69,
      "end_line": 88,
      "comment": "",
      "child_ranges": [
        "(line 72,col 9)-(line 75,col 9)",
        "(line 77,col 9)-(line 87,col 9)"
      ]
    }
  ]
}