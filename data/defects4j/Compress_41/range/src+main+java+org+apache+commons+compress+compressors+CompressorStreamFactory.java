{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorStreamProvider"
      ],
      "begin_line": 87,
      "end_line": 614,
      "comment": "\n * \u003cp\u003e\n * Factory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\n * \u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d new FileOutputStream(output);\n * CompressorOutputStream cos \u003d new CompressorStreamFactory()\n *         .createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(new FileInputStream(input), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \n * \u003cpre\u003e\n * final InputStream is \u003d new FileInputStream(input);\n * CompressorInputStream in \u003d new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2,\n *         is);\n * IOUtils.copy(in, new FileOutputStream(output));\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable provided that the deprecated method setDecompressConcatenated is\n *            not used.\n * @ThreadSafe even if the deprecated method setDecompressConcatenated is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLETON"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * Constant (value {@value}) used to identify the BZIP2 compression\n     * algorithm.\n     * \n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": "\n     * Constant (value {@value}) used to identify the GZIP compression\n     * algorithm. Not supported as an output stream type.\n     * \n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": "\n     * Constant (value {@value}) used to identify the PACK200 compression\n     * algorithm.\n     * \n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": "\n     * Constant (value {@value}) used to identify the XZ compression method.\n     * \n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": "\n     * Constant (value {@value}) used to identify the LZMA compression method.\n     * Not supported as an output stream type.\n     * \n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": "\n     * Constant (value {@value}) used to identify the \"framed\" Snappy\n     * compression method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Constant (value {@value}) used to identify the \"raw\" Snappy compression\n     * method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Constant (value {@value}) used to identify the traditional Unix compress\n     * method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate compress method.\n     * \n     * @since 1.9\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorInputStreamProviders()",
      "begin_line": 188,
      "end_line": 200,
      "comment": "\n     * Constructs a new sorted map from input stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 199,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-a4ae3ac9-94aa-4525-8e57-876190667fa9.run()",
      "begin_line": 190,
      "end_line": 198,
      "comment": "",
      "child_ranges": [
        "(line 192,col 17)-(line 192,col 86)",
        "(line 193,col 17)-(line 193,col 82)",
        "(line 194,col 17)-(line 196,col 17)",
        "(line 197,col 17)-(line 197,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorOutputStreamProviders()",
      "begin_line": 229,
      "end_line": 242,
      "comment": "\n     * Constructs a new sorted map from output stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 230,col 9)-(line 241,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-0c0e6a87-f176-463c-ba15-6ae3fece0e87.run()",
      "begin_line": 231,
      "end_line": 239,
      "comment": "",
      "child_ranges": [
        "(line 233,col 17)-(line 233,col 86)",
        "(line 234,col 17)-(line 234,col 83)",
        "(line 235,col 17)-(line 237,col 17)",
        "(line 238,col 17)-(line 238,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findCompressorStreamProviders()",
      "begin_line": 243,
      "end_line": 245,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getBzip2()",
      "begin_line": 247,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate()",
      "begin_line": 251,
      "end_line": 253,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getGzip()",
      "begin_line": 255,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLzma()",
      "begin_line": 259,
      "end_line": 261,
      "comment": "",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getPack200()",
      "begin_line": 263,
      "end_line": 265,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton()",
      "begin_line": 267,
      "end_line": 269,
      "comment": "",
      "child_ranges": [
        "(line 268,col 9)-(line 268,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyFramed()",
      "begin_line": 271,
      "end_line": 273,
      "comment": "",
      "child_ranges": [
        "(line 272,col 9)-(line 272,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyRaw()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getXz()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getZ()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.putAll(java.util.Set\u003cjava.lang.String\u003e, org.apache.commons.compress.compressors.CompressorStreamProvider, java.util.TreeMap\u003cjava.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider\u003e)",
      "begin_line": 287,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 289,col 9)-(line 291,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.serviceLoaderIterator()",
      "begin_line": 294,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.toKey(java.lang.String)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "decompressUntilEOF"
      ],
      "begin_line": 307,
      "end_line": 307,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "compressorInputStreamProviders"
      ],
      "begin_line": 313,
      "end_line": 313,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressorOutputStreamProviders"
      ],
      "begin_line": 315,
      "end_line": 315,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 322,
      "end_line": 322,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "\n     * Create an instance with the decompress Concatenated option set to false.\n     ",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 39)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean)",
      "begin_line": 341,
      "end_line": 346,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     * \n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 70)",
        "(line 345,col 9)-(line 345,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 362,
      "end_line": 414,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting the\n     * compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in\n     *            the input stream\n     * @return the compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 46)",
        "(line 372,col 9)-(line 372,col 34)",
        "(line 373,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 413,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 433,
      "end_line": 436,
      "comment": "\n     * Creates a compressor input stream from a compressor name and an input\n     * stream.\n     * \n     * @param name\n     *            of the compressor, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #LZMA}, {@value #PACK200},\n     *            {@value #SNAPPY_RAW}, {@value #SNAPPY_FRAMED}, {@value #Z} or\n     *            {@value #DEFLATE}\n     * @param in\n     *            the input stream\n     * @return compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 435,col 9)-(line 435,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream, boolean)",
      "begin_line": 438,
      "end_line": 492,
      "comment": "",
      "child_ranges": [
        "(line 441,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 485,col 9)",
        "(line 486,col 9)-(line 486,col 119)",
        "(line 487,col 9)-(line 489,col 9)",
        "(line 491,col 9)-(line 491,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 509,
      "end_line": 550,
      "comment": "\n     * Creates an compressor output stream from an compressor name and an output\n     * stream.\n     * \n     * @param name\n     *            the compressor name, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #PACK200} or {@value #DEFLATE}\n     * @param out\n     *            the output stream\n     * @return the compressor output stream\n     * @throws CompressorException\n     *             if the archiver name is not known\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 514,col 9)",
        "(line 516,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 120)",
        "(line 546,col 9)-(line 548,col 9)",
        "(line 549,col 9)-(line 549,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorInputStreamProviders()",
      "begin_line": 552,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 553,col 9)-(line 556,col 9)",
        "(line 557,col 9)-(line 557,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorOutputStreamProviders()",
      "begin_line": 560,
      "end_line": 566,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 564,col 9)",
        "(line 565,col 9)-(line 565,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated()",
      "begin_line": 569,
      "end_line": 571,
      "comment": " For Unit tests",
      "child_ranges": [
        "(line 570,col 9)-(line 570,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressUntilEOF()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getInputStreamCompressorNames()",
      "begin_line": 577,
      "end_line": 580,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 102)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getOutputStreamCompressorNames()",
      "begin_line": 582,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 72)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 606,
      "end_line": 612,
      "comment": "\n     * Whether to decompress the full input or only the first stream in formats\n     * supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003e\n     * This setting applies to the gzip, bzip2 and xz formats only.\n     * \u003c/p\u003e\n     *\n     * @param decompressConcatenated\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream\n     * @since 1.5\n     * @deprecated 1.10 use the {@link #CompressorStreamFactory(boolean)}\n     *             constructor instead\n     * @throws IllegalStateException\n     *             if the constructor {@link #CompressorStreamFactory(boolean)}\n     *             was used to create the factory\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 61)"
      ]
    }
  ]
}