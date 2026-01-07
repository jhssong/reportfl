{
  "filepath": "/tmp/Compress-29b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [],
      "begin_line": 67,
      "end_line": 366,
      "comment": "\n * \u003cp\u003eFactory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output); \n * CompressorOutputStream cos \u003d \n *      new CompressorStreamFactory().createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input); \n * CompressorInputStream in \u003d \n *      new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2, is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * @Immutable provided that the deprecated method setDecompressConcatenated is not used.\n "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": "\n     * Constant (value {@value}) used to identify the BZIP2 compression algorithm.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": "\n     * Constant (value {@value}) used to identify the GZIP compression algorithm.\n     * Not supported as an output stream type.\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": "\n     * Constant (value {@value}) used to identify the PACK200 compression algorithm.\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * Constant (value {@value}) used to identify the XZ compression method.\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Constant (value {@value}) used to identify the LZMA compression method.\n     * Not supported as an output stream type.\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Constant (value {@value}) used to identify the \"framed\" Snappy compression method.\n     * Not supported as an output stream type.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": "\n     * Constant (value {@value}) used to identify the \"raw\" Snappy compression method.\n     * Not supported as an output stream type.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": "\n     * Constant (value {@value}) used to identify the traditional Unix compress method.\n     * Not supported as an output stream type.\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate compress method.\n     * @since 1.9\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decompressUntilEOF"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": "\n     * If true, decompress until the end of the input.\n     * If false, stop after the first stream and leave the \n     * input position to point to the next byte after the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory()",
      "begin_line": 147,
      "end_line": 149,
      "comment": "\n     * Create an instance with the decompress Concatenated option set to false.\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 148,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean)",
      "begin_line": 161,
      "end_line": 165,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     * @param       decompressUntilEOF\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first\n     *                          stream and leave the input position to point\n     *                          to the next byte after the stream.\n     *           This setting applies to the gzip, bzip2 and xz formats only.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 162,col 9)-(line 162,col 70)",
        "(line 164,col 9)-(line 164,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 183,
      "end_line": 189,
      "comment": "\n     * Whether to decompress the full input or only the first stream\n     * in formats supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003eThis setting applies to the gzip, bzip2 and xz formats only.\u003c/p\u003e\n     *\n     * @param       decompressConcatenated\n     *                          if true, decompress until the end of the\n     *                          input; if false, stop after the first\n     *                          stream and leave the input position to point\n     *                          to the next byte after the stream\n     * @since 1.5\n     * @deprecated 1.10 use the {@link #CompressorStreamFactory(boolean)} constructor instead\n     * @throws IllegalStateException if the constructor {@link #CompressorStreamFactory(boolean)} \n     * was used to create the factory\n     ",
      "child_ranges": [
        "(line 185,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 202,
      "end_line": 248,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting\n     * the compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in the input stream\n     * @return the compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 210,col 9)",
        "(line 212,col 9)-(line 212,col 46)",
        "(line 213,col 9)-(line 213,col 34)",
        "(line 214,col 9)-(line 245,col 9)",
        "(line 247,col 9)-(line 247,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 262,
      "end_line": 312,
      "comment": "\n     * Create a compressor input stream from a compressor name and an input stream.\n     * \n     * @param name of the compressor,\n     * i.e. {@value #GZIP}, {@value #BZIP2}, {@value #XZ}, {@value #LZMA},\n     * {@value #PACK200}, {@value #SNAPPY_RAW}, {@value #SNAPPY_FRAMED}, \n     * {@value #Z} or {@value #DEFLATE} \n     * @param in the input stream\n     * @return compressor input stream\n     * @throws CompressorException if the compressor name is not known\n     * @throws IllegalArgumentException if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 264,col 9)-(line 267,col 9)",
        "(line 269,col 9)-(line 310,col 9)",
        "(line 311,col 9)-(line 311,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 325,
      "end_line": 360,
      "comment": "\n     * Create an compressor output stream from an compressor name and an output stream.\n     * \n     * @param name the compressor name,\n     * i.e. {@value #GZIP}, {@value #BZIP2}, {@value #XZ},\n     * {@value #PACK200} or {@value #DEFLATE} \n     * @param out the output stream\n     * @return the compressor output stream\n     * @throws CompressorException if the archiver name is not known\n     * @throws IllegalArgumentException if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated()",
      "begin_line": 363,
      "end_line": 365,
      "comment": " For Unit tests",
      "child_ranges": [
        "(line 364,col 9)-(line 364,col 38)"
      ]
    }
  ]
}