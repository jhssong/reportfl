{
  "filepath": "/tmp/Compress-11b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 60,
      "end_line": 217,
      "comment": "\n * \u003cp\u003eFactory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * CompressorOutputStream cos \u003d \n *      new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Compressing a file):\n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * CompressorInputStream in \u003d \n *      new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2, is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 66,
      "end_line": 66,
      "comment": "\n     * Constant used to identify the BZIP2 compression algorithm.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Constant used to identify the GZIP compression algorithm.\n     * @since Commons Compress 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": "\n     * Constant used to identify the PACK200 compression algorithm.\n     * @since Commons Compress 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Constant used to identify the XZ compression method.\n     * @since Commons Compress 1.4\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 96,
      "end_line": 133,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting\n     * the compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     * @since Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 98,col 9)-(line 100,col 9)",
        "(line 102,col 9)-(line 104,col 9)",
        "(line 106,col 9)-(line 106,col 46)",
        "(line 107,col 9)-(line 107,col 34)",
        "(line 108,col 9)-(line 130,col 9)",
        "(line 132,col 9)-(line 132,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 144,
      "end_line": 174,
      "comment": "\n     * Create a compressor input stream from a compressor name and an input stream.\n     * \n     * @param name of the compressor, i.e. \"gz\", \"bzip2\", \"xz\", or \"pack200\"\n     * @param in the input stream\n     * @return compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 172,col 9)",
        "(line 173,col 9)-(line 173,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 185,
      "end_line": 216,
      "comment": "\n     * Create an compressor output stream from an compressor name and an input stream.\n     * \n     * @param name the compressor name, i.e. \"gz\", \"bzip2\", \"xz\", or \"pack200\"\n     * @param out the output stream\n     * @return the compressor output stream\n     * @throws CompressorException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 191,col 9)",
        "(line 193,col 9)-(line 214,col 9)",
        "(line 215,col 9)-(line 215,col 77)"
      ]
    }
  ]
}