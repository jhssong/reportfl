{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 50,
      "end_line": 808,
      "comment": "\n * Writes a 7z file.\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "channel"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "files"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numNonEmptyStreams"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc32"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressedCrc32"
      ],
      "begin_line": 55,
      "end_line": 55,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileBytesWritten"
      ],
      "begin_line": 56,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentOutputStream"
      ],
      "begin_line": 58,
      "end_line": 58,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "additionalCountingStreams"
      ],
      "begin_line": 59,
      "end_line": 59,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentMethods"
      ],
      "begin_line": 60,
      "end_line": 61,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "additionalSizes"
      ],
      "begin_line": 62,
      "end_line": 62,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.SevenZOutputFile(java.io.File)",
      "begin_line": 70,
      "end_line": 74,
      "comment": "\n     * Opens file to write a 7z archive to.\n     *\n     * @param filename the file to write to\n     * @throws IOException if opening the file fails\n     ",
      "child_ranges": [
        "(line 71,col 9)-(line 73,col 63)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.SevenZOutputFile(java.nio.channels.SeekableByteChannel)",
      "begin_line": 87,
      "end_line": 90,
      "comment": "\n     * Prepares channel to write a 7z archive to.\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to write to an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to write to\n     * @throws IOException if the channel cannot be positioned properly\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 88,col 9)-(line 88,col 31)",
        "(line 89,col 9)-(line 89,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 104,
      "end_line": 106,
      "comment": "\n     * Sets the default compression method to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a short form for passing a single-element iterable\n     * to {@link #setContentMethods}.\u003c/p\u003e\n     * @param method the default compression method\n     ",
      "child_ranges": [
        "(line 105,col 9)-(line 105,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentMethods(java.lang.Iterable\u003c? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration\u003e)",
      "begin_line": 122,
      "end_line": 124,
      "comment": "\n     * Sets the default (compression) methods to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @since 1.8\n     * @param methods the default (compression) methods\n     ",
      "child_ranges": [
        "(line 123,col 9)-(line 123,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close()",
      "begin_line": 131,
      "end_line": 137,
      "comment": "\n     * Closes the archive, calling {@link #finish} if necessary.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 133,col 9)-(line 135,col 9)",
        "(line 136,col 9)-(line 136,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 148,
      "end_line": 155,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile file to create an entry from\n     * @param entryName the name to use\n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 150,col 9)-(line 150,col 66)",
        "(line 151,col 9)-(line 151,col 52)",
        "(line 152,col 9)-(line 152,col 33)",
        "(line 153,col 9)-(line 153,col 70)",
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 166,
      "end_line": 169,
      "comment": "\n     * Records an archive entry to add.\n     *\n     * The caller must then write the content to the archive and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param archiveEntry describes the entry\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 167,col 9)-(line 167,col 75)",
        "(line 168,col 9)-(line 168,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 175,
      "end_line": 208,
      "comment": "\n     * Closes the archive entry.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 179,col 9)",
        "(line 181,col 9)-(line 181,col 69)",
        "(line 182,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 35)",
        "(line 204,col 9)-(line 204,col 41)",
        "(line 205,col 9)-(line 205,col 22)",
        "(line 206,col 9)-(line 206,col 32)",
        "(line 207,col 9)-(line 207,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 215,
      "end_line": 217,
      "comment": "\n     * Writes a byte to the current archive entry.\n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 216,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 224,
      "end_line": 226,
      "comment": "\n     * Writes a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 225,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 235,
      "end_line": 239,
      "comment": "\n     * Writes part of a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @param off offset into the array to start writing from\n     * @param len number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 238,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 246,
      "end_line": 290,
      "comment": "\n     * Finishes the addition of entries to this archive, without closing it.\n     * \n     * @throws IOException if archive is already closed.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 249,col 9)",
        "(line 250,col 9)-(line 250,col 24)",
        "(line 252,col 9)-(line 252,col 55)",
        "(line 254,col 9)-(line 254,col 77)",
        "(line 255,col 9)-(line 255,col 73)",
        "(line 257,col 9)-(line 257,col 28)",
        "(line 258,col 9)-(line 258,col 23)",
        "(line 259,col 9)-(line 259,col 60)",
        "(line 260,col 9)-(line 260,col 52)",
        "(line 262,col 9)-(line 262,col 40)",
        "(line 263,col 9)-(line 263,col 34)",
        "(line 265,col 9)-(line 271,col 44)",
        "(line 273,col 9)-(line 273,col 28)",
        "(line 274,col 9)-(line 274,col 43)",
        "(line 276,col 9)-(line 276,col 39)",
        "(line 279,col 9)-(line 279,col 21)",
        "(line 282,col 9)-(line 284,col 44)",
        "(line 285,col 9)-(line 285,col 22)",
        "(line 286,col 9)-(line 286,col 76)",
        "(line 287,col 9)-(line 287,col 81)",
        "(line 288,col 9)-(line 288,col 18)",
        "(line 289,col 9)-(line 289,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream()",
      "begin_line": 297,
      "end_line": 302,
      "comment": "\n     * Creation of output stream is deferred until data is actually\n     * written as some codecs might write header information even for\n     * empty streams and directories otherwise.\n     ",
      "child_ranges": [
        "(line 298,col 9)-(line 300,col 9)",
        "(line 301,col 9)-(line 301,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream()",
      "begin_line": 304,
      "end_line": 344,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 307,col 9)",
        "(line 309,col 9)-(line 309,col 53)",
        "(line 310,col 9)-(line 310,col 78)",
        "(line 311,col 9)-(line 311,col 29)",
        "(line 312,col 9)-(line 320,col 9)",
        "(line 321,col 9)-(line 323,col 9)",
        "(line 324,col 9)-(line 343,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-bb4ed0cf-010f-4370-beaf-417dcbd0048b.write(int)",
      "begin_line": 325,
      "end_line": 329,
      "comment": "",
      "child_ranges": [
        "(line 327,col 17)-(line 327,col 31)",
        "(line 328,col 17)-(line 328,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-b7fbffca-18b8-4282-894a-024ca46a6aa2.write(byte[])",
      "begin_line": 331,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 333,col 17)-(line 333,col 31)",
        "(line 334,col 17)-(line 334,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-12cdcd86-869d-410b-b166-2976fbe39670.write(byte[], int, int)",
      "begin_line": 337,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 340,col 17)-(line 340,col 41)",
        "(line 341,col 17)-(line 341,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 346,
      "end_line": 349,
      "comment": "",
      "child_ranges": [
        "(line 347,col 9)-(line 347,col 91)",
        "(line 348,col 9)-(line 348,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 351,
      "end_line": 358,
      "comment": "",
      "child_ranges": [
        "(line 352,col 9)-(line 352,col 34)",
        "(line 354,col 9)-(line 354,col 43)",
        "(line 355,col 9)-(line 355,col 33)",
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 357,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 360,
      "end_line": 369,
      "comment": "",
      "child_ranges": [
        "(line 361,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 36)",
        "(line 368,col 9)-(line 368,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 371,
      "end_line": 393,
      "comment": "",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 36)",
        "(line 374,col 9)-(line 374,col 31)",
        "(line 375,col 9)-(line 375,col 62)",
        "(line 377,col 9)-(line 377,col 32)",
        "(line 378,col 9)-(line 382,col 9)",
        "(line 384,col 9)-(line 384,col 31)",
        "(line 385,col 9)-(line 385,col 24)",
        "(line 386,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 395,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 38)",
        "(line 398,col 9)-(line 398,col 34)",
        "(line 399,col 9)-(line 399,col 48)",
        "(line 400,col 9)-(line 400,col 24)",
        "(line 401,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 407,col 44)",
        "(line 408,col 9)-(line 418,col 9)",
        "(line 420,col 9)-(line 420,col 31)",
        "(line 421,col 9)-(line 421,col 24)",
        "(line 422,col 9)-(line 426,col 9)",
        "(line 428,col 9)-(line 428,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 431,
      "end_line": 445,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 70)",
        "(line 433,col 9)-(line 433,col 26)",
        "(line 434,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 39)",
        "(line 440,col 9)-(line 440,col 40)",
        "(line 441,col 9)-(line 444,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSingleCodec(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration, java.io.OutputStream)",
      "begin_line": 447,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 48)",
        "(line 449,col 9)-(line 450,col 52)",
        "(line 452,col 9)-(line 452,col 35)",
        "(line 453,col 9)-(line 455,col 9)",
        "(line 456,col 9)-(line 456,col 30)",
        "(line 457,col 9)-(line 457,col 22)",
        "(line 459,col 9)-(line 462,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 465,
      "end_line": 477,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 42)",
        "(line 476,col 9)-(line 476,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 479,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 480,col 9)-(line 480,col 37)",
        "(line 482,col 9)-(line 482,col 42)",
        "(line 484,col 9)-(line 484,col 38)",
        "(line 485,col 9)-(line 485,col 36)",
        "(line 486,col 9)-(line 486,col 35)",
        "(line 487,col 9)-(line 487,col 31)",
        "(line 488,col 9)-(line 488,col 32)",
        "(line 489,col 9)-(line 489,col 32)",
        "(line 490,col 9)-(line 490,col 32)",
        "(line 491,col 9)-(line 491,col 43)",
        "(line 492,col 9)-(line 492,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 495,
      "end_line": 517,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 40)",
        "(line 497,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 516,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 519,
      "end_line": 540,
      "comment": "",
      "child_ranges": [
        "(line 520,col 9)-(line 520,col 38)",
        "(line 521,col 9)-(line 521,col 35)",
        "(line 522,col 9)-(line 522,col 48)",
        "(line 523,col 9)-(line 529,col 9)",
        "(line 530,col 9)-(line 539,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 542,
      "end_line": 563,
      "comment": "",
      "child_ranges": [
        "(line 543,col 9)-(line 543,col 37)",
        "(line 544,col 9)-(line 544,col 47)",
        "(line 545,col 9)-(line 545,col 32)",
        "(line 546,col 9)-(line 552,col 9)",
        "(line 553,col 9)-(line 562,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 565,
      "end_line": 579,
      "comment": "",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 32)",
        "(line 568,col 9)-(line 568,col 71)",
        "(line 569,col 9)-(line 569,col 64)",
        "(line 570,col 9)-(line 570,col 21)",
        "(line 571,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 20)",
        "(line 576,col 9)-(line 576,col 51)",
        "(line 577,col 9)-(line 577,col 45)",
        "(line 578,col 9)-(line 578,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 581,
      "end_line": 615,
      "comment": "",
      "child_ranges": [
        "(line 582,col 9)-(line 582,col 33)",
        "(line 583,col 9)-(line 587,col 9)",
        "(line 588,col 9)-(line 614,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 617,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 618,col 9)-(line 618,col 31)",
        "(line 619,col 9)-(line 623,col 9)",
        "(line 624,col 9)-(line 650,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 653,
      "end_line": 687,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 37)",
        "(line 655,col 9)-(line 659,col 9)",
        "(line 660,col 9)-(line 686,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 689,
      "end_line": 722,
      "comment": "",
      "child_ranges": [
        "(line 690,col 9)-(line 690,col 37)",
        "(line 691,col 9)-(line 695,col 9)",
        "(line 696,col 9)-(line 721,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 724,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 725,col 9)-(line 725,col 26)",
        "(line 726,col 9)-(line 726,col 24)",
        "(line 727,col 9)-(line 727,col 14)",
        "(line 728,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 32)",
        "(line 737,col 9)-(line 740,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 743,
      "end_line": 757,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 22)",
        "(line 745,col 9)-(line 745,col 22)",
        "(line 746,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 756,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.reverse(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 759,
      "end_line": 765,
      "comment": "",
      "child_ranges": [
        "(line 760,col 9)-(line 760,col 51)",
        "(line 761,col 9)-(line 763,col 9)",
        "(line 764,col 9)-(line 764,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamWrapper",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 767,
      "end_line": 807,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "BUF_SIZE"
      ],
      "begin_line": 768,
      "end_line": 768,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "buffer"
      ],
      "begin_line": 769,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(int)",
      "begin_line": 770,
      "end_line": 777,
      "comment": "",
      "child_ranges": [
        "(line 772,col 13)-(line 772,col 27)",
        "(line 773,col 13)-(line 773,col 40)",
        "(line 774,col 13)-(line 774,col 34)",
        "(line 775,col 13)-(line 775,col 38)",
        "(line 776,col 13)-(line 776,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[])",
      "begin_line": 779,
      "end_line": 782,
      "comment": "",
      "child_ranges": [
        "(line 781,col 13)-(line 781,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[], int, int)",
      "begin_line": 784,
      "end_line": 796,
      "comment": "",
      "child_ranges": [
        "(line 787,col 13)-(line 793,col 13)",
        "(line 794,col 13)-(line 794,col 48)",
        "(line 795,col 13)-(line 795,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.flush()",
      "begin_line": 798,
      "end_line": 801,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.close()",
      "begin_line": 803,
      "end_line": 806,
      "comment": "",
      "child_ranges": []
    }
  ]
}