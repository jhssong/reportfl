{
  "filepath": "/tmp/Compress-19b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 61,
      "end_line": 238,
      "comment": "\n * \u003cp\u003eFactory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * CompressorOutputStream cos \u003d \n *      new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * CompressorInputStream in \u003d \n *      new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2, is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": "\n     * Constant used to identify the BZIP2 compression algorithm.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Constant used to identify the GZIP compression algorithm.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Constant used to identify the PACK200 compression algorithm.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": "\n     * Constant used to identify the XZ compression method.\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 101,
      "end_line": 103,
      "comment": "\n     * Whether to decompress the full input or only the first stream\n     * in formats supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003eThis setting applies to the gzip, bzip2 and xz formats only.\u003c/p\u003e\n     *\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first\n     *                          stream and leave the input position to point\n     *                          to the next byte after the stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 102,col 9)-(line 102,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 116,
      "end_line": 154,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting\n     * the compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 118,col 9)-(line 120,col 9)",
        "(line 122,col 9)-(line 124,col 9)",
        "(line 126,col 9)-(line 126,col 46)",
        "(line 127,col 9)-(line 127,col 34)",
        "(line 128,col 9)-(line 151,col 9)",
        "(line 153,col 9)-(line 153,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 165,
      "end_line": 195,
      "comment": "\n     * Create a compressor input stream from a compressor name and an input stream.\n     * \n     * @param name of the compressor, i.e. \"gz\", \"bzip2\", \"xz\", or \"pack200\"\n     * @param in the input stream\n     * @return compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 193,col 9)",
        "(line 194,col 9)-(line 194,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 206,
      "end_line": 237,
      "comment": "\n     * Create an compressor output stream from an compressor name and an input stream.\n     * \n     * @param name the compressor name, i.e. \"gz\", \"bzip2\", \"xz\", or \"pack200\"\n     * @param out the output stream\n     * @return the compressor output stream\n     * @throws CompressorException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 209,col 9)-(line 212,col 9)",
        "(line 214,col 9)-(line 235,col 9)",
        "(line 236,col 9)-(line 236,col 77)"
      ]
    }
  ]
}