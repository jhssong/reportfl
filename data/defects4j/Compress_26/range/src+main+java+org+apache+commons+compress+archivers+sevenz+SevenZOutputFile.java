{
  "filepath": "/tmp/Compress-26b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 45,
      "end_line": 764,
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
      "end_line": 310,
      "comment": "",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 53)",
        "(line 276,col 9)-(line 276,col 92)",
        "(line 277,col 9)-(line 277,col 29)",
        "(line 278,col 9)-(line 286,col 9)",
        "(line 287,col 9)-(line 289,col 9)",
        "(line 290,col 9)-(line 309,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-9f095103-6ec9-4370-bfdb-b7724dc1e47e.write(int)",
      "begin_line": 291,
      "end_line": 295,
      "comment": "",
      "child_ranges": [
        "(line 293,col 17)-(line 293,col 31)",
        "(line 294,col 17)-(line 294,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-4b355f90-a100-4ea2-8660-049f75c7b12c.write(byte[])",
      "begin_line": 297,
      "end_line": 301,
      "comment": "",
      "child_ranges": [
        "(line 299,col 17)-(line 299,col 31)",
        "(line 300,col 17)-(line 300,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-b6e2bd70-0e8c-4272-bae6-c3cae9dd8dab.write(byte[], int, int)",
      "begin_line": 303,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 306,col 17)-(line 306,col 41)",
        "(line 307,col 17)-(line 307,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 312,
      "end_line": 315,
      "comment": "",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 85)",
        "(line 314,col 9)-(line 314,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 317,
      "end_line": 324,
      "comment": "",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 34)",
        "(line 320,col 9)-(line 320,col 43)",
        "(line 321,col 9)-(line 321,col 33)",
        "(line 322,col 9)-(line 322,col 31)",
        "(line 323,col 9)-(line 323,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 326,
      "end_line": 335,
      "comment": "",
      "child_ranges": [
        "(line 327,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 332,col 36)",
        "(line 334,col 9)-(line 334,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 337,
      "end_line": 359,
      "comment": "",
      "child_ranges": [
        "(line 338,col 9)-(line 338,col 36)",
        "(line 340,col 9)-(line 340,col 31)",
        "(line 341,col 9)-(line 341,col 62)",
        "(line 343,col 9)-(line 343,col 32)",
        "(line 344,col 9)-(line 348,col 9)",
        "(line 350,col 9)-(line 350,col 31)",
        "(line 351,col 9)-(line 351,col 24)",
        "(line 352,col 9)-(line 356,col 9)",
        "(line 358,col 9)-(line 358,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 361,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 38)",
        "(line 364,col 9)-(line 364,col 34)",
        "(line 365,col 9)-(line 365,col 48)",
        "(line 366,col 9)-(line 366,col 24)",
        "(line 367,col 9)-(line 371,col 9)",
        "(line 373,col 9)-(line 373,col 44)",
        "(line 374,col 9)-(line 384,col 9)",
        "(line 386,col 9)-(line 386,col 31)",
        "(line 387,col 9)-(line 387,col 24)",
        "(line 388,col 9)-(line 392,col 9)",
        "(line 394,col 9)-(line 394,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 397,
      "end_line": 411,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 64)",
        "(line 399,col 9)-(line 399,col 26)",
        "(line 400,col 9)-(line 403,col 9)",
        "(line 405,col 9)-(line 405,col 39)",
        "(line 406,col 9)-(line 406,col 40)",
        "(line 407,col 9)-(line 410,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSingleCodec(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration, java.io.OutputStream)",
      "begin_line": 413,
      "end_line": 429,
      "comment": "",
      "child_ranges": [
        "(line 414,col 9)-(line 414,col 42)",
        "(line 415,col 9)-(line 416,col 52)",
        "(line 418,col 9)-(line 418,col 35)",
        "(line 419,col 9)-(line 421,col 9)",
        "(line 422,col 9)-(line 422,col 30)",
        "(line 423,col 9)-(line 423,col 22)",
        "(line 425,col 9)-(line 428,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 431,
      "end_line": 443,
      "comment": "",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 42)",
        "(line 442,col 9)-(line 442,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 445,
      "end_line": 459,
      "comment": "",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 37)",
        "(line 448,col 9)-(line 448,col 42)",
        "(line 450,col 9)-(line 450,col 38)",
        "(line 451,col 9)-(line 451,col 36)",
        "(line 452,col 9)-(line 452,col 35)",
        "(line 453,col 9)-(line 453,col 31)",
        "(line 454,col 9)-(line 454,col 32)",
        "(line 455,col 9)-(line 455,col 32)",
        "(line 456,col 9)-(line 456,col 32)",
        "(line 457,col 9)-(line 457,col 43)",
        "(line 458,col 9)-(line 458,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 461,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 462,col 9)-(line 462,col 40)",
        "(line 463,col 9)-(line 468,col 9)",
        "(line 469,col 9)-(line 482,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 485,
      "end_line": 506,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 38)",
        "(line 487,col 9)-(line 487,col 35)",
        "(line 488,col 9)-(line 488,col 48)",
        "(line 489,col 9)-(line 495,col 9)",
        "(line 496,col 9)-(line 505,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 508,
      "end_line": 529,
      "comment": "",
      "child_ranges": [
        "(line 509,col 9)-(line 509,col 37)",
        "(line 510,col 9)-(line 510,col 47)",
        "(line 511,col 9)-(line 511,col 32)",
        "(line 512,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 528,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 531,
      "end_line": 545,
      "comment": "",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 32)",
        "(line 534,col 9)-(line 534,col 71)",
        "(line 535,col 9)-(line 535,col 64)",
        "(line 536,col 9)-(line 536,col 21)",
        "(line 537,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 20)",
        "(line 542,col 9)-(line 542,col 51)",
        "(line 543,col 9)-(line 543,col 45)",
        "(line 544,col 9)-(line 544,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 547,
      "end_line": 581,
      "comment": "",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 33)",
        "(line 549,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 580,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 583,
      "end_line": 617,
      "comment": "",
      "child_ranges": [
        "(line 584,col 9)-(line 584,col 31)",
        "(line 585,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 616,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 619,
      "end_line": 653,
      "comment": "",
      "child_ranges": [
        "(line 620,col 9)-(line 620,col 37)",
        "(line 621,col 9)-(line 625,col 9)",
        "(line 626,col 9)-(line 652,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 655,
      "end_line": 688,
      "comment": "",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 37)",
        "(line 657,col 9)-(line 661,col 9)",
        "(line 662,col 9)-(line 687,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 690,
      "end_line": 707,
      "comment": "",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 26)",
        "(line 692,col 9)-(line 692,col 24)",
        "(line 693,col 9)-(line 693,col 14)",
        "(line 694,col 9)-(line 701,col 9)",
        "(line 702,col 9)-(line 702,col 32)",
        "(line 703,col 9)-(line 706,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 709,
      "end_line": 723,
      "comment": "",
      "child_ranges": [
        "(line 710,col 9)-(line 710,col 22)",
        "(line 711,col 9)-(line 711,col 22)",
        "(line 712,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 722,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.reverse(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 725,
      "end_line": 731,
      "comment": "",
      "child_ranges": [
        "(line 726,col 9)-(line 726,col 46)",
        "(line 727,col 9)-(line 729,col 9)",
        "(line 730,col 9)-(line 730,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamWrapper",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 733,
      "end_line": 763,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(int)",
      "begin_line": 734,
      "end_line": 739,
      "comment": "",
      "child_ranges": [
        "(line 736,col 13)-(line 736,col 26)",
        "(line 737,col 13)-(line 737,col 38)",
        "(line 738,col 13)-(line 738,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[])",
      "begin_line": 741,
      "end_line": 744,
      "comment": "",
      "child_ranges": [
        "(line 743,col 13)-(line 743,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[], int, int)",
      "begin_line": 746,
      "end_line": 752,
      "comment": "",
      "child_ranges": [
        "(line 749,col 13)-(line 749,col 36)",
        "(line 750,col 13)-(line 750,col 48)",
        "(line 751,col 13)-(line 751,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.flush()",
      "begin_line": 754,
      "end_line": 757,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.close()",
      "begin_line": 759,
      "end_line": 762,
      "comment": "",
      "child_ranges": []
    }
  ]
}