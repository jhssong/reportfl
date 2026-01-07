{
  "filepath": "/tmp/Compress-40b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 69,
      "end_line": 1005,
      "comment": "\n * Reads a 7z file, using RandomAccessFile under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA, LZMA2, BZIP2, Deflate and AES-256 + SHA-256\n * are supported.\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.  \n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "password"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "deferredBlockStreams"
      ],
      "begin_line": 80,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 82,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 95,
      "end_line": 113,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 96,col 9)-(line 96,col 34)",
        "(line 97,col 9)-(line 97,col 56)",
        "(line 98,col 9)-(line 98,col 51)",
        "(line 99,col 9)-(line 112,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 121,
      "end_line": 123,
      "comment": "\n     * Reads a file as unencrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 122,col 9)-(line 122,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 129,
      "end_line": 142,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 141,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 151,
      "end_line": 159,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 152,col 9)-(line 154,col 9)",
        "(line 155,col 9)-(line 155,col 28)",
        "(line 156,col 9)-(line 156,col 74)",
        "(line 157,col 9)-(line 157,col 30)",
        "(line 158,col 9)-(line 158,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getEntries()",
      "begin_line": 174,
      "end_line": 176,
      "comment": "\n     * Returns meta-data of all archive entries.\n     *\n     * \u003cp\u003eThis method only provides meta-data, the entries can not be\n     * used to read the contents, you still need to process all\n     * entries in order using {@link #getNextEntry} for that.\u003c/p\u003e\n     *\n     * \u003cp\u003eThe content methods are only available for entries that have\n     * already been reached via {@link #getNextEntry}.\u003c/p\u003e\n     *\n     * @return meta-data of all archive entries.\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 175,col 9)-(line 175,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 178,
      "end_line": 227,
      "comment": "",
      "child_ranges": [
        "(line 179,col 9)-(line 179,col 45)",
        "(line 180,col 9)-(line 180,col 34)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 57)",
        "(line 186,col 9)-(line 186,col 57)",
        "(line 187,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 87)",
        "(line 193,col 9)-(line 193,col 72)",
        "(line 195,col 9)-(line 195,col 71)",
        "(line 196,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 199,col 72)",
        "(line 200,col 9)-(line 200,col 62)",
        "(line 201,col 9)-(line 201,col 35)",
        "(line 202,col 9)-(line 202,col 38)",
        "(line 203,col 9)-(line 203,col 31)",
        "(line 204,col 9)-(line 206,col 9)",
        "(line 208,col 9)-(line 208,col 85)",
        "(line 209,col 9)-(line 210,col 28)",
        "(line 211,col 9)-(line 211,col 40)",
        "(line 212,col 9)-(line 212,col 59)",
        "(line 213,col 9)-(line 219,col 9)",
        "(line 220,col 9)-(line 225,col 9)",
        "(line 226,col 9)-(line 226,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 229,
      "end_line": 238,
      "comment": "",
      "child_ranges": [
        "(line 230,col 9)-(line 230,col 58)",
        "(line 231,col 9)-(line 237,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 240,
      "end_line": 266,
      "comment": "",
      "child_ranges": [
        "(line 241,col 9)-(line 241,col 44)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 251,col 9)",
        "(line 253,col 9)-(line 256,col 9)",
        "(line 258,col 9)-(line 261,col 9)",
        "(line 263,col 9)-(line 265,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 268,
      "end_line": 277,
      "comment": "",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 44)",
        "(line 271,col 9)-(line 276,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 279,
      "end_line": 308,
      "comment": "",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 41)",
        "(line 284,col 9)-(line 284,col 49)",
        "(line 285,col 9)-(line 285,col 43)",
        "(line 286,col 9)-(line 287,col 18)",
        "(line 289,col 9)-(line 289,col 32)",
        "(line 290,col 9)-(line 291,col 57)",
        "(line 292,col 9)-(line 298,col 9)",
        "(line 299,col 9)-(line 302,col 9)",
        "(line 303,col 9)-(line 303,col 72)",
        "(line 304,col 9)-(line 306,col 9)",
        "(line 307,col 9)-(line 307,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 310,
      "end_line": 334,
      "comment": "",
      "child_ranges": [
        "(line 311,col 9)-(line 311,col 44)",
        "(line 313,col 9)-(line 316,col 9)",
        "(line 318,col 9)-(line 324,col 9)",
        "(line 326,col 9)-(line 329,col 9)",
        "(line 331,col 9)-(line 333,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 336,
      "end_line": 363,
      "comment": "",
      "child_ranges": [
        "(line 337,col 9)-(line 337,col 45)",
        "(line 338,col 9)-(line 338,col 55)",
        "(line 339,col 9)-(line 339,col 44)",
        "(line 340,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 358,col 9)",
        "(line 360,col 9)-(line 362,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 365,
      "end_line": 410,
      "comment": "",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 44)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 370,col 51)",
        "(line 371,col 9)-(line 371,col 61)",
        "(line 372,col 9)-(line 372,col 34)",
        "(line 373,col 9)-(line 373,col 55)",
        "(line 374,col 9)-(line 376,col 9)",
        "(line 377,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 40)",
        "(line 382,col 9)-(line 384,col 9)",
        "(line 385,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 392,col 40)",
        "(line 393,col 9)-(line 405,col 9)",
        "(line 407,col 9)-(line 409,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 412,
      "end_line": 493,
      "comment": "",
      "child_ranges": [
        "(line 413,col 9)-(line 415,col 9)",
        "(line 416,col 9)-(line 416,col 56)",
        "(line 418,col 9)-(line 418,col 44)",
        "(line 419,col 9)-(line 427,col 9)",
        "(line 429,col 9)-(line 429,col 67)",
        "(line 430,col 9)-(line 430,col 66)",
        "(line 431,col 9)-(line 431,col 63)",
        "(line 432,col 9)-(line 432,col 59)",
        "(line 434,col 9)-(line 434,col 33)",
        "(line 435,col 9)-(line 448,col 9)",
        "(line 449,col 9)-(line 451,col 9)",
        "(line 453,col 9)-(line 453,col 27)",
        "(line 454,col 9)-(line 458,col 9)",
        "(line 460,col 9)-(line 486,col 9)",
        "(line 488,col 9)-(line 490,col 9)",
        "(line 492,col 9)-(line 492,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 495,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 43)",
        "(line 498,col 9)-(line 498,col 50)",
        "(line 499,col 9)-(line 499,col 57)",
        "(line 500,col 9)-(line 500,col 32)",
        "(line 501,col 9)-(line 501,col 33)",
        "(line 502,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 31)",
        "(line 533,col 9)-(line 533,col 50)",
        "(line 534,col 9)-(line 534,col 52)",
        "(line 536,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 539,col 54)",
        "(line 540,col 9)-(line 540,col 69)",
        "(line 541,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 37)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 551,col 9)-(line 551,col 68)",
        "(line 552,col 9)-(line 552,col 69)",
        "(line 553,col 9)-(line 568,col 9)",
        "(line 569,col 9)-(line 569,col 45)",
        "(line 571,col 9)-(line 571,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 574,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 60)",
        "(line 576,col 9)-(line 576,col 26)",
        "(line 577,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 588,
      "end_line": 601,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 45)",
        "(line 590,col 9)-(line 590,col 21)",
        "(line 591,col 9)-(line 591,col 22)",
        "(line 592,col 9)-(line 599,col 9)",
        "(line 600,col 9)-(line 600,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 603,
      "end_line": 759,
      "comment": "",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 49)",
        "(line 605,col 9)-(line 605,col 81)",
        "(line 606,col 9)-(line 608,col 9)",
        "(line 609,col 9)-(line 609,col 36)",
        "(line 610,col 9)-(line 610,col 34)",
        "(line 611,col 9)-(line 611,col 29)",
        "(line 612,col 9)-(line 737,col 9)",
        "(line 738,col 9)-(line 738,col 36)",
        "(line 739,col 9)-(line 739,col 33)",
        "(line 740,col 9)-(line 756,col 9)",
        "(line 757,col 9)-(line 757,col 30)",
        "(line 758,col 9)-(line 758,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 761,
      "end_line": 812,
      "comment": "",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 52)",
        "(line 764,col 9)-(line 764,col 42)",
        "(line 765,col 9)-(line 765,col 84)",
        "(line 766,col 9)-(line 766,col 67)",
        "(line 767,col 9)-(line 770,col 9)",
        "(line 772,col 9)-(line 772,col 38)",
        "(line 773,col 9)-(line 773,col 90)",
        "(line 774,col 9)-(line 774,col 61)",
        "(line 775,col 9)-(line 778,col 9)",
        "(line 780,col 9)-(line 780,col 61)",
        "(line 781,col 9)-(line 781,col 66)",
        "(line 782,col 9)-(line 782,col 32)",
        "(line 783,col 9)-(line 783,col 44)",
        "(line 784,col 9)-(line 809,col 9)",
        "(line 811,col 9)-(line 811,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 814,
      "end_line": 853,
      "comment": "",
      "child_ranges": [
        "(line 815,col 9)-(line 815,col 85)",
        "(line 816,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 822,col 73)",
        "(line 823,col 9)-(line 845,col 9)",
        "(line 847,col 9)-(line 847,col 98)",
        "(line 848,col 9)-(line 850,col 9)",
        "(line 852,col 9)-(line 852,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 855,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 857,col 9)-(line 857,col 32)",
        "(line 858,col 9)-(line 861,col 60)",
        "(line 862,col 9)-(line 862,col 81)",
        "(line 863,col 9)-(line 872,col 9)",
        "(line 873,col 9)-(line 873,col 41)",
        "(line 874,col 9)-(line 877,col 9)",
        "(line 878,col 9)-(line 878,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getCurrentStream()",
      "begin_line": 892,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 893,col 9)-(line 895,col 9)",
        "(line 896,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 907,col 9)",
        "(line 909,col 9)-(line 909,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 920,
      "end_line": 922,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 921,col 9)-(line 921,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 934,
      "end_line": 936,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 935,col 9)-(line 935,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 938,
      "end_line": 952,
      "comment": "",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 53)",
        "(line 941,col 9)-(line 941,col 24)",
        "(line 942,col 9)-(line 942,col 23)",
        "(line 943,col 9)-(line 950,col 9)",
        "(line 951,col 9)-(line 951,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 964,
      "end_line": 975,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 965,col 9)-(line 967,col 9)",
        "(line 969,col 9)-(line 973,col 9)",
        "(line 974,col 9)-(line 974,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.skipBytesFully(java.io.DataInput, long)",
      "begin_line": 977,
      "end_line": 999,
      "comment": "",
      "child_ranges": [
        "(line 978,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 981,col 25)",
        "(line 982,col 9)-(line 989,col 9)",
        "(line 990,col 9)-(line 997,col 9)",
        "(line 998,col 9)-(line 998,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.toString()",
      "begin_line": 1001,
      "end_line": 1004,
      "comment": "",
      "child_ranges": [
        "(line 1003,col 7)-(line 1003,col 32)"
      ]
    }
  ]
}