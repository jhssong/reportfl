{
  "filepath": "/tmp/Compress-28b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 67,
      "end_line": 947,
      "comment": "\n * Reads a 7z file, using RandomAccessFile under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA, LZMA2, BZIP2, Deflate and AES-256 + SHA-256\n * are supported.\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.  \n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 68,
      "end_line": 68,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryInputStream"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "password"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 78,
      "end_line": 80,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 91,
      "end_line": 108,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 92,col 9)-(line 92,col 34)",
        "(line 93,col 9)-(line 93,col 56)",
        "(line 94,col 9)-(line 107,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 116,
      "end_line": 118,
      "comment": "\n     * Reads a file as unecrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 117,col 9)-(line 117,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 124,
      "end_line": 136,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 125,col 9)-(line 135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 145,
      "end_line": 153,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 146,col 9)-(line 148,col 9)",
        "(line 149,col 9)-(line 149,col 28)",
        "(line 150,col 9)-(line 150,col 74)",
        "(line 151,col 9)-(line 151,col 30)",
        "(line 152,col 9)-(line 152,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 155,
      "end_line": 204,
      "comment": "",
      "child_ranges": [
        "(line 156,col 9)-(line 156,col 45)",
        "(line 157,col 9)-(line 157,col 34)",
        "(line 158,col 9)-(line 160,col 9)",
        "(line 162,col 9)-(line 162,col 57)",
        "(line 163,col 9)-(line 163,col 57)",
        "(line 164,col 9)-(line 167,col 9)",
        "(line 169,col 9)-(line 169,col 87)",
        "(line 170,col 9)-(line 170,col 72)",
        "(line 172,col 9)-(line 172,col 71)",
        "(line 173,col 9)-(line 175,col 9)",
        "(line 176,col 9)-(line 176,col 72)",
        "(line 177,col 9)-(line 177,col 62)",
        "(line 178,col 9)-(line 178,col 35)",
        "(line 179,col 9)-(line 179,col 38)",
        "(line 180,col 9)-(line 180,col 31)",
        "(line 181,col 9)-(line 183,col 9)",
        "(line 185,col 9)-(line 185,col 85)",
        "(line 186,col 9)-(line 187,col 28)",
        "(line 188,col 9)-(line 188,col 40)",
        "(line 189,col 9)-(line 189,col 59)",
        "(line 190,col 9)-(line 196,col 9)",
        "(line 197,col 9)-(line 202,col 9)",
        "(line 203,col 9)-(line 203,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 206,
      "end_line": 221,
      "comment": "",
      "child_ranges": [
        "(line 207,col 9)-(line 207,col 58)",
        "(line 208,col 9)-(line 208,col 47)",
        "(line 209,col 9)-(line 220,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 223,
      "end_line": 249,
      "comment": "",
      "child_ranges": [
        "(line 224,col 9)-(line 224,col 44)",
        "(line 226,col 9)-(line 229,col 9)",
        "(line 231,col 9)-(line 234,col 9)",
        "(line 236,col 9)-(line 239,col 9)",
        "(line 241,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 248,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 251,
      "end_line": 260,
      "comment": "",
      "child_ranges": [
        "(line 253,col 9)-(line 253,col 44)",
        "(line 254,col 9)-(line 259,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 262,
      "end_line": 293,
      "comment": "",
      "child_ranges": [
        "(line 264,col 9)-(line 264,col 41)",
        "(line 267,col 9)-(line 267,col 49)",
        "(line 268,col 9)-(line 268,col 43)",
        "(line 269,col 9)-(line 270,col 18)",
        "(line 272,col 9)-(line 272,col 32)",
        "(line 273,col 9)-(line 274,col 57)",
        "(line 275,col 9)-(line 280,col 9)",
        "(line 281,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 285,col 72)",
        "(line 286,col 9)-(line 286,col 92)",
        "(line 287,col 9)-(line 291,col 9)",
        "(line 292,col 9)-(line 292,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 295,
      "end_line": 319,
      "comment": "",
      "child_ranges": [
        "(line 296,col 9)-(line 296,col 44)",
        "(line 298,col 9)-(line 301,col 9)",
        "(line 303,col 9)-(line 309,col 9)",
        "(line 311,col 9)-(line 314,col 9)",
        "(line 316,col 9)-(line 318,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 321,
      "end_line": 348,
      "comment": "",
      "child_ranges": [
        "(line 322,col 9)-(line 322,col 45)",
        "(line 323,col 9)-(line 323,col 55)",
        "(line 324,col 9)-(line 324,col 44)",
        "(line 325,col 9)-(line 331,col 9)",
        "(line 333,col 9)-(line 343,col 9)",
        "(line 345,col 9)-(line 347,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 350,
      "end_line": 396,
      "comment": "",
      "child_ranges": [
        "(line 351,col 9)-(line 351,col 44)",
        "(line 352,col 9)-(line 354,col 9)",
        "(line 355,col 9)-(line 355,col 51)",
        "(line 356,col 9)-(line 356,col 61)",
        "(line 357,col 9)-(line 357,col 34)",
        "(line 358,col 9)-(line 358,col 55)",
        "(line 359,col 9)-(line 365,col 9)",
        "(line 367,col 9)-(line 367,col 40)",
        "(line 368,col 9)-(line 370,col 9)",
        "(line 371,col 9)-(line 376,col 9)",
        "(line 378,col 9)-(line 378,col 40)",
        "(line 379,col 9)-(line 391,col 9)",
        "(line 393,col 9)-(line 395,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 398,
      "end_line": 479,
      "comment": "",
      "child_ranges": [
        "(line 399,col 9)-(line 401,col 9)",
        "(line 402,col 9)-(line 402,col 56)",
        "(line 404,col 9)-(line 404,col 44)",
        "(line 405,col 9)-(line 413,col 9)",
        "(line 415,col 9)-(line 415,col 67)",
        "(line 416,col 9)-(line 416,col 66)",
        "(line 417,col 9)-(line 417,col 63)",
        "(line 418,col 9)-(line 418,col 59)",
        "(line 420,col 9)-(line 420,col 33)",
        "(line 421,col 9)-(line 434,col 9)",
        "(line 435,col 9)-(line 437,col 9)",
        "(line 439,col 9)-(line 439,col 27)",
        "(line 440,col 9)-(line 444,col 9)",
        "(line 446,col 9)-(line 472,col 9)",
        "(line 474,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 478,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 481,
      "end_line": 558,
      "comment": "",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 43)",
        "(line 484,col 9)-(line 484,col 50)",
        "(line 485,col 9)-(line 485,col 57)",
        "(line 486,col 9)-(line 486,col 32)",
        "(line 487,col 9)-(line 487,col 33)",
        "(line 488,col 9)-(line 517,col 9)",
        "(line 518,col 9)-(line 518,col 31)",
        "(line 519,col 9)-(line 519,col 50)",
        "(line 520,col 9)-(line 520,col 52)",
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 54)",
        "(line 526,col 9)-(line 526,col 69)",
        "(line 527,col 9)-(line 531,col 9)",
        "(line 532,col 9)-(line 532,col 37)",
        "(line 534,col 9)-(line 536,col 9)",
        "(line 537,col 9)-(line 537,col 68)",
        "(line 538,col 9)-(line 538,col 69)",
        "(line 539,col 9)-(line 554,col 9)",
        "(line 555,col 9)-(line 555,col 45)",
        "(line 557,col 9)-(line 557,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 560,
      "end_line": 572,
      "comment": "",
      "child_ranges": [
        "(line 561,col 9)-(line 561,col 60)",
        "(line 562,col 9)-(line 562,col 26)",
        "(line 563,col 9)-(line 570,col 9)",
        "(line 571,col 9)-(line 571,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 574,
      "end_line": 587,
      "comment": "",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 45)",
        "(line 576,col 9)-(line 576,col 21)",
        "(line 577,col 9)-(line 577,col 22)",
        "(line 578,col 9)-(line 585,col 9)",
        "(line 586,col 9)-(line 586,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 589,
      "end_line": 742,
      "comment": "",
      "child_ranges": [
        "(line 590,col 9)-(line 590,col 49)",
        "(line 591,col 9)-(line 591,col 81)",
        "(line 592,col 9)-(line 594,col 9)",
        "(line 595,col 9)-(line 595,col 36)",
        "(line 596,col 9)-(line 596,col 34)",
        "(line 597,col 9)-(line 597,col 29)",
        "(line 598,col 9)-(line 720,col 9)",
        "(line 721,col 9)-(line 721,col 36)",
        "(line 722,col 9)-(line 722,col 33)",
        "(line 723,col 9)-(line 739,col 9)",
        "(line 740,col 9)-(line 740,col 30)",
        "(line 741,col 9)-(line 741,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 744,
      "end_line": 795,
      "comment": "",
      "child_ranges": [
        "(line 745,col 9)-(line 745,col 52)",
        "(line 747,col 9)-(line 747,col 42)",
        "(line 748,col 9)-(line 748,col 84)",
        "(line 749,col 9)-(line 749,col 67)",
        "(line 750,col 9)-(line 753,col 9)",
        "(line 755,col 9)-(line 755,col 38)",
        "(line 756,col 9)-(line 756,col 90)",
        "(line 757,col 9)-(line 757,col 61)",
        "(line 758,col 9)-(line 761,col 9)",
        "(line 763,col 9)-(line 763,col 61)",
        "(line 764,col 9)-(line 764,col 66)",
        "(line 765,col 9)-(line 765,col 32)",
        "(line 766,col 9)-(line 766,col 44)",
        "(line 767,col 9)-(line 792,col 9)",
        "(line 794,col 9)-(line 794,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 797,
      "end_line": 831,
      "comment": "",
      "child_ranges": [
        "(line 798,col 9)-(line 798,col 85)",
        "(line 799,col 9)-(line 803,col 9)",
        "(line 804,col 9)-(line 804,col 73)",
        "(line 805,col 9)-(line 821,col 9)",
        "(line 822,col 9)-(line 823,col 58)",
        "(line 824,col 9)-(line 829,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.drainPreviousEntry()",
      "begin_line": 833,
      "end_line": 840,
      "comment": "",
      "child_ranges": [
        "(line 834,col 9)-(line 839,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 842,
      "end_line": 864,
      "comment": "",
      "child_ranges": [
        "(line 844,col 9)-(line 844,col 32)",
        "(line 845,col 9)-(line 846,col 57)",
        "(line 847,col 9)-(line 847,col 100)",
        "(line 848,col 9)-(line 856,col 9)",
        "(line 857,col 9)-(line 857,col 41)",
        "(line 858,col 9)-(line 863,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 873,
      "end_line": 878,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 876,col 9)",
        "(line 877,col 9)-(line 877,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 888,
      "end_line": 890,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 889,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 902,
      "end_line": 907,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 903,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 906,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 909,
      "end_line": 923,
      "comment": "",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 47)",
        "(line 912,col 9)-(line 912,col 24)",
        "(line 913,col 9)-(line 913,col 23)",
        "(line 914,col 9)-(line 921,col 9)",
        "(line 922,col 9)-(line 922,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 935,
      "end_line": 946,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 936,col 9)-(line 938,col 9)",
        "(line 940,col 9)-(line 944,col 9)",
        "(line 945,col 9)-(line 945,col 20)"
      ]
    }
  ]
}