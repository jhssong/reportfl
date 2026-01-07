{
  "filepath": "/tmp/Compress-41b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 73,
      "end_line": 1068,
      "comment": "\n * Reads a 7z file, using SeekableByteChannel under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA, LZMA2, BZIP2, Deflate and AES-256 + SHA-256\n * are supported.\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.\n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "channel"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "password"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deferredBlockStreams"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 86,
      "end_line": 88,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 99,
      "end_line": 102,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 100,col 9)-(line 101,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Reads a SeekableByteChannel as 7z archive\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to read\n     * @throws IOException if reading the archive fails\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel, byte[])",
      "begin_line": 133,
      "end_line": 136,
      "comment": "\n     * Reads a SeekableByteChannel as 7z archive\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel, java.lang.String, byte[])",
      "begin_line": 153,
      "end_line": 156,
      "comment": "\n     * Reads a SeekableByteChannel as 7z archive\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to read\n     * @param filename name of the archive - only used for error reporting\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel, java.lang.String, byte[], boolean)",
      "begin_line": 158,
      "end_line": 177,
      "comment": "",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 161,col 31)",
        "(line 162,col 9)-(line 162,col 33)",
        "(line 163,col 9)-(line 176,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 185,
      "end_line": 187,
      "comment": "\n     * Reads a file as unencrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 193,
      "end_line": 206,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 195,col 9)-(line 205,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 215,
      "end_line": 223,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 216,col 9)-(line 218,col 9)",
        "(line 219,col 9)-(line 219,col 28)",
        "(line 220,col 9)-(line 220,col 74)",
        "(line 221,col 9)-(line 221,col 30)",
        "(line 222,col 9)-(line 222,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getEntries()",
      "begin_line": 238,
      "end_line": 240,
      "comment": "\n     * Returns meta-data of all archive entries.\n     *\n     * \u003cp\u003eThis method only provides meta-data, the entries can not be\n     * used to read the contents, you still need to process all\n     * entries in order using {@link #getNextEntry} for that.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe content methods are only available for entries that have\n     * already been reached via {@link #getNextEntry}.\u003c/p\u003e\n     *\n     * @return meta-data of all archive entries.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 239,col 9)-(line 239,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 242,
      "end_line": 289,
      "comment": "",
      "child_ranges": [
        "(line 243,col 9)-(line 244,col 44)",
        "(line 245,col 9)-(line 245,col 23)",
        "(line 246,col 9)-(line 246,col 45)",
        "(line 247,col 9)-(line 247,col 27)",
        "(line 248,col 9)-(line 250,col 9)",
        "(line 252,col 9)-(line 252,col 51)",
        "(line 253,col 9)-(line 253,col 51)",
        "(line 254,col 9)-(line 257,col 9)",
        "(line 259,col 9)-(line 259,col 63)",
        "(line 260,col 9)-(line 260,col 72)",
        "(line 262,col 9)-(line 262,col 71)",
        "(line 263,col 9)-(line 265,col 9)",
        "(line 266,col 9)-(line 266,col 79)",
        "(line 267,col 9)-(line 267,col 84)",
        "(line 268,col 9)-(line 268,col 23)",
        "(line 269,col 9)-(line 269,col 38)",
        "(line 270,col 9)-(line 270,col 32)",
        "(line 271,col 9)-(line 273,col 9)",
        "(line 275,col 9)-(line 275,col 40)",
        "(line 276,col 9)-(line 276,col 39)",
        "(line 277,col 9)-(line 282,col 9)",
        "(line 283,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 291,
      "end_line": 302,
      "comment": "",
      "child_ranges": [
        "(line 292,col 9)-(line 292,col 58)",
        "(line 295,col 9)-(line 301,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 304,
      "end_line": 330,
      "comment": "",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 42)",
        "(line 307,col 9)-(line 310,col 9)",
        "(line 312,col 9)-(line 315,col 9)",
        "(line 317,col 9)-(line 320,col 9)",
        "(line 322,col 9)-(line 325,col 9)",
        "(line 327,col 9)-(line 329,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.nio.ByteBuffer)",
      "begin_line": 332,
      "end_line": 341,
      "comment": "",
      "child_ranges": [
        "(line 334,col 9)-(line 334,col 42)",
        "(line 335,col 9)-(line 340,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 343,
      "end_line": 372,
      "comment": "",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 41)",
        "(line 348,col 9)-(line 348,col 49)",
        "(line 349,col 9)-(line 349,col 43)",
        "(line 350,col 9)-(line 351,col 18)",
        "(line 353,col 9)-(line 353,col 39)",
        "(line 354,col 9)-(line 355,col 57)",
        "(line 356,col 9)-(line 362,col 9)",
        "(line 363,col 9)-(line 366,col 9)",
        "(line 367,col 9)-(line 367,col 72)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 371,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 374,
      "end_line": 398,
      "comment": "",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 42)",
        "(line 377,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 388,col 9)",
        "(line 390,col 9)-(line 393,col 9)",
        "(line 395,col 9)-(line 397,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 400,
      "end_line": 427,
      "comment": "",
      "child_ranges": [
        "(line 401,col 9)-(line 401,col 45)",
        "(line 402,col 9)-(line 402,col 55)",
        "(line 403,col 9)-(line 403,col 42)",
        "(line 404,col 9)-(line 410,col 9)",
        "(line 412,col 9)-(line 422,col 9)",
        "(line 424,col 9)-(line 426,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 429,
      "end_line": 474,
      "comment": "",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 42)",
        "(line 431,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 434,col 51)",
        "(line 435,col 9)-(line 435,col 61)",
        "(line 436,col 9)-(line 436,col 34)",
        "(line 437,col 9)-(line 437,col 53)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 441,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 445,col 38)",
        "(line 446,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 454,col 9)",
        "(line 456,col 9)-(line 456,col 38)",
        "(line 457,col 9)-(line 469,col 9)",
        "(line 471,col 9)-(line 473,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 476,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 477,col 9)-(line 479,col 9)",
        "(line 480,col 9)-(line 480,col 56)",
        "(line 482,col 9)-(line 482,col 42)",
        "(line 483,col 9)-(line 491,col 9)",
        "(line 493,col 9)-(line 493,col 67)",
        "(line 494,col 9)-(line 494,col 66)",
        "(line 495,col 9)-(line 495,col 63)",
        "(line 496,col 9)-(line 496,col 59)",
        "(line 498,col 9)-(line 498,col 33)",
        "(line 499,col 9)-(line 512,col 9)",
        "(line 513,col 9)-(line 515,col 9)",
        "(line 517,col 9)-(line 517,col 27)",
        "(line 518,col 9)-(line 522,col 9)",
        "(line 524,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 554,col 9)",
        "(line 556,col 9)-(line 556,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.nio.ByteBuffer)",
      "begin_line": 559,
      "end_line": 636,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 43)",
        "(line 562,col 9)-(line 562,col 50)",
        "(line 563,col 9)-(line 563,col 57)",
        "(line 564,col 9)-(line 564,col 32)",
        "(line 565,col 9)-(line 565,col 33)",
        "(line 566,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 31)",
        "(line 597,col 9)-(line 597,col 50)",
        "(line 598,col 9)-(line 598,col 52)",
        "(line 600,col 9)-(line 602,col 9)",
        "(line 603,col 9)-(line 603,col 54)",
        "(line 604,col 9)-(line 604,col 69)",
        "(line 605,col 9)-(line 609,col 9)",
        "(line 610,col 9)-(line 610,col 37)",
        "(line 612,col 9)-(line 614,col 9)",
        "(line 615,col 9)-(line 615,col 68)",
        "(line 616,col 9)-(line 616,col 69)",
        "(line 617,col 9)-(line 632,col 9)",
        "(line 633,col 9)-(line 633,col 45)",
        "(line 635,col 9)-(line 635,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.nio.ByteBuffer, int)",
      "begin_line": 638,
      "end_line": 650,
      "comment": "",
      "child_ranges": [
        "(line 639,col 9)-(line 639,col 58)",
        "(line 640,col 9)-(line 640,col 26)",
        "(line 641,col 9)-(line 648,col 9)",
        "(line 649,col 9)-(line 649,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.nio.ByteBuffer, int)",
      "begin_line": 652,
      "end_line": 665,
      "comment": "",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 45)",
        "(line 654,col 9)-(line 654,col 21)",
        "(line 655,col 9)-(line 655,col 22)",
        "(line 656,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 664,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 667,
      "end_line": 823,
      "comment": "",
      "child_ranges": [
        "(line 668,col 9)-(line 668,col 49)",
        "(line 669,col 9)-(line 669,col 81)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 36)",
        "(line 674,col 9)-(line 674,col 34)",
        "(line 675,col 9)-(line 675,col 29)",
        "(line 676,col 9)-(line 801,col 9)",
        "(line 802,col 9)-(line 802,col 36)",
        "(line 803,col 9)-(line 803,col 33)",
        "(line 804,col 9)-(line 820,col 9)",
        "(line 821,col 9)-(line 821,col 30)",
        "(line 822,col 9)-(line 822,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 825,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 826,col 9)-(line 826,col 52)",
        "(line 828,col 9)-(line 828,col 42)",
        "(line 829,col 9)-(line 829,col 84)",
        "(line 830,col 9)-(line 830,col 67)",
        "(line 831,col 9)-(line 834,col 9)",
        "(line 836,col 9)-(line 836,col 38)",
        "(line 837,col 9)-(line 837,col 90)",
        "(line 838,col 9)-(line 838,col 61)",
        "(line 839,col 9)-(line 842,col 9)",
        "(line 844,col 9)-(line 844,col 61)",
        "(line 845,col 9)-(line 845,col 66)",
        "(line 846,col 9)-(line 846,col 32)",
        "(line 847,col 9)-(line 847,col 44)",
        "(line 848,col 9)-(line 873,col 9)",
        "(line 875,col 9)-(line 875,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 878,
      "end_line": 917,
      "comment": "",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 85)",
        "(line 880,col 9)-(line 885,col 9)",
        "(line 886,col 9)-(line 886,col 73)",
        "(line 887,col 9)-(line 909,col 9)",
        "(line 911,col 9)-(line 911,col 98)",
        "(line 912,col 9)-(line 914,col 9)",
        "(line 916,col 9)-(line 916,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 919,
      "end_line": 943,
      "comment": "",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 39)",
        "(line 922,col 9)-(line 925,col 60)",
        "(line 926,col 9)-(line 926,col 81)",
        "(line 927,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 937,col 41)",
        "(line 938,col 9)-(line 941,col 9)",
        "(line 942,col 9)-(line 942,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 952,
      "end_line": 954,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 953,col 9)-(line 953,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getCurrentStream()",
      "begin_line": 956,
      "end_line": 974,
      "comment": "",
      "child_ranges": [
        "(line 957,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 962,col 9)",
        "(line 964,col 9)-(line 971,col 9)",
        "(line 973,col 9)-(line 973,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 984,
      "end_line": 986,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 998,
      "end_line": 1000,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 999,col 9)-(line 999,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.nio.ByteBuffer)",
      "begin_line": 1002,
      "end_line": 1016,
      "comment": "",
      "child_ranges": [
        "(line 1004,col 9)-(line 1004,col 51)",
        "(line 1005,col 9)-(line 1005,col 24)",
        "(line 1006,col 9)-(line 1006,col 23)",
        "(line 1007,col 9)-(line 1014,col 9)",
        "(line 1015,col 9)-(line 1015,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getUnsignedByte(java.nio.ByteBuffer)",
      "begin_line": 1018,
      "end_line": 1020,
      "comment": "",
      "child_ranges": [
        "(line 1019,col 9)-(line 1019,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 1032,
      "end_line": 1043,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 1033,col 9)-(line 1035,col 9)",
        "(line 1037,col 9)-(line 1041,col 9)",
        "(line 1042,col 9)-(line 1042,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.skipBytesFully(java.nio.ByteBuffer, long)",
      "begin_line": 1045,
      "end_line": 1056,
      "comment": "",
      "child_ranges": [
        "(line 1046,col 9)-(line 1048,col 9)",
        "(line 1049,col 9)-(line 1049,col 39)",
        "(line 1050,col 9)-(line 1050,col 40)",
        "(line 1051,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 52)",
        "(line 1055,col 9)-(line 1055,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFully(java.nio.ByteBuffer)",
      "begin_line": 1058,
      "end_line": 1062,
      "comment": "",
      "child_ranges": [
        "(line 1059,col 9)-(line 1059,col 21)",
        "(line 1060,col 9)-(line 1060,col 40)",
        "(line 1061,col 9)-(line 1061,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.toString()",
      "begin_line": 1064,
      "end_line": 1067,
      "comment": "",
      "child_ranges": [
        "(line 1066,col 7)-(line 1066,col 32)"
      ]
    }
  ]
}