{
  "filepath": "/tmp/Compress-35b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 68,
      "end_line": 986,
      "comment": "\n * Reads a 7z file, using RandomAccessFile under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA, LZMA2, BZIP2, Deflate and AES-256 + SHA-256\n * are supported.\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.  \n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "fileName"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 76,
      "end_line": 76,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryInputStream"
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
        "sevenZSignature"
      ],
      "begin_line": 80,
      "end_line": 82,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 93,
      "end_line": 111,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 94,col 9)-(line 94,col 34)",
        "(line 95,col 9)-(line 95,col 56)",
        "(line 96,col 9)-(line 96,col 51)",
        "(line 97,col 9)-(line 110,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 119,
      "end_line": 121,
      "comment": "\n     * Reads a file as unecrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 120,col 9)-(line 120,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 127,
      "end_line": 139,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 128,col 9)-(line 138,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 148,
      "end_line": 156,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 149,col 9)-(line 151,col 9)",
        "(line 152,col 9)-(line 152,col 28)",
        "(line 153,col 9)-(line 153,col 74)",
        "(line 154,col 9)-(line 154,col 30)",
        "(line 155,col 9)-(line 155,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 158,
      "end_line": 207,
      "comment": "",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 45)",
        "(line 160,col 9)-(line 160,col 34)",
        "(line 161,col 9)-(line 163,col 9)",
        "(line 165,col 9)-(line 165,col 57)",
        "(line 166,col 9)-(line 166,col 57)",
        "(line 167,col 9)-(line 170,col 9)",
        "(line 172,col 9)-(line 172,col 87)",
        "(line 173,col 9)-(line 173,col 72)",
        "(line 175,col 9)-(line 175,col 71)",
        "(line 176,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 179,col 72)",
        "(line 180,col 9)-(line 180,col 62)",
        "(line 181,col 9)-(line 181,col 35)",
        "(line 182,col 9)-(line 182,col 38)",
        "(line 183,col 9)-(line 183,col 31)",
        "(line 184,col 9)-(line 186,col 9)",
        "(line 188,col 9)-(line 188,col 85)",
        "(line 189,col 9)-(line 190,col 28)",
        "(line 191,col 9)-(line 191,col 40)",
        "(line 192,col 9)-(line 192,col 59)",
        "(line 193,col 9)-(line 199,col 9)",
        "(line 200,col 9)-(line 205,col 9)",
        "(line 206,col 9)-(line 206,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 209,
      "end_line": 224,
      "comment": "",
      "child_ranges": [
        "(line 210,col 9)-(line 210,col 58)",
        "(line 211,col 9)-(line 211,col 47)",
        "(line 212,col 9)-(line 223,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 226,
      "end_line": 252,
      "comment": "",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 44)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 234,col 9)-(line 237,col 9)",
        "(line 239,col 9)-(line 242,col 9)",
        "(line 244,col 9)-(line 247,col 9)",
        "(line 249,col 9)-(line 251,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 254,
      "end_line": 263,
      "comment": "",
      "child_ranges": [
        "(line 256,col 9)-(line 256,col 44)",
        "(line 257,col 9)-(line 262,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 265,
      "end_line": 297,
      "comment": "",
      "child_ranges": [
        "(line 267,col 9)-(line 267,col 41)",
        "(line 270,col 9)-(line 270,col 49)",
        "(line 271,col 9)-(line 271,col 43)",
        "(line 272,col 9)-(line 273,col 18)",
        "(line 275,col 9)-(line 275,col 32)",
        "(line 276,col 9)-(line 277,col 57)",
        "(line 278,col 9)-(line 284,col 9)",
        "(line 285,col 9)-(line 288,col 9)",
        "(line 289,col 9)-(line 289,col 72)",
        "(line 290,col 9)-(line 290,col 92)",
        "(line 291,col 9)-(line 295,col 9)",
        "(line 296,col 9)-(line 296,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 299,
      "end_line": 323,
      "comment": "",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 44)",
        "(line 302,col 9)-(line 305,col 9)",
        "(line 307,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 318,col 9)",
        "(line 320,col 9)-(line 322,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 325,
      "end_line": 352,
      "comment": "",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 45)",
        "(line 327,col 9)-(line 327,col 55)",
        "(line 328,col 9)-(line 328,col 44)",
        "(line 329,col 9)-(line 335,col 9)",
        "(line 337,col 9)-(line 347,col 9)",
        "(line 349,col 9)-(line 351,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 354,
      "end_line": 400,
      "comment": "",
      "child_ranges": [
        "(line 355,col 9)-(line 355,col 44)",
        "(line 356,col 9)-(line 358,col 9)",
        "(line 359,col 9)-(line 359,col 51)",
        "(line 360,col 9)-(line 360,col 61)",
        "(line 361,col 9)-(line 361,col 34)",
        "(line 362,col 9)-(line 362,col 55)",
        "(line 363,col 9)-(line 369,col 9)",
        "(line 371,col 9)-(line 371,col 40)",
        "(line 372,col 9)-(line 374,col 9)",
        "(line 375,col 9)-(line 380,col 9)",
        "(line 382,col 9)-(line 382,col 40)",
        "(line 383,col 9)-(line 395,col 9)",
        "(line 397,col 9)-(line 399,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 402,
      "end_line": 483,
      "comment": "",
      "child_ranges": [
        "(line 403,col 9)-(line 405,col 9)",
        "(line 406,col 9)-(line 406,col 56)",
        "(line 408,col 9)-(line 408,col 44)",
        "(line 409,col 9)-(line 417,col 9)",
        "(line 419,col 9)-(line 419,col 67)",
        "(line 420,col 9)-(line 420,col 66)",
        "(line 421,col 9)-(line 421,col 63)",
        "(line 422,col 9)-(line 422,col 59)",
        "(line 424,col 9)-(line 424,col 33)",
        "(line 425,col 9)-(line 438,col 9)",
        "(line 439,col 9)-(line 441,col 9)",
        "(line 443,col 9)-(line 443,col 27)",
        "(line 444,col 9)-(line 448,col 9)",
        "(line 450,col 9)-(line 476,col 9)",
        "(line 478,col 9)-(line 480,col 9)",
        "(line 482,col 9)-(line 482,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 485,
      "end_line": 562,
      "comment": "",
      "child_ranges": [
        "(line 486,col 9)-(line 486,col 43)",
        "(line 488,col 9)-(line 488,col 50)",
        "(line 489,col 9)-(line 489,col 57)",
        "(line 490,col 9)-(line 490,col 32)",
        "(line 491,col 9)-(line 491,col 33)",
        "(line 492,col 9)-(line 521,col 9)",
        "(line 522,col 9)-(line 522,col 31)",
        "(line 523,col 9)-(line 523,col 50)",
        "(line 524,col 9)-(line 524,col 52)",
        "(line 526,col 9)-(line 528,col 9)",
        "(line 529,col 9)-(line 529,col 54)",
        "(line 530,col 9)-(line 530,col 69)",
        "(line 531,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 37)",
        "(line 538,col 9)-(line 540,col 9)",
        "(line 541,col 9)-(line 541,col 68)",
        "(line 542,col 9)-(line 542,col 69)",
        "(line 543,col 9)-(line 558,col 9)",
        "(line 559,col 9)-(line 559,col 45)",
        "(line 561,col 9)-(line 561,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 564,
      "end_line": 576,
      "comment": "",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 60)",
        "(line 566,col 9)-(line 566,col 26)",
        "(line 567,col 9)-(line 574,col 9)",
        "(line 575,col 9)-(line 575,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 578,
      "end_line": 591,
      "comment": "",
      "child_ranges": [
        "(line 579,col 9)-(line 579,col 45)",
        "(line 580,col 9)-(line 580,col 21)",
        "(line 581,col 9)-(line 581,col 22)",
        "(line 582,col 9)-(line 589,col 9)",
        "(line 590,col 9)-(line 590,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 593,
      "end_line": 754,
      "comment": "",
      "child_ranges": [
        "(line 594,col 9)-(line 594,col 49)",
        "(line 595,col 9)-(line 595,col 81)",
        "(line 596,col 9)-(line 598,col 9)",
        "(line 599,col 9)-(line 599,col 36)",
        "(line 600,col 9)-(line 600,col 34)",
        "(line 601,col 9)-(line 601,col 29)",
        "(line 602,col 9)-(line 732,col 9)",
        "(line 733,col 9)-(line 733,col 36)",
        "(line 734,col 9)-(line 734,col 33)",
        "(line 735,col 9)-(line 751,col 9)",
        "(line 752,col 9)-(line 752,col 30)",
        "(line 753,col 9)-(line 753,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 756,
      "end_line": 807,
      "comment": "",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 52)",
        "(line 759,col 9)-(line 759,col 42)",
        "(line 760,col 9)-(line 760,col 84)",
        "(line 761,col 9)-(line 761,col 67)",
        "(line 762,col 9)-(line 765,col 9)",
        "(line 767,col 9)-(line 767,col 38)",
        "(line 768,col 9)-(line 768,col 90)",
        "(line 769,col 9)-(line 769,col 61)",
        "(line 770,col 9)-(line 773,col 9)",
        "(line 775,col 9)-(line 775,col 61)",
        "(line 776,col 9)-(line 776,col 66)",
        "(line 777,col 9)-(line 777,col 32)",
        "(line 778,col 9)-(line 778,col 44)",
        "(line 779,col 9)-(line 804,col 9)",
        "(line 806,col 9)-(line 806,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 809,
      "end_line": 843,
      "comment": "",
      "child_ranges": [
        "(line 810,col 9)-(line 810,col 85)",
        "(line 811,col 9)-(line 815,col 9)",
        "(line 816,col 9)-(line 816,col 73)",
        "(line 817,col 9)-(line 833,col 9)",
        "(line 834,col 9)-(line 835,col 58)",
        "(line 836,col 9)-(line 841,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.drainPreviousEntry()",
      "begin_line": 845,
      "end_line": 852,
      "comment": "",
      "child_ranges": [
        "(line 846,col 9)-(line 851,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry)",
      "begin_line": 854,
      "end_line": 879,
      "comment": "",
      "child_ranges": [
        "(line 856,col 9)-(line 856,col 32)",
        "(line 857,col 9)-(line 860,col 60)",
        "(line 861,col 9)-(line 861,col 100)",
        "(line 862,col 9)-(line 871,col 9)",
        "(line 872,col 9)-(line 872,col 41)",
        "(line 873,col 9)-(line 878,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 888,
      "end_line": 893,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 889,col 9)-(line 891,col 9)",
        "(line 892,col 9)-(line 892,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 903,
      "end_line": 905,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 904,col 9)-(line 904,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 917,
      "end_line": 922,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 920,col 9)",
        "(line 921,col 9)-(line 921,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 924,
      "end_line": 938,
      "comment": "",
      "child_ranges": [
        "(line 926,col 9)-(line 926,col 47)",
        "(line 927,col 9)-(line 927,col 24)",
        "(line 928,col 9)-(line 928,col 23)",
        "(line 929,col 9)-(line 936,col 9)",
        "(line 937,col 9)-(line 937,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.matches(byte[], int)",
      "begin_line": 950,
      "end_line": 961,
      "comment": "\n     * Checks if the signature matches what is expected for a 7z file.\n     *\n     * @param signature\n     *            the bytes to check\n     * @param length\n     *            the number of bytes to check\n     * @return true, if this is the signature of a 7z archive.\n     * @since 1.8\n     ",
      "child_ranges": [
        "(line 951,col 9)-(line 953,col 9)",
        "(line 955,col 9)-(line 959,col 9)",
        "(line 960,col 9)-(line 960,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.skipBytesFully(java.io.DataInput, long)",
      "begin_line": 963,
      "end_line": 985,
      "comment": "",
      "child_ranges": [
        "(line 964,col 9)-(line 966,col 9)",
        "(line 967,col 9)-(line 967,col 25)",
        "(line 968,col 9)-(line 975,col 9)",
        "(line 976,col 9)-(line 983,col 9)",
        "(line 984,col 9)-(line 984,col 23)"
      ]
    }
  ]
}