{
  "filepath": "/tmp/Compress-24b/src/main/java/org/apache/commons/compress/archivers/sevenz/SevenZFile.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "SevenZFile",
      "is_interface": false,
      "parent_types": [
        "java.io.Closeable"
      ],
      "begin_line": 66,
      "end_line": 911,
      "comment": "\n * Reads a 7z file, using RandomAccessFile under\n * the covers.\n * \u003cp\u003e\n * The 7z file format is a flexible container\n * that can contain many compression and\n * encryption types, but at the moment only\n * only Copy, LZMA, LZMA2, BZIP2, Deflate and AES-256 + SHA-256\n * are supported.\n * \u003cp\u003e\n * The format is very Windows/Intel specific,\n * so it uses little-endian byte order,\n * doesn\u0027t store user/group or permission bits,\n * and represents times using NTFS timestamps\n * (100 nanosecond units since 1 January 1601).\n * Hence the official tools recommend against\n * using it for backup purposes on *nix, and\n * recommend .tar.7z or .tar.lzma or .tar.xz\n * instead.  \n * \u003cp\u003e\n * Both the header and file contents may be\n * compressed and/or encrypted. With both\n * encrypted, neither file names nor file\n * contents can be read, but the use of\n * encryption isn\u0027t plausibly deniable.\n * \n * @NotThreadSafe\n * @since 1.6\n "
    },
    {
      "type": "field",
      "varNames": [
        "SIGNATURE_HEADER_SIZE"
      ],
      "begin_line": 67,
      "end_line": 67,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 69,
      "end_line": 69,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "archive"
      ],
      "begin_line": 70,
      "end_line": 70,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryIndex"
      ],
      "begin_line": 71,
      "end_line": 71,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderIndex"
      ],
      "begin_line": 72,
      "end_line": 72,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentFolderInputStream"
      ],
      "begin_line": 73,
      "end_line": 73,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "currentEntryInputStream"
      ],
      "begin_line": 74,
      "end_line": 74,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "password"
      ],
      "begin_line": 75,
      "end_line": 75,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "sevenZSignature"
      ],
      "begin_line": 77,
      "end_line": 79,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File, byte[])",
      "begin_line": 90,
      "end_line": 107,
      "comment": "\n     * Reads a file as 7z archive\n     *\n     * @param filename the file to read\n     * @param password optional password if the archive is encrypted -\n     * the byte array is supposed to be the UTF16-LE encoded\n     * representation of the password.\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 91,col 9)-(line 91,col 34)",
        "(line 92,col 9)-(line 92,col 56)",
        "(line 93,col 9)-(line 106,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.SevenZFile(java.io.File)",
      "begin_line": 115,
      "end_line": 117,
      "comment": "\n     * Reads a file as unecrypted 7z archive\n     *\n     * @param filename the file to read\n     * @throws IOException if reading the archive fails\n     ",
      "child_ranges": [
        "(line 116,col 9)-(line 116,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.close()",
      "begin_line": 123,
      "end_line": 135,
      "comment": "\n     * Closes the archive.\n     * @throws IOException if closing the file fails\n     ",
      "child_ranges": [
        "(line 124,col 9)-(line 134,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.getNextEntry()",
      "begin_line": 144,
      "end_line": 152,
      "comment": "\n     * Returns the next Archive Entry in this archive.\n     *\n     * @return the next entry,\n     *         or {@code null} if there are no more entries\n     * @throws IOException if the next entry could not be read\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 147,col 9)",
        "(line 148,col 9)-(line 148,col 28)",
        "(line 149,col 9)-(line 149,col 74)",
        "(line 150,col 9)-(line 150,col 30)",
        "(line 151,col 9)-(line 151,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeaders(byte[])",
      "begin_line": 154,
      "end_line": 203,
      "comment": "",
      "child_ranges": [
        "(line 155,col 9)-(line 155,col 45)",
        "(line 156,col 9)-(line 156,col 34)",
        "(line 157,col 9)-(line 159,col 9)",
        "(line 161,col 9)-(line 161,col 57)",
        "(line 162,col 9)-(line 162,col 57)",
        "(line 163,col 9)-(line 166,col 9)",
        "(line 168,col 9)-(line 168,col 87)",
        "(line 169,col 9)-(line 169,col 72)",
        "(line 171,col 9)-(line 171,col 71)",
        "(line 172,col 9)-(line 174,col 9)",
        "(line 175,col 9)-(line 175,col 72)",
        "(line 176,col 9)-(line 176,col 62)",
        "(line 177,col 9)-(line 177,col 35)",
        "(line 178,col 9)-(line 178,col 38)",
        "(line 179,col 9)-(line 179,col 31)",
        "(line 180,col 9)-(line 182,col 9)",
        "(line 184,col 9)-(line 184,col 85)",
        "(line 185,col 9)-(line 186,col 28)",
        "(line 187,col 9)-(line 187,col 40)",
        "(line 188,col 9)-(line 188,col 59)",
        "(line 189,col 9)-(line 195,col 9)",
        "(line 196,col 9)-(line 201,col 9)",
        "(line 202,col 9)-(line 202,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStartHeader(long)",
      "begin_line": 205,
      "end_line": 220,
      "comment": "",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 58)",
        "(line 207,col 9)-(line 207,col 47)",
        "(line 208,col 9)-(line 219,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readHeader(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 222,
      "end_line": 248,
      "comment": "",
      "child_ranges": [
        "(line 223,col 9)-(line 223,col 44)",
        "(line 225,col 9)-(line 228,col 9)",
        "(line 230,col 9)-(line 233,col 9)",
        "(line 235,col 9)-(line 238,col 9)",
        "(line 240,col 9)-(line 243,col 9)",
        "(line 245,col 9)-(line 247,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readArchiveProperties(java.io.DataInput)",
      "begin_line": 250,
      "end_line": 259,
      "comment": "",
      "child_ranges": [
        "(line 252,col 9)-(line 252,col 44)",
        "(line 253,col 9)-(line 258,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readEncodedHeader(java.io.DataInputStream, org.apache.commons.compress.archivers.sevenz.Archive, byte[])",
      "begin_line": 261,
      "end_line": 292,
      "comment": "",
      "child_ranges": [
        "(line 263,col 9)-(line 263,col 41)",
        "(line 266,col 9)-(line 266,col 49)",
        "(line 267,col 9)-(line 267,col 43)",
        "(line 268,col 9)-(line 269,col 18)",
        "(line 271,col 9)-(line 271,col 32)",
        "(line 272,col 9)-(line 273,col 57)",
        "(line 274,col 9)-(line 279,col 9)",
        "(line 280,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 72)",
        "(line 285,col 9)-(line 285,col 92)",
        "(line 286,col 9)-(line 290,col 9)",
        "(line 291,col 9)-(line 291,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 294,
      "end_line": 318,
      "comment": "",
      "child_ranges": [
        "(line 295,col 9)-(line 295,col 44)",
        "(line 297,col 9)-(line 300,col 9)",
        "(line 302,col 9)-(line 308,col 9)",
        "(line 310,col 9)-(line 313,col 9)",
        "(line 315,col 9)-(line 317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readPackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 320,
      "end_line": 347,
      "comment": "",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 45)",
        "(line 322,col 9)-(line 322,col 55)",
        "(line 323,col 9)-(line 323,col 44)",
        "(line 324,col 9)-(line 330,col 9)",
        "(line 332,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 346,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUnpackInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 349,
      "end_line": 395,
      "comment": "",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 44)",
        "(line 351,col 9)-(line 353,col 9)",
        "(line 354,col 9)-(line 354,col 51)",
        "(line 355,col 9)-(line 355,col 61)",
        "(line 356,col 9)-(line 356,col 34)",
        "(line 357,col 9)-(line 357,col 55)",
        "(line 358,col 9)-(line 364,col 9)",
        "(line 366,col 9)-(line 366,col 40)",
        "(line 367,col 9)-(line 369,col 9)",
        "(line 370,col 9)-(line 375,col 9)",
        "(line 377,col 9)-(line 377,col 40)",
        "(line 378,col 9)-(line 390,col 9)",
        "(line 392,col 9)-(line 394,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readSubStreamsInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 397,
      "end_line": 478,
      "comment": "",
      "child_ranges": [
        "(line 398,col 9)-(line 400,col 9)",
        "(line 401,col 9)-(line 401,col 56)",
        "(line 403,col 9)-(line 403,col 44)",
        "(line 404,col 9)-(line 412,col 9)",
        "(line 414,col 9)-(line 414,col 67)",
        "(line 415,col 9)-(line 415,col 66)",
        "(line 416,col 9)-(line 416,col 63)",
        "(line 417,col 9)-(line 417,col 59)",
        "(line 419,col 9)-(line 419,col 33)",
        "(line 420,col 9)-(line 433,col 9)",
        "(line 434,col 9)-(line 436,col 9)",
        "(line 438,col 9)-(line 438,col 27)",
        "(line 439,col 9)-(line 443,col 9)",
        "(line 445,col 9)-(line 471,col 9)",
        "(line 473,col 9)-(line 475,col 9)",
        "(line 477,col 9)-(line 477,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFolder(java.io.DataInput)",
      "begin_line": 480,
      "end_line": 557,
      "comment": "",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 43)",
        "(line 483,col 9)-(line 483,col 50)",
        "(line 484,col 9)-(line 484,col 57)",
        "(line 485,col 9)-(line 485,col 32)",
        "(line 486,col 9)-(line 486,col 33)",
        "(line 487,col 9)-(line 516,col 9)",
        "(line 517,col 9)-(line 517,col 31)",
        "(line 518,col 9)-(line 518,col 50)",
        "(line 519,col 9)-(line 519,col 52)",
        "(line 521,col 9)-(line 523,col 9)",
        "(line 524,col 9)-(line 524,col 54)",
        "(line 525,col 9)-(line 525,col 69)",
        "(line 526,col 9)-(line 530,col 9)",
        "(line 531,col 9)-(line 531,col 37)",
        "(line 533,col 9)-(line 535,col 9)",
        "(line 536,col 9)-(line 536,col 68)",
        "(line 537,col 9)-(line 537,col 69)",
        "(line 538,col 9)-(line 553,col 9)",
        "(line 554,col 9)-(line 554,col 45)",
        "(line 556,col 9)-(line 556,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readAllOrBits(java.io.DataInput, int)",
      "begin_line": 559,
      "end_line": 571,
      "comment": "",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 60)",
        "(line 561,col 9)-(line 561,col 26)",
        "(line 562,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readBits(java.io.DataInput, int)",
      "begin_line": 573,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 45)",
        "(line 575,col 9)-(line 575,col 21)",
        "(line 576,col 9)-(line 576,col 22)",
        "(line 577,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 588,
      "end_line": 741,
      "comment": "",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 49)",
        "(line 590,col 9)-(line 590,col 81)",
        "(line 591,col 9)-(line 593,col 9)",
        "(line 594,col 9)-(line 594,col 36)",
        "(line 595,col 9)-(line 595,col 34)",
        "(line 596,col 9)-(line 596,col 29)",
        "(line 597,col 9)-(line 719,col 9)",
        "(line 720,col 9)-(line 720,col 36)",
        "(line 721,col 9)-(line 721,col 33)",
        "(line 722,col 9)-(line 738,col 9)",
        "(line 739,col 9)-(line 739,col 30)",
        "(line 740,col 9)-(line 740,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.calculateStreamMap(org.apache.commons.compress.archivers.sevenz.Archive)",
      "begin_line": 743,
      "end_line": 794,
      "comment": "",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 52)",
        "(line 746,col 9)-(line 746,col 42)",
        "(line 747,col 9)-(line 747,col 84)",
        "(line 748,col 9)-(line 748,col 67)",
        "(line 749,col 9)-(line 752,col 9)",
        "(line 754,col 9)-(line 754,col 38)",
        "(line 755,col 9)-(line 755,col 90)",
        "(line 756,col 9)-(line 756,col 61)",
        "(line 757,col 9)-(line 760,col 9)",
        "(line 762,col 9)-(line 762,col 61)",
        "(line 763,col 9)-(line 763,col 66)",
        "(line 764,col 9)-(line 764,col 32)",
        "(line 765,col 9)-(line 765,col 44)",
        "(line 766,col 9)-(line 791,col 9)",
        "(line 793,col 9)-(line 793,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecodingStream()",
      "begin_line": 796,
      "end_line": 829,
      "comment": "",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 85)",
        "(line 798,col 9)-(line 802,col 9)",
        "(line 803,col 9)-(line 818,col 9)",
        "(line 819,col 9)-(line 819,col 73)",
        "(line 820,col 9)-(line 821,col 58)",
        "(line 822,col 9)-(line 827,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.drainPreviousEntry()",
      "begin_line": 831,
      "end_line": 838,
      "comment": "",
      "child_ranges": [
        "(line 832,col 9)-(line 837,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.buildDecoderStack(org.apache.commons.compress.archivers.sevenz.Folder, long, int)",
      "begin_line": 840,
      "end_line": 857,
      "comment": "",
      "child_ranges": [
        "(line 842,col 9)-(line 842,col 32)",
        "(line 843,col 9)-(line 844,col 57)",
        "(line 845,col 9)-(line 850,col 9)",
        "(line 851,col 9)-(line 856,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read()",
      "begin_line": 866,
      "end_line": 868,
      "comment": "\n     * Reads a byte of data.\n     * \n     * @return the byte read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[])",
      "begin_line": 878,
      "end_line": 880,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 879,col 9)-(line 879,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.read(byte[], int, int)",
      "begin_line": 892,
      "end_line": 894,
      "comment": "\n     * Reads data into an array of bytes.\n     * \n     * @param b the array to write data to\n     * @param off offset into the buffer to start filling at\n     * @param len of bytes to read\n     * @return the number of bytes read, or -1 if end of input is reached\n     * @throws IOException\n     *             if an I/O error has occurred\n     ",
      "child_ranges": [
        "(line 893,col 9)-(line 893,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.sevenz.SevenZFile.readUint64(java.io.DataInput)",
      "begin_line": 896,
      "end_line": 910,
      "comment": "",
      "child_ranges": [
        "(line 898,col 9)-(line 898,col 47)",
        "(line 899,col 9)-(line 899,col 24)",
        "(line 900,col 9)-(line 900,col 23)",
        "(line 901,col 9)-(line 908,col 9)",
        "(line 909,col 9)-(line 909,col 21)"
      ]
    }
  ]
}