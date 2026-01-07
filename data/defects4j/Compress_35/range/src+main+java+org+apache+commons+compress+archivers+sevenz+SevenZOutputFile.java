{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZOutputFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZOutputFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 45,
      "end_line": 770,
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
      "end_line": 114,
      "comment": "\n     * Closes the archive, calling {@link #finish} if necessary.\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 110,col 9)-(line 112,col 9)",
        "(line 113,col 9)-(line 113,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.createArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 125,
      "end_line": 132,
      "comment": "\n     * Create an archive entry using the inputFile and entryName provided.\n     * \n     * @param inputFile file to create an entry from\n     * @param entryName the name to use\n     * @return the ArchiveEntry set up with details from the file\n     * \n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 127,col 66)",
        "(line 128,col 9)-(line 128,col 52)",
        "(line 129,col 9)-(line 129,col 33)",
        "(line 130,col 9)-(line 130,col 70)",
        "(line 131,col 9)-(line 131,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry)",
      "begin_line": 143,
      "end_line": 146,
      "comment": "\n     * Records an archive entry to add.\n     *\n     * The caller must then write the content to the archive and call\n     * {@link #closeArchiveEntry()} to complete the process.\n     * \n     * @param archiveEntry describes the entry\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 144,col 9)-(line 144,col 75)",
        "(line 145,col 9)-(line 145,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.closeArchiveEntry()",
      "begin_line": 152,
      "end_line": 185,
      "comment": "\n     * Closes the archive entry.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 153,col 9)-(line 156,col 9)",
        "(line 158,col 9)-(line 158,col 69)",
        "(line 159,col 9)-(line 179,col 9)",
        "(line 180,col 9)-(line 180,col 35)",
        "(line 181,col 9)-(line 181,col 41)",
        "(line 182,col 9)-(line 182,col 22)",
        "(line 183,col 9)-(line 183,col 32)",
        "(line 184,col 9)-(line 184,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(int)",
      "begin_line": 192,
      "end_line": 194,
      "comment": "\n     * Writes a byte to the current archive entry.\n     * @param b The byte to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 193,col 9)-(line 193,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[])",
      "begin_line": 201,
      "end_line": 203,
      "comment": "\n     * Writes a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 202,col 9)-(line 202,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.write(byte[], int, int)",
      "begin_line": 212,
      "end_line": 216,
      "comment": "\n     * Writes part of a byte array to the current archive entry.\n     * @param b The byte array to be written.\n     * @param off offset into the array to start writing from\n     * @param len number of bytes to write\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 213,col 9)-(line 215,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.finish()",
      "begin_line": 223,
      "end_line": 262,
      "comment": "\n     * Finishes the addition of entries to this archive, without closing it.\n     * \n     * @throws IOException if archive is already closed.\n     ",
      "child_ranges": [
        "(line 224,col 9)-(line 226,col 9)",
        "(line 227,col 9)-(line 227,col 24)",
        "(line 229,col 9)-(line 229,col 58)",
        "(line 231,col 9)-(line 231,col 77)",
        "(line 232,col 9)-(line 232,col 73)",
        "(line 234,col 9)-(line 234,col 28)",
        "(line 235,col 9)-(line 235,col 23)",
        "(line 236,col 9)-(line 236,col 60)",
        "(line 237,col 9)-(line 237,col 32)",
        "(line 239,col 9)-(line 239,col 40)",
        "(line 242,col 9)-(line 242,col 21)",
        "(line 243,col 9)-(line 243,col 47)",
        "(line 245,col 9)-(line 245,col 22)",
        "(line 246,col 9)-(line 246,col 22)",
        "(line 249,col 9)-(line 249,col 82)",
        "(line 250,col 9)-(line 250,col 89)",
        "(line 251,col 9)-(line 251,col 106)",
        "(line 252,col 9)-(line 252,col 89)",
        "(line 253,col 9)-(line 253,col 22)",
        "(line 254,col 9)-(line 254,col 34)",
        "(line 255,col 9)-(line 255,col 80)",
        "(line 256,col 9)-(line 256,col 34)",
        "(line 257,col 9)-(line 257,col 70)",
        "(line 258,col 9)-(line 258,col 22)",
        "(line 259,col 9)-(line 259,col 39)",
        "(line 260,col 9)-(line 260,col 68)",
        "(line 261,col 9)-(line 261,col 37)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getCurrentOutputStream()",
      "begin_line": 269,
      "end_line": 274,
      "comment": "\n     * Creation of output stream is deferred until data is actually\n     * written as some codecs might write header information even for\n     * empty streams and directories otherwise.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 272,col 9)",
        "(line 273,col 9)-(line 273,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.setupFileOutputStream()",
      "begin_line": 276,
      "end_line": 316,
      "comment": "",
      "child_ranges": [
        "(line 277,col 9)-(line 279,col 9)",
        "(line 281,col 9)-(line 281,col 53)",
        "(line 282,col 9)-(line 282,col 92)",
        "(line 283,col 9)-(line 283,col 29)",
        "(line 284,col 9)-(line 292,col 9)",
        "(line 293,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 315,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-6984390f-605e-4d7e-8e6b-f6463d855789.write(int)",
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
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-dd576335-5437-4c34-8b84-0526fb4885a3.write(byte[])",
      "begin_line": 303,
      "end_line": 307,
      "comment": "",
      "child_ranges": [
        "(line 305,col 17)-(line 305,col 31)",
        "(line 306,col 17)-(line 306,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.Anonymous-8d549feb-2520-43e1-a18f-29b303027ffd.write(byte[], int, int)",
      "begin_line": 309,
      "end_line": 314,
      "comment": "",
      "child_ranges": [
        "(line 312,col 17)-(line 312,col 41)",
        "(line 313,col 17)-(line 313,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.getContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 318,
      "end_line": 321,
      "comment": "",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 85)",
        "(line 320,col 9)-(line 320,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeHeader(java.io.DataOutput)",
      "begin_line": 323,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 34)",
        "(line 326,col 9)-(line 326,col 43)",
        "(line 327,col 9)-(line 327,col 33)",
        "(line 328,col 9)-(line 328,col 31)",
        "(line 329,col 9)-(line 329,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeStreamsInfo(java.io.DataOutput)",
      "begin_line": 332,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 333,col 9)-(line 336,col 9)",
        "(line 338,col 9)-(line 338,col 36)",
        "(line 340,col 9)-(line 340,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writePackInfo(java.io.DataOutput)",
      "begin_line": 343,
      "end_line": 365,
      "comment": "",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 36)",
        "(line 346,col 9)-(line 346,col 31)",
        "(line 347,col 9)-(line 347,col 62)",
        "(line 349,col 9)-(line 349,col 32)",
        "(line 350,col 9)-(line 354,col 9)",
        "(line 356,col 9)-(line 356,col 31)",
        "(line 357,col 9)-(line 357,col 24)",
        "(line 358,col 9)-(line 362,col 9)",
        "(line 364,col 9)-(line 364,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUnpackInfo(java.io.DataOutput)",
      "begin_line": 367,
      "end_line": 401,
      "comment": "",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 38)",
        "(line 370,col 9)-(line 370,col 34)",
        "(line 371,col 9)-(line 371,col 48)",
        "(line 372,col 9)-(line 372,col 24)",
        "(line 373,col 9)-(line 377,col 9)",
        "(line 379,col 9)-(line 379,col 44)",
        "(line 380,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 31)",
        "(line 393,col 9)-(line 393,col 24)",
        "(line 394,col 9)-(line 398,col 9)",
        "(line 400,col 9)-(line 400,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFolder(java.io.DataOutput, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 403,
      "end_line": 417,
      "comment": "",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 64)",
        "(line 405,col 9)-(line 405,col 26)",
        "(line 406,col 9)-(line 409,col 9)",
        "(line 411,col 9)-(line 411,col 39)",
        "(line 412,col 9)-(line 412,col 40)",
        "(line 413,col 9)-(line 416,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSingleCodec(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration, java.io.OutputStream)",
      "begin_line": 419,
      "end_line": 435,
      "comment": "",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 42)",
        "(line 421,col 9)-(line 422,col 52)",
        "(line 424,col 9)-(line 424,col 35)",
        "(line 425,col 9)-(line 427,col 9)",
        "(line 428,col 9)-(line 428,col 30)",
        "(line 429,col 9)-(line 429,col 22)",
        "(line 431,col 9)-(line 434,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeSubStreamsInfo(java.io.DataOutput)",
      "begin_line": 437,
      "end_line": 449,
      "comment": "",
      "child_ranges": [
        "(line 438,col 9)-(line 438,col 42)",
        "(line 448,col 9)-(line 448,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFilesInfo(java.io.DataOutput)",
      "begin_line": 451,
      "end_line": 465,
      "comment": "",
      "child_ranges": [
        "(line 452,col 9)-(line 452,col 37)",
        "(line 454,col 9)-(line 454,col 42)",
        "(line 456,col 9)-(line 456,col 38)",
        "(line 457,col 9)-(line 457,col 36)",
        "(line 458,col 9)-(line 458,col 35)",
        "(line 459,col 9)-(line 459,col 31)",
        "(line 460,col 9)-(line 460,col 32)",
        "(line 461,col 9)-(line 461,col 32)",
        "(line 462,col 9)-(line 462,col 32)",
        "(line 463,col 9)-(line 463,col 43)",
        "(line 464,col 9)-(line 464,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyStreams(java.io.DataOutput)",
      "begin_line": 467,
      "end_line": 489,
      "comment": "",
      "child_ranges": [
        "(line 468,col 9)-(line 468,col 40)",
        "(line 469,col 9)-(line 474,col 9)",
        "(line 475,col 9)-(line 488,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileEmptyFiles(java.io.DataOutput)",
      "begin_line": 491,
      "end_line": 512,
      "comment": "",
      "child_ranges": [
        "(line 492,col 9)-(line 492,col 38)",
        "(line 493,col 9)-(line 493,col 35)",
        "(line 494,col 9)-(line 494,col 48)",
        "(line 495,col 9)-(line 501,col 9)",
        "(line 502,col 9)-(line 511,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileAntiItems(java.io.DataOutput)",
      "begin_line": 514,
      "end_line": 535,
      "comment": "",
      "child_ranges": [
        "(line 515,col 9)-(line 515,col 37)",
        "(line 516,col 9)-(line 516,col 47)",
        "(line 517,col 9)-(line 517,col 32)",
        "(line 518,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 534,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileNames(java.io.DataOutput)",
      "begin_line": 537,
      "end_line": 551,
      "comment": "",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 32)",
        "(line 540,col 9)-(line 540,col 71)",
        "(line 541,col 9)-(line 541,col 64)",
        "(line 542,col 9)-(line 542,col 21)",
        "(line 543,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 20)",
        "(line 548,col 9)-(line 548,col 51)",
        "(line 549,col 9)-(line 549,col 45)",
        "(line 550,col 9)-(line 550,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileCTimes(java.io.DataOutput)",
      "begin_line": 553,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 33)",
        "(line 555,col 9)-(line 559,col 9)",
        "(line 560,col 9)-(line 586,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileATimes(java.io.DataOutput)",
      "begin_line": 589,
      "end_line": 623,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 31)",
        "(line 591,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 622,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileMTimes(java.io.DataOutput)",
      "begin_line": 625,
      "end_line": 659,
      "comment": "",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 37)",
        "(line 627,col 9)-(line 631,col 9)",
        "(line 632,col 9)-(line 658,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeFileWindowsAttributes(java.io.DataOutput)",
      "begin_line": 661,
      "end_line": 694,
      "comment": "",
      "child_ranges": [
        "(line 662,col 9)-(line 662,col 37)",
        "(line 663,col 9)-(line 667,col 9)",
        "(line 668,col 9)-(line 693,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeUint64(java.io.DataOutput, long)",
      "begin_line": 696,
      "end_line": 713,
      "comment": "",
      "child_ranges": [
        "(line 697,col 9)-(line 697,col 26)",
        "(line 698,col 9)-(line 698,col 24)",
        "(line 699,col 9)-(line 699,col 14)",
        "(line 700,col 9)-(line 707,col 9)",
        "(line 708,col 9)-(line 708,col 32)",
        "(line 709,col 9)-(line 712,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.writeBits(java.io.DataOutput, java.util.BitSet, int)",
      "begin_line": 715,
      "end_line": 729,
      "comment": "",
      "child_ranges": [
        "(line 716,col 9)-(line 716,col 22)",
        "(line 717,col 9)-(line 717,col 22)",
        "(line 718,col 9)-(line 725,col 9)",
        "(line 726,col 9)-(line 728,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.reverse(java.lang.Iterable\u003cT\u003e)",
      "begin_line": 731,
      "end_line": 737,
      "comment": "",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 46)",
        "(line 733,col 9)-(line 735,col 9)",
        "(line 736,col 9)-(line 736,col 17)"
      ]
    },
    {
      "type": "class_interface",
      "name": "OutputStreamWrapper",
      "is_interface": false,
      "parent_types": [
        "java.io.OutputStream"
      ],
      "begin_line": 739,
      "end_line": 769,
      "comment": ""
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(int)",
      "begin_line": 740,
      "end_line": 745,
      "comment": "",
      "child_ranges": [
        "(line 742,col 13)-(line 742,col 26)",
        "(line 743,col 13)-(line 743,col 38)",
        "(line 744,col 13)-(line 744,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[])",
      "begin_line": 747,
      "end_line": 750,
      "comment": "",
      "child_ranges": [
        "(line 749,col 13)-(line 749,col 59)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.write(byte[], int, int)",
      "begin_line": 752,
      "end_line": 758,
      "comment": "",
      "child_ranges": [
        "(line 755,col 13)-(line 755,col 36)",
        "(line 756,col 13)-(line 756,col 48)",
        "(line 757,col 13)-(line 757,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.flush()",
      "begin_line": 760,
      "end_line": 763,
      "comment": "",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.OutputStreamWrapper.close()",
      "begin_line": 765,
      "end_line": 768,
      "comment": "",
      "child_ranges": []
    }
  ]
}