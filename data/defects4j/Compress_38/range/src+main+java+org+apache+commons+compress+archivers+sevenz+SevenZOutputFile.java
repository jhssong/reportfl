{
  "filepath": "/tmp/Compress-38b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 45,
      "end_line": 771,
      "comment": "\n * Writes a 7z file.\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 46,
      "end_line": 46,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "files"
      ],
      "begin_line": 47,
      "end_line": 47,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "numNonEmptyStreams"
      ],
      "begin_line": 48,
      "end_line": 48,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "crc32"
      ],
      "begin_line": 49,
      "end_line": 49,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "compressedCrc32"
      ],
      "begin_line": 50,
      "end_line": 50,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileBytesWritten"
      ],
      "begin_line": 51,
      "end_line": 51,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "finished"
      ],
      "begin_line": 52,
      "end_line": 52,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentOutputStream"
      ],
      "begin_line": 53,
      "end_line": 53,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "additionalCountingStreams"
      ],
      "begin_line": 54,
      "end_line": 54,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "contentMethods"
      ],
      "begin_line": 55,
      "end_line": 56,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "additionalSizes"
      ],
      "begin_line": 57,
      "end_line": 57,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.SevenZOutputFile(java.io.File)",
      "begin_line": 65,
      "end_line": 68,
      "comment": "\n     * Opens file to write a 7z archive to.\n     *\n     * @param filename name of the file to write to\n     * @throws IOException if opening the file fails\n     ",
      "child_ranges": [
        "(line 66,col 9)-(line 66,col 52)",
        "(line 67,col 9)-(line 67,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod)",
      "begin_line": 82,
      "end_line": 84,
      "comment": "\n     * Sets the default compression method to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a short form for passing a single-element iterable\n     * to {@link #setContentMethods}.\u003c/p\u003e\n     * @param method the default compression method\n     ",
      "child_ranges": [
        "(line 83,col 9)-(line 83,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentMethods(java.lang.Iterable\u003c? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration\u003e)",
      "begin_line": 100,
      "end_line": 102,
      "comment": "\n     * Sets the default (compression) methods to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @since 1.8\n     * @param methods the default (compression) methods\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 101,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close()",
      "begin_line": 109,
      "end_line": 115,
      "comment": "\n     * Closes the archive, calling {@link #finish} if necessary.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 111,col 9)-(line 113,col 9)",
        "(line 114,col 9)-(line 114,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 126,
      "end_line": 133,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile file to create an entry from\n     * @param entryName the name to use\n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 128,col 66)",
        "(line 129,col 9)-(line 129,col 52)",
        "(line 130,col 9)-(line 130,col 33)",
        "(line 131,col 9)-(line 131,col 70)",
        "(line 132,col 9)-(line 132,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 144,
      "end_line": 147,
      "comment": "\n     * Records an archive entry to add.\n     *\n     * The caller must then write the content to the archive and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param archiveEntry describes the entry\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 75)",
        "(line 146,col 9)-(line 146,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 153,
      "end_line": 186,
      "comment": "\n     * Closes the archive entry.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 154,col 9)-(line 157,col 9)",
        "(line 159,col 9)-(line 159,col 69)",
        "(line 160,col 9)-(line 180,col 9)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 41)",
        "(line 183,col 9)-(line 183,col 22)",
        "(line 184,col 9)-(line 184,col 32)",
        "(line 185,col 9)-(line 185,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 193,
      "end_line": 195,
      "comment": "\n     * Writes a byte to the current archive entry.\n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 194,col 9)-(line 194,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Writes a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 213,
      "end_line": 217,
      "comment": "\n     * Writes part of a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @param off offset into the array to start writing from\n     * @param len number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 214,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 224,
      "end_line": 263,
      "comment": "\n     * Finishes the addition of entries to this archive, without closing it.\n     * \n     * @throws IOException if archive is already closed.\n     ",
      "child_ranges": [
        "(line 225,col 9)-(line 227,col 9)",
        "(line 228,col 9)-(line 228,col 24)",
        "(line 230,col 9)-(line 230,col 58)",
        "(line 232,col 9)-(line 232,col 77)",
        "(line 233,col 9)-(line 233,col 73)",
        "(line 235,col 9)-(line 235,col 28)",
        "(line 236,col 9)-(line 236,col 23)",
        "(line 237,col 9)-(line 237,col 60)",
        "(line 238,col 9)-(line 238,col 32)",
        "(line 240,col 9)-(line 240,col 40)",
        "(line 243,col 9)-(line 243,col 21)",
        "(line 244,col 9)-(line 244,col 47)",
        "(line 246,col 9)-(line 246,col 22)",
        "(line 247,col 9)-(line 247,col 22)",
        "(line 250,col 9)-(line 250,col 82)",
        "(line 251,col 9)-(line 251,col 89)",
        "(line 252,col 9)-(line 252,col 106)",
        "(line 253,col 9)-(line 253,col 89)",
        "(line 254,col 9)-(line 254,col 22)",
        "(line 255,col 9)-(line 255,col 34)",
        "(line 256,col 9)-(line 256,col 80)",
        "(line 257,col 9)-(line 257,col 34)",
        "(line 258,col 9)-(line 258,col 70)",
        "(line 259,col 9)-(line 259,col 22)",
        "(line 260,col 9)-(line 260,col 39)",
        "(line 261,col 9)-(line 261,col 68)",
        "(line 262,col 9)-(line 262,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream()",
      "begin_line": 270,
      "end_line": 275,
      "comment": "\n     * Creation of output stream is deferred until data is actually\n     * written as some codecs might write header information even for\n     * empty streams and directories otherwise.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 273,col 9)",
        "(line 274,col 9)-(line 274,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream()",
      "begin_line": 277,
      "end_line": 317,
      "comment": "",
      "child_ranges": [
        "(line 278,col 9)-(line 280,col 9)",
        "(line 282,col 9)-(line 282,col 53)",
        "(line 283,col 9)-(line 283,col 98)",
        "(line 284,col 9)-(line 284,col 29)",
        "(line 285,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 296,col 9)",
        "(line 297,col 9)-(line 316,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-ca02e1b8-05fd-4f6c-880e-062e2e1a3cb8.write(int)",
      "begin_line": 298,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 300,col 17)-(line 300,col 31)",
        "(line 301,col 17)-(line 301,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-496f5a78-60de-4e77-9813-02cee7f054fa.write(byte[])",
      "begin_line": 304,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 306,col 17)-(line 306,col 31)",
        "(line 307,col 17)-(line 307,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-36780daa-d607-4e45-942a-707fe5ef4047.write(byte[], int, int)",
      "begin_line": 310,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 313,col 17)-(line 313,col 41)",
        "(line 314,col 17)-(line 314,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 319,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 320,col 9)-(line 320,col 91)",
        "(line 321,col 9)-(line 321,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 324,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 34)",
        "(line 327,col 9)-(line 327,col 43)",
        "(line 328,col 9)-(line 328,col 33)",
        "(line 329,col 9)-(line 329,col 31)",
        "(line 330,col 9)-(line 330,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 333,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 337,col 9)",
        "(line 339,col 9)-(line 339,col 36)",
        "(line 341,col 9)-(line 341,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 344,
      "end_line": 366,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 36)",
        "(line 347,col 9)-(line 347,col 31)",
        "(line 348,col 9)-(line 348,col 62)",
        "(line 350,col 9)-(line 350,col 32)",
        "(line 351,col 9)-(line 355,col 9)",
        "(line 357,col 9)-(line 357,col 31)",
        "(line 358,col 9)-(line 358,col 24)",
        "(line 359,col 9)-(line 363,col 9)",
        "(line 365,col 9)-(line 365,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 368,
      "end_line": 402,
      "comment": "",
      "child_ranges": [
        "(line 369,col 9)-(line 369,col 38)",
        "(line 371,col 9)-(line 371,col 34)",
        "(line 372,col 9)-(line 372,col 48)",
        "(line 373,col 9)-(line 373,col 24)",
        "(line 374,col 9)-(line 378,col 9)",
        "(line 380,col 9)-(line 380,col 44)",
        "(line 381,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 393,col 31)",
        "(line 394,col 9)-(line 394,col 24)",
        "(line 395,col 9)-(line 399,col 9)",
        "(line 401,col 9)-(line 401,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 404,
      "end_line": 418,
      "comment": "",
      "child_ranges": [
        "(line 405,col 9)-(line 405,col 70)",
        "(line 406,col 9)-(line 406,col 26)",
        "(line 407,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 412,col 39)",
        "(line 413,col 9)-(line 413,col 40)",
        "(line 414,col 9)-(line 417,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSingleCodec(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration, java.io.OutputStream)",
      "begin_line": 420,
      "end_line": 436,
      "comment": "",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 48)",
        "(line 422,col 9)-(line 423,col 52)",
        "(line 425,col 9)-(line 425,col 35)",
        "(line 426,col 9)-(line 428,col 9)",
        "(line 429,col 9)-(line 429,col 30)",
        "(line 430,col 9)-(line 430,col 22)",
        "(line 432,col 9)-(line 435,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 438,
      "end_line": 450,
      "comment": "",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 42)",
        "(line 449,col 9)-(line 449,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 452,
      "end_line": 466,
      "comment": "",
      "child_ranges": [
        "(line 453,col 9)-(line 453,col 37)",
        "(line 455,col 9)-(line 455,col 42)",
        "(line 457,col 9)-(line 457,col 38)",
        "(line 458,col 9)-(line 458,col 36)",
        "(line 459,col 9)-(line 459,col 35)",
        "(line 460,col 9)-(line 460,col 31)",
        "(line 461,col 9)-(line 461,col 32)",
        "(line 462,col 9)-(line 462,col 32)",
        "(line 463,col 9)-(line 463,col 32)",
        "(line 464,col 9)-(line 464,col 43)",
        "(line 465,col 9)-(line 465,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 468,
      "end_line": 490,
      "comment": "",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 40)",
        "(line 470,col 9)-(line 475,col 9)",
        "(line 476,col 9)-(line 489,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 492,
      "end_line": 513,
      "comment": "",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 38)",
        "(line 494,col 9)-(line 494,col 35)",
        "(line 495,col 9)-(line 495,col 48)",
        "(line 496,col 9)-(line 502,col 9)",
        "(line 503,col 9)-(line 512,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 515,
      "end_line": 536,
      "comment": "",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 37)",
        "(line 517,col 9)-(line 517,col 47)",
        "(line 518,col 9)-(line 518,col 32)",
        "(line 519,col 9)-(line 525,col 9)",
        "(line 526,col 9)-(line 535,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 538,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 32)",
        "(line 541,col 9)-(line 541,col 71)",
        "(line 542,col 9)-(line 542,col 64)",
        "(line 543,col 9)-(line 543,col 21)",
        "(line 544,col 9)-(line 547,col 9)",
        "(line 548,col 9)-(line 548,col 20)",
        "(line 549,col 9)-(line 549,col 51)",
        "(line 550,col 9)-(line 550,col 45)",
        "(line 551,col 9)-(line 551,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 554,
      "end_line": 588,
      "comment": "",
      "child_ranges": [
        "(line 555,col 9)-(line 555,col 33)",
        "(line 556,col 9)-(line 560,col 9)",
        "(line 561,col 9)-(line 587,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 590,
      "end_line": 624,
      "comment": "",
      "child_ranges": [
        "(line 591,col 9)-(line 591,col 31)",
        "(line 592,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 623,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 626,
      "end_line": 660,
      "comment": "",
      "child_ranges": [
        "(line 627,col 9)-(line 627,col 37)",
        "(line 628,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 659,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 662,
      "end_line": 695,
      "comment": "",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 37)",
        "(line 664,col 9)-(line 668,col 9)",
        "(line 669,col 9)-(line 694,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 697,
      "end_line": 714,
      "comment": "",
      "child_ranges": [
        "(line 698,col 9)-(line 698,col 26)",
        "(line 699,col 9)-(line 699,col 24)",
        "(line 700,col 9)-(line 700,col 14)",
        "(line 701,col 9)-(line 708,col 9)",
        "(line 709,col 9)-(line 709,col 32)",
        "(line 710,col 9)-(line 713,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 716,
      "end_line": 730,
      "comment": "",
      "child_ranges": [
        "(line 717,col 9)-(line 717,col 22)",
        "(line 718,col 9)-(line 718,col 22)",
        "(line 719,col 9)-(line 726,col 9)",
        "(line 727,col 9)-(line 729,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.reverse(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 732,
      "end_line": 738,
      "comment": "",
      "child_ranges": [
        "(line 733,col 9)-(line 733,col 52)",
        "(line 734,col 9)-(line 736,col 9)",
        "(line 737,col 9)-(line 737,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamWrapper",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 740,
      "end_line": 770,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(int)",
      "begin_line": 741,
      "end_line": 746,
      "comment": "",
      "child_ranges": [
        "(line 743,col 13)-(line 743,col 26)",
        "(line 744,col 13)-(line 744,col 38)",
        "(line 745,col 13)-(line 745,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[])",
      "begin_line": 748,
      "end_line": 751,
      "comment": "",
      "child_ranges": [
        "(line 750,col 13)-(line 750,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[], int, int)",
      "begin_line": 753,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 756,col 13)-(line 756,col 36)",
        "(line 757,col 13)-(line 757,col 48)",
        "(line 758,col 13)-(line 758,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.flush()",
      "begin_line": 761,
      "end_line": 764,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.close()",
      "begin_line": 766,
      "end_line": 769,
      "comment": "",
      "child_ranges": []
    }
  ]
}