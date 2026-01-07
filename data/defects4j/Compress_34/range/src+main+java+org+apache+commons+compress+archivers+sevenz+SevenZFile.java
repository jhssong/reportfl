{
  "filepath": "/tmp/Compress-34b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 67,
      "end_line": 983,
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
        "fileName"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryInputStream"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "password"
      ],
      "begin_line": 77,
      "end_line": 77,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 79,
      "end_line": 81,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 92,
      "end_line": 110,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 93,col 9)-(line 93,col 34)",
        "(line 94,col 9)-(line 94,col 56)",
        "(line 95,col 9)-(line 95,col 51)",
        "(line 96,col 9)-(line 109,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 118,
      "end_line": 120,
      "comment": "\n     * Reads a file as unecrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 119,col 9)-(line 119,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 126,
      "end_line": 138,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 127,col 9)-(line 137,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 147,
      "end_line": 155,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 148,col 9)-(line 150,col 9)",
        "(line 151,col 9)-(line 151,col 28)",
        "(line 152,col 9)-(line 152,col 74)",
        "(line 153,col 9)-(line 153,col 30)",
        "(line 154,col 9)-(line 154,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 157,
      "end_line": 206,
      "comment": "",
      "child_ranges": [
        "(line 158,col 9)-(line 158,col 45)",
        "(line 159,col 9)-(line 159,col 34)",
        "(line 160,col 9)-(line 162,col 9)",
        "(line 164,col 9)-(line 164,col 57)",
        "(line 165,col 9)-(line 165,col 57)",
        "(line 166,col 9)-(line 169,col 9)",
        "(line 171,col 9)-(line 171,col 87)",
        "(line 172,col 9)-(line 172,col 72)",
        "(line 174,col 9)-(line 174,col 71)",
        "(line 175,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 178,col 72)",
        "(line 179,col 9)-(line 179,col 62)",
        "(line 180,col 9)-(line 180,col 35)",
        "(line 181,col 9)-(line 181,col 38)",
        "(line 182,col 9)-(line 182,col 31)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 85)",
        "(line 188,col 9)-(line 189,col 28)",
        "(line 190,col 9)-(line 190,col 40)",
        "(line 191,col 9)-(line 191,col 59)",
        "(line 192,col 9)-(line 198,col 9)",
        "(line 199,col 9)-(line 204,col 9)",
        "(line 205,col 9)-(line 205,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 208,
      "end_line": 223,
      "comment": "",
      "child_ranges": [
        "(line 209,col 9)-(line 209,col 58)",
        "(line 210,col 9)-(line 210,col 47)",
        "(line 211,col 9)-(line 222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 225,
      "end_line": 251,
      "comment": "",
      "child_ranges": [
        "(line 226,col 9)-(line 226,col 44)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 233,col 9)-(line 236,col 9)",
        "(line 238,col 9)-(line 241,col 9)",
        "(line 243,col 9)-(line 246,col 9)",
        "(line 248,col 9)-(line 250,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 253,
      "end_line": 262,
      "comment": "",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 44)",
        "(line 256,col 9)-(line 261,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 264,
      "end_line": 296,
      "comment": "",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 41)",
        "(line 269,col 9)-(line 269,col 49)",
        "(line 270,col 9)-(line 270,col 43)",
        "(line 271,col 9)-(line 272,col 18)",
        "(line 274,col 9)-(line 274,col 32)",
        "(line 275,col 9)-(line 276,col 57)",
        "(line 277,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 287,col 9)",
        "(line 288,col 9)-(line 288,col 72)",
        "(line 289,col 9)-(line 289,col 92)",
        "(line 290,col 9)-(line 294,col 9)",
        "(line 295,col 9)-(line 295,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 298,
      "end_line": 322,
      "comment": "",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 44)",
        "(line 301,col 9)-(line 304,col 9)",
        "(line 306,col 9)-(line 312,col 9)",
        "(line 314,col 9)-(line 317,col 9)",
        "(line 319,col 9)-(line 321,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 324,
      "end_line": 351,
      "comment": "",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 45)",
        "(line 326,col 9)-(line 326,col 55)",
        "(line 327,col 9)-(line 327,col 44)",
        "(line 328,col 9)-(line 334,col 9)",
        "(line 336,col 9)-(line 346,col 9)",
        "(line 348,col 9)-(line 350,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 353,
      "end_line": 399,
      "comment": "",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 44)",
        "(line 355,col 9)-(line 357,col 9)",
        "(line 358,col 9)-(line 358,col 51)",
        "(line 359,col 9)-(line 359,col 61)",
        "(line 360,col 9)-(line 360,col 34)",
        "(line 361,col 9)-(line 361,col 55)",
        "(line 362,col 9)-(line 368,col 9)",
        "(line 370,col 9)-(line 370,col 40)",
        "(line 371,col 9)-(line 373,col 9)",
        "(line 374,col 9)-(line 379,col 9)",
        "(line 381,col 9)-(line 381,col 40)",
        "(line 382,col 9)-(line 394,col 9)",
        "(line 396,col 9)-(line 398,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 401,
      "end_line": 482,
      "comment": "",
      "child_ranges": [
        "(line 402,col 9)-(line 404,col 9)",
        "(line 405,col 9)-(line 405,col 56)",
        "(line 407,col 9)-(line 407,col 44)",
        "(line 408,col 9)-(line 416,col 9)",
        "(line 418,col 9)-(line 418,col 67)",
        "(line 419,col 9)-(line 419,col 66)",
        "(line 420,col 9)-(line 420,col 63)",
        "(line 421,col 9)-(line 421,col 59)",
        "(line 423,col 9)-(line 423,col 33)",
        "(line 424,col 9)-(line 437,col 9)",
        "(line 438,col 9)-(line 440,col 9)",
        "(line 442,col 9)-(line 442,col 27)",
        "(line 443,col 9)-(line 447,col 9)",
        "(line 449,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 479,col 9)",
        "(line 481,col 9)-(line 481,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 484,
      "end_line": 561,
      "comment": "",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 43)",
        "(line 487,col 9)-(line 487,col 50)",
        "(line 488,col 9)-(line 488,col 57)",
        "(line 489,col 9)-(line 489,col 32)",
        "(line 490,col 9)-(line 490,col 33)",
        "(line 491,col 9)-(line 520,col 9)",
        "(line 521,col 9)-(line 521,col 31)",
        "(line 522,col 9)-(line 522,col 50)",
        "(line 523,col 9)-(line 523,col 52)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 528,col 9)-(line 528,col 54)",
        "(line 529,col 9)-(line 529,col 69)",
        "(line 530,col 9)-(line 534,col 9)",
        "(line 535,col 9)-(line 535,col 37)",
        "(line 537,col 9)-(line 539,col 9)",
        "(line 540,col 9)-(line 540,col 68)",
        "(line 541,col 9)-(line 541,col 69)",
        "(line 542,col 9)-(line 557,col 9)",
        "(line 558,col 9)-(line 558,col 45)",
        "(line 560,col 9)-(line 560,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 563,
      "end_line": 575,
      "comment": "",
      "child_ranges": [
        "(line 564,col 9)-(line 564,col 60)",
        "(line 565,col 9)-(line 565,col 26)",
        "(line 566,col 9)-(line 573,col 9)",
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 577,
      "end_line": 590,
      "comment": "",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 45)",
        "(line 579,col 9)-(line 579,col 21)",
        "(line 580,col 9)-(line 580,col 22)",
        "(line 581,col 9)-(line 588,col 9)",
        "(line 589,col 9)-(line 589,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 592,
      "end_line": 753,
      "comment": "",
      "child_ranges": [
        "(line 593,col 9)-(line 593,col 49)",
        "(line 594,col 9)-(line 594,col 81)",
        "(line 595,col 9)-(line 597,col 9)",
        "(line 598,col 9)-(line 598,col 36)",
        "(line 599,col 9)-(line 599,col 34)",
        "(line 600,col 9)-(line 600,col 29)",
        "(line 601,col 9)-(line 731,col 9)",
        "(line 732,col 9)-(line 732,col 36)",
        "(line 733,col 9)-(line 733,col 33)",
        "(line 734,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 751,col 30)",
        "(line 752,col 9)-(line 752,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 755,
      "end_line": 806,
      "comment": "",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 52)",
        "(line 758,col 9)-(line 758,col 42)",
        "(line 759,col 9)-(line 759,col 84)",
        "(line 760,col 9)-(line 760,col 67)",
        "(line 761,col 9)-(line 764,col 9)",
        "(line 766,col 9)-(line 766,col 38)",
        "(line 767,col 9)-(line 767,col 90)",
        "(line 768,col 9)-(line 768,col 61)",
        "(line 769,col 9)-(line 772,col 9)",
        "(line 774,col 9)-(line 774,col 61)",
        "(line 775,col 9)-(line 775,col 66)",
        "(line 776,col 9)-(line 776,col 32)",
        "(line 777,col 9)-(line 777,col 44)",
        "(line 778,col 9)-(line 803,col 9)",
        "(line 805,col 9)-(line 805,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 808,
      "end_line": 842,
      "comment": "",
      "child_ranges": [
        "(line 809,col 9)-(line 809,col 85)",
        "(line 810,col 9)-(line 814,col 9)",
        "(line 815,col 9)-(line 815,col 73)",
        "(line 816,col 9)-(line 832,col 9)",
        "(line 833,col 9)-(line 834,col 58)",
        "(line 835,col 9)-(line 840,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.drainPreviousEntry()",
      "begin_line": 844,
      "end_line": 851,
      "comment": "",
      "child_ranges": [
        "(line 845,col 9)-(line 850,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 853,
      "end_line": 876,
      "comment": "",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 32)",
        "(line 856,col 9)-(line 857,col 57)",
        "(line 858,col 9)-(line 858,col 100)",
        "(line 859,col 9)-(line 868,col 9)",
        "(line 869,col 9)-(line 869,col 41)",
        "(line 870,col 9)-(line 875,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 885,
      "end_line": 890,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 886,col 9)-(line 888,col 9)",
        "(line 889,col 9)-(line 889,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 900,
      "end_line": 902,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 901,col 9)-(line 901,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 914,
      "end_line": 919,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 915,col 9)-(line 917,col 9)",
        "(line 918,col 9)-(line 918,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 921,
      "end_line": 935,
      "comment": "",
      "child_ranges": [
        "(line 923,col 9)-(line 923,col 47)",
        "(line 924,col 9)-(line 924,col 24)",
        "(line 925,col 9)-(line 925,col 23)",
        "(line 926,col 9)-(line 933,col 9)",
        "(line 934,col 9)-(line 934,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 947,
      "end_line": 958,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 948,col 9)-(line 950,col 9)",
        "(line 952,col 9)-(line 956,col 9)",
        "(line 957,col 9)-(line 957,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.skipBytesFully(java.io.DataInput, long)",
      "begin_line": 960,
      "end_line": 982,
      "comment": "",
      "child_ranges": [
        "(line 961,col 9)-(line 963,col 9)",
        "(line 964,col 9)-(line 964,col 25)",
        "(line 965,col 9)-(line 972,col 9)",
        "(line 973,col 9)-(line 980,col 9)",
        "(line 981,col 9)-(line 981,col 23)"
      ]
    }
  ]
}