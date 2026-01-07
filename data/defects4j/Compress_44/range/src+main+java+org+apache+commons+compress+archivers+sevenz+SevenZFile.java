{
  "filepath": "/tmp/Compress-44b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 73,
      "end_line": 1069,
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
      "begin_line": 87,
      "end_line": 89,
      "comment": " shared with SevenZOutputFile and tests, neither mutates it"
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 100,
      "end_line": 103,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 101,col 9)-(line 102,col 57)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Reads a SeekableByteChannel as 7z archive\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to read\n     * @throws IOException if reading the archive fails\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 47)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel, byte[])",
      "begin_line": 134,
      "end_line": 137,
      "comment": "\n     * Reads a SeekableByteChannel as 7z archive\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 51)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel, java.lang.String, byte[])",
      "begin_line": 154,
      "end_line": 157,
      "comment": "\n     * Reads a SeekableByteChannel as 7z archive\n     *\n     * \u003cp\u003e{@link\n     * org.apache.commons.compress.utils.SeekableInMemoryByteChannel}\n     * allows you to read from an in-memory archive.\u003c/p\u003e\n     *\n     * @param channel the channel to read\n     * @param filename name of the archive - only used for error reporting\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     * @since 1.13\n     ",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 49)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.nio.channels.SeekableByteChannel, java.lang.String, byte[], boolean)",
      "begin_line": 159,
      "end_line": 178,
      "comment": "",
      "child_ranges": [
        "(line 161,col 9)-(line 161,col 34)",
        "(line 162,col 9)-(line 162,col 31)",
        "(line 163,col 9)-(line 163,col 33)",
        "(line 164,col 9)-(line 177,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 186,
      "end_line": 188,
      "comment": "\n     * Reads a file as unencrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 187,col 9)-(line 187,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 194,
      "end_line": 207,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 196,col 9)-(line 206,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 216,
      "end_line": 224,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 220,col 28)",
        "(line 221,col 9)-(line 221,col 74)",
        "(line 222,col 9)-(line 222,col 30)",
        "(line 223,col 9)-(line 223,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getEntries()",
      "begin_line": 239,
      "end_line": 241,
      "comment": "\n     * Returns meta-data of all archive entries.\n     *\n     * \u003cp\u003eThis method only provides meta-data, the entries can not be\n     * used to read the contents, you still need to process all\n     * entries in order using {@link #getNextEntry} for that.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe content methods are only available for entries that have\n     * already been reached via {@link #getNextEntry}.\u003c/p\u003e\n     *\n     * @return meta-data of all archive entries.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 240,col 9)-(line 240,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 243,
      "end_line": 290,
      "comment": "",
      "child_ranges": [
        "(line 244,col 9)-(line 245,col 44)",
        "(line 246,col 9)-(line 246,col 23)",
        "(line 247,col 9)-(line 247,col 45)",
        "(line 248,col 9)-(line 248,col 27)",
        "(line 249,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 253,col 51)",
        "(line 254,col 9)-(line 254,col 51)",
        "(line 255,col 9)-(line 258,col 9)",
        "(line 260,col 9)-(line 260,col 63)",
        "(line 261,col 9)-(line 261,col 72)",
        "(line 263,col 9)-(line 263,col 71)",
        "(line 264,col 9)-(line 266,col 9)",
        "(line 267,col 9)-(line 267,col 79)",
        "(line 268,col 9)-(line 268,col 84)",
        "(line 269,col 9)-(line 269,col 23)",
        "(line 270,col 9)-(line 270,col 38)",
        "(line 271,col 9)-(line 271,col 32)",
        "(line 272,col 9)-(line 274,col 9)",
        "(line 276,col 9)-(line 276,col 40)",
        "(line 277,col 9)-(line 277,col 39)",
        "(line 278,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 292,
      "end_line": 303,
      "comment": "",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 58)",
        "(line 296,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 305,
      "end_line": 331,
      "comment": "",
      "child_ranges": [
        "(line 306,col 9)-(line 306,col 42)",
        "(line 308,col 9)-(line 311,col 9)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 321,col 9)",
        "(line 323,col 9)-(line 326,col 9)",
        "(line 328,col 9)-(line 330,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.nio.ByteBuffer)",
      "begin_line": 333,
      "end_line": 342,
      "comment": "",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 42)",
        "(line 336,col 9)-(line 341,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 344,
      "end_line": 373,
      "comment": "",
      "child_ranges": [
        "(line 346,col 9)-(line 346,col 41)",
        "(line 349,col 9)-(line 349,col 49)",
        "(line 350,col 9)-(line 350,col 43)",
        "(line 351,col 9)-(line 352,col 18)",
        "(line 354,col 9)-(line 354,col 39)",
        "(line 355,col 9)-(line 356,col 57)",
        "(line 357,col 9)-(line 363,col 9)",
        "(line 364,col 9)-(line 367,col 9)",
        "(line 368,col 9)-(line 368,col 72)",
        "(line 369,col 9)-(line 371,col 9)",
        "(line 372,col 9)-(line 372,col 74)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 375,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 376,col 9)-(line 376,col 42)",
        "(line 378,col 9)-(line 381,col 9)",
        "(line 383,col 9)-(line 389,col 9)",
        "(line 391,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 401,
      "end_line": 428,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 45)",
        "(line 403,col 9)-(line 403,col 55)",
        "(line 404,col 9)-(line 404,col 42)",
        "(line 405,col 9)-(line 411,col 9)",
        "(line 413,col 9)-(line 423,col 9)",
        "(line 425,col 9)-(line 427,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 430,
      "end_line": 475,
      "comment": "",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 42)",
        "(line 432,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 435,col 51)",
        "(line 436,col 9)-(line 436,col 61)",
        "(line 437,col 9)-(line 437,col 34)",
        "(line 438,col 9)-(line 438,col 53)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 442,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 446,col 38)",
        "(line 447,col 9)-(line 449,col 9)",
        "(line 450,col 9)-(line 455,col 9)",
        "(line 457,col 9)-(line 457,col 38)",
        "(line 458,col 9)-(line 470,col 9)",
        "(line 472,col 9)-(line 474,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 477,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 478,col 9)-(line 480,col 9)",
        "(line 481,col 9)-(line 481,col 56)",
        "(line 483,col 9)-(line 483,col 42)",
        "(line 484,col 9)-(line 492,col 9)",
        "(line 494,col 9)-(line 494,col 67)",
        "(line 495,col 9)-(line 495,col 66)",
        "(line 496,col 9)-(line 496,col 63)",
        "(line 497,col 9)-(line 497,col 59)",
        "(line 499,col 9)-(line 499,col 33)",
        "(line 500,col 9)-(line 513,col 9)",
        "(line 514,col 9)-(line 516,col 9)",
        "(line 518,col 9)-(line 518,col 27)",
        "(line 519,col 9)-(line 523,col 9)",
        "(line 525,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.nio.ByteBuffer)",
      "begin_line": 560,
      "end_line": 637,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 43)",
        "(line 563,col 9)-(line 563,col 50)",
        "(line 564,col 9)-(line 564,col 57)",
        "(line 565,col 9)-(line 565,col 32)",
        "(line 566,col 9)-(line 566,col 33)",
        "(line 567,col 9)-(line 596,col 9)",
        "(line 597,col 9)-(line 597,col 31)",
        "(line 598,col 9)-(line 598,col 50)",
        "(line 599,col 9)-(line 599,col 52)",
        "(line 601,col 9)-(line 603,col 9)",
        "(line 604,col 9)-(line 604,col 54)",
        "(line 605,col 9)-(line 605,col 69)",
        "(line 606,col 9)-(line 610,col 9)",
        "(line 611,col 9)-(line 611,col 37)",
        "(line 613,col 9)-(line 615,col 9)",
        "(line 616,col 9)-(line 616,col 68)",
        "(line 617,col 9)-(line 617,col 69)",
        "(line 618,col 9)-(line 633,col 9)",
        "(line 634,col 9)-(line 634,col 45)",
        "(line 636,col 9)-(line 636,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.nio.ByteBuffer, int)",
      "begin_line": 639,
      "end_line": 651,
      "comment": "",
      "child_ranges": [
        "(line 640,col 9)-(line 640,col 58)",
        "(line 641,col 9)-(line 641,col 26)",
        "(line 642,col 9)-(line 649,col 9)",
        "(line 650,col 9)-(line 650,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.nio.ByteBuffer, int)",
      "begin_line": 653,
      "end_line": 666,
      "comment": "",
      "child_ranges": [
        "(line 654,col 9)-(line 654,col 45)",
        "(line 655,col 9)-(line 655,col 21)",
        "(line 656,col 9)-(line 656,col 22)",
        "(line 657,col 9)-(line 664,col 9)",
        "(line 665,col 9)-(line 665,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.nio.ByteBuffer, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 668,
      "end_line": 824,
      "comment": "",
      "child_ranges": [
        "(line 669,col 9)-(line 669,col 49)",
        "(line 670,col 9)-(line 670,col 81)",
        "(line 671,col 9)-(line 673,col 9)",
        "(line 674,col 9)-(line 674,col 36)",
        "(line 675,col 9)-(line 675,col 34)",
        "(line 676,col 9)-(line 676,col 29)",
        "(line 677,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 803,col 36)",
        "(line 804,col 9)-(line 804,col 33)",
        "(line 805,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 30)",
        "(line 823,col 9)-(line 823,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 826,
      "end_line": 877,
      "comment": "",
      "child_ranges": [
        "(line 827,col 9)-(line 827,col 52)",
        "(line 829,col 9)-(line 829,col 42)",
        "(line 830,col 9)-(line 830,col 84)",
        "(line 831,col 9)-(line 831,col 67)",
        "(line 832,col 9)-(line 835,col 9)",
        "(line 837,col 9)-(line 837,col 38)",
        "(line 838,col 9)-(line 838,col 90)",
        "(line 839,col 9)-(line 839,col 61)",
        "(line 840,col 9)-(line 843,col 9)",
        "(line 845,col 9)-(line 845,col 61)",
        "(line 846,col 9)-(line 846,col 66)",
        "(line 847,col 9)-(line 847,col 32)",
        "(line 848,col 9)-(line 848,col 44)",
        "(line 849,col 9)-(line 874,col 9)",
        "(line 876,col 9)-(line 876,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 879,
      "end_line": 918,
      "comment": "",
      "child_ranges": [
        "(line 880,col 9)-(line 880,col 85)",
        "(line 881,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 73)",
        "(line 888,col 9)-(line 910,col 9)",
        "(line 912,col 9)-(line 912,col 98)",
        "(line 913,col 9)-(line 915,col 9)",
        "(line 917,col 9)-(line 917,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 920,
      "end_line": 944,
      "comment": "",
      "child_ranges": [
        "(line 922,col 9)-(line 922,col 39)",
        "(line 923,col 9)-(line 926,col 60)",
        "(line 927,col 9)-(line 927,col 81)",
        "(line 928,col 9)-(line 937,col 9)",
        "(line 938,col 9)-(line 938,col 41)",
        "(line 939,col 9)-(line 942,col 9)",
        "(line 943,col 9)-(line 943,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 953,
      "end_line": 955,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 954,col 9)-(line 954,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getCurrentStream()",
      "begin_line": 957,
      "end_line": 975,
      "comment": "",
      "child_ranges": [
        "(line 958,col 9)-(line 960,col 9)",
        "(line 961,col 9)-(line 963,col 9)",
        "(line 965,col 9)-(line 972,col 9)",
        "(line 974,col 9)-(line 974,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 985,
      "end_line": 987,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 986,col 9)-(line 986,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 999,
      "end_line": 1001,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 1000,col 9)-(line 1000,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.nio.ByteBuffer)",
      "begin_line": 1003,
      "end_line": 1017,
      "comment": "",
      "child_ranges": [
        "(line 1005,col 9)-(line 1005,col 51)",
        "(line 1006,col 9)-(line 1006,col 24)",
        "(line 1007,col 9)-(line 1007,col 23)",
        "(line 1008,col 9)-(line 1015,col 9)",
        "(line 1016,col 9)-(line 1016,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getUnsignedByte(java.nio.ByteBuffer)",
      "begin_line": 1019,
      "end_line": 1021,
      "comment": "",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 1033,
      "end_line": 1044,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 1034,col 9)-(line 1036,col 9)",
        "(line 1038,col 9)-(line 1042,col 9)",
        "(line 1043,col 9)-(line 1043,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.skipBytesFully(java.nio.ByteBuffer, long)",
      "begin_line": 1046,
      "end_line": 1057,
      "comment": "",
      "child_ranges": [
        "(line 1047,col 9)-(line 1049,col 9)",
        "(line 1050,col 9)-(line 1050,col 39)",
        "(line 1051,col 9)-(line 1051,col 40)",
        "(line 1052,col 9)-(line 1054,col 9)",
        "(line 1055,col 9)-(line 1055,col 52)",
        "(line 1056,col 9)-(line 1056,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFully(java.nio.ByteBuffer)",
      "begin_line": 1059,
      "end_line": 1063,
      "comment": "",
      "child_ranges": [
        "(line 1060,col 9)-(line 1060,col 21)",
        "(line 1061,col 9)-(line 1061,col 40)",
        "(line 1062,col 9)-(line 1062,col 19)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.toString()",
      "begin_line": 1065,
      "end_line": 1068,
      "comment": "",
      "child_ranges": [
        "(line 1067,col 7)-(line 1067,col 32)"
      ]
    }
  ]
}