{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 66,
      "end_line": 288,
      "comment": "\n * \u003cp\u003eFactory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * CompressorOutputStream cos \u003d \n *      new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * CompressorInputStream in \u003d \n *      new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2, is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable\n "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": "\n     * Constant used to identify the BZIP2 compression algorithm.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": "\n     * Constant used to identify the GZIP compression algorithm.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 83,
      "end_line": 83,
      "comment": "\n     * Constant used to identify the PACK200 compression algorithm.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": "\n     * Constant used to identify the XZ compression method.\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": "\n     * Constant used to identify the LZMA compression method.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * Constant used to identify the \"framed\" Snappy compression method.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": "\n     * Constant used to identify the \"raw\" Snappy compression method.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Constant used to identify the traditional Unix compress method.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * Whether to decompress the full input or only the first stream\n     * in formats supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003eThis setting applies to the gzip, bzip2 and xz formats only.\u003c/p\u003e\n     *\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first\n     *                          stream and leave the input position to point\n     *                          to the next byte after the stream\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 145,
      "end_line": 187,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting\n     * the compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 147,col 9)-(line 149,col 9)",
        "(line 151,col 9)-(line 153,col 9)",
        "(line 155,col 9)-(line 155,col 46)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 184,col 9)",
        "(line 186,col 9)-(line 186,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 199,
      "end_line": 245,
      "comment": "\n     * Create a compressor input stream from a compressor name and an input stream.\n     * \n     * @param name of the compressor, i.e. \"gz\", \"bzip2\", \"xz\",\n     *        \"lzma\", \"snappy-raw\", \"snappy-framed\", \"pack200\", \"z\"\n     * @param in the input stream\n     * @return compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 204,col 9)",
        "(line 206,col 9)-(line 243,col 9)",
        "(line 244,col 9)-(line 244,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 256,
      "end_line": 287,
      "comment": "\n     * Create an compressor output stream from an compressor name and an input stream.\n     * \n     * @param name the compressor name, i.e. \"gz\", \"bzip2\", \"xz\", or \"pack200\"\n     * @param out the output stream\n     * @return the compressor output stream\n     * @throws CompressorException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 259,col 9)-(line 262,col 9)",
        "(line 264,col 9)-(line 285,col 9)",
        "(line 286,col 9)-(line 286,col 77)"
      ]
    }
  ]
}