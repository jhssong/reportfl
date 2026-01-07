{
  "filepath": "/tmp/Compress-42b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorStreamProvider"
      ],
      "begin_line": 88,
      "end_line": 620,
      "comment": "\n * \u003cp\u003e\n * Factory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\n * \u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output);\n * CompressorOutputStream cos \u003d new CompressorStreamFactory()\n *         .createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input);\n * CompressorInputStream in \u003d new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2,\n *         is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable provided that the deprecated method setDecompressConcatenated is\n *            not used.\n * @ThreadSafe even if the deprecated method setDecompressConcatenated is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLETON"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": "\n     * Constant (value {@value}) used to identify the BZIP2 compression\n     * algorithm.\n     * \n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Constant (value {@value}) used to identify the GZIP compression\n     * algorithm. Not supported as an output stream type.\n     * \n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Constant (value {@value}) used to identify the PACK200 compression\n     * algorithm.\n     * \n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": "\n     * Constant (value {@value}) used to identify the XZ compression method.\n     * \n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": "\n     * Constant (value {@value}) used to identify the LZMA compression method.\n     * Not supported as an output stream type.\n     * \n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Constant (value {@value}) used to identify the \"framed\" Snappy\n     * compression method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": "\n     * Constant (value {@value}) used to identify the \"raw\" Snappy compression\n     * method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": "\n     * Constant (value {@value}) used to identify the traditional Unix compress\n     * method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate compress method.\n     * \n     * @since 1.9\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorInputStreamProviders()",
      "begin_line": 189,
      "end_line": 201,
      "comment": "\n     * Constructs a new sorted map from input stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 190,col 9)-(line 200,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-803246e7-47e7-49d8-880d-b81d0a210d10.run()",
      "begin_line": 191,
      "end_line": 199,
      "comment": "",
      "child_ranges": [
        "(line 193,col 17)-(line 193,col 86)",
        "(line 194,col 17)-(line 194,col 82)",
        "(line 195,col 17)-(line 197,col 17)",
        "(line 198,col 17)-(line 198,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorOutputStreamProviders()",
      "begin_line": 230,
      "end_line": 243,
      "comment": "\n     * Constructs a new sorted map from output stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 242,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-75e77e16-183e-49bb-97f7-b00955b160c9.run()",
      "begin_line": 232,
      "end_line": 240,
      "comment": "",
      "child_ranges": [
        "(line 234,col 17)-(line 234,col 86)",
        "(line 235,col 17)-(line 235,col 83)",
        "(line 236,col 17)-(line 238,col 17)",
        "(line 239,col 17)-(line 239,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findCompressorStreamProviders()",
      "begin_line": 244,
      "end_line": 246,
      "comment": "",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getBzip2()",
      "begin_line": 248,
      "end_line": 250,
      "comment": "",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate()",
      "begin_line": 252,
      "end_line": 254,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getGzip()",
      "begin_line": 256,
      "end_line": 258,
      "comment": "",
      "child_ranges": [
        "(line 257,col 9)-(line 257,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLzma()",
      "begin_line": 260,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 261,col 9)-(line 261,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getPack200()",
      "begin_line": 264,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyFramed()",
      "begin_line": 272,
      "end_line": 274,
      "comment": "",
      "child_ranges": [
        "(line 273,col 9)-(line 273,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyRaw()",
      "begin_line": 276,
      "end_line": 278,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getXz()",
      "begin_line": 280,
      "end_line": 282,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getZ()",
      "begin_line": 284,
      "end_line": 286,
      "comment": "",
      "child_ranges": [
        "(line 285,col 9)-(line 285,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.putAll(java.util.Set\u003cjava.lang.String\u003e, org.apache.commons.compress.compressors.CompressorStreamProvider, java.util.TreeMap\u003cjava.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider\u003e)",
      "begin_line": 288,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 290,col 9)-(line 292,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.serviceLoaderIterator()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.toKey(java.lang.String)",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "decompressUntilEOF"
      ],
      "begin_line": 308,
      "end_line": 308,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "compressorInputStreamProviders"
      ],
      "begin_line": 314,
      "end_line": 314,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressorOutputStreamProviders"
      ],
      "begin_line": 316,
      "end_line": 316,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 323,
      "end_line": 323,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory()",
      "begin_line": 328,
      "end_line": 330,
      "comment": "\n     * Create an instance with the decompress Concatenated option set to false.\n     ",
      "child_ranges": [
        "(line 329,col 9)-(line 329,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean)",
      "begin_line": 342,
      "end_line": 347,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     * \n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 70)",
        "(line 346,col 9)-(line 346,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 363,
      "end_line": 415,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting the\n     * compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in\n     *            the input stream\n     * @return the compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 364,col 9)-(line 366,col 9)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 372,col 9)-(line 372,col 46)",
        "(line 373,col 9)-(line 373,col 34)",
        "(line 374,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 434,
      "end_line": 437,
      "comment": "\n     * Creates a compressor input stream from a compressor name and an input\n     * stream.\n     * \n     * @param name\n     *            of the compressor, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #LZMA}, {@value #PACK200},\n     *            {@value #SNAPPY_RAW}, {@value #SNAPPY_FRAMED}, {@value #Z} or\n     *            {@value #DEFLATE}\n     * @param in\n     *            the input stream\n     * @return compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream, boolean)",
      "begin_line": 439,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 486,col 9)",
        "(line 487,col 9)-(line 487,col 119)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 511,
      "end_line": 556,
      "comment": "\n     * Creates an compressor output stream from an compressor name and an output\n     * stream.\n     * \n     * @param name\n     *            the compressor name, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #PACK200}, {@value SNAPPY_FRAMED}\n     *            or {@value #DEFLATE}\n     * @param out\n     *            the output stream\n     * @return the compressor output stream\n     * @throws CompressorException\n     *             if the archiver name is not known\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 120)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorInputStreamProviders()",
      "begin_line": 558,
      "end_line": 564,
      "comment": "",
      "child_ranges": [
        "(line 559,col 9)-(line 562,col 9)",
        "(line 563,col 9)-(line 563,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorOutputStreamProviders()",
      "begin_line": 566,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 567,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated()",
      "begin_line": 575,
      "end_line": 577,
      "comment": " For Unit tests",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressUntilEOF()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getInputStreamCompressorNames()",
      "begin_line": 583,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 585,col 9)-(line 585,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getOutputStreamCompressorNames()",
      "begin_line": 588,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 612,
      "end_line": 618,
      "comment": "\n     * Whether to decompress the full input or only the first stream in formats\n     * supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003e\n     * This setting applies to the gzip, bzip2 and xz formats only.\n     * \u003c/p\u003e\n     *\n     * @param decompressConcatenated\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream\n     * @since 1.5\n     * @deprecated 1.10 use the {@link #CompressorStreamFactory(boolean)}\n     *             constructor instead\n     * @throws IllegalStateException\n     *             if the constructor {@link #CompressorStreamFactory(boolean)}\n     *             was used to create the factory\n     ",
      "child_ranges": [
        "(line 614,col 9)-(line 616,col 9)",
        "(line 617,col 9)-(line 617,col 61)"
      ]
    }
  ]
}