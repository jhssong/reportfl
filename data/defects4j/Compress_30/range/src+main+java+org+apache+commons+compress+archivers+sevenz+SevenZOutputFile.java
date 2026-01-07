{
  "filepath": "/tmp/Compress-30b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 45,
      "end_line": 768,
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
      "begin_line": 81,
      "end_line": 83,
      "comment": "\n     * Sets the default compression method to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThis is a short form for passing a single-element iterable\n     * to {@link #setContentMethods}.\u003c/p\u003e\n     ",
      "child_ranges": [
        "(line 82,col 9)-(line 82,col 92)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setContentMethods(java.lang.Iterable\u003c? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration\u003e)",
      "begin_line": 98,
      "end_line": 100,
      "comment": "\n     * Sets the default (compression) methods to use for entry contents - the\n     * default is LZMA2.\n     *\n     * \u003cp\u003eCurrently only {@link SevenZMethod#COPY}, {@link\n     * SevenZMethod#LZMA2}, {@link SevenZMethod#BZIP2} and {@link\n     * SevenZMethod#DEFLATE} are supported.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe methods will be consulted in iteration order to create\n     * the final output.\u003c/p\u003e\n     *\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 99,col 9)-(line 99,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.close()",
      "begin_line": 107,
      "end_line": 112,
      "comment": "\n     * Closes the archive, calling {@link #finish} if necessary.\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 108,col 9)-(line 110,col 9)",
        "(line 111,col 9)-(line 111,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 123,
      "end_line": 130,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile\n     * @param entryName \n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 125,col 66)",
        "(line 126,col 9)-(line 126,col 52)",
        "(line 127,col 9)-(line 127,col 33)",
        "(line 128,col 9)-(line 128,col 70)",
        "(line 129,col 9)-(line 129,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 141,
      "end_line": 144,
      "comment": "\n     * Records an archive entry to add.\n     *\n     * The caller must then write the content to the archive and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param archiveEntry describes the entry\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 142,col 9)-(line 142,col 75)",
        "(line 143,col 9)-(line 143,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 150,
      "end_line": 183,
      "comment": "\n     * Closes the archive entry.\n     * @throws IOException\n     ",
      "child_ranges": [
        "(line 151,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 69)",
        "(line 157,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 41)",
        "(line 180,col 9)-(line 180,col 22)",
        "(line 181,col 9)-(line 181,col 32)",
        "(line 182,col 9)-(line 182,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 190,
      "end_line": 192,
      "comment": "\n     * Writes a byte to the current archive entry.\n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 191,col 9)-(line 191,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 199,
      "end_line": 201,
      "comment": "\n     * Writes a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 210,
      "end_line": 214,
      "comment": "\n     * Writes part of a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @param off offset into the array to start writing from\n     * @param len number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 213,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 221,
      "end_line": 260,
      "comment": "\n     * Finishes the addition of entries to this archive, without closing it.\n     * \n     * @throws IOException if archive is already closed.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 224,col 9)",
        "(line 225,col 9)-(line 225,col 24)",
        "(line 227,col 9)-(line 227,col 58)",
        "(line 229,col 9)-(line 229,col 77)",
        "(line 230,col 9)-(line 230,col 73)",
        "(line 232,col 9)-(line 232,col 28)",
        "(line 233,col 9)-(line 233,col 23)",
        "(line 234,col 9)-(line 234,col 60)",
        "(line 235,col 9)-(line 235,col 32)",
        "(line 237,col 9)-(line 237,col 40)",
        "(line 240,col 9)-(line 240,col 21)",
        "(line 241,col 9)-(line 241,col 47)",
        "(line 243,col 9)-(line 243,col 22)",
        "(line 244,col 9)-(line 244,col 22)",
        "(line 247,col 9)-(line 247,col 82)",
        "(line 248,col 9)-(line 248,col 89)",
        "(line 249,col 9)-(line 249,col 106)",
        "(line 250,col 9)-(line 250,col 89)",
        "(line 251,col 9)-(line 251,col 22)",
        "(line 252,col 9)-(line 252,col 34)",
        "(line 253,col 9)-(line 253,col 80)",
        "(line 254,col 9)-(line 254,col 34)",
        "(line 255,col 9)-(line 255,col 70)",
        "(line 256,col 9)-(line 256,col 22)",
        "(line 257,col 9)-(line 257,col 39)",
        "(line 258,col 9)-(line 258,col 68)",
        "(line 259,col 9)-(line 259,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream()",
      "begin_line": 267,
      "end_line": 272,
      "comment": "\n     * Creation of output stream is deferred until data is actually\n     * written as some codecs might write header information even for\n     * empty streams and directories otherwise.\n     ",
      "child_ranges": [
        "(line 268,col 9)-(line 270,col 9)",
        "(line 271,col 9)-(line 271,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream()",
      "begin_line": 274,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 277,col 9)",
        "(line 279,col 9)-(line 279,col 53)",
        "(line 280,col 9)-(line 280,col 92)",
        "(line 281,col 9)-(line 281,col 29)",
        "(line 282,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 293,col 9)",
        "(line 294,col 9)-(line 313,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-c500e669-6aaf-486a-a8a9-9d8db2aeb45e.write(int)",
      "begin_line": 295,
      "end_line": 299,
      "comment": "",
      "child_ranges": [
        "(line 297,col 17)-(line 297,col 31)",
        "(line 298,col 17)-(line 298,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-7efbc16e-125f-4436-a3f8-37e09c5339fa.write(byte[])",
      "begin_line": 301,
      "end_line": 305,
      "comment": "",
      "child_ranges": [
        "(line 303,col 17)-(line 303,col 31)",
        "(line 304,col 17)-(line 304,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-0780ce3e-657c-4ba2-a51a-643630899c5f.write(byte[], int, int)",
      "begin_line": 307,
      "end_line": 312,
      "comment": "",
      "child_ranges": [
        "(line 310,col 17)-(line 310,col 41)",
        "(line 311,col 17)-(line 311,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 316,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 85)",
        "(line 318,col 9)-(line 318,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 321,
      "end_line": 328,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 34)",
        "(line 324,col 9)-(line 324,col 43)",
        "(line 325,col 9)-(line 325,col 33)",
        "(line 326,col 9)-(line 326,col 31)",
        "(line 327,col 9)-(line 327,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 330,
      "end_line": 339,
      "comment": "",
      "child_ranges": [
        "(line 331,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 336,col 36)",
        "(line 338,col 9)-(line 338,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 341,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 342,col 9)-(line 342,col 36)",
        "(line 344,col 9)-(line 344,col 31)",
        "(line 345,col 9)-(line 345,col 62)",
        "(line 347,col 9)-(line 347,col 32)",
        "(line 348,col 9)-(line 352,col 9)",
        "(line 354,col 9)-(line 354,col 31)",
        "(line 355,col 9)-(line 355,col 24)",
        "(line 356,col 9)-(line 360,col 9)",
        "(line 362,col 9)-(line 362,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 365,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 38)",
        "(line 368,col 9)-(line 368,col 34)",
        "(line 369,col 9)-(line 369,col 48)",
        "(line 370,col 9)-(line 370,col 24)",
        "(line 371,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 377,col 44)",
        "(line 378,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 390,col 31)",
        "(line 391,col 9)-(line 391,col 24)",
        "(line 392,col 9)-(line 396,col 9)",
        "(line 398,col 9)-(line 398,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 401,
      "end_line": 415,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 64)",
        "(line 403,col 9)-(line 403,col 26)",
        "(line 404,col 9)-(line 407,col 9)",
        "(line 409,col 9)-(line 409,col 39)",
        "(line 410,col 9)-(line 410,col 40)",
        "(line 411,col 9)-(line 414,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSingleCodec(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration, java.io.OutputStream)",
      "begin_line": 417,
      "end_line": 433,
      "comment": "",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 42)",
        "(line 419,col 9)-(line 420,col 52)",
        "(line 422,col 9)-(line 422,col 35)",
        "(line 423,col 9)-(line 425,col 9)",
        "(line 426,col 9)-(line 426,col 30)",
        "(line 427,col 9)-(line 427,col 22)",
        "(line 429,col 9)-(line 432,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 435,
      "end_line": 447,
      "comment": "",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 42)",
        "(line 446,col 9)-(line 446,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 449,
      "end_line": 463,
      "comment": "",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 37)",
        "(line 452,col 9)-(line 452,col 42)",
        "(line 454,col 9)-(line 454,col 38)",
        "(line 455,col 9)-(line 455,col 36)",
        "(line 456,col 9)-(line 456,col 35)",
        "(line 457,col 9)-(line 457,col 31)",
        "(line 458,col 9)-(line 458,col 32)",
        "(line 459,col 9)-(line 459,col 32)",
        "(line 460,col 9)-(line 460,col 32)",
        "(line 461,col 9)-(line 461,col 43)",
        "(line 462,col 9)-(line 462,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 465,
      "end_line": 487,
      "comment": "",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 40)",
        "(line 467,col 9)-(line 472,col 9)",
        "(line 473,col 9)-(line 486,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 489,
      "end_line": 510,
      "comment": "",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 38)",
        "(line 491,col 9)-(line 491,col 35)",
        "(line 492,col 9)-(line 492,col 48)",
        "(line 493,col 9)-(line 499,col 9)",
        "(line 500,col 9)-(line 509,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 512,
      "end_line": 533,
      "comment": "",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 37)",
        "(line 514,col 9)-(line 514,col 47)",
        "(line 515,col 9)-(line 515,col 32)",
        "(line 516,col 9)-(line 522,col 9)",
        "(line 523,col 9)-(line 532,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 535,
      "end_line": 549,
      "comment": "",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 32)",
        "(line 538,col 9)-(line 538,col 71)",
        "(line 539,col 9)-(line 539,col 64)",
        "(line 540,col 9)-(line 540,col 21)",
        "(line 541,col 9)-(line 544,col 9)",
        "(line 545,col 9)-(line 545,col 20)",
        "(line 546,col 9)-(line 546,col 51)",
        "(line 547,col 9)-(line 547,col 45)",
        "(line 548,col 9)-(line 548,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 551,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 33)",
        "(line 553,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 584,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 587,
      "end_line": 621,
      "comment": "",
      "child_ranges": [
        "(line 588,col 9)-(line 588,col 31)",
        "(line 589,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 620,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 623,
      "end_line": 657,
      "comment": "",
      "child_ranges": [
        "(line 624,col 9)-(line 624,col 37)",
        "(line 625,col 9)-(line 629,col 9)",
        "(line 630,col 9)-(line 656,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 659,
      "end_line": 692,
      "comment": "",
      "child_ranges": [
        "(line 660,col 9)-(line 660,col 37)",
        "(line 661,col 9)-(line 665,col 9)",
        "(line 666,col 9)-(line 691,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 694,
      "end_line": 711,
      "comment": "",
      "child_ranges": [
        "(line 695,col 9)-(line 695,col 26)",
        "(line 696,col 9)-(line 696,col 24)",
        "(line 697,col 9)-(line 697,col 14)",
        "(line 698,col 9)-(line 705,col 9)",
        "(line 706,col 9)-(line 706,col 32)",
        "(line 707,col 9)-(line 710,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 713,
      "end_line": 727,
      "comment": "",
      "child_ranges": [
        "(line 714,col 9)-(line 714,col 22)",
        "(line 715,col 9)-(line 715,col 22)",
        "(line 716,col 9)-(line 723,col 9)",
        "(line 724,col 9)-(line 726,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.reverse(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 729,
      "end_line": 735,
      "comment": "",
      "child_ranges": [
        "(line 730,col 9)-(line 730,col 46)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 734,col 9)-(line 734,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamWrapper",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 737,
      "end_line": 767,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(int)",
      "begin_line": 738,
      "end_line": 743,
      "comment": "",
      "child_ranges": [
        "(line 740,col 13)-(line 740,col 26)",
        "(line 741,col 13)-(line 741,col 38)",
        "(line 742,col 13)-(line 742,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[])",
      "begin_line": 745,
      "end_line": 748,
      "comment": "",
      "child_ranges": [
        "(line 747,col 13)-(line 747,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[], int, int)",
      "begin_line": 750,
      "end_line": 756,
      "comment": "",
      "child_ranges": [
        "(line 753,col 13)-(line 753,col 36)",
        "(line 754,col 13)-(line 754,col 48)",
        "(line 755,col 13)-(line 755,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.flush()",
      "begin_line": 758,
      "end_line": 761,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.close()",
      "begin_line": 763,
      "end_line": 766,
      "comment": "",
      "child_ranges": []
    }
  ]
}