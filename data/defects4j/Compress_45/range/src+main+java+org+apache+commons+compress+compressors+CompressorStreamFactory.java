{
  "filepath": "/tmp/Compress-45b/src/main/java/org/apache/commons/compress/compressors/CompressorStreamFactory.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "CompressorStreamFactory",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.compressors.CompressorStreamProvider"
      ],
      "begin_line": 94,
      "end_line": 739,
      "comment": "\n * \u003cp\u003e\n * Factory to create Compressor[In|Out]putStreams from names. To add other\n * implementations you should extend CompressorStreamFactory and override the\n * appropriate methods (and call their implementation from super of course).\n * \u003c/p\u003e\n * \n * Example (Compressing a file):\n * \n * \u003cpre\u003e\n * final OutputStream out \u003d Files.newOutputStream(output.toPath());\n * CompressorOutputStream cos \u003d new CompressorStreamFactory()\n *         .createCompressorOutputStream(CompressorStreamFactory.BZIP2, out);\n * IOUtils.copy(Files.newInputStream(input.toPath()), cos);\n * cos.close();\n * \u003c/pre\u003e\n * \n * Example (Decompressing a file):\n * \n * \u003cpre\u003e\n * final InputStream is \u003d Files.newInputStream(input.toPath());\n * CompressorInputStream in \u003d new CompressorStreamFactory().createCompressorInputStream(CompressorStreamFactory.BZIP2,\n *         is);\n * IOUtils.copy(in, Files.newOutputStream(output.toPath()));\n * in.close();\n * \u003c/pre\u003e\n * \n * @Immutable provided that the deprecated method setDecompressConcatenated is\n *            not used.\n * @ThreadSafe even if the deprecated method setDecompressConcatenated is used\n "
    },
    {
      "type": "field",
      "varNames": [
        "SINGLETON"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BROTLI"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": "\n     * Constant (value {@value}) used to identify the BROTLI compression\n     * algorithm.\n     * \n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "BZIP2"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": "\n     * Constant (value {@value}) used to identify the BZIP2 compression\n     * algorithm.\n     * \n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "GZIP"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Constant (value {@value}) used to identify the GZIP compression\n     * algorithm.\n     * \n     * @since 1.1\n     "
    },
    {
      "type": "field",
      "varNames": [
        "PACK200"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": "\n     * Constant (value {@value}) used to identify the PACK200 compression\n     * algorithm.\n     * \n     * @since 1.3\n     "
    },
    {
      "type": "field",
      "varNames": [
        "XZ"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": "\n     * Constant (value {@value}) used to identify the XZ compression method.\n     * \n     * @since 1.4\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZMA"
      ],
      "begin_line": 144,
      "end_line": 144,
      "comment": "\n     * Constant (value {@value}) used to identify the LZMA compression method.\n     * \n     * @since 1.6\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_FRAMED"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": "\n     * Constant (value {@value}) used to identify the \"framed\" Snappy\n     * compression method.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "SNAPPY_RAW"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": "\n     * Constant (value {@value}) used to identify the \"raw\" Snappy compression\n     * method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "Z"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": "\n     * Constant (value {@value}) used to identify the traditional Unix compress\n     * method. Not supported as an output stream type.\n     * \n     * @since 1.7\n     "
    },
    {
      "type": "field",
      "varNames": [
        "DEFLATE"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": "\n     * Constant (value {@value}) used to identify the Deflate compress method.\n     * \n     * @since 1.9\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZ4_BLOCK"
      ],
      "begin_line": 183,
      "end_line": 183,
      "comment": "\n     * Constant (value {@value}) used to identify the block LZ4\n     * compression method.\n     *\n     * @since 1.14\n     "
    },
    {
      "type": "field",
      "varNames": [
        "LZ4_FRAMED"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": "\n     * Constant (value {@value}) used to identify the frame LZ4\n     * compression method.\n     *\n     * @since 1.14\n     "
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorInputStreamProviders()",
      "begin_line": 220,
      "end_line": 232,
      "comment": "\n     * Constructs a new sorted map from input stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 221,col 9)-(line 231,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-bd909c17-a9d9-4c2b-ba10-8748332d46e9.run()",
      "begin_line": 222,
      "end_line": 230,
      "comment": "",
      "child_ranges": [
        "(line 224,col 17)-(line 224,col 86)",
        "(line 225,col 17)-(line 225,col 82)",
        "(line 226,col 17)-(line 228,col 17)",
        "(line 229,col 17)-(line 229,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findAvailableCompressorOutputStreamProviders()",
      "begin_line": 261,
      "end_line": 274,
      "comment": "\n     * Constructs a new sorted map from output stream provider names to provider\n     * objects.\n     *\n     * \u003cp\u003e\n     * The map returned by this method will have one entry for each provider for\n     * which support is available in the current Java virtual machine. If two or\n     * more supported provider have the same name then the resulting map will\n     * contain just one of them; which one it will contain is not specified.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * The invocation of this method, and the subsequent use of the resulting\n     * map, may cause time-consuming disk or network I/O operations to occur.\n     * This method is provided for applications that need to enumerate all of\n     * the available providers, for example to allow user provider selection.\n     * \u003c/p\u003e\n     *\n     * \u003cp\u003e\n     * This method may return different results at different times if new\n     * providers are dynamically made available to the current Java virtual\n     * machine.\n     * \u003c/p\u003e\n     *\n     * @return An immutable, map from names to provider objects\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 273,col 11)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.Anonymous-776b2ca2-6cb0-4b3a-be44-c98ac2ec09be.run()",
      "begin_line": 263,
      "end_line": 271,
      "comment": "",
      "child_ranges": [
        "(line 265,col 17)-(line 265,col 86)",
        "(line 266,col 17)-(line 266,col 83)",
        "(line 267,col 17)-(line 269,col 17)",
        "(line 270,col 17)-(line 270,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.findCompressorStreamProviders()",
      "begin_line": 275,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getBrotli()",
      "begin_line": 279,
      "end_line": 281,
      "comment": "",
      "child_ranges": [
        "(line 280,col 9)-(line 280,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getBzip2()",
      "begin_line": 283,
      "end_line": 285,
      "comment": "",
      "child_ranges": [
        "(line 284,col 9)-(line 284,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDeflate()",
      "begin_line": 287,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 288,col 9)-(line 288,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getGzip()",
      "begin_line": 291,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLzma()",
      "begin_line": 295,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getPack200()",
      "begin_line": 299,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSingleton()",
      "begin_line": 303,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 304,col 9)-(line 304,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyFramed()",
      "begin_line": 307,
      "end_line": 309,
      "comment": "",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getSnappyRaw()",
      "begin_line": 311,
      "end_line": 313,
      "comment": "",
      "child_ranges": [
        "(line 312,col 9)-(line 312,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getXz()",
      "begin_line": 315,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 316,col 9)-(line 316,col 18)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getZ()",
      "begin_line": 319,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLZ4Framed()",
      "begin_line": 323,
      "end_line": 325,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getLZ4Block()",
      "begin_line": 327,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 328,col 9)-(line 328,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.putAll(java.util.Set\u003cjava.lang.String\u003e, org.apache.commons.compress.compressors.CompressorStreamProvider, java.util.TreeMap\u003cjava.lang.String, org.apache.commons.compress.compressors.CompressorStreamProvider\u003e)",
      "begin_line": 331,
      "end_line": 336,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 335,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.serviceLoaderIterator()",
      "begin_line": 338,
      "end_line": 340,
      "comment": "",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 75)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.toKey(java.lang.String)",
      "begin_line": 342,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 343,col 9)-(line 343,col 45)"
      ]
    },
    {
      "type": "field",
      "varNames": [
        "decompressUntilEOF"
      ],
      "begin_line": 351,
      "end_line": 351,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "compressorInputStreamProviders"
      ],
      "begin_line": 357,
      "end_line": 357,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressorOutputStreamProviders"
      ],
      "begin_line": 359,
      "end_line": 359,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "decompressConcatenated"
      ],
      "begin_line": 366,
      "end_line": 366,
      "comment": "\n     * If true, decompress until the end of the input. If false, stop after the\n     * first stream and leave the input position to point to the next byte after\n     * the stream\n     "
    },
    {
      "type": "field",
      "varNames": [
        "memoryLimitInKb"
      ],
      "begin_line": 368,
      "end_line": 368,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory()",
      "begin_line": 372,
      "end_line": 375,
      "comment": "\n     * Create an instance with the decompress Concatenated option set to false.\n     ",
      "child_ranges": [
        "(line 373,col 9)-(line 373,col 39)",
        "(line 374,col 9)-(line 374,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean, int)",
      "begin_line": 393,
      "end_line": 399,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     *\n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     *\n     * @param memoryLimitInKb\n     *            Some streams require allocation of potentially significant\n     *            byte arrays/tables, and they can offer checks to prevent OOMs\n     *            on corrupt files.  Set the maximum allowed memory allocation in KBs.\n     *\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 394,col 9)-(line 394,col 70)",
        "(line 397,col 9)-(line 397,col 57)",
        "(line 398,col 9)-(line 398,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.CompressorStreamFactory(boolean)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Create an instance with the provided decompress Concatenated option.\n     * \n     * @param decompressUntilEOF\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream. This setting applies to the\n     *            gzip, bzip2 and xz formats only.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.detect(java.io.InputStream)",
      "begin_line": 427,
      "end_line": 483,
      "comment": "\n     * Try to detect the type of compressor stream.\n     *\n     * @param in input stream\n     * @return type of compressor stream detected\n     * @throws CompressorException if no compressor stream type was detected\n     *                             or if something else went wrong\n     * @throws IllegalArgumentException if stream is null or does not support mark\n     *\n     * @since 1.14\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 430,col 9)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 436,col 9)-(line 436,col 46)",
        "(line 437,col 9)-(line 437,col 34)",
        "(line 438,col 9)-(line 438,col 33)",
        "(line 439,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 452,col 9)",
        "(line 454,col 9)-(line 456,col 9)",
        "(line 458,col 9)-(line 460,col 9)",
        "(line 462,col 9)-(line 464,col 9)",
        "(line 466,col 9)-(line 468,col 9)",
        "(line 470,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 87)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.io.InputStream)",
      "begin_line": 498,
      "end_line": 500,
      "comment": "\n     * Create an compressor input stream from an input stream, autodetecting the\n     * compressor type from the first few bytes of the stream. The InputStream\n     * must support marks, like BufferedInputStream.\n     * \n     * @param in\n     *            the input stream\n     * @return the compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known\n     * @throws IllegalArgumentException\n     *             if the stream is null or does not support mark\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 499,col 9)-(line 499,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream)",
      "begin_line": 522,
      "end_line": 525,
      "comment": "\n     * Creates a compressor input stream from a compressor name and an input\n     * stream.\n     * \n     * @param name\n     *            of the compressor, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #LZMA}, {@value #PACK200},\n     *            {@value #SNAPPY_RAW}, {@value #SNAPPY_FRAMED}, {@value #Z},\n     *            {@value #LZ4_BLOCK}, {@value #LZ4_FRAMED}\n     *            or {@value #DEFLATE}\n     * @param in\n     *            the input stream\n     * @return compressor input stream\n     * @throws CompressorException\n     *             if the compressor name is not known or not available,\n     *             or if there\u0027s an IOException or MemoryLimitException thrown\n     *             during initialization\n     * @throws IllegalArgumentException\n     *             if the name or input stream is null\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 524,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorInputStream(java.lang.String, java.io.InputStream, boolean)",
      "begin_line": 527,
      "end_line": 602,
      "comment": "",
      "child_ranges": [
        "(line 530,col 9)-(line 532,col 9)",
        "(line 534,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 119)",
        "(line 597,col 9)-(line 599,col 9)",
        "(line 601,col 9)-(line 601,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.createCompressorOutputStream(java.lang.String, java.io.OutputStream)",
      "begin_line": 621,
      "end_line": 674,
      "comment": "\n     * Creates an compressor output stream from an compressor name and an output\n     * stream.\n     * \n     * @param name\n     *            the compressor name, i.e. {@value #GZIP}, {@value #BZIP2},\n     *            {@value #XZ}, {@value #PACK200}, {@value #SNAPPY_FRAMED},\n     *            {@value #LZ4_BLOCK}, {@value #LZ4_FRAMED}\n     *            or {@value #DEFLATE}\n     * @param out\n     *            the output stream\n     * @return the compressor output stream\n     * @throws CompressorException\n     *             if the archiver name is not known\n     * @throws IllegalArgumentException\n     *             if the archiver name or stream is null\n     ",
      "child_ranges": [
        "(line 624,col 9)-(line 626,col 9)",
        "(line 628,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 669,col 120)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 77)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorInputStreamProviders()",
      "begin_line": 676,
      "end_line": 682,
      "comment": "",
      "child_ranges": [
        "(line 677,col 9)-(line 680,col 9)",
        "(line 681,col 9)-(line 681,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getCompressorOutputStreamProviders()",
      "begin_line": 684,
      "end_line": 690,
      "comment": "",
      "child_ranges": [
        "(line 685,col 9)-(line 688,col 9)",
        "(line 689,col 9)-(line 689,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressConcatenated()",
      "begin_line": 693,
      "end_line": 695,
      "comment": " For Unit tests",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getDecompressUntilEOF()",
      "begin_line": 697,
      "end_line": 699,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getInputStreamCompressorNames()",
      "begin_line": 701,
      "end_line": 705,
      "comment": "",
      "child_ranges": [
        "(line 703,col 9)-(line 704,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.getOutputStreamCompressorNames()",
      "begin_line": 707,
      "end_line": 710,
      "comment": "",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 110)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.compressors.CompressorStreamFactory.setDecompressConcatenated(boolean)",
      "begin_line": 731,
      "end_line": 737,
      "comment": "\n     * Whether to decompress the full input or only the first stream in formats\n     * supporting multiple concatenated input streams.\n     *\n     * \u003cp\u003e\n     * This setting applies to the gzip, bzip2 and xz formats only.\n     * \u003c/p\u003e\n     *\n     * @param decompressConcatenated\n     *            if true, decompress until the end of the input; if false, stop\n     *            after the first stream and leave the input position to point\n     *            to the next byte after the stream\n     * @since 1.5\n     * @deprecated 1.10 use the {@link #CompressorStreamFactory(boolean)}\n     *             constructor instead\n     * @throws IllegalStateException\n     *             if the constructor {@link #CompressorStreamFactory(boolean)}\n     *             was used to create the factory\n     ",
      "child_ranges": [
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 61)"
      ]
    }
  ]
}