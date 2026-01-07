{
  "filepath": "/tmp/Compress-47b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorStreamProvider"
      ],
      "begin_line": 98,
      "end_line": 797,
      "comment": "\n * \u003cp\u003e\n * Factory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\n * \u003c/p\u003e\n *\n * Example (Compressing a file):\n *\n * \u003cpre\u003e\n * final OutputStream out \u003d Files.newOutputStream(output.toPath());\n * CompressorOutputStream cos \u003d new CompressorStreamFactory()\n *         .createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(Files.newInputStream(input.toPath()), cos);\n * cos.close();\n * \u003c/pre\u003e\n *\n * Example (Decompressing a file):\n *\n * \u003cpre\u003e\n * final InputStream is \u003d Files.newInputStream(input.toPath());\n * CompressorInputStream in \u003d new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2,\n *         is);\n * IOUtils.copy(in, Files.newOutputStream(output.toPath()));\n * in.close();\n * \u003c/pre\u003e\n *\n * @Immutable provided that the deprecated method setDecompressConcatenated is\n *            not used.\n * @ThreadSafe even if the deprecated method setDecompressConcatenated is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLETON"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BROTLI"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": "\n     * Constant (value {@value}) used to identify the BROTLI compression\n     * algorithm.\n     *\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": "\n     * Constant (value {@value}) used to identify the BZIP2 compression\n     * algorithm.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": "\n     * Constant (value {@value}) used to identify the GZIP compression\n     * algorithm.\n     *\n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": "\n     * Constant (value {@value}) used to identify the PACK200 compression\n     * algorithm.\n     *\n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 141,
      "end_line": 141,
      "comment": "\n     * Constant (value {@value}) used to identify the XZ compression method.\n     *\n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": "\n     * Constant (value {@value}) used to identify the LZMA compression method.\n     *\n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": "\n     * Constant (value {@value}) used to identify the \"framed\" Snappy\n     * compression method.\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": "\n     * Constant (value {@value}) used to identify the \"raw\" Snappy compression\n     * method. Not supported as an output stream type.\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": "\n     * Constant (value {@value}) used to identify the traditional Unix compress\n     * method. Not supported as an output stream type.\n     *\n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE"
      ],
      "begin_line": 179,
      "end_line": 179,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate compress method.\n     *\n     * @since 1.9\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE64"
      ],
      "begin_line": 186,
      "end_line": 186,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate64 compress method.\n     *\n     * @since 1.16\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZ4_BLOCK"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": "\n     * Constant (value {@value}) used to identify the block LZ4\n     * compression method.\n     *\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZ4_FRAMED"
      ],
      "begin_line": 202,
      "end_line": 202,
      "comment": "\n     * Constant (value {@value}) used to identify the frame LZ4\n     * compression method.\n     *\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ZSTANDARD"
      ],
      "begin_line": 210,
      "end_line": 210,
      "comment": "\n     * Constant (value {@value}) used to identify the Zstandard compression\n     * algorithm. Not supported as an output stream type.\n     *\n     * @since 1.16\n     "
    },
    {
      "type": "field",
      "varNames": [
        "YOU_NEED_BROTLI_DEC"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "YOU_NEED_XZ_JAVA"
      ],
      "begin_line": 213,
      "end_line": 213,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "YOU_NEED_ZSTD_JNI"
      ],
      "begin_line": 214,
      "end_line": 214,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.youNeed(java.lang.String, java.lang.String)",
      "begin_line": 216,
      "end_line": 218,
      "comment": "",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 104)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorInputStreamProviders()",
      "begin_line": 247,
      "end_line": 259,
      "comment": "\n     * Constructs a new sorted map from input stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 258,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-5506f4e0-bb38-4557-a0f1-5058989258c1.run()",
      "begin_line": 249,
      "end_line": 257,
      "comment": "",
      "child_ranges": [
        "(line 251,col 17)-(line 251,col 86)",
        "(line 252,col 17)-(line 252,col 82)",
        "(line 253,col 17)-(line 255,col 17)",
        "(line 256,col 17)-(line 256,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorOutputStreamProviders()",
      "begin_line": 288,
      "end_line": 301,
      "comment": "\n     * Constructs a new sorted map from output stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 289,col 9)-(line 300,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-92081570-c557-41c3-9034-08c4e2990bef.run()",
      "begin_line": 290,
      "end_line": 298,
      "comment": "",
      "child_ranges": [
        "(line 292,col 17)-(line 292,col 86)",
        "(line 293,col 17)-(line 293,col 83)",
        "(line 294,col 17)-(line 296,col 17)",
        "(line 297,col 17)-(line 297,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findCompressorStreamProviders()",
      "begin_line": 302,
      "end_line": 304,
      "comment": "",
      "child_ranges": [
        "(line 303,col 9)-(line 303,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getBrotli()",
      "begin_line": 306,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getBzip2()",
      "begin_line": 310,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate()",
      "begin_line": 314,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 315,col 9)-(line 315,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate64()",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * @since 1.16\n     * @return the constant {@link #DEFLATE64}\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getGzip()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLzma()",
      "begin_line": 330,
      "end_line": 332,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 331,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getPack200()",
      "begin_line": 334,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyFramed()",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyRaw()",
      "begin_line": 346,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getXz()",
      "begin_line": 350,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getZ()",
      "begin_line": 354,
      "end_line": 356,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLZ4Framed()",
      "begin_line": 358,
      "end_line": 360,
      "comment": "",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLZ4Block()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getZstandard()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.putAll(java.util.Set\u003cjava.lang.String\u003e, org.apache.commons.compress.compressors.CompressorStreamProvider, java.util.TreeMap\u003cjava.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider\u003e)",
      "begin_line": 370,
      "end_line": 375,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 374,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.serviceLoaderIterator()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.toKey(java.lang.String)",
      "begin_line": 381,
      "end_line": 383,
      "comment": "",
      "child_ranges": [
        "(line 382,col 9)-(line 382,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "decompressUntilEOF"
      ],
      "begin_line": 390,
      "end_line": 390,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "compressorInputStreamProviders"
      ],
      "begin_line": 396,
      "end_line": 396,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressorOutputStreamProviders"
      ],
      "begin_line": 398,
      "end_line": 398,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 405,
      "end_line": 405,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "memoryLimitInKb"
      ],
      "begin_line": 407,
      "end_line": 407,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory()",
      "begin_line": 411,
      "end_line": 414,
      "comment": "\n     * Create an instance with the decompress Concatenated option set to false.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean, int)",
      "begin_line": 432,
      "end_line": 438,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     *\n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     *\n     * @param memoryLimitInKb\n     *            Some streams require allocation of potentially significant\n     *            byte arrays/tables, and they can offer checks to prevent OOMs\n     *            on corrupt files.  Set the maximum allowed memory allocation in KBs.\n     *\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 433,col 9)-(line 433,col 70)",
        "(line 436,col 9)-(line 436,col 57)",
        "(line 437,col 9)-(line 437,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean)",
      "begin_line": 451,
      "end_line": 453,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     *\n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.detect(java.io.InputStream)",
      "begin_line": 466,
      "end_line": 526,
      "comment": "\n     * Try to detect the type of compressor stream.\n     *\n     * @param in input stream\n     * @return type of compressor stream detected\n     * @throws CompressorException if no compressor stream type was detected\n     *                             or if something else went wrong\n     * @throws IllegalArgumentException if stream is null or does not support mark\n     *\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 473,col 9)",
        "(line 475,col 9)-(line 475,col 46)",
        "(line 476,col 9)-(line 476,col 34)",
        "(line 477,col 9)-(line 477,col 33)",
        "(line 478,col 9)-(line 483,col 9)",
        "(line 485,col 9)-(line 487,col 9)",
        "(line 489,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 495,col 9)",
        "(line 497,col 9)-(line 499,col 9)",
        "(line 501,col 9)-(line 503,col 9)",
        "(line 505,col 9)-(line 507,col 9)",
        "(line 509,col 9)-(line 511,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 525,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 541,
      "end_line": 543,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting the\n     * compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     *\n     * @param in\n     *            the input stream\n     * @return the compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 542,col 9)-(line 542,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 566,
      "end_line": 569,
      "comment": "\n     * Creates a compressor input stream from a compressor name and an input\n     * stream.\n     *\n     * @param name\n     *            of the compressor, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #LZMA}, {@value #PACK200},\n     *            {@value #SNAPPY_RAW}, {@value #SNAPPY_FRAMED}, {@value #Z},\n     *            {@value #LZ4_BLOCK}, {@value #LZ4_FRAMED}, {@value #ZSTANDARD},\n     *            {@value #DEFLATE64}\n     *            or {@value #DEFLATE}\n     * @param in\n     *            the input stream\n     * @return compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known or not available,\n     *             or if there\u0027s an IOException or MemoryLimitException thrown\n     *             during initialization\n     * @throws IllegalArgumentException\n     *             if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 568,col 9)-(line 568,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream, boolean)",
      "begin_line": 571,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 650,col 9)",
        "(line 651,col 9)-(line 651,col 119)",
        "(line 652,col 9)-(line 654,col 9)",
        "(line 656,col 9)-(line 656,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 676,
      "end_line": 732,
      "comment": "\n     * Creates an compressor output stream from an compressor name and an output\n     * stream.\n     *\n     * @param name\n     *            the compressor name, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #PACK200}, {@value #SNAPPY_FRAMED},\n     *            {@value #LZ4_BLOCK}, {@value #LZ4_FRAMED}, {@value #ZSTANDARD}\n     *            or {@value #DEFLATE}\n     * @param out\n     *            the output stream\n     * @return the compressor output stream\n     * @throws CompressorException\n     *             if the archiver name is not known\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 679,col 9)-(line 681,col 9)",
        "(line 683,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 727,col 120)",
        "(line 728,col 9)-(line 730,col 9)",
        "(line 731,col 9)-(line 731,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorInputStreamProviders()",
      "begin_line": 734,
      "end_line": 740,
      "comment": "",
      "child_ranges": [
        "(line 735,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorOutputStreamProviders()",
      "begin_line": 742,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 743,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated()",
      "begin_line": 751,
      "end_line": 753,
      "comment": " For Unit tests",
      "child_ranges": [
        "(line 752,col 9)-(line 752,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressUntilEOF()",
      "begin_line": 755,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getInputStreamCompressorNames()",
      "begin_line": 759,
      "end_line": 763,
      "comment": "",
      "child_ranges": [
        "(line 761,col 9)-(line 762,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getOutputStreamCompressorNames()",
      "begin_line": 765,
      "end_line": 768,
      "comment": "",
      "child_ranges": [
        "(line 767,col 9)-(line 767,col 121)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 789,
      "end_line": 795,
      "comment": "\n     * Whether to decompress the full input or only the first stream in formats\n     * supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003e\n     * This setting applies to the gzip, bzip2 and xz formats only.\n     * \u003c/p\u003e\n     *\n     * @param decompressConcatenated\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream\n     * @since 1.5\n     * @deprecated 1.10 use the {@link #CompressorStreamFactory(boolean)}\n     *             constructor instead\n     * @throws IllegalStateException\n     *             if the constructor {@link #CompressorStreamFactory(boolean)}\n     *             was used to create the factory\n     ",
      "child_ranges": [
        "(line 791,col 9)-(line 793,col 9)",
        "(line 794,col 9)-(line 794,col 61)"
      ]
    }
  ]
}